package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommandsEvents
  extends StObject
     with IEvents {
  
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ Double, Unit]] = js.undefined
}
object ICommandsEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ICommandsEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ICommandsEvents]
  }
  
  extension [Self <: ICommandsEvents](x: Self) {
    
    inline def setOnCustomCommand(value: /* commandID */ Double => Unit): Self = StObject.set(x, "OnCustomCommand", js.Any.fromFunction1(value))
    
    inline def setOnCustomCommandUndefined: Self = StObject.set(x, "OnCustomCommand", js.undefined)
  }
}
