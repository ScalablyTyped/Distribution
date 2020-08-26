package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`gh-pages`
import typings.octokitTypes.octokitTypesStrings.`master Slashdocs`
import typings.octokitTypes.octokitTypesStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateInformationAboutPagesSiteEndpoint extends js.Object {
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
    */
  var source: js.UndefOr[`gh-pages` | master | (`master Slashdocs`)] = js.native
}

object ReposUpdateInformationAboutPagesSiteEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteEndpoint]
  }
  @scala.inline
  implicit class ReposUpdateInformationAboutPagesSiteEndpointOps[Self <: ReposUpdateInformationAboutPagesSiteEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    @scala.inline
    def setSource(value: `gh-pages` | master | (`master Slashdocs`)): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

