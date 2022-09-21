package typings.naja.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  var defaultOptions: typings.naja.najaMod.Options
}
object DefaultOptions {
  
  inline def apply(defaultOptions: typings.naja.najaMod.Options): DefaultOptions = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  
  extension [Self <: DefaultOptions](x: Self) {
    
    inline def setDefaultOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
  }
}
