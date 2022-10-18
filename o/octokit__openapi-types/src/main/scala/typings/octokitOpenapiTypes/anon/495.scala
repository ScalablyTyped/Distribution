package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `495` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DeploymentbranchpolicyReviewers | Null
}
object `495` {
  
  inline def apply(): `495` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`495`]
  }
  
  extension [Self <: `495`](x: Self) {
    
    inline def setApplicationSlashjson(value: DeploymentbranchpolicyReviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
