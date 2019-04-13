package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateColumnParams extends js.Object {
  /**
    * The name of the column.
    */
  var name: java.lang.String
  var project_id: scala.Double
}

object ProjectsCreateColumnParams {
  @scala.inline
  def apply(name: java.lang.String, project_id: scala.Double): ProjectsCreateColumnParams = {
    val __obj = js.Dynamic.literal(name = name, project_id = project_id)
  
    __obj.asInstanceOf[ProjectsCreateColumnParams]
  }
}

