package typings.openui5.sapUiTableTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$BusyStateChangedEventParameters extends StObject {
  
  /**
    * busy state
    */
  var busy: js.UndefOr[Boolean] = js.undefined
}
object Table$BusyStateChangedEventParameters {
  
  inline def apply(): Table$BusyStateChangedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$BusyStateChangedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$BusyStateChangedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
  }
}
