package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBackgroundColorArgs extends AsyncCallback[Unit] {
  
  /**
    * Window background color.
    */
  var backgroundColor: String = js.native
  
  /**
    * Bottom window background color, supported in iOS only.
    */
  var backgroundColorBottom: String = js.native
  
  /**
    * Top window background color, supported in iOS only.
    */
  var backgroundColorTop: String = js.native
}
object SetBackgroundColorArgs {
  
  @scala.inline
  def apply(backgroundColor: String, backgroundColorBottom: String, backgroundColorTop: String): SetBackgroundColorArgs = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundColorBottom = backgroundColorBottom.asInstanceOf[js.Any], backgroundColorTop = backgroundColorTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBackgroundColorArgs]
  }
  
  @scala.inline
  implicit class SetBackgroundColorArgsOps[Self <: SetBackgroundColorArgs] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = this.set("backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = this.set("backgroundColorTop", value.asInstanceOf[js.Any])
  }
}
