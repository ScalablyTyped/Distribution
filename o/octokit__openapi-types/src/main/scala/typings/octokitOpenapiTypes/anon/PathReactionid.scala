package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReactionid extends StObject {
  
  var path: Reactionid
}
object PathReactionid {
  
  inline def apply(path: Reactionid): PathReactionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReactionid]
  }
  
  extension [Self <: PathReactionid](x: Self) {
    
    inline def setPath(value: Reactionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
