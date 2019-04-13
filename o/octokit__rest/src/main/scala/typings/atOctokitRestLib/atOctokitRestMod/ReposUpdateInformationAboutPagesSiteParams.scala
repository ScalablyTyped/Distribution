package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInformationAboutPagesSiteParams extends js.Object {
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://help.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
    */
  var source: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.`BACKSLASHgh-pagesBACKSLASH` | atOctokitRestLib.atOctokitRestLibStrings.BACKSLASHmasterBACKSLASH | (atOctokitRestLib.atOctokitRestLibStrings.`BACKSLASHmaster /docsBACKSLASH`)
  ] = js.undefined
}

object ReposUpdateInformationAboutPagesSiteParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    cname: java.lang.String = null,
    source: atOctokitRestLib.atOctokitRestLibStrings.`BACKSLASHgh-pagesBACKSLASH` | atOctokitRestLib.atOctokitRestLibStrings.BACKSLASHmasterBACKSLASH | (atOctokitRestLib.atOctokitRestLibStrings.`BACKSLASHmaster /docsBACKSLASH`) = null
  ): ReposUpdateInformationAboutPagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (cname != null) __obj.updateDynamic("cname")(cname)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteParams]
  }
}

