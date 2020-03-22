package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewParamsComments extends js.Object {
  /**
    * Text of the review comment.
    */
  var body: String
  /**
    * The relative path to the file that necessitates a review comment.
    */
  var path: String
  /**
    * The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below.
    */
  var position: Double
}

object PullsCreateReviewParamsComments {
  @scala.inline
  def apply(body: String, path: String, position: Double): PullsCreateReviewParamsComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewParamsComments]
  }
}

