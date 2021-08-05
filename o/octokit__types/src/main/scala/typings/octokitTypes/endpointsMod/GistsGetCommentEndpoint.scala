package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsGetCommentEndpoint extends StObject {
  
  var comment_id: Double
  
  var gist_id: String
}
object GistsGetCommentEndpoint {
  
  inline def apply(comment_id: Double, gist_id: String): GistsGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetCommentEndpoint]
  }
  
  extension [Self <: GistsGetCommentEndpoint](x: Self) {
    
    inline def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
