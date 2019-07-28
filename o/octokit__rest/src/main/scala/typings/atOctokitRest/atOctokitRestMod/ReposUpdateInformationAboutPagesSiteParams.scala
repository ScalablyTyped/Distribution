package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.BACKSLASHmasterBACKSLASH
import typings.atOctokitRest.atOctokitRestStrings.`BACKSLASHgh-pagesBACKSLASH`
import typings.atOctokitRest.atOctokitRestStrings.`BACKSLASHmaster /docsBACKSLASH`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInformationAboutPagesSiteParams extends js.Object {
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://help.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
    */
  var source: js.UndefOr[
    `BACKSLASHgh-pagesBACKSLASH` | BACKSLASHmasterBACKSLASH | (`BACKSLASHmaster /docsBACKSLASH`)
  ] = js.undefined
}

object ReposUpdateInformationAboutPagesSiteParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    cname: String = null,
    source: `BACKSLASHgh-pagesBACKSLASH` | BACKSLASHmasterBACKSLASH | (`BACKSLASHmaster /docsBACKSLASH`) = null
  ): ReposUpdateInformationAboutPagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (cname != null) __obj.updateDynamic("cname")(cname)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteParams]
  }
}

