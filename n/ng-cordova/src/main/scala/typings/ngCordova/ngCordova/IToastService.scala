package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastService extends StObject {
  
  def show(message: String, duration: String, position: String): js.Any = js.native
  
  def showLongBottom(message: String): js.Any = js.native
  
  def showLongCenter(message: String): js.Any = js.native
  
  def showLongTop(message: String): js.Any = js.native
  
  def showShortBottom(message: String): js.Any = js.native
  
  def showShortCenter(message: String): js.Any = js.native
  
  def showShortTop(message: String): js.Any = js.native
}
object IToastService {
  
  @scala.inline
  def apply(
    show: (String, String, String) => js.Any,
    showLongBottom: String => js.Any,
    showLongCenter: String => js.Any,
    showLongTop: String => js.Any,
    showShortBottom: String => js.Any,
    showShortCenter: String => js.Any,
    showShortTop: String => js.Any
  ): IToastService = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction3(show), showLongBottom = js.Any.fromFunction1(showLongBottom), showLongCenter = js.Any.fromFunction1(showLongCenter), showLongTop = js.Any.fromFunction1(showLongTop), showShortBottom = js.Any.fromFunction1(showShortBottom), showShortCenter = js.Any.fromFunction1(showShortCenter), showShortTop = js.Any.fromFunction1(showShortTop))
    __obj.asInstanceOf[IToastService]
  }
  
  @scala.inline
  implicit class IToastServiceMutableBuilder[Self <: IToastService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: (String, String, String) => js.Any): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShowLongBottom(value: String => js.Any): Self = StObject.set(x, "showLongBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowLongCenter(value: String => js.Any): Self = StObject.set(x, "showLongCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowLongTop(value: String => js.Any): Self = StObject.set(x, "showLongTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowShortBottom(value: String => js.Any): Self = StObject.set(x, "showShortBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowShortCenter(value: String => js.Any): Self = StObject.set(x, "showShortCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowShortTop(value: String => js.Any): Self = StObject.set(x, "showShortTop", js.Any.fromFunction1(value))
  }
}
