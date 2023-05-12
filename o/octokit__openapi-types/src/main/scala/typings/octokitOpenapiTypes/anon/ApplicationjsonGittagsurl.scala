package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGittagsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Gittagsurl
}
object ApplicationjsonGittagsurl {
  
  inline def apply(applicationSlashjson: Gittagsurl): ApplicationjsonGittagsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGittagsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonGittagsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Gittagsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
