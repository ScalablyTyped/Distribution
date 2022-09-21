package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoTeamid extends StObject {
  
  var path: OwnerRepoTeamid
}
object PathOwnerRepoTeamid {
  
  inline def apply(path: OwnerRepoTeamid): PathOwnerRepoTeamid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoTeamid]
  }
  
  extension [Self <: PathOwnerRepoTeamid](x: Self) {
    
    inline def setPath(value: OwnerRepoTeamid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
