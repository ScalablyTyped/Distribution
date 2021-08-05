package typings.postcssSelectorParser.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions extends StObject {
  
  var css: String
  
  def error(message: String, options: ErrorOptions): Error
  
  var options: Options
}
object ParserOptions {
  
  inline def apply(css: String, error: (String, ErrorOptions) => Error, options: Options): ParserOptions = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setError(value: (String, ErrorOptions) => Error): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
