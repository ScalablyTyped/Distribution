package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReactionidRepo extends StObject {
  
  var path: ReactionidRepo
}
object PathReactionidRepo {
  
  inline def apply(path: ReactionidRepo): PathReactionidRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReactionidRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReactionidRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ReactionidRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
