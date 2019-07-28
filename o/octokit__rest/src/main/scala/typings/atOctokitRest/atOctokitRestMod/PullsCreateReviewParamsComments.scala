package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(body = body, path = path, position = position)
  
    __obj.asInstanceOf[PullsCreateReviewParamsComments]
  }
}

