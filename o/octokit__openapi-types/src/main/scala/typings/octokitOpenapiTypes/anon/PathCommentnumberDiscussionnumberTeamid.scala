package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberTeamid extends StObject {
  
  var path: CommentnumberDiscussionnumberTeamid
}
object PathCommentnumberDiscussionnumberTeamid {
  
  inline def apply(path: CommentnumberDiscussionnumberTeamid): PathCommentnumberDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberTeamid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
