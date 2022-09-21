package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReactionid extends StObject {
  
  var path: OwnerReactionid
}
object PathOwnerReactionid {
  
  inline def apply(path: OwnerReactionid): PathOwnerReactionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReactionid]
  }
  
  extension [Self <: PathOwnerReactionid](x: Self) {
    
    inline def setPath(value: OwnerReactionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
