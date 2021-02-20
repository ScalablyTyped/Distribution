package typings.ngbootbox

import typings.bootbox.BootboxDefaultOptions
import typings.bootbox.BootboxLocaleValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootboxService extends StObject {
  
  def addLocale(name: String, values: BootboxLocaleValues): Unit = js.native
  
  def alert(msg: String): js.Promise[_] = js.native
  
  def confirm(msg: String): js.Promise[_] = js.native
  
  def customDialog(options: NgBootboxDialog): Unit = js.native
  
  def hideAll(): Unit = js.native
  
  def prompt(msg: String): js.Promise[_] = js.native
  
  def removeLocale(name: String): Unit = js.native
  
  def setDefaults(options: BootboxDefaultOptions): Unit = js.native
  
  def setLocale(name: String): Unit = js.native
}
object BootboxService {
  
  @scala.inline
  def apply(
    addLocale: (String, BootboxLocaleValues) => Unit,
    alert: String => js.Promise[_],
    confirm: String => js.Promise[_],
    customDialog: NgBootboxDialog => Unit,
    hideAll: () => Unit,
    prompt: String => js.Promise[_],
    removeLocale: String => Unit,
    setDefaults: BootboxDefaultOptions => Unit,
    setLocale: String => Unit
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2(addLocale), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1(customDialog), hideAll = js.Any.fromFunction0(hideAll), prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1(removeLocale), setDefaults = js.Any.fromFunction1(setDefaults), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[BootboxService]
  }
  
  @scala.inline
  implicit class BootboxServiceMutableBuilder[Self <: BootboxService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLocale(value: (String, BootboxLocaleValues) => Unit): Self = StObject.set(x, "addLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlert(value: String => js.Promise[_]): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfirm(value: String => js.Promise[_]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomDialog(value: NgBootboxDialog => Unit): Self = StObject.set(x, "customDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrompt(value: String => js.Promise[_]): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLocale(value: String => Unit): Self = StObject.set(x, "removeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaults(value: BootboxDefaultOptions => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
