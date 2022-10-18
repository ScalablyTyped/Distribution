package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentid extends StObject {
  
  /** The unique identifier of the comment. */
  var comment_id: Double
  
  /** The unique identifier of the gist. */
  var gist_id: String
}
object Commentid {
  
  inline def apply(comment_id: Double, gist_id: String): Commentid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentid]
  }
  
  extension [Self <: Commentid](x: Self) {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
