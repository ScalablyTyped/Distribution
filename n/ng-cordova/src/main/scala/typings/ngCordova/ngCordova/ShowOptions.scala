package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowOptions extends StObject {
  
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
  implicit class ShowOptionsMutableBuilder[Self <: ShowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCancelButtonWithLabel(value: String): Self = StObject.set(x, "addCancelButtonWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCancelButtonWithLabelUndefined: Self = StObject.set(x, "addCancelButtonWithLabel", js.undefined)
    
    @scala.inline
    def setAddDestructiveButtonWithLabel(value: String): Self = StObject.set(x, "addDestructiveButtonWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDestructiveButtonWithLabelUndefined: Self = StObject.set(x, "addDestructiveButtonWithLabel", js.undefined)
    
    @scala.inline
    def setAndroidEnableCancelButton(value: Boolean): Self = StObject.set(x, "androidEnableCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidEnableCancelButtonUndefined: Self = StObject.set(x, "androidEnableCancelButton", js.undefined)
    
    @scala.inline
    def setButtonLabels(value: js.Array[String]): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
    
    @scala.inline
    def setButtonLabelsVarargs(value: String*): Self = StObject.set(x, "buttonLabels", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWinphoneEnableCancelButton(value: Boolean): Self = StObject.set(x, "winphoneEnableCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinphoneEnableCancelButtonUndefined: Self = StObject.set(x, "winphoneEnableCancelButton", js.undefined)
  }
}
