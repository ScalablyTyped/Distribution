package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowToastArgs extends AsyncCallback[Unit] {
  
  /**
    * Text content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Displaying duration, in ms, 2000 by default.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * toast type, showing the related icon, none by default,
    * supporting success/fail/exception/none Here. If it is exception, content is mandatory.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ShowToastArgs {
  
  @scala.inline
  def apply(): ShowToastArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowToastArgs]
  }
  
  @scala.inline
  implicit class ShowToastArgsOps[Self <: ShowToastArgs] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
