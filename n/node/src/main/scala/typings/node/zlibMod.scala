package typings.node

import org.scalablytyped.runtime.NumberDictionary
import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zlibMod {
  
  @JSImport("zlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated */
  @JSImport("zlib", "Z_ASCII")
  @js.native
  val Z_ASCII: Double = js.native
  
  /** @deprecated Use `constants.Z_BEST_COMPRESSION` */
  @JSImport("zlib", "Z_BEST_COMPRESSION")
  @js.native
  val Z_BEST_COMPRESSION: Double = js.native
  
  /** @deprecated Use `constants.Z_BEST_SPEED` */
  @JSImport("zlib", "Z_BEST_SPEED")
  @js.native
  val Z_BEST_SPEED: Double = js.native
  
  /** @deprecated */
  @JSImport("zlib", "Z_BINARY")
  @js.native
  val Z_BINARY: Double = js.native
  
  /** @deprecated Use `constants.Z_BLOCK` */
  @JSImport("zlib", "Z_BLOCK")
  @js.native
  val Z_BLOCK: Double = js.native
  
  /** @deprecated Use `constants.Z_BUF_ERROR` */
  @JSImport("zlib", "Z_BUF_ERROR")
  @js.native
  val Z_BUF_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_DATA_ERROR` */
  @JSImport("zlib", "Z_DATA_ERROR")
  @js.native
  val Z_DATA_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_DEFAULT_COMPRESSION` */
  @JSImport("zlib", "Z_DEFAULT_COMPRESSION")
  @js.native
  val Z_DEFAULT_COMPRESSION: Double = js.native
  
  /** @deprecated Use `constants.Z_DEFAULT_STRATEGY` */
  @JSImport("zlib", "Z_DEFAULT_STRATEGY")
  @js.native
  val Z_DEFAULT_STRATEGY: Double = js.native
  
  /** @deprecated */
  @JSImport("zlib", "Z_DEFLATED")
  @js.native
  val Z_DEFLATED: Double = js.native
  
  /** @deprecated Use `constants.Z_ERRNO` */
  @JSImport("zlib", "Z_ERRNO")
  @js.native
  val Z_ERRNO: Double = js.native
  
  // Compression strategy.
  /** @deprecated Use `constants.Z_FILTERED` */
  @JSImport("zlib", "Z_FILTERED")
  @js.native
  val Z_FILTERED: Double = js.native
  
  /** @deprecated Use `constants.Z_FINISH` */
  @JSImport("zlib", "Z_FINISH")
  @js.native
  val Z_FINISH: Double = js.native
  
  /** @deprecated Use `constants.Z_FIXED` */
  @JSImport("zlib", "Z_FIXED")
  @js.native
  val Z_FIXED: Double = js.native
  
  /** @deprecated Use `constants.Z_FULL_FLUSH` */
  @JSImport("zlib", "Z_FULL_FLUSH")
  @js.native
  val Z_FULL_FLUSH: Double = js.native
  
  /** @deprecated Use `constants.Z_HUFFMAN_ONLY` */
  @JSImport("zlib", "Z_HUFFMAN_ONLY")
  @js.native
  val Z_HUFFMAN_ONLY: Double = js.native
  
  /** @deprecated Use `constants.Z_MEM_ERROR` */
  @JSImport("zlib", "Z_MEM_ERROR")
  @js.native
  val Z_MEM_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_NEED_DICT` */
  @JSImport("zlib", "Z_NEED_DICT")
  @js.native
  val Z_NEED_DICT: Double = js.native
  
  // Compression levels.
  /** @deprecated Use `constants.Z_NO_COMPRESSION` */
  @JSImport("zlib", "Z_NO_COMPRESSION")
  @js.native
  val Z_NO_COMPRESSION: Double = js.native
  
  // Allowed flush values.
  /** @deprecated Use `constants.Z_NO_FLUSH` */
  @JSImport("zlib", "Z_NO_FLUSH")
  @js.native
  val Z_NO_FLUSH: Double = js.native
  
  // Return codes for the compression/decompression functions.
  // Negative values are errors, positive values are used for special but normal events.
  /** @deprecated Use `constants.Z_OK` */
  @JSImport("zlib", "Z_OK")
  @js.native
  val Z_OK: Double = js.native
  
  /** @deprecated Use `constants.Z_PARTIAL_FLUSH` */
  @JSImport("zlib", "Z_PARTIAL_FLUSH")
  @js.native
  val Z_PARTIAL_FLUSH: Double = js.native
  
  /** @deprecated Use `constants.Z_RLE` */
  @JSImport("zlib", "Z_RLE")
  @js.native
  val Z_RLE: Double = js.native
  
  /** @deprecated Use `constants.Z_STREAM_END` */
  @JSImport("zlib", "Z_STREAM_END")
  @js.native
  val Z_STREAM_END: Double = js.native
  
  /** @deprecated Use `constants.Z_STREAM_ERROR` */
  @JSImport("zlib", "Z_STREAM_ERROR")
  @js.native
  val Z_STREAM_ERROR: Double = js.native
  
  /** @deprecated Use `constants.Z_SYNC_FLUSH` */
  @JSImport("zlib", "Z_SYNC_FLUSH")
  @js.native
  val Z_SYNC_FLUSH: Double = js.native
  
  /** @deprecated */
  @JSImport("zlib", "Z_TEXT")
  @js.native
  val Z_TEXT: Double = js.native
  
  /** @deprecated Use `constants.Z_TREES` */
  @JSImport("zlib", "Z_TREES")
  @js.native
  val Z_TREES: Double = js.native
  
  /** @deprecated  */
  @JSImport("zlib", "Z_UNKNOWN")
  @js.native
  val Z_UNKNOWN: Double = js.native
  
  /** @deprecated Use `constants.Z_VERSION_ERROR` */
  @JSImport("zlib", "Z_VERSION_ERROR")
  @js.native
  val Z_VERSION_ERROR: Double = js.native
  
  inline def brotliCompress(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @since v11.7.0, v10.16.0
    */
  inline def brotliCompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compress a chunk of data with `BrotliCompress`.
    * @since v11.7.0, v10.16.0
    */
  inline def brotliCompressSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompressSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def brotliCompressSync(buf: InputType, options: BrotliOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliCompressSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def brotliDecompress(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @since v11.7.0, v10.16.0
    */
  inline def brotliDecompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Decompress a chunk of data with `BrotliDecompress`.
    * @since v11.7.0, v10.16.0
    */
  inline def brotliDecompressSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompressSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def brotliDecompressSync(buf: InputType, options: BrotliOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("brotliDecompressSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object constants {
    
    @JSImport("zlib", "constants.BROTLI_DECODE")
    @js.native
    val BROTLI_DECODE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET")
    @js.native
    val BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CL_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CL_SPACE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DICTIONARY")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DICTIONARY: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DISTANCE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DISTANCE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_1: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_2: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_RESERVED")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_RESERVED: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_TRANSFORM")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_TRANSFORM: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_INVALID_ARGUMENTS")
    @js.native
    val BROTLI_DECODER_ERROR_INVALID_ARGUMENTS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_ERROR_UNREACHABLE")
    @js.native
    val BROTLI_DECODER_ERROR_UNREACHABLE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_NO_ERROR")
    @js.native
    val BROTLI_DECODER_NO_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION")
    @js.native
    val BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_DECODER_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_RESULT_ERROR")
    @js.native
    val BROTLI_DECODER_RESULT_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_RESULT_SUCCESS")
    @js.native
    val BROTLI_DECODER_RESULT_SUCCESS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DECODER_SUCCESS")
    @js.native
    val BROTLI_DECODER_SUCCESS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DEFAULT_MODE")
    @js.native
    val BROTLI_DEFAULT_MODE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DEFAULT_QUALITY")
    @js.native
    val BROTLI_DEFAULT_QUALITY: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_DEFAULT_WINDOW")
    @js.native
    val BROTLI_DEFAULT_WINDOW: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_ENCODE")
    @js.native
    val BROTLI_ENCODE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_LARGE_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_LARGE_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MAX_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MAX_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MAX_QUALITY")
    @js.native
    val BROTLI_MAX_QUALITY: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MIN_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MIN_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MIN_QUALITY")
    @js.native
    val BROTLI_MIN_QUALITY: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MIN_WINDOW_BITS")
    @js.native
    val BROTLI_MIN_WINDOW_BITS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MODE_FONT")
    @js.native
    val BROTLI_MODE_FONT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MODE_GENERIC")
    @js.native
    val BROTLI_MODE_GENERIC: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_MODE_TEXT")
    @js.native
    val BROTLI_MODE_TEXT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_OPERATION_EMIT_METADATA")
    @js.native
    val BROTLI_OPERATION_EMIT_METADATA: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_OPERATION_FINISH")
    @js.native
    val BROTLI_OPERATION_FINISH: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_OPERATION_FLUSH")
    @js.native
    val BROTLI_OPERATION_FLUSH: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_OPERATION_PROCESS")
    @js.native
    val BROTLI_OPERATION_PROCESS: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING")
    @js.native
    val BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_LGBLOCK")
    @js.native
    val BROTLI_PARAM_LGBLOCK: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_LGWIN")
    @js.native
    val BROTLI_PARAM_LGWIN: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_MODE")
    @js.native
    val BROTLI_PARAM_MODE: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_NDIRECT")
    @js.native
    val BROTLI_PARAM_NDIRECT: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_NPOSTFIX")
    @js.native
    val BROTLI_PARAM_NPOSTFIX: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_QUALITY")
    @js.native
    val BROTLI_PARAM_QUALITY: Double = js.native
    
    @JSImport("zlib", "constants.BROTLI_PARAM_SIZE_HINT")
    @js.native
    val BROTLI_PARAM_SIZE_HINT: Double = js.native
    
    @JSImport("zlib", "constants.DEFLATE")
    @js.native
    val DEFLATE: Double = js.native
    
    @JSImport("zlib", "constants.DEFLATERAW")
    @js.native
    val DEFLATERAW: Double = js.native
    
    @JSImport("zlib", "constants.GUNZIP")
    @js.native
    val GUNZIP: Double = js.native
    
    @JSImport("zlib", "constants.GZIP")
    @js.native
    val GZIP: Double = js.native
    
    @JSImport("zlib", "constants.INFLATE")
    @js.native
    val INFLATE: Double = js.native
    
    @JSImport("zlib", "constants.INFLATERAW")
    @js.native
    val INFLATERAW: Double = js.native
    
    @JSImport("zlib", "constants.UNZIP")
    @js.native
    val UNZIP: Double = js.native
    
    @JSImport("zlib", "constants.ZLIB_VERNUM")
    @js.native
    val ZLIB_VERNUM: Double = js.native
    
    @JSImport("zlib", "constants.Z_BEST_COMPRESSION")
    @js.native
    val Z_BEST_COMPRESSION: Double = js.native
    
    @JSImport("zlib", "constants.Z_BEST_SPEED")
    @js.native
    val Z_BEST_SPEED: Double = js.native
    
    @JSImport("zlib", "constants.Z_BLOCK")
    @js.native
    val Z_BLOCK: Double = js.native
    
    @JSImport("zlib", "constants.Z_BUF_ERROR")
    @js.native
    val Z_BUF_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.Z_DATA_ERROR")
    @js.native
    val Z_DATA_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_CHUNK")
    @js.native
    val Z_DEFAULT_CHUNK: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_COMPRESSION")
    @js.native
    val Z_DEFAULT_COMPRESSION: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_LEVEL")
    @js.native
    val Z_DEFAULT_LEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_MEMLEVEL")
    @js.native
    val Z_DEFAULT_MEMLEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_STRATEGY")
    @js.native
    val Z_DEFAULT_STRATEGY: Double = js.native
    
    @JSImport("zlib", "constants.Z_DEFAULT_WINDOWBITS")
    @js.native
    val Z_DEFAULT_WINDOWBITS: Double = js.native
    
    @JSImport("zlib", "constants.Z_ERRNO")
    @js.native
    val Z_ERRNO: Double = js.native
    
    // Compression strategy.
    @JSImport("zlib", "constants.Z_FILTERED")
    @js.native
    val Z_FILTERED: Double = js.native
    
    @JSImport("zlib", "constants.Z_FINISH")
    @js.native
    val Z_FINISH: Double = js.native
    
    @JSImport("zlib", "constants.Z_FIXED")
    @js.native
    val Z_FIXED: Double = js.native
    
    @JSImport("zlib", "constants.Z_FULL_FLUSH")
    @js.native
    val Z_FULL_FLUSH: Double = js.native
    
    @JSImport("zlib", "constants.Z_HUFFMAN_ONLY")
    @js.native
    val Z_HUFFMAN_ONLY: Double = js.native
    
    @JSImport("zlib", "constants.Z_MAX_CHUNK")
    @js.native
    val Z_MAX_CHUNK: Double = js.native
    
    @JSImport("zlib", "constants.Z_MAX_LEVEL")
    @js.native
    val Z_MAX_LEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_MAX_MEMLEVEL")
    @js.native
    val Z_MAX_MEMLEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_MAX_WINDOWBITS")
    @js.native
    val Z_MAX_WINDOWBITS: Double = js.native
    
    @JSImport("zlib", "constants.Z_MEM_ERROR")
    @js.native
    val Z_MEM_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.Z_MIN_CHUNK")
    @js.native
    val Z_MIN_CHUNK: Double = js.native
    
    @JSImport("zlib", "constants.Z_MIN_LEVEL")
    @js.native
    val Z_MIN_LEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_MIN_MEMLEVEL")
    @js.native
    val Z_MIN_MEMLEVEL: Double = js.native
    
    @JSImport("zlib", "constants.Z_MIN_WINDOWBITS")
    @js.native
    val Z_MIN_WINDOWBITS: Double = js.native
    
    @JSImport("zlib", "constants.Z_NEED_DICT")
    @js.native
    val Z_NEED_DICT: Double = js.native
    
    // Compression levels.
    @JSImport("zlib", "constants.Z_NO_COMPRESSION")
    @js.native
    val Z_NO_COMPRESSION: Double = js.native
    
    // Allowed flush values.
    @JSImport("zlib", "constants.Z_NO_FLUSH")
    @js.native
    val Z_NO_FLUSH: Double = js.native
    
    // Return codes for the compression/decompression functions.
    // Negative values are errors, positive values are used for special but normal events.
    @JSImport("zlib", "constants.Z_OK")
    @js.native
    val Z_OK: Double = js.native
    
    @JSImport("zlib", "constants.Z_PARTIAL_FLUSH")
    @js.native
    val Z_PARTIAL_FLUSH: Double = js.native
    
    @JSImport("zlib", "constants.Z_RLE")
    @js.native
    val Z_RLE: Double = js.native
    
    @JSImport("zlib", "constants.Z_STREAM_END")
    @js.native
    val Z_STREAM_END: Double = js.native
    
    @JSImport("zlib", "constants.Z_STREAM_ERROR")
    @js.native
    val Z_STREAM_ERROR: Double = js.native
    
    @JSImport("zlib", "constants.Z_SYNC_FLUSH")
    @js.native
    val Z_SYNC_FLUSH: Double = js.native
    
    @JSImport("zlib", "constants.Z_TREES")
    @js.native
    val Z_TREES: Double = js.native
    
    @JSImport("zlib", "constants.Z_VERSION_ERROR")
    @js.native
    val Z_VERSION_ERROR: Double = js.native
  }
  
  /**
    * Creates and returns a new `BrotliCompress` object.
    * @since v11.7.0, v10.16.0
    */
  inline def createBrotliCompress(): BrotliCompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliCompress")().asInstanceOf[BrotliCompress_]
  inline def createBrotliCompress(options: BrotliOptions): BrotliCompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliCompress")(options.asInstanceOf[js.Any]).asInstanceOf[BrotliCompress_]
  
  /**
    * Creates and returns a new `BrotliDecompress` object.
    * @since v11.7.0, v10.16.0
    */
  inline def createBrotliDecompress(): BrotliDecompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliDecompress")().asInstanceOf[BrotliDecompress_]
  inline def createBrotliDecompress(options: BrotliOptions): BrotliDecompress_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliDecompress")(options.asInstanceOf[js.Any]).asInstanceOf[BrotliDecompress_]
  
  /**
    * Creates and returns a new `Deflate` object.
    * @since v0.5.8
    */
  inline def createDeflate(): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")().asInstanceOf[Deflate_]
  inline def createDeflate(options: ZlibOptions): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")(options.asInstanceOf[js.Any]).asInstanceOf[Deflate_]
  
  /**
    * Creates and returns a new `DeflateRaw` object.
    *
    * An upgrade of zlib from 1.2.8 to 1.2.11 changed behavior when `windowBits`is set to 8 for raw deflate streams. zlib would automatically set `windowBits`to 9 if was initially set to 8\. Newer
    * versions of zlib will throw an exception,
    * so Node.js restored the original behavior of upgrading a value of 8 to 9,
    * since passing `windowBits = 9` to zlib actually results in a compressed stream
    * that effectively uses an 8-bit window only.
    * @since v0.5.8
    */
  inline def createDeflateRaw(): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")().asInstanceOf[DeflateRaw_]
  inline def createDeflateRaw(options: ZlibOptions): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[DeflateRaw_]
  
  /**
    * Creates and returns a new `Gunzip` object.
    * @since v0.5.8
    */
  inline def createGunzip(): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")().asInstanceOf[Gunzip_]
  inline def createGunzip(options: ZlibOptions): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gunzip_]
  
  /**
    * Creates and returns a new `Gzip` object.
    * See `example`.
    * @since v0.5.8
    */
  inline def createGzip(): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")().asInstanceOf[Gzip_]
  inline def createGzip(options: ZlibOptions): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gzip_]
  
  /**
    * Creates and returns a new `Inflate` object.
    * @since v0.5.8
    */
  inline def createInflate(): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")().asInstanceOf[Inflate_]
  inline def createInflate(options: ZlibOptions): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")(options.asInstanceOf[js.Any]).asInstanceOf[Inflate_]
  
  /**
    * Creates and returns a new `InflateRaw` object.
    * @since v0.5.8
    */
  inline def createInflateRaw(): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")().asInstanceOf[InflateRaw_]
  inline def createInflateRaw(options: ZlibOptions): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[InflateRaw_]
  
  /**
    * Creates and returns a new `Unzip` object.
    * @since v0.5.8
    */
  inline def createUnzip(): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")().asInstanceOf[Unzip_]
  inline def createUnzip(options: ZlibOptions): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")(options.asInstanceOf[js.Any]).asInstanceOf[Unzip_]
  
  /**
    * @since v0.6.0
    */
  inline def deflate(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @since v0.6.0
    */
  inline def deflateRaw(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compress a chunk of data with `DeflateRaw`.
    * @since v0.11.12
    */
  inline def deflateRawSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def deflateRawSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Compress a chunk of data with `Deflate`.
    * @since v0.11.12
    */
  inline def deflateSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def deflateSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @since v0.6.0
    */
  inline def gunzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gunzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Decompress a chunk of data with `Gunzip`.
    * @since v0.11.12
    */
  inline def gunzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def gunzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @since v0.6.0
    */
  inline def gzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compress a chunk of data with `Gzip`.
    * @since v0.11.12
    */
  inline def gzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def gzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @since v0.6.0
    */
  inline def inflate(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @since v0.6.0
    */
  inline def inflateRaw(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Decompress a chunk of data with `InflateRaw`.
    * @since v0.11.12
    */
  inline def inflateRawSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def inflateRawSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Decompress a chunk of data with `Inflate`.
    * @since v0.11.12
    */
  inline def inflateSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def inflateSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * @since v0.6.0
    */
  inline def unzip(buf: InputType, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Decompress a chunk of data with `Unzip`.
    * @since v0.11.12
    */
  inline def unzipSync(buf: InputType): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def unzipSync(buf: InputType, options: ZlibOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @js.native
  trait BrotliCompress_
    extends StObject
       with Zlib
  
  @js.native
  trait BrotliDecompress_
    extends StObject
       with Zlib
  
  trait BrotliOptions extends StObject {
    
    /**
      * @default 16*1024
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @default constants.BROTLI_OPERATION_FINISH
      */
    var finishFlush: js.UndefOr[Double] = js.undefined
    
    /**
      * @default constants.BROTLI_OPERATION_PROCESS
      */
    var flush: js.UndefOr[Double] = js.undefined
    
    var maxOutputLength: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[
        /**
      * Each key is a `constants.BROTLI_*` constant.
      */
    NumberDictionary[Boolean | Double]
      ] = js.undefined
  }
  object BrotliOptions {
    
    inline def apply(): BrotliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrotliOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrotliOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
      
      inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
      
      inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setMaxOutputLength(value: Double): Self = StObject.set(x, "maxOutputLength", value.asInstanceOf[js.Any])
      
      inline def setMaxOutputLengthUndefined: Self = StObject.set(x, "maxOutputLength", js.undefined)
      
      inline def setParams(
        value: /**
        * Each key is a `constants.BROTLI_*` constant.
        */
      NumberDictionary[Boolean | Double]
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  type CompressCallback = js.Function2[/* error */ js.Error | Null, /* result */ Buffer, Unit]
  
  @js.native
  trait DeflateRaw_
    extends StObject
       with Zlib
       with ZlibReset
       with ZlibParams
  
  @js.native
  trait Deflate_
    extends StObject
       with Zlib
       with ZlibReset
       with ZlibParams
  
  @js.native
  trait Gunzip_
    extends StObject
       with Zlib
  
  @js.native
  trait Gzip_
    extends StObject
       with Zlib
  
  @js.native
  trait InflateRaw_
    extends StObject
       with Zlib
       with ZlibReset
  
  @js.native
  trait Inflate_
    extends StObject
       with Zlib
       with ZlibReset
  
  type InputType = String | js.typedarray.ArrayBuffer | ArrayBufferView
  
  @js.native
  trait Unzip_
    extends StObject
       with Zlib
  
  @js.native
  trait Zlib extends StObject {
    
    /** @deprecated Use bytesWritten instead. */
    val bytesRead: Double = js.native
    
    val bytesWritten: Double = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(callback: js.Function0[Unit]): Unit = js.native
    def flush(kind: Double): Unit = js.native
    def flush(kind: Double, callback: js.Function0[Unit]): Unit = js.native
    def flush(kind: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    var shell: js.UndefOr[Boolean | String] = js.native
  }
  
  trait ZlibOptions extends StObject {
    
    /**
      * @default 16*1024
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    // compression only
    var dictionary: js.UndefOr[ArrayBufferView | js.typedarray.ArrayBuffer] = js.undefined
    
    /**
      * @default constants.Z_FINISH
      */
    var finishFlush: js.UndefOr[Double] = js.undefined
    
    /**
      * @default constants.Z_NO_FLUSH
      */
    var flush: js.UndefOr[Double] = js.undefined
    
    // deflate/inflate only, empty dictionary by default
    var info: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var maxOutputLength: js.UndefOr[Double] = js.undefined
    
    // compression only
    var memLevel: js.UndefOr[Double] = js.undefined
    
    // compression only
    var strategy: js.UndefOr[Double] = js.undefined
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object ZlibOptions {
    
    inline def apply(): ZlibOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZlibOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZlibOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setDictionary(value: ArrayBufferView | js.typedarray.ArrayBuffer): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
      
      inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
      
      inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaxOutputLength(value: Double): Self = StObject.set(x, "maxOutputLength", value.asInstanceOf[js.Any])
      
      inline def setMaxOutputLengthUndefined: Self = StObject.set(x, "maxOutputLength", js.undefined)
      
      inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
  
  trait ZlibParams extends StObject {
    
    def params(level: Double, strategy: Double, callback: js.Function0[Unit]): Unit
  }
  object ZlibParams {
    
    inline def apply(params: (Double, Double, js.Function0[Unit]) => Unit): ZlibParams = {
      val __obj = js.Dynamic.literal(params = js.Any.fromFunction3(params))
      __obj.asInstanceOf[ZlibParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZlibParams] (val x: Self) extends AnyVal {
      
      inline def setParams(value: (Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "params", js.Any.fromFunction3(value))
    }
  }
  
  trait ZlibReset extends StObject {
    
    def reset(): Unit
  }
  object ZlibReset {
    
    inline def apply(reset: () => Unit): ZlibReset = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[ZlibReset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZlibReset] (val x: Self) extends AnyVal {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
