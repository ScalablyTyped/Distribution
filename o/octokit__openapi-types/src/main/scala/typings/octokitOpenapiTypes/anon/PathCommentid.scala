package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentid extends StObject {
  
  var path: Commentid
}
object PathCommentid {
  
  inline def apply(path: Commentid): PathCommentid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Commentid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
