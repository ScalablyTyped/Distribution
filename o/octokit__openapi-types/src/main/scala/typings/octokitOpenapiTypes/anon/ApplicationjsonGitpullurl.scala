package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGitpullurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Gitpullurl
}
object ApplicationjsonGitpullurl {
  
  inline def apply(applicationSlashjson: Gitpullurl): ApplicationjsonGitpullurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGitpullurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonGitpullurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Gitpullurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
