package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `531` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DeploymentbranchpolicyReviewers | Null
}
object `531` {
  
  inline def apply(): `531` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`531`]
  }
  
  extension [Self <: `531`](x: Self) {
    
    inline def setApplicationSlashjson(value: DeploymentbranchpolicyReviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
