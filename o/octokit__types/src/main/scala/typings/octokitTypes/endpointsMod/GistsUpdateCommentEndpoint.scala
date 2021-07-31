package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsUpdateCommentEndpoint extends StObject {
  
  /**
    * The comment text.
    */
  var body: String
  
  var comment_id: Double
  
  var gist_id: String
}
object GistsUpdateCommentEndpoint {
  
  @scala.inline
  def apply(body: String, comment_id: Double, gist_id: String): GistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateCommentEndpoint]
  }
  
  @scala.inline
  implicit class GistsUpdateCommentEndpointMutableBuilder[Self <: GistsUpdateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
