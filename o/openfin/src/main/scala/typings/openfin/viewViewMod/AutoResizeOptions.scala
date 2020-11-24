package typings.openfin.viewViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoResizeOptions extends js.Object {
  
  /**
    * If true, the view's height will grow and shrink together with the window. false
    * by default.
    */
  var height: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the view's x position and width will grow and shrink proportionally with
    * the window. false by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the view's y position and height will grow and shrink proportionally with
    * the window. false by default.
    */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the view's width will grow and shrink together with the window. false
    * by default.
    */
  var width: js.UndefOr[Boolean] = js.native
}
object AutoResizeOptions {
  
  @scala.inline
  def apply(): AutoResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResizeOptions]
  }
  
  @scala.inline
  implicit class AutoResizeOptionsOps[Self <: AutoResizeOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
