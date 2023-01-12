package typings.ngbootbox

import typings.bootbox.BootboxDefaultOptions
import typings.bootbox.BootboxLocaleValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootboxService extends StObject {
  
  def addLocale(name: String, values: BootboxLocaleValues): Unit
  
  def alert(msg: String): js.Promise[Any]
  
  def confirm(msg: String): js.Promise[Any]
  
  def customDialog(options: NgBootboxDialog): Unit
  
  def hideAll(): Unit
  
  def prompt(msg: String): js.Promise[Any]
  
  def removeLocale(name: String): Unit
  
  def setDefaults(options: BootboxDefaultOptions): Unit
  
  def setLocale(name: String): Unit
}
object BootboxService {
  
  inline def apply(
    addLocale: (String, BootboxLocaleValues) => Unit,
    alert: String => js.Promise[Any],
    confirm: String => js.Promise[Any],
    customDialog: NgBootboxDialog => Unit,
    hideAll: () => Unit,
    prompt: String => js.Promise[Any],
    removeLocale: String => Unit,
    setDefaults: BootboxDefaultOptions => Unit,
    setLocale: String => Unit
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2(addLocale), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1(customDialog), hideAll = js.Any.fromFunction0(hideAll), prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1(removeLocale), setDefaults = js.Any.fromFunction1(setDefaults), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[BootboxService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootboxService] (val x: Self) extends AnyVal {
    
    inline def setAddLocale(value: (String, BootboxLocaleValues) => Unit): Self = StObject.set(x, "addLocale", js.Any.fromFunction2(value))
    
    inline def setAlert(value: String => js.Promise[Any]): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
    
    inline def setConfirm(value: String => js.Promise[Any]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    inline def setCustomDialog(value: NgBootboxDialog => Unit): Self = StObject.set(x, "customDialog", js.Any.fromFunction1(value))
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    inline def setPrompt(value: String => js.Promise[Any]): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
    
    inline def setRemoveLocale(value: String => Unit): Self = StObject.set(x, "removeLocale", js.Any.fromFunction1(value))
    
    inline def setSetDefaults(value: BootboxDefaultOptions => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    
    inline def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
