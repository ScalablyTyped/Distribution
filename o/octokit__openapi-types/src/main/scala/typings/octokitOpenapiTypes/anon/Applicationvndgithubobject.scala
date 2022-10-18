package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationvndgithubobject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Giturl] | Size | Target | Submodulegiturl
  
  @JSName("application/vnd.github.object")
  var applicationSlashvndDotgithubDotobject: Encoding
}
object Applicationvndgithubobject {
  
  inline def apply(
    applicationSlashjson: js.Array[Giturl] | Size | Target | Submodulegiturl,
    applicationSlashvndDotgithubDotobject: Encoding
  ): Applicationvndgithubobject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/vnd.github.object")(applicationSlashvndDotgithubDotobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationvndgithubobject]
  }
  
  extension [Self <: Applicationvndgithubobject](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Giturl] | Size | Target | Submodulegiturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Giturl*): Self = StObject.set(x, "application/json", js.Array(value*))
    
    inline def setApplicationSlashvndDotgithubDotobject(value: Encoding): Self = StObject.set(x, "application/vnd.github.object", value.asInstanceOf[js.Any])
  }
}
