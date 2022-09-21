package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBranchpoliciesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BranchpoliciesTotalcount
}
object ApplicationjsonBranchpoliciesTotalcount {
  
  inline def apply(applicationSlashjson: BranchpoliciesTotalcount): ApplicationjsonBranchpoliciesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBranchpoliciesTotalcount]
  }
  
  extension [Self <: ApplicationjsonBranchpoliciesTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: BranchpoliciesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
