package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGithubownedallowed extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Githubownedallowed
}
object ApplicationjsonGithubownedallowed {
  
  inline def apply(applicationSlashjson: Githubownedallowed): ApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGithubownedallowed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonGithubownedallowed] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Githubownedallowed): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
