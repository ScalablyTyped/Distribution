package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistentBrowserSessionControl extends ConditionalAccessSessionControl {
  
  // Possible values are: always, never.
  var mode: js.UndefOr[NullableOption[PersistentBrowserSessionMode]] = js.native
}
object PersistentBrowserSessionControl {
  
  @scala.inline
  def apply(): PersistentBrowserSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentBrowserSessionControl]
  }
  
  @scala.inline
  implicit class PersistentBrowserSessionControlMutableBuilder[Self <: PersistentBrowserSessionControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: NullableOption[PersistentBrowserSessionMode]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = StObject.set(x, "mode", null)
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
