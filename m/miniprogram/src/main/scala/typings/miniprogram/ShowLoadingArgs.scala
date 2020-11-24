package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowLoadingArgs extends AsyncCallback[Unit] {
  
  /**
    * Text contents of loading.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Displaying delay, in ms, 0 by default If my.hideLoading was
    * called before this time, it is not displayed.
    */
  var delay: js.UndefOr[Double] = js.native
}
object ShowLoadingArgs {
  
  @scala.inline
  def apply(): ShowLoadingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowLoadingArgs]
  }
  
  @scala.inline
  implicit class ShowLoadingArgsOps[Self <: ShowLoadingArgs] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
}
