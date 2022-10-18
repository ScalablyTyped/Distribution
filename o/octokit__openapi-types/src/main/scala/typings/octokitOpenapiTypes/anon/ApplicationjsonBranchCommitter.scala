package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBranchCommitter extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BranchCommitter
}
object ApplicationjsonBranchCommitter {
  
  inline def apply(applicationSlashjson: BranchCommitter): ApplicationjsonBranchCommitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBranchCommitter]
  }
  
  extension [Self <: ApplicationjsonBranchCommitter](x: Self) {
    
    inline def setApplicationSlashjson(value: BranchCommitter): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
