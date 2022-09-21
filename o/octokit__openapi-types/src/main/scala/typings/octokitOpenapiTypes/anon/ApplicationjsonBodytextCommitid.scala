package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodytextCommitid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodytextCommitid
}
object ApplicationjsonBodytextCommitid {
  
  inline def apply(applicationSlashjson: BodytextCommitid): ApplicationjsonBodytextCommitid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodytextCommitid]
  }
  
  extension [Self <: ApplicationjsonBodytextCommitid](x: Self) {
    
    inline def setApplicationSlashjson(value: BodytextCommitid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
