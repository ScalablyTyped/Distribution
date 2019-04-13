package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForRepoParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the project.
    */
  var name: java.lang.String
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object ProjectsCreateForRepoParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    body: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsCreateForRepoParams = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForRepoParams]
  }
}

