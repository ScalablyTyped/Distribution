package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsCreateReviewParamsComments extends StObject {
  
  var body: String
  
  var path: String
  
  var position: Double
}
object PullsCreateReviewParamsComments {
  
  @scala.inline
  def apply(body: String, path: String, position: Double): PullsCreateReviewParamsComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewParamsComments]
  }
  
  @scala.inline
  implicit class PullsCreateReviewParamsCommentsMutableBuilder[Self <: PullsCreateReviewParamsComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
