package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageScrollToArgs extends AsyncCallback[Unit] {
  
  var duration: js.UndefOr[Double] = js.native
  
  var scrollTo: js.UndefOr[Double] = js.native
  
  var selector: js.UndefOr[String] = js.native
}
object PageScrollToArgs {
  
  @scala.inline
  def apply(): PageScrollToArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToArgs]
  }
  
  @scala.inline
  implicit class PageScrollToArgsOps[Self <: PageScrollToArgs] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setScrollTo(value: Double): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
