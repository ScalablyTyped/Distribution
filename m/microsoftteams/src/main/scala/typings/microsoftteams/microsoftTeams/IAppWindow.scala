package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait IAppWindow extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function0[Unit]): Unit
  
  def postMessage(message: Any): Unit
}
object IAppWindow {
  
  inline def apply(addEventListener: (String, js.Function0[Unit]) => Unit, postMessage: Any => Unit): IAppWindow = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), postMessage = js.Any.fromFunction1(postMessage))
    __obj.asInstanceOf[IAppWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAppWindow] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
  }
}
