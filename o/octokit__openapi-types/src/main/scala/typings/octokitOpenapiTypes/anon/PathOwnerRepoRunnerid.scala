package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoRunnerid extends StObject {
  
  var path: OwnerRepoRunnerid
}
object PathOwnerRepoRunnerid {
  
  inline def apply(path: OwnerRepoRunnerid): PathOwnerRepoRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoRunnerid]
  }
  
  extension [Self <: PathOwnerRepoRunnerid](x: Self) {
    
    inline def setPath(value: OwnerRepoRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
