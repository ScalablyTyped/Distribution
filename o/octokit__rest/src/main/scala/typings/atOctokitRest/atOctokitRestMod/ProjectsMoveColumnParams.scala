package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsMoveColumnParams extends js.Object {
  var column_id: Double
  /**
    * Can be one of `first`, `last`, or `after:<column_id>`, where `<column_id>` is the `id` value of a column in the same project.
    */
  var position: String
}

object ProjectsMoveColumnParams {
  @scala.inline
  def apply(column_id: Double, position: String): ProjectsMoveColumnParams = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsMoveColumnParams]
  }
}

