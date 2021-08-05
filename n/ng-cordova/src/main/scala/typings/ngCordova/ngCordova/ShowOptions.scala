package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowOptions extends StObject {
  
  var addCancelButtonWithLabel: js.UndefOr[String] = js.undefined
  
  var addDestructiveButtonWithLabel: js.UndefOr[String] = js.undefined
  
  var androidEnableCancelButton: js.UndefOr[Boolean] = js.undefined
  
  var buttonLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var winphoneEnableCancelButton: js.UndefOr[Boolean] = js.undefined
}
object ShowOptions {
  
  inline def apply(): ShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowOptions]
  }
  
  extension [Self <: ShowOptions](x: Self) {
    
    inline def setAddCancelButtonWithLabel(value: String): Self = StObject.set(x, "addCancelButtonWithLabel", value.asInstanceOf[js.Any])
    
    inline def setAddCancelButtonWithLabelUndefined: Self = StObject.set(x, "addCancelButtonWithLabel", js.undefined)
    
    inline def setAddDestructiveButtonWithLabel(value: String): Self = StObject.set(x, "addDestructiveButtonWithLabel", value.asInstanceOf[js.Any])
    
    inline def setAddDestructiveButtonWithLabelUndefined: Self = StObject.set(x, "addDestructiveButtonWithLabel", js.undefined)
    
    inline def setAndroidEnableCancelButton(value: Boolean): Self = StObject.set(x, "androidEnableCancelButton", value.asInstanceOf[js.Any])
    
    inline def setAndroidEnableCancelButtonUndefined: Self = StObject.set(x, "androidEnableCancelButton", js.undefined)
    
    inline def setButtonLabels(value: js.Array[String]): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
    
    inline def setButtonLabelsVarargs(value: String*): Self = StObject.set(x, "buttonLabels", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWinphoneEnableCancelButton(value: Boolean): Self = StObject.set(x, "winphoneEnableCancelButton", value.asInstanceOf[js.Any])
    
    inline def setWinphoneEnableCancelButtonUndefined: Self = StObject.set(x, "winphoneEnableCancelButton", js.undefined)
  }
}
