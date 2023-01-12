package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowEvents
  extends StObject
     with IEvents {
  
  var OnCloseWindow: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IWindowEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IWindowEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IWindowEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWindowEvents] (val x: Self) extends AnyVal {
    
    inline def setOnCloseWindow(value: () => Boolean): Self = StObject.set(x, "OnCloseWindow", js.Any.fromFunction0(value))
    
    inline def setOnCloseWindowUndefined: Self = StObject.set(x, "OnCloseWindow", js.undefined)
  }
}
