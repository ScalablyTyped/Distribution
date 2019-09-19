package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForAuthenticatedUserParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The name of the project.
    */
  var name: String
}

object ProjectsCreateForAuthenticatedUserParams {
  @scala.inline
  def apply(name: String, body: String = null): ProjectsCreateForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserParams]
  }
}

