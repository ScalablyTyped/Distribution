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
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object ProjectsCreateForAuthenticatedUserParams {
  @scala.inline
  def apply(name: String, body: String = null, page: Int | Double = null, per_page: Int | Double = null): ProjectsCreateForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserParams]
  }
}

