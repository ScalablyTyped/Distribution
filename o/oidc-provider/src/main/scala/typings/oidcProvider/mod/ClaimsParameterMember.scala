package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimsParameterMember
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var essential: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ClaimsParameterMember {
  
  inline def apply(): ClaimsParameterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsParameterMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimsParameterMember] (val x: Self) extends AnyVal {
    
    inline def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    inline def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
