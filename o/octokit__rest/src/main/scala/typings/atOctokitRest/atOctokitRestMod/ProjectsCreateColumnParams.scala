package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateColumnParams extends js.Object {
  /**
    * The name of the column.
    */
  var name: String
  var project_id: Double
}

object ProjectsCreateColumnParams {
  @scala.inline
  def apply(name: String, project_id: Double): ProjectsCreateColumnParams = {
    val __obj = js.Dynamic.literal(name = name, project_id = project_id)
  
    __obj.asInstanceOf[ProjectsCreateColumnParams]
  }
}

