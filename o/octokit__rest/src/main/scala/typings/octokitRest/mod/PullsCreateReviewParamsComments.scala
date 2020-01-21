package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewParamsComments extends js.Object {
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
}

