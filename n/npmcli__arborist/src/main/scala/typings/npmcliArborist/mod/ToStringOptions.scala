package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToStringOptions extends StObject {
  
  var format: js.UndefOr[Boolean] = js.undefined
}
object ToStringOptions {
  
  inline def apply(): ToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToStringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToStringOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
