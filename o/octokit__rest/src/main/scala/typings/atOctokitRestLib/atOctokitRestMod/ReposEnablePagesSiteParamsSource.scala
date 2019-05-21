package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParamsSource extends js.Object {
  var branch: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.master | atOctokitRestLib.atOctokitRestLibStrings.`gh-pages`
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object ReposEnablePagesSiteParamsSource {
  @scala.inline
  def apply(
    branch: atOctokitRestLib.atOctokitRestLibStrings.master | atOctokitRestLib.atOctokitRestLibStrings.`gh-pages` = null,
    path: java.lang.String = null
  ): ReposEnablePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ReposEnablePagesSiteParamsSource]
  }
}

