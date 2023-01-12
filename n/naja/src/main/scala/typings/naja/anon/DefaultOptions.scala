package typings.naja.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  var defaultOptions: typings.naja.distNajaMod.Options
}
object DefaultOptions {
  
  inline def apply(defaultOptions: typings.naja.distNajaMod.Options): DefaultOptions = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
  }
}
