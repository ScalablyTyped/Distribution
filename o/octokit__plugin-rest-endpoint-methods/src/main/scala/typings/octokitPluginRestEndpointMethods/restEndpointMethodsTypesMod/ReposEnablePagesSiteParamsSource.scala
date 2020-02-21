package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`gh-pages`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParamsSource extends js.Object {
  /**
    * The repository branch used to publish your [site's source files](https://help.github.com/articles/configuring-a-publishing-source-for-github-pages/). Can be either `master` or `gh-pages`.
    */
  var branch: js.UndefOr[master | `gh-pages`] = js.undefined
  /**
    * The repository directory that includes the source files for the Pages site. When `branch` is `master`, you can change `path` to `/docs`. When `branch` is `gh-pages`, you are unable to specify a `path` other than `/`.
    */
  var path: js.UndefOr[String] = js.undefined
}

object ReposEnablePagesSiteParamsSource {
  @scala.inline
  def apply(branch: master | `gh-pages` = null, path: String = null): ReposEnablePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposEnablePagesSiteParamsSource]
  }
}

