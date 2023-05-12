package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValue
  extends StObject
     with Entity {
  
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object AllowedValue {
  
  inline def apply(): AllowedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedValue] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
  }
}
