package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsMoveColumnParams extends js.Object {
  var column_id: scala.Double
  /**
    * Can be one of `first`, `last`, or `after:<column_id>`, where `<column_id>` is the `id` value of a column in the same project.
    */
  var position: java.lang.String
}

object ProjectsMoveColumnParams {
  @scala.inline
  def apply(column_id: scala.Double, position: java.lang.String): ProjectsMoveColumnParams = {
    val __obj = js.Dynamic.literal(column_id = column_id, position = position)
  
    __obj.asInstanceOf[ProjectsMoveColumnParams]
  }
}

