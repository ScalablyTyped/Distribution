package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`gh-pages`
import typings.octokitTypes.octokitTypesStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreatePagesSiteParamsSource extends js.Object {
  var branch: js.UndefOr[master | `gh-pages`] = js.native
  var path: js.UndefOr[String] = js.native
}

object ReposCreatePagesSiteParamsSource {
  @scala.inline
  def apply(): ReposCreatePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposCreatePagesSiteParamsSource]
  }
  @scala.inline
  implicit class ReposCreatePagesSiteParamsSourceOps[Self <: ReposCreatePagesSiteParamsSource] (val x: Self) extends AnyVal {
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
    def setBranch(value: master | `gh-pages`): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

