package typings.pako

import typings.pako.anon.InflateFunctionOptionstos
import typings.pako.mod.Data
import typings.pako.mod.DeflateFunctionOptions
import typings.pako.mod.DeflateOptions
import typings.pako.mod.InflateFunctionOptions
import typings.pako.mod.InflateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pako {
    
    @JSGlobal("pako")
    @js.native
    val ^ : js.Any = js.native
    
    // https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
    @JSGlobal("pako.Deflate")
    @js.native
    open class Deflate_ ()
      extends typings.pako.mod.Deflate_ {
      def this(options: DeflateOptions) = this()
    }
    
    // https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
    @JSGlobal("pako.Inflate")
    @js.native
    open class Inflate_ ()
      extends typings.pako.mod.Inflate_ {
      def this(options: InflateOptions) = this()
    }
    
    @JSGlobal("pako.constants")
    @js.native
    object constants extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pako.mod.constants & Double] = js.native
      
      /* 5 */ val Z_BLOCK: typings.pako.mod.constants.Z_BLOCK & Double = js.native
      
      /* -5 */ val Z_BUF_ERROR: typings.pako.mod.constants.Z_BUF_ERROR & Double = js.native
      
      /* -3 */ val Z_DATA_ERROR: typings.pako.mod.constants.Z_DATA_ERROR & Double = js.native
      
      /* 0 */ val Z_DEFAULT_STRATEGY: typings.pako.mod.constants.Z_DEFAULT_STRATEGY & Double = js.native
      
      /* -1 */ val Z_ERRNO: typings.pako.mod.constants.Z_ERRNO & Double = js.native
      
      /* 1 */ val Z_FILTERED: typings.pako.mod.constants.Z_FILTERED & Double = js.native
      
      /* 4 */ val Z_FINISH: typings.pako.mod.constants.Z_FINISH & Double = js.native
      
      /* 4 */ val Z_FIXED: typings.pako.mod.constants.Z_FIXED & Double = js.native
      
      /* 3 */ val Z_FULL_FLUSH: typings.pako.mod.constants.Z_FULL_FLUSH & Double = js.native
      
      /* 2 */ val Z_HUFFMAN_ONLY: typings.pako.mod.constants.Z_HUFFMAN_ONLY & Double = js.native
      
      /* 2 */ val Z_NEED_DICT: typings.pako.mod.constants.Z_NEED_DICT & Double = js.native
      
      /* 0 */ val Z_NO_FLUSH: typings.pako.mod.constants.Z_NO_FLUSH & Double = js.native
      
      /* 0 */ val Z_OK: typings.pako.mod.constants.Z_OK & Double = js.native
      
      /* 1 */ val Z_PARTIAL_FLUSH: typings.pako.mod.constants.Z_PARTIAL_FLUSH & Double = js.native
      
      /* 3 */ val Z_RLE: typings.pako.mod.constants.Z_RLE & Double = js.native
      
      /* 1 */ val Z_STREAM_END: typings.pako.mod.constants.Z_STREAM_END & Double = js.native
      
      /* -2 */ val Z_STREAM_ERROR: typings.pako.mod.constants.Z_STREAM_ERROR & Double = js.native
      
      /* 2 */ val Z_SYNC_FLUSH: typings.pako.mod.constants.Z_SYNC_FLUSH & Double = js.native
      
      /* 6 */ val Z_TREES: typings.pako.mod.constants.Z_TREES & Double = js.native
    }
    
    inline def deflate(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflate(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Compress data with deflate algorithm and options.
      */
    inline def deflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflate(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def deflateRaw(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflateRaw(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def deflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflateRaw(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def gzip(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def gzip(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as deflate, but create gzip wrapper instead of deflate one.
      */
    inline def gzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def gzip(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def inflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
      * by default. That's why we don't provide separate ungzip method.
      */
    inline def inflate(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflate(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def inflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def inflateRaw(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflateRaw(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def ungzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
      */
    inline def ungzip(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def ungzip(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
}
