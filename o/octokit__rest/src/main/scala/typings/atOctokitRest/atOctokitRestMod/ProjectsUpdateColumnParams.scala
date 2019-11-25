package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateColumnParams extends js.Object {
  var column_id: Double
  /**
    * The new name of the column.
    */
  var name: String
}

object ProjectsUpdateColumnParams {
  @scala.inline
  def apply(column_id: Double, name: String): ProjectsUpdateColumnParams = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsUpdateColumnParams]
  }
}

