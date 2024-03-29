package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastService extends StObject {
  
  def show(message: String, duration: String, position: String): js.Any
  
  def showLongBottom(message: String): js.Any
  
  def showLongCenter(message: String): js.Any
  
  def showLongTop(message: String): js.Any
  
  def showShortBottom(message: String): js.Any
  
  def showShortCenter(message: String): js.Any
  
  def showShortTop(message: String): js.Any
}
object IToastService {
  
  inline def apply(
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
  
  extension [Self <: IToastService](x: Self) {
    
    inline def setShow(value: (String, String, String) => js.Any): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
    
    inline def setShowLongBottom(value: String => js.Any): Self = StObject.set(x, "showLongBottom", js.Any.fromFunction1(value))
    
    inline def setShowLongCenter(value: String => js.Any): Self = StObject.set(x, "showLongCenter", js.Any.fromFunction1(value))
    
    inline def setShowLongTop(value: String => js.Any): Self = StObject.set(x, "showLongTop", js.Any.fromFunction1(value))
    
    inline def setShowShortBottom(value: String => js.Any): Self = StObject.set(x, "showShortBottom", js.Any.fromFunction1(value))
    
    inline def setShowShortCenter(value: String => js.Any): Self = StObject.set(x, "showShortCenter", js.Any.fromFunction1(value))
    
    inline def setShowShortTop(value: String => js.Any): Self = StObject.set(x, "showShortTop", js.Any.fromFunction1(value))
  }
}
