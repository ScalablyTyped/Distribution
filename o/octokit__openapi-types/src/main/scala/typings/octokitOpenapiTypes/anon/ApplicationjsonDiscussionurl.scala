package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDiscussionurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Discussionurl
}
object ApplicationjsonDiscussionurl {
  
  inline def apply(applicationSlashjson: Discussionurl): ApplicationjsonDiscussionurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDiscussionurl]
  }
  
  extension [Self <: ApplicationjsonDiscussionurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Discussionurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
