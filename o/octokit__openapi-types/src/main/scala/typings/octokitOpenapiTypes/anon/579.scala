package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `579` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DeploymentbranchpolicyReviewers | Null
}
object `579` {
  
  inline def apply(): `579` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`579`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `579`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DeploymentbranchpolicyReviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
