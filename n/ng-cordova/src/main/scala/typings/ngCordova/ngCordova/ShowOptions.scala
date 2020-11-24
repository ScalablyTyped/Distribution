package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowOptions extends js.Object {
  
  var addCancelButtonWithLabel: js.UndefOr[String] = js.native
  
  var addDestructiveButtonWithLabel: js.UndefOr[String] = js.native
  
  var androidEnableCancelButton: js.UndefOr[Boolean] = js.native
  
  var buttonLabels: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var winphoneEnableCancelButton: js.UndefOr[Boolean] = js.native
}
object ShowOptions {
  
  @scala.inline
  def apply(): ShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowOptions]
  }
  
  @scala.inline
  implicit class ShowOptionsOps[Self <: ShowOptions] (val x: Self) extends AnyVal {
    
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
    def setAddCancelButtonWithLabel(value: String): Self = this.set("addCancelButtonWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddCancelButtonWithLabel: Self = this.set("addCancelButtonWithLabel", js.undefined)
    
    @scala.inline
    def setAddDestructiveButtonWithLabel(value: String): Self = this.set("addDestructiveButtonWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDestructiveButtonWithLabel: Self = this.set("addDestructiveButtonWithLabel", js.undefined)
    
    @scala.inline
    def setAndroidEnableCancelButton(value: Boolean): Self = this.set("androidEnableCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidEnableCancelButton: Self = this.set("androidEnableCancelButton", js.undefined)
    
    @scala.inline
    def setButtonLabelsVarargs(value: String*): Self = this.set("buttonLabels", js.Array(value :_*))
    
    @scala.inline
    def setButtonLabels(value: js.Array[String]): Self = this.set("buttonLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabels: Self = this.set("buttonLabels", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWinphoneEnableCancelButton(value: Boolean): Self = this.set("winphoneEnableCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWinphoneEnableCancelButton: Self = this.set("winphoneEnableCancelButton", js.undefined)
  }
}
