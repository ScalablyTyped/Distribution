package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`gh-pages`
import typings.octokitTypes.octokitTypesStrings.`master Slashdocs`
import typings.octokitTypes.octokitTypesStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInformationAboutPagesSiteEndpoint extends js.Object {
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://help.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
    */
  var source: js.UndefOr[`gh-pages` | master | (`master Slashdocs`)] = js.undefined
}

object ReposUpdateInformationAboutPagesSiteEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    cname: String = null,
    source: `gh-pages` | master | (`master Slashdocs`) = null
  ): ReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteEndpoint]
  }
}

