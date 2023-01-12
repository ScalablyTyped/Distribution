package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberTeamid extends StObject {
  
  var path: DiscussionnumberTeamid
}
object PathDiscussionnumberTeamid {
  
  inline def apply(path: DiscussionnumberTeamid): PathDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberTeamid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
