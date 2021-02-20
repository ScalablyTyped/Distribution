package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GistsDeleteCommentEndpoint extends StObject {
  
  var comment_id: Double = js.native
  
  var gist_id: String = js.native
}
object GistsDeleteCommentEndpoint {
  
  @scala.inline
  def apply(comment_id: Double, gist_id: String): GistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsDeleteCommentEndpoint]
  }
  
  @scala.inline
  implicit class GistsDeleteCommentEndpointMutableBuilder[Self <: GistsDeleteCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
