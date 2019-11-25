package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForOrgParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The name of the project.
    */
  var name: String
  var org: String
}

object ProjectsCreateForOrgParams {
  @scala.inline
  def apply(name: String, org: String, body: String = null): ProjectsCreateForOrgParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgParams]
  }
}

