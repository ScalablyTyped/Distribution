package typings.mz

import typings.node.Buffer
import typings.node.zlibMod.BrotliCompress_
import typings.node.zlibMod.BrotliDecompress_
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.CompressCallback
import typings.node.zlibMod.DeflateRaw_
import typings.node.zlibMod.Deflate_
import typings.node.zlibMod.Gunzip_
import typings.node.zlibMod.Gzip_
import typings.node.zlibMod.InflateRaw_
import typings.node.zlibMod.Inflate_
import typings.node.zlibMod.InputType
import typings.node.zlibMod.Unzip_
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zlibMod {
  
  @JSImport("mz/zlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated */
  @JSImport("mz/zlib", "Z_ASCII")
  @js.native
  val Z_ASCII: Double = js.native
  
  /** @deprecated Use `constants.Z_BEST_COMPRESSION` */
  @JSImport("mz/zlib", "Z_BEST_COMPRESSION")
  @js.native
  val Z_BEST_COMPRESSION: Double = js.native
  
  /** @deprecated Use `constants.Z_BEST_SPEED` */
  @JSImport("mz/zlib", "Z_BEST_SPEED")
  @js.native
  val Z_BEST_SPEED: Double = js.native
  
  /** @deprecated */
  @JSImport("mz/zlib", "Z_BINARY")
  @js.native
  val Z_BINARY: Double = js.native
  
  /** @deprecated Use `constants.Z_BLOCK` */
  @JSImport("mz/zlib", "Z_BLOCK")
  @js.native
  val Z_BLOCK: Double = js.native
  
  /** @deprecated Use `constants.Z_BUF_ERROR` */
  @JSImport("mz/zlib", "Z_BUF_ERROR")
  @js.native
  val Z_BUF_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_DATA_ERROR` */
  @JSImport("mz/zlib", "Z_DATA_ERROR")
  @js.native
  val Z_DATA_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_DEFAULT_COMPRESSION` */
  @JSImport("mz/zlib", "Z_DEFAULT_COMPRESSION")
  @js.native
  val Z_DEFAULT_COMPRESSION: Double = js.native
  
  /** @deprecated Use `constants.Z_DEFAULT_STRATEGY` */
  @JSImport("mz/zlib", "Z_DEFAULT_STRATEGY")
  @js.native
  val Z_DEFAULT_STRATEGY: Double = js.native
  
  /** @deprecated */
  @JSImport("mz/zlib", "Z_DEFLATED")
  @js.native
  val Z_DEFLATED: Double = js.native
  
  /** @deprecated Use `constants.Z_ERRNO` */
  @JSImport("mz/zlib", "Z_ERRNO")
  @js.native
  val Z_ERRNO: Double = js.native
  
  // Compression strategy.
  /** @deprecated Use `constants.Z_FILTERED` */
  @JSImport("mz/zlib", "Z_FILTERED")
  @js.native
  val Z_FILTERED: Double = js.native
  
  /** @deprecated Use `constants.Z_FINISH` */
  @JSImport("mz/zlib", "Z_FINISH")
  @js.native
  val Z_FINISH: Double = js.native
  
  /** @deprecated Use `constants.Z_FIXED` */
  @JSImport("mz/zlib", "Z_FIXED")
  @js.native
  val Z_FIXED: Double = js.native
  
  /** @deprecated Use `constants.Z_FULL_FLUSH` */
  @JSImport("mz/zlib", "Z_FULL_FLUSH")
  @js.native
  val Z_FULL_FLUSH: Double = js.native
  
  /** @deprecated Use `constants.Z_HUFFMAN_ONLY` */
  @JSImport("mz/zlib", "Z_HUFFMAN_ONLY")
  @js.native
  val Z_HUFFMAN_ONLY: Double = js.native
  
  /** @deprecated Use `constants.Z_MEM_ERROR` */
  @JSImport("mz/zlib", "Z_MEM_ERROR")
  @js.native
  val Z_MEM_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_NEED_DICT` */
  @JSImport("mz/zlib", "Z_NEED_DICT")
  @js.native
  val Z_NEED_DICT: Double = js.native
  
  // Compression levels.
  /** @deprecated Use `constants.Z_NO_COMPRESSION` */
  @JSImport("mz/zlib", "Z_NO_COMPRESSION")
  @js.native
  val Z_NO_COMPRESSION: Double = js.native
  
  // Allowed flush values.
  /** @deprecated Use `constants.Z_NO_FLUSH` */
  @JSImport("mz/zlib", "Z_NO_FLUSH")
  @js.native
  val Z_NO_FLUSH: Double = js.native
  
  // Return codes for the compression/decompression functions.
  // Negative values are errors, positive values are used for special but normal events.
  /** @deprecated Use `constants.Z_OK` */
  @JSImport("mz/zlib", "Z_OK")
  @js.native
  val Z_OK: Double = js.native
  
  /** @deprecated Use `constants.Z_PARTIAL_FLUSH` */
  @JSImport("mz/zlib", "Z_PARTIAL_FLUSH")
  @js.native
  val Z_PARTIAL_FLUSH: Double = js.native
  
  /** @deprecated Use `constants.Z_RLE` */
  @JSImport("mz/zlib", "Z_RLE")
  @js.native
  val Z_RLE: Double = js.native
  
  /** @deprecated Use `constants.Z_STREAM_END` */
  @JSImport("mz/zlib", "Z_STREAM_END")
  @js.native
  val Z_STREAM_END: Double = js.native
  
  /** @deprecated Use `constants.Z_STREAM_ERROR` */
  @JSImport("mz/zlib", "Z_STREAM_ERROR")
  @js.native
  val Z_STREAM_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_SYNC_FLUSH` */
  @JSImport("mz/zlib", "Z_SYNC_FLUSH")
  @js.native
  val Z_SYNC_FLUSH: Double = js.native
  
  /** @deprecated */
  @JSImport("mz/zlib", "Z_TEXT")
  @js.native
  val Z_TEXT: Double = js.native
  
  /** @deprecated Use `constants.Z_TREES` */
  @JSImport("mz/zlib", "Z_TREES")
  @js.native
  val Z_TREES: Double = js.native
  
  /** @deprecated  */
  @JSImport("mz/zlib", "Z_UNKNOWN")
  @js.native
  val Z_UNKNOWN: Double = js.native
  
  /** @deprecated Use `constants.Z_VERSION_ERROR` */
  @JSImport("mz/zlib", "Z_VERSION_ERROR")
  @js.native
  val Z_VERSION_ERROR: Double = js.native
  
  inline def brotliCompress(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def brotliCompress(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def brotliCompress(buf: InputType, options: BrotliOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def brotliCompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def brotliCompressSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompressSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def brotliCompressSync(buf: InputType, options: BrotliOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompressSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def brotliDecompress(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def brotliDecompress(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def brotliDecompress(buf: InputType, options: BrotliOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def brotliDecompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def brotliDecompressSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompressSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def brotliDecompressSync(buf: InputType, options: BrotliOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompressSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object constants {
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODE")
    @js.native
    val BROTLI_DECODE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET")
    @js.native
    val BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CL_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CL_SPACE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DICTIONARY")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DICTIONARY: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DISTANCE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DISTANCE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_1: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_2: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_RESERVED")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_RESERVED: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_TRANSFORM")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_TRANSFORM: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_INVALID_ARGUMENTS")
    @js.native
    val BROTLI_DECODER_ERROR_INVALID_ARGUMENTS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_ERROR_UNREACHABLE")
    @js.native
    val BROTLI_DECODER_ERROR_UNREACHABLE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_NO_ERROR")
    @js.native
    val BROTLI_DECODER_NO_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION")
    @js.native
    val BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_DECODER_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_RESULT_ERROR")
    @js.native
    val BROTLI_DECODER_RESULT_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_RESULT_SUCCESS")
    @js.native
    val BROTLI_DECODER_RESULT_SUCCESS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DECODER_SUCCESS")
    @js.native
    val BROTLI_DECODER_SUCCESS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DEFAULT_MODE")
    @js.native
    val BROTLI_DEFAULT_MODE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DEFAULT_QUALITY")
    @js.native
    val BROTLI_DEFAULT_QUALITY: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_DEFAULT_WINDOW")
    @js.native
    val BROTLI_DEFAULT_WINDOW: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_ENCODE")
    @js.native
    val BROTLI_ENCODE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_LARGE_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_LARGE_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MAX_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MAX_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MAX_QUALITY")
    @js.native
    val BROTLI_MAX_QUALITY: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MIN_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MIN_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MIN_QUALITY")
    @js.native
    val BROTLI_MIN_QUALITY: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MIN_WINDOW_BITS")
    @js.native
    val BROTLI_MIN_WINDOW_BITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MODE_FONT")
    @js.native
    val BROTLI_MODE_FONT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MODE_GENERIC")
    @js.native
    val BROTLI_MODE_GENERIC: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_MODE_TEXT")
    @js.native
    val BROTLI_MODE_TEXT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_OPERATION_EMIT_METADATA")
    @js.native
    val BROTLI_OPERATION_EMIT_METADATA: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_OPERATION_FINISH")
    @js.native
    val BROTLI_OPERATION_FINISH: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_OPERATION_FLUSH")
    @js.native
    val BROTLI_OPERATION_FLUSH: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_OPERATION_PROCESS")
    @js.native
    val BROTLI_OPERATION_PROCESS: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING")
    @js.native
    val BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_LGBLOCK")
    @js.native
    val BROTLI_PARAM_LGBLOCK: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_LGWIN")
    @js.native
    val BROTLI_PARAM_LGWIN: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_MODE")
    @js.native
    val BROTLI_PARAM_MODE: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_NDIRECT")
    @js.native
    val BROTLI_PARAM_NDIRECT: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_NPOSTFIX")
    @js.native
    val BROTLI_PARAM_NPOSTFIX: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_QUALITY")
    @js.native
    val BROTLI_PARAM_QUALITY: Double = js.native
    
    @JSImport("mz/zlib", "constants.BROTLI_PARAM_SIZE_HINT")
    @js.native
    val BROTLI_PARAM_SIZE_HINT: Double = js.native
    
    @JSImport("mz/zlib", "constants.DEFLATE")
    @js.native
    val DEFLATE: Double = js.native
    
    @JSImport("mz/zlib", "constants.DEFLATERAW")
    @js.native
    val DEFLATERAW: Double = js.native
    
    @JSImport("mz/zlib", "constants.GUNZIP")
    @js.native
    val GUNZIP: Double = js.native
    
    @JSImport("mz/zlib", "constants.GZIP")
    @js.native
    val GZIP: Double = js.native
    
    @JSImport("mz/zlib", "constants.INFLATE")
    @js.native
    val INFLATE: Double = js.native
    
    @JSImport("mz/zlib", "constants.INFLATERAW")
    @js.native
    val INFLATERAW: Double = js.native
    
    @JSImport("mz/zlib", "constants.UNZIP")
    @js.native
    val UNZIP: Double = js.native
    
    @JSImport("mz/zlib", "constants.ZLIB_VERNUM")
    @js.native
    val ZLIB_VERNUM: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_BEST_COMPRESSION")
    @js.native
    val Z_BEST_COMPRESSION: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_BEST_SPEED")
    @js.native
    val Z_BEST_SPEED: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_BLOCK")
    @js.native
    val Z_BLOCK: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_BUF_ERROR")
    @js.native
    val Z_BUF_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DATA_ERROR")
    @js.native
    val Z_DATA_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_CHUNK")
    @js.native
    val Z_DEFAULT_CHUNK: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_COMPRESSION")
    @js.native
    val Z_DEFAULT_COMPRESSION: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_LEVEL")
    @js.native
    val Z_DEFAULT_LEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_MEMLEVEL")
    @js.native
    val Z_DEFAULT_MEMLEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_STRATEGY")
    @js.native
    val Z_DEFAULT_STRATEGY: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_DEFAULT_WINDOWBITS")
    @js.native
    val Z_DEFAULT_WINDOWBITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_ERRNO")
    @js.native
    val Z_ERRNO: Double = js.native
    
    // Compression strategy.
    @JSImport("mz/zlib", "constants.Z_FILTERED")
    @js.native
    val Z_FILTERED: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_FINISH")
    @js.native
    val Z_FINISH: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_FIXED")
    @js.native
    val Z_FIXED: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_FULL_FLUSH")
    @js.native
    val Z_FULL_FLUSH: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_HUFFMAN_ONLY")
    @js.native
    val Z_HUFFMAN_ONLY: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MAX_CHUNK")
    @js.native
    val Z_MAX_CHUNK: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MAX_LEVEL")
    @js.native
    val Z_MAX_LEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MAX_MEMLEVEL")
    @js.native
    val Z_MAX_MEMLEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MAX_WINDOWBITS")
    @js.native
    val Z_MAX_WINDOWBITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MEM_ERROR")
    @js.native
    val Z_MEM_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MIN_CHUNK")
    @js.native
    val Z_MIN_CHUNK: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MIN_LEVEL")
    @js.native
    val Z_MIN_LEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MIN_MEMLEVEL")
    @js.native
    val Z_MIN_MEMLEVEL: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_MIN_WINDOWBITS")
    @js.native
    val Z_MIN_WINDOWBITS: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_NEED_DICT")
    @js.native
    val Z_NEED_DICT: Double = js.native
    
    // Compression levels.
    @JSImport("mz/zlib", "constants.Z_NO_COMPRESSION")
    @js.native
    val Z_NO_COMPRESSION: Double = js.native
    
    // Allowed flush values.
    @JSImport("mz/zlib", "constants.Z_NO_FLUSH")
    @js.native
    val Z_NO_FLUSH: Double = js.native
    
    // Return codes for the compression/decompression functions.
    // Negative values are errors, positive values are used for special but normal events.
    @JSImport("mz/zlib", "constants.Z_OK")
    @js.native
    val Z_OK: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_PARTIAL_FLUSH")
    @js.native
    val Z_PARTIAL_FLUSH: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_RLE")
    @js.native
    val Z_RLE: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_STREAM_END")
    @js.native
    val Z_STREAM_END: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_STREAM_ERROR")
    @js.native
    val Z_STREAM_ERROR: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_SYNC_FLUSH")
    @js.native
    val Z_SYNC_FLUSH: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_TREES")
    @js.native
    val Z_TREES: Double = js.native
    
    @JSImport("mz/zlib", "constants.Z_VERSION_ERROR")
    @js.native
    val Z_VERSION_ERROR: Double = js.native
  }
  
  inline def createBrotliCompress(): BrotliCompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliCompress")().asInstanceOf[BrotliCompress_]
  inline def createBrotliCompress(options: BrotliOptions): BrotliCompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliCompress")(options.asInstanceOf[js.Any]).asInstanceOf[BrotliCompress_]
  
  inline def createBrotliDecompress(): BrotliDecompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliDecompress")().asInstanceOf[BrotliDecompress_]
  inline def createBrotliDecompress(options: BrotliOptions): BrotliDecompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliDecompress")(options.asInstanceOf[js.Any]).asInstanceOf[BrotliDecompress_]
  
  inline def createDeflate(): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")().asInstanceOf[Deflate_]
  inline def createDeflate(options: ZlibOptions): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")(options.asInstanceOf[js.Any]).asInstanceOf[Deflate_]
  
  inline def createDeflateRaw(): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")().asInstanceOf[DeflateRaw_]
  inline def createDeflateRaw(options: ZlibOptions): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[DeflateRaw_]
  
  inline def createGunzip(): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")().asInstanceOf[Gunzip_]
  inline def createGunzip(options: ZlibOptions): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gunzip_]
  
  inline def createGzip(): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")().asInstanceOf[Gzip_]
  inline def createGzip(options: ZlibOptions): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gzip_]
  
  inline def createInflate(): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")().asInstanceOf[Inflate_]
  inline def createInflate(options: ZlibOptions): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")(options.asInstanceOf[js.Any]).asInstanceOf[Inflate_]
  
  inline def createInflateRaw(): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")().asInstanceOf[InflateRaw_]
  inline def createInflateRaw(options: ZlibOptions): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[InflateRaw_]
  
  inline def createUnzip(): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")().asInstanceOf[Unzip_]
  inline def createUnzip(options: ZlibOptions): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")(options.asInstanceOf[js.Any]).asInstanceOf[Unzip_]
  
  inline def deflate(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def deflate(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflate(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def deflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deflateRaw(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def deflateRaw(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateRaw(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def deflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deflateRawSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def deflateRawSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def deflateSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def deflateSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def gunzip(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def gunzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gunzip(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def gunzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gunzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def gunzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def gzip(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def gzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gzip(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def gzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def gzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def inflate(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def inflate(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflate(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def inflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inflateRaw(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def inflateRaw(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateRaw(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def inflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inflateRawSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def inflateRawSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def inflateSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def inflateSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def unzip(buf: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def unzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unzip(buf: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def unzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def unzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
