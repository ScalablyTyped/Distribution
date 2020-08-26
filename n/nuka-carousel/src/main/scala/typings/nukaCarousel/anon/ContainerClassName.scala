package typings.nukaCarousel.anon

import typings.nukaCarousel.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerClassName extends js.Object {
  var containerClassName: js.UndefOr[String] = js.native
  var nextButtonClassName: js.UndefOr[String] = js.native
  var nextButtonStyle: js.UndefOr[CSSProperties] = js.native
  var nextButtonText: js.UndefOr[String] = js.native
  var pagingDotsClassName: js.UndefOr[String] = js.native
  var pagingDotsContainerClassName: js.UndefOr[String] = js.native
  var pagingDotsStyle: js.UndefOr[CSSProperties] = js.native
  var prevButtonClassName: js.UndefOr[String] = js.native
  var prevButtonStyle: js.UndefOr[CSSProperties] = js.native
  var prevButtonText: js.UndefOr[String] = js.native
}

object ContainerClassName {
  @scala.inline
  def apply(): ContainerClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerClassName]
  }
  @scala.inline
  implicit class ContainerClassNameOps[Self <: ContainerClassName] (val x: Self) extends AnyVal {
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setNextButtonClassName(value: String): Self = this.set("nextButtonClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButtonClassName: Self = this.set("nextButtonClassName", js.undefined)
    @scala.inline
    def setNextButtonStyle(value: CSSProperties): Self = this.set("nextButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButtonStyle: Self = this.set("nextButtonStyle", js.undefined)
    @scala.inline
    def setNextButtonText(value: String): Self = this.set("nextButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButtonText: Self = this.set("nextButtonText", js.undefined)
    @scala.inline
    def setPagingDotsClassName(value: String): Self = this.set("pagingDotsClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingDotsClassName: Self = this.set("pagingDotsClassName", js.undefined)
    @scala.inline
    def setPagingDotsContainerClassName(value: String): Self = this.set("pagingDotsContainerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingDotsContainerClassName: Self = this.set("pagingDotsContainerClassName", js.undefined)
    @scala.inline
    def setPagingDotsStyle(value: CSSProperties): Self = this.set("pagingDotsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingDotsStyle: Self = this.set("pagingDotsStyle", js.undefined)
    @scala.inline
    def setPrevButtonClassName(value: String): Self = this.set("prevButtonClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButtonClassName: Self = this.set("prevButtonClassName", js.undefined)
    @scala.inline
    def setPrevButtonStyle(value: CSSProperties): Self = this.set("prevButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButtonStyle: Self = this.set("prevButtonStyle", js.undefined)
    @scala.inline
    def setPrevButtonText(value: String): Self = this.set("prevButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButtonText: Self = this.set("prevButtonText", js.undefined)
  }
  
}

