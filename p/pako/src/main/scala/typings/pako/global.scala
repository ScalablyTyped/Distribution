package typings.pako

import typings.pako.anon.DeflateFunctionOptionstos
import typings.pako.anon.InflateFunctionOptionstos
import typings.pako.mod.Data
import typings.pako.mod.DeflateFunctionOptions
import typings.pako.mod.DeflateOptions
import typings.pako.mod.InflateFunctionOptions
import typings.pako.mod.InflateOptions
import typings.std.Uint8Array
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
    class Deflate_ ()
      extends typings.pako.mod.Deflate_ {
      def this(options: DeflateOptions) = this()
    }
    
    @JSGlobal("pako.FlushValues")
    @js.native
    object FlushValues extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pako.mod.FlushValues & Double] = js.native
      
      /* 5 */ val Z_BLOCK: typings.pako.mod.FlushValues.Z_BLOCK & Double = js.native
      
      /* 4 */ val Z_FINISH: typings.pako.mod.FlushValues.Z_FINISH & Double = js.native
      
      /* 3 */ val Z_FULL_FLUSH: typings.pako.mod.FlushValues.Z_FULL_FLUSH & Double = js.native
      
      /* 0 */ val Z_NO_FLUSH: typings.pako.mod.FlushValues.Z_NO_FLUSH & Double = js.native
      
      /* 1 */ val Z_PARTIAL_FLUSH: typings.pako.mod.FlushValues.Z_PARTIAL_FLUSH & Double = js.native
      
      /* 2 */ val Z_SYNC_FLUSH: typings.pako.mod.FlushValues.Z_SYNC_FLUSH & Double = js.native
      
      /* 6 */ val Z_TREES: typings.pako.mod.FlushValues.Z_TREES & Double = js.native
    }
    
    // https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
    @JSGlobal("pako.Inflate")
    @js.native
    class Inflate_ ()
      extends typings.pako.mod.Inflate_ {
      def this(options: InflateOptions) = this()
    }
    
    @JSGlobal("pako.ReturnCodes")
    @js.native
    object ReturnCodes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pako.mod.ReturnCodes & Double] = js.native
      
      /* -5 */ val Z_BUF_ERROR: typings.pako.mod.ReturnCodes.Z_BUF_ERROR & Double = js.native
      
      /* -3 */ val Z_DATA_ERROR: typings.pako.mod.ReturnCodes.Z_DATA_ERROR & Double = js.native
      
      /* -1 */ val Z_ERRNO: typings.pako.mod.ReturnCodes.Z_ERRNO & Double = js.native
      
      /* 2 */ val Z_NEED_DICT: typings.pako.mod.ReturnCodes.Z_NEED_DICT & Double = js.native
      
      /* 0 */ val Z_OK: typings.pako.mod.ReturnCodes.Z_OK & Double = js.native
      
      /* 1 */ val Z_STREAM_END: typings.pako.mod.ReturnCodes.Z_STREAM_END & Double = js.native
      
      /* -2 */ val Z_STREAM_ERROR: typings.pako.mod.ReturnCodes.Z_STREAM_ERROR & Double = js.native
    }
    
    @JSGlobal("pako.StrategyValues")
    @js.native
    object StrategyValues extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pako.mod.StrategyValues & Double] = js.native
      
      /* 0 */ val Z_DEFAULT_STRATEGY: typings.pako.mod.StrategyValues.Z_DEFAULT_STRATEGY & Double = js.native
      
      /* 1 */ val Z_FILTERED: typings.pako.mod.StrategyValues.Z_FILTERED & Double = js.native
      
      /* 4 */ val Z_FIXED: typings.pako.mod.StrategyValues.Z_FIXED & Double = js.native
      
      /* 2 */ val Z_HUFFMAN_ONLY: typings.pako.mod.StrategyValues.Z_HUFFMAN_ONLY & Double = js.native
      
      /* 3 */ val Z_RLE: typings.pako.mod.StrategyValues.Z_RLE & Double = js.native
    }
    
    inline def deflate(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * Compress data with deflate algorithm and options.
      */
    inline def deflate(data: Data, options: DeflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def deflate(data: Data, options: DeflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def deflateRaw(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def deflateRaw(data: Data, options: DeflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def deflateRaw(data: Data, options: DeflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def gzip(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * The same as deflate, but create gzip wrapper instead of deflate one.
      */
    inline def gzip(data: Data, options: DeflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def gzip(data: Data, options: DeflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def inflate(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
      * by default. That's why we don't provide separate ungzip method.
      */
    inline def inflate(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflate(data: Data, options: InflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def inflateRaw(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def inflateRaw(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflateRaw(data: Data, options: InflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def ungzip(data: Data): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    /**
      * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
      */
    inline def ungzip(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def ungzip(data: Data, options: InflateFunctionOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
}
