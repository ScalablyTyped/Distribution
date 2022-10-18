package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Organizationpermission]
}
object `56` {
  
  inline def apply(applicationSlashjson: js.Array[Organizationpermission]): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`56`]
  }
  
  extension [Self <: `56`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Organizationpermission]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Organizationpermission*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
