package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoSarifid extends StObject {
  
  var path: OwnerRepoSarifid
}
object PathOwnerRepoSarifid {
  
  inline def apply(path: OwnerRepoSarifid): PathOwnerRepoSarifid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoSarifid]
  }
  
  extension [Self <: PathOwnerRepoSarifid](x: Self) {
    
    inline def setPath(value: OwnerRepoSarifid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
