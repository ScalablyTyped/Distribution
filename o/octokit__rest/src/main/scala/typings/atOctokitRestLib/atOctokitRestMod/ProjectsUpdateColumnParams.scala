package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateColumnParams extends js.Object {
  var column_id: scala.Double
  /**
    * The new name of the column.
    */
  var name: java.lang.String
}

object ProjectsUpdateColumnParams {
  @scala.inline
  def apply(column_id: scala.Double, name: java.lang.String): ProjectsUpdateColumnParams = {
    val __obj = js.Dynamic.literal(column_id = column_id, name = name)
  
    __obj.asInstanceOf[ProjectsUpdateColumnParams]
  }
}

