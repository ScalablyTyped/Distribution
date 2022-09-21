package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBranchpolicies extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Branchpolicies
}
object ApplicationjsonBranchpolicies {
  
  inline def apply(applicationSlashjson: Branchpolicies): ApplicationjsonBranchpolicies = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBranchpolicies]
  }
  
  extension [Self <: ApplicationjsonBranchpolicies](x: Self) {
    
    inline def setApplicationSlashjson(value: Branchpolicies): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
