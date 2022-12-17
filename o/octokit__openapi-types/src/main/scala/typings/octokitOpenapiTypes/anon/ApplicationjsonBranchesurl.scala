package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBranchesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Branchesurl
}
object ApplicationjsonBranchesurl {
  
  inline def apply(applicationSlashjson: Branchesurl): ApplicationjsonBranchesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBranchesurl]
  }
  
  extension [Self <: ApplicationjsonBranchesurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Branchesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
