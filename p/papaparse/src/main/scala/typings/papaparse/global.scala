package typings.papaparse

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.papaparse.mod.NODE_STREAM_INPUT_TYPE
import typings.papaparse.mod.ParseConfig
import typings.papaparse.mod.ParseResult
import typings.papaparse.mod.UnparseConfig
import typings.papaparse.mod.UnparseObject
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Papa {
    
    @JSGlobal("Papa")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Papa.BAD_DELIMITERS")
    @js.native
    val BAD_DELIMITERS: js.Array[String] = js.native
    
    @JSGlobal("Papa.DefaultDelimiter")
    @js.native
    def DefaultDelimiter: String = js.native
    inline def DefaultDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDelimiter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.LocalChunkSize")
    @js.native
    def LocalChunkSize: String = js.native
    inline def LocalChunkSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalChunkSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.NODE_STREAM_INPUT")
    @js.native
    val NODE_STREAM_INPUT: /* 1 */ Double = js.native
    
    @JSGlobal("Papa.Parser")
    @js.native
    class Parser protected ()
      extends typings.papaparse.mod.Parser {
      def this(config: ParseConfig[js.Any]) = this()
    }
    
    @JSGlobal("Papa.RECORD_SEP")
    @js.native
    val RECORD_SEP: /* "\\u001E" */ String = js.native
    
    @JSGlobal("Papa.RemoteChunkSize")
    @js.native
    def RemoteChunkSize: String = js.native
    inline def RemoteChunkSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RemoteChunkSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.SCRIPT_PATH")
    @js.native
    def SCRIPT_PATH: String = js.native
    inline def SCRIPT_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_PATH")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Papa.UNIT_SEP")
    @js.native
    val UNIT_SEP: /* "\\u001F" */ String = js.native
    
    @JSGlobal("Papa.WORKERS_SUPPORTED")
    @js.native
    val WORKERS_SUPPORTED: Boolean = js.native
    
    inline def parse(stream: NODE_STREAM_INPUT_TYPE): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
    inline def parse(stream: NODE_STREAM_INPUT_TYPE, config: ParseConfig[js.Any]): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
    inline def parse[T](input: String): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
    inline def parse[T](input: String, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
    inline def parse[T](input: ReadableStream): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
    inline def parse[T](input: ReadableStream, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
    inline def parse[T](input: File): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
    inline def parse[T](input: File, config: ParseConfig[T]): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]
    
    inline def unparse(data: js.Array[js.Array[js.Any] | js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unparse(data: js.Array[js.Array[js.Any] | js.Object], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unparse(data: UnparseObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unparse(data: UnparseObject, config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
