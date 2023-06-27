package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseEmptyValueToZero extends StObject {
  
  /**
    * Whether the empty string and `null` are parsed to `0` if the `nullable` constraint is set to `false`;
    * see {@link sap.ui.model.odata.type.Int#parseValue parseValue}; since 1.115.0
    */
  var parseEmptyValueToZero: js.UndefOr[Boolean] = js.undefined
}
object ParseEmptyValueToZero {
  
  inline def apply(): ParseEmptyValueToZero = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseEmptyValueToZero]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseEmptyValueToZero] (val x: Self) extends AnyVal {
    
    inline def setParseEmptyValueToZero(value: Boolean): Self = StObject.set(x, "parseEmptyValueToZero", value.asInstanceOf[js.Any])
    
    inline def setParseEmptyValueToZeroUndefined: Self = StObject.set(x, "parseEmptyValueToZero", js.undefined)
  }
}
