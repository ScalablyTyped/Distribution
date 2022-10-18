package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOwnerRepoRunnerid extends StObject {
  
  var path: NameOwnerRepoRunnerid
}
object PathNameOwnerRepoRunnerid {
  
  inline def apply(path: NameOwnerRepoRunnerid): PathNameOwnerRepoRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOwnerRepoRunnerid]
  }
  
  extension [Self <: PathNameOwnerRepoRunnerid](x: Self) {
    
    inline def setPath(value: NameOwnerRepoRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
