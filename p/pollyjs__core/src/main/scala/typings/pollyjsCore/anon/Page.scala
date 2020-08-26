package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var page: js.UndefOr[js.Any] = js.native
  var requestResourceTypes: js.UndefOr[js.Array[String]] = js.native
}

object Page {
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setPage(value: js.Any): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setRequestResourceTypesVarargs(value: String*): Self = this.set("requestResourceTypes", js.Array(value :_*))
    @scala.inline
    def setRequestResourceTypes(value: js.Array[String]): Self = this.set("requestResourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestResourceTypes: Self = this.set("requestResourceTypes", js.undefined)
  }
  
}

