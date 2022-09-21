package typings.morganJson

import org.scalablytyped.runtime.StringDictionary
import typings.morgan.mod.FormatFn
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Format strings
    * @example
    * :method :url :status :res[content-length] bytes :response-time ms
    * @example
    * {
    *      short: ':method :url :status',
    *      length: ':res[content-length]',
    *      'response-time': ':response-time ms'
    * }
    * @param format
    * @param opts
    */
  inline def apply(format: String): FormatFn[IncomingMessage, ServerResponse[IncomingMessage]] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[FormatFn[IncomingMessage, ServerResponse[IncomingMessage]]]
  inline def apply(format: String, opts: Options): FormatFn[IncomingMessage, ServerResponse[IncomingMessage]] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FormatFn[IncomingMessage, ServerResponse[IncomingMessage]]]
  inline def apply(format: FormatObject): FormatFn[IncomingMessage, ServerResponse[IncomingMessage]] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[FormatFn[IncomingMessage, ServerResponse[IncomingMessage]]]
  inline def apply(format: FormatObject, opts: Options): FormatFn[IncomingMessage, ServerResponse[IncomingMessage]] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FormatFn[IncomingMessage, ServerResponse[IncomingMessage]]]
  
  @JSImport("morgan-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FormatObject = StringDictionary[String]
  
  trait Options extends StObject {
    
    var stringify: Boolean
  }
  object Options {
    
    inline def apply(stringify: Boolean): Options = {
      val __obj = js.Dynamic.literal(stringify = stringify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    }
  }
}
