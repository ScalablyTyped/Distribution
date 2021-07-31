package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsCreateCommentEndpoint extends StObject {
  
  /**
    * The comment text.
    */
  var body: String
  
  var gist_id: String
}
object GistsCreateCommentEndpoint {
  
  @scala.inline
  def apply(body: String, gist_id: String): GistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class GistsCreateCommentEndpointMutableBuilder[Self <: GistsCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
