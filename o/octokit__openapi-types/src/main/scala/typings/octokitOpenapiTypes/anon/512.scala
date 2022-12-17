package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `512` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DeploymentbranchpolicyReviewers | Null
}
object `512` {
  
  inline def apply(): `512` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`512`]
  }
  
  extension [Self <: `512`](x: Self) {
    
    inline def setApplicationSlashjson(value: DeploymentbranchpolicyReviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
