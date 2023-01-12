package typings.minizlib

import typings.minizlib.minizlibStrings.buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.zlibMod.BrotliOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minizlib", "BrotliCompress")
  @js.native
  open class BrotliCompress protected ()
    extends StObject
       with ZlibBase {
    def this(opts: ZlibOptions & BrotliOptions) = this()
  }
  
  @JSImport("minizlib", "BrotliDecompress")
  @js.native
  open class BrotliDecompress protected ()
    extends StObject
       with ZlibBase {
    def this(opts: ZlibOptions & BrotliOptions) = this()
  }
  
  @JSImport("minizlib", "Deflate")
  @js.native
  open class Deflate protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "DeflateRaw")
  @js.native
  open class DeflateRaw protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "Gunzip")
  @js.native
  open class Gunzip protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "Gzip")
  @js.native
  open class Gzip protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "Inflate")
  @js.native
  open class Inflate protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "InflateRaw")
  @js.native
  open class InflateRaw protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  @JSImport("minizlib", "Unzip")
  @js.native
  open class Unzip protected ()
    extends StObject
       with Zlib {
    def this(opts: ZlibOptions & typings.node.zlibMod.ZlibOptions) = this()
  }
  
  object constants {
    
    @JSImport("minizlib", "constants.BROTLI_DECODE")
    @js.native
    val BROTLI_DECODE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS")
    @js.native
    val BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET")
    @js.native
    val BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CL_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CL_SPACE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DICTIONARY")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DICTIONARY: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_DISTANCE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_DISTANCE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_1")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_1: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_PADDING_2")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_2: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_RESERVED")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_RESERVED: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_TRANSFORM")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_TRANSFORM: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS")
    @js.native
    val BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_INVALID_ARGUMENTS")
    @js.native
    val BROTLI_DECODER_ERROR_INVALID_ARGUMENTS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_ERROR_UNREACHABLE")
    @js.native
    val BROTLI_DECODER_ERROR_UNREACHABLE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_NO_ERROR")
    @js.native
    val BROTLI_DECODER_NO_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION")
    @js.native
    val BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_DECODER_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_RESULT_ERROR")
    @js.native
    val BROTLI_DECODER_RESULT_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT")
    @js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_RESULT_SUCCESS")
    @js.native
    val BROTLI_DECODER_RESULT_SUCCESS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DECODER_SUCCESS")
    @js.native
    val BROTLI_DECODER_SUCCESS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DEFAULT_MODE")
    @js.native
    val BROTLI_DEFAULT_MODE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DEFAULT_QUALITY")
    @js.native
    val BROTLI_DEFAULT_QUALITY: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_DEFAULT_WINDOW")
    @js.native
    val BROTLI_DEFAULT_WINDOW: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_ENCODE")
    @js.native
    val BROTLI_ENCODE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_LARGE_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_LARGE_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MAX_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MAX_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MAX_QUALITY")
    @js.native
    val BROTLI_MAX_QUALITY: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MAX_WINDOW_BITS")
    @js.native
    val BROTLI_MAX_WINDOW_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MIN_INPUT_BLOCK_BITS")
    @js.native
    val BROTLI_MIN_INPUT_BLOCK_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MIN_QUALITY")
    @js.native
    val BROTLI_MIN_QUALITY: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MIN_WINDOW_BITS")
    @js.native
    val BROTLI_MIN_WINDOW_BITS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MODE_FONT")
    @js.native
    val BROTLI_MODE_FONT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MODE_GENERIC")
    @js.native
    val BROTLI_MODE_GENERIC: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_MODE_TEXT")
    @js.native
    val BROTLI_MODE_TEXT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_OPERATION_EMIT_METADATA")
    @js.native
    val BROTLI_OPERATION_EMIT_METADATA: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_OPERATION_FINISH")
    @js.native
    val BROTLI_OPERATION_FINISH: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_OPERATION_FLUSH")
    @js.native
    val BROTLI_OPERATION_FLUSH: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_OPERATION_PROCESS")
    @js.native
    val BROTLI_OPERATION_PROCESS: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING")
    @js.native
    val BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_LARGE_WINDOW")
    @js.native
    val BROTLI_PARAM_LARGE_WINDOW: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_LGBLOCK")
    @js.native
    val BROTLI_PARAM_LGBLOCK: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_LGWIN")
    @js.native
    val BROTLI_PARAM_LGWIN: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_MODE")
    @js.native
    val BROTLI_PARAM_MODE: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_NDIRECT")
    @js.native
    val BROTLI_PARAM_NDIRECT: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_NPOSTFIX")
    @js.native
    val BROTLI_PARAM_NPOSTFIX: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_QUALITY")
    @js.native
    val BROTLI_PARAM_QUALITY: Double = js.native
    
    @JSImport("minizlib", "constants.BROTLI_PARAM_SIZE_HINT")
    @js.native
    val BROTLI_PARAM_SIZE_HINT: Double = js.native
    
    @JSImport("minizlib", "constants.DEFLATE")
    @js.native
    val DEFLATE: Double = js.native
    
    @JSImport("minizlib", "constants.DEFLATERAW")
    @js.native
    val DEFLATERAW: Double = js.native
    
    @JSImport("minizlib", "constants.GUNZIP")
    @js.native
    val GUNZIP: Double = js.native
    
    @JSImport("minizlib", "constants.GZIP")
    @js.native
    val GZIP: Double = js.native
    
    @JSImport("minizlib", "constants.INFLATE")
    @js.native
    val INFLATE: Double = js.native
    
    @JSImport("minizlib", "constants.INFLATERAW")
    @js.native
    val INFLATERAW: Double = js.native
    
    @JSImport("minizlib", "constants.UNZIP")
    @js.native
    val UNZIP: Double = js.native
    
    @JSImport("minizlib", "constants.ZLIB_VERNUM")
    @js.native
    val ZLIB_VERNUM: Double = js.native
    
    @JSImport("minizlib", "constants.Z_BEST_COMPRESSION")
    @js.native
    val Z_BEST_COMPRESSION: Double = js.native
    
    @JSImport("minizlib", "constants.Z_BEST_SPEED")
    @js.native
    val Z_BEST_SPEED: Double = js.native
    
    @JSImport("minizlib", "constants.Z_BLOCK")
    @js.native
    val Z_BLOCK: Double = js.native
    
    @JSImport("minizlib", "constants.Z_BUF_ERROR")
    @js.native
    val Z_BUF_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DATA_ERROR")
    @js.native
    val Z_DATA_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_CHUNK")
    @js.native
    val Z_DEFAULT_CHUNK: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_COMPRESSION")
    @js.native
    val Z_DEFAULT_COMPRESSION: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_LEVEL")
    @js.native
    val Z_DEFAULT_LEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_MEMLEVEL")
    @js.native
    val Z_DEFAULT_MEMLEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_STRATEGY")
    @js.native
    val Z_DEFAULT_STRATEGY: Double = js.native
    
    @JSImport("minizlib", "constants.Z_DEFAULT_WINDOWBITS")
    @js.native
    val Z_DEFAULT_WINDOWBITS: Double = js.native
    
    @JSImport("minizlib", "constants.Z_ERRNO")
    @js.native
    val Z_ERRNO: Double = js.native
    
    // Compression strategy.
    @JSImport("minizlib", "constants.Z_FILTERED")
    @js.native
    val Z_FILTERED: Double = js.native
    
    @JSImport("minizlib", "constants.Z_FINISH")
    @js.native
    val Z_FINISH: Double = js.native
    
    @JSImport("minizlib", "constants.Z_FIXED")
    @js.native
    val Z_FIXED: Double = js.native
    
    @JSImport("minizlib", "constants.Z_FULL_FLUSH")
    @js.native
    val Z_FULL_FLUSH: Double = js.native
    
    @JSImport("minizlib", "constants.Z_HUFFMAN_ONLY")
    @js.native
    val Z_HUFFMAN_ONLY: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MAX_CHUNK")
    @js.native
    val Z_MAX_CHUNK: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MAX_LEVEL")
    @js.native
    val Z_MAX_LEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MAX_MEMLEVEL")
    @js.native
    val Z_MAX_MEMLEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MAX_WINDOWBITS")
    @js.native
    val Z_MAX_WINDOWBITS: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MEM_ERROR")
    @js.native
    val Z_MEM_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MIN_CHUNK")
    @js.native
    val Z_MIN_CHUNK: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MIN_LEVEL")
    @js.native
    val Z_MIN_LEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MIN_MEMLEVEL")
    @js.native
    val Z_MIN_MEMLEVEL: Double = js.native
    
    @JSImport("minizlib", "constants.Z_MIN_WINDOWBITS")
    @js.native
    val Z_MIN_WINDOWBITS: Double = js.native
    
    @JSImport("minizlib", "constants.Z_NEED_DICT")
    @js.native
    val Z_NEED_DICT: Double = js.native
    
    // Compression levels.
    @JSImport("minizlib", "constants.Z_NO_COMPRESSION")
    @js.native
    val Z_NO_COMPRESSION: Double = js.native
    
    // Allowed flush values.
    @JSImport("minizlib", "constants.Z_NO_FLUSH")
    @js.native
    val Z_NO_FLUSH: Double = js.native
    
    // Return codes for the compression/decompression functions.
    // Negative values are errors, positive values are used for special but normal events.
    @JSImport("minizlib", "constants.Z_OK")
    @js.native
    val Z_OK: Double = js.native
    
    @JSImport("minizlib", "constants.Z_PARTIAL_FLUSH")
    @js.native
    val Z_PARTIAL_FLUSH: Double = js.native
    
    @JSImport("minizlib", "constants.Z_RLE")
    @js.native
    val Z_RLE: Double = js.native
    
    @JSImport("minizlib", "constants.Z_STREAM_END")
    @js.native
    val Z_STREAM_END: Double = js.native
    
    @JSImport("minizlib", "constants.Z_STREAM_ERROR")
    @js.native
    val Z_STREAM_ERROR: Double = js.native
    
    @JSImport("minizlib", "constants.Z_SYNC_FLUSH")
    @js.native
    val Z_SYNC_FLUSH: Double = js.native
    
    @JSImport("minizlib", "constants.Z_TREES")
    @js.native
    val Z_TREES: Double = js.native
    
    @JSImport("minizlib", "constants.Z_VERSION_ERROR")
    @js.native
    val Z_VERSION_ERROR: Double = js.native
  }
  
  type Brotli = ZlibBase
  
  /* Rewritten from type alias, can be one of: 
    - typings.minizlib.minizlibStrings.BrotliCompress
    - typings.minizlib.minizlibStrings.BrotliDecompress
  */
  trait BrotliMode extends StObject
  object BrotliMode {
    
    inline def BrotliCompress: typings.minizlib.minizlibStrings.BrotliCompress = "BrotliCompress".asInstanceOf[typings.minizlib.minizlibStrings.BrotliCompress]
    
    inline def BrotliDecompress: typings.minizlib.minizlibStrings.BrotliDecompress = "BrotliDecompress".asInstanceOf[typings.minizlib.minizlibStrings.BrotliDecompress]
  }
  
  /* Inlined parent std.Omit<minipass.minipass.StringOptions, 'encoding'> */
  trait MiniPassOptions extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding | buffer | Null] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object MiniPassOptions {
    
    inline def apply(): MiniPassOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiniPassOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiniPassOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEncoding(value: BufferEncoding | buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  @js.native
  trait Zlib
    extends StObject
       with ZlibBase {
    
    def params(): Unit = js.native
    def params(level: Double): Unit = js.native
    def params(level: Double, strategy: Double): Unit = js.native
    def params(level: Unit, strategy: Double): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MiniPass * / any */ @js.native
  trait ZlibBase extends StObject {
    
    def close(): Unit = js.native
    
    def end(): this.type = js.native
    def end(chunk: Any): this.type = js.native
    def end(chunk: Any, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: String): this.type = js.native
    def end(chunk: Any, encoding: String, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: Null, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Unit, encoding: String): this.type = js.native
    def end(chunk: Unit, encoding: String, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Unit, encoding: Null, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Unit, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    
    val ended: Boolean = js.native
    
    def flush(): Unit = js.native
    def flush(flushFlag: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def write(): Boolean = js.native
    def write(chunk: Any): Boolean = js.native
    def write(chunk: Any, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Any, encoding: String): Boolean = js.native
    def write(chunk: Any, encoding: String, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Any, encoding: Null, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Unit, encoding: String): Boolean = js.native
    def write(chunk: Unit, encoding: String, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Unit, encoding: Null, cb: js.Function0[Unit]): Boolean = js.native
    def write(chunk: Unit, encoding: Unit, cb: js.Function0[Unit]): Boolean = js.native
  }
  
  trait ZlibBaseOptions
    extends StObject
       with MiniPassOptions {
    
    var finishFlush: js.UndefOr[Double] = js.undefined
    
    var flush: js.UndefOr[Double] = js.undefined
  }
  object ZlibBaseOptions {
    
    inline def apply(): ZlibBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZlibBaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZlibBaseOptions] (val x: Self) extends AnyVal {
      
      inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
      
      inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
      
      inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.minizlib.minizlibStrings.Gzip
    - typings.minizlib.minizlibStrings.Gunzip
    - typings.minizlib.minizlibStrings.Deflate
    - typings.minizlib.minizlibStrings.Inflate
    - typings.minizlib.minizlibStrings.DeflateRaw
    - typings.minizlib.minizlibStrings.InflateRaw
    - typings.minizlib.minizlibStrings.Unzip
  */
  trait ZlibMode extends StObject
  object ZlibMode {
    
    inline def Deflate: typings.minizlib.minizlibStrings.Deflate = "Deflate".asInstanceOf[typings.minizlib.minizlibStrings.Deflate]
    
    inline def DeflateRaw: typings.minizlib.minizlibStrings.DeflateRaw = "DeflateRaw".asInstanceOf[typings.minizlib.minizlibStrings.DeflateRaw]
    
    inline def Gunzip: typings.minizlib.minizlibStrings.Gunzip = "Gunzip".asInstanceOf[typings.minizlib.minizlibStrings.Gunzip]
    
    inline def Gzip: typings.minizlib.minizlibStrings.Gzip = "Gzip".asInstanceOf[typings.minizlib.minizlibStrings.Gzip]
    
    inline def Inflate: typings.minizlib.minizlibStrings.Inflate = "Inflate".asInstanceOf[typings.minizlib.minizlibStrings.Inflate]
    
    inline def InflateRaw: typings.minizlib.minizlibStrings.InflateRaw = "InflateRaw".asInstanceOf[typings.minizlib.minizlibStrings.InflateRaw]
    
    inline def Unzip: typings.minizlib.minizlibStrings.Unzip = "Unzip".asInstanceOf[typings.minizlib.minizlibStrings.Unzip]
  }
  
  trait ZlibOptions
    extends StObject
       with ZlibBaseOptions {
    
    var level: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[Double] = js.undefined
  }
  object ZlibOptions {
    
    inline def apply(): ZlibOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZlibOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZlibOptions] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
