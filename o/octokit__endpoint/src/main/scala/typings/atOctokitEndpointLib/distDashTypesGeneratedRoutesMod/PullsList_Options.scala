package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsList_Options extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var head: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object PullsList_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    base: java.lang.String = null,
    direction: java.lang.String = null,
    head: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: java.lang.String = null,
    state: java.lang.String = null
  ): PullsList_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (base != null) __obj.updateDynamic("base")(base)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (head != null) __obj.updateDynamic("head")(head)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PullsList_Options]
  }
}

