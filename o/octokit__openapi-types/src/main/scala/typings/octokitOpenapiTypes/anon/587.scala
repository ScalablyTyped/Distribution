package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `587` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[OrganizationOrganizationurl]
}
object `587` {
  
  inline def apply(applicationSlashjson: js.Array[OrganizationOrganizationurl]): `587` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`587`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `587`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: js.Array[OrganizationOrganizationurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: OrganizationOrganizationurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
