package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `610` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[OrganizationOrganizationurl]
}
object `610` {
  
  inline def apply(applicationSlashjson: js.Array[OrganizationOrganizationurl]): `610` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`610`]
  }
  
  extension [Self <: `610`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[OrganizationOrganizationurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: OrganizationOrganizationurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
