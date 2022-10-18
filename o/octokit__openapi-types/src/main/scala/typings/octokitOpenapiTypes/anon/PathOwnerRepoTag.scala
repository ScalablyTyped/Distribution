package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoTag extends StObject {
  
  var path: OwnerRepoTag
}
object PathOwnerRepoTag {
  
  inline def apply(path: OwnerRepoTag): PathOwnerRepoTag = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoTag]
  }
  
  extension [Self <: PathOwnerRepoTag](x: Self) {
    
    inline def setPath(value: OwnerRepoTag): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
