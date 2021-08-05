package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentBrowserSessionControl
  extends StObject
     with ConditionalAccessSessionControl {
  
  // Possible values are: always, never.
  var mode: js.UndefOr[NullableOption[PersistentBrowserSessionMode]] = js.undefined
}
object PersistentBrowserSessionControl {
  
  inline def apply(): PersistentBrowserSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentBrowserSessionControl]
  }
  
  extension [Self <: PersistentBrowserSessionControl](x: Self) {
    
    inline def setMode(value: NullableOption[PersistentBrowserSessionMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
