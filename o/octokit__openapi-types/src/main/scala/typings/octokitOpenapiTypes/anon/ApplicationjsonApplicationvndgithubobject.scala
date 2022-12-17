package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationvndgithubobject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Giturl] | Submodulegiturl | Target | DownloadurlGiturl
  
  @JSName("application/vnd.github.object")
  var applicationSlashvndDotgithubDotobject: Entries
}
object ApplicationjsonApplicationvndgithubobject {
  
  inline def apply(
    applicationSlashjson: js.Array[Giturl] | Submodulegiturl | Target | DownloadurlGiturl,
    applicationSlashvndDotgithubDotobject: Entries
  ): ApplicationjsonApplicationvndgithubobject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/vnd.github.object")(applicationSlashvndDotgithubDotobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationvndgithubobject]
  }
  
  extension [Self <: ApplicationjsonApplicationvndgithubobject](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Giturl] | Submodulegiturl | Target | DownloadurlGiturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Giturl*): Self = StObject.set(x, "application/json", js.Array(value*))
    
    inline def setApplicationSlashvndDotgithubDotobject(value: Entries): Self = StObject.set(x, "application/vnd.github.object", value.asInstanceOf[js.Any])
  }
}
