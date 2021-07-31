package typings.ngbootbox

import typings.bootbox.BootboxButtonMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgBootboxDialog extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var backdrop: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[BootboxButtonMap] = js.undefined
  
  var callback: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onEscape: js.UndefOr[js.Function0[js.Any | Boolean]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object NgBootboxDialog {
  
  @scala.inline
  def apply(): NgBootboxDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NgBootboxDialog]
  }
  
  @scala.inline
  implicit class NgBootboxDialogMutableBuilder[Self <: NgBootboxDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    @scala.inline
    def setButtons(value: BootboxButtonMap): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnEscape(value: () => js.Any | Boolean): Self = StObject.set(x, "onEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
