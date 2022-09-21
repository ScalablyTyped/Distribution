package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommitContent extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CommitContent
}
object ApplicationjsonCommitContent {
  
  inline def apply(applicationSlashjson: CommitContent): ApplicationjsonCommitContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommitContent]
  }
  
  extension [Self <: ApplicationjsonCommitContent](x: Self) {
    
    inline def setApplicationSlashjson(value: CommitContent): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
