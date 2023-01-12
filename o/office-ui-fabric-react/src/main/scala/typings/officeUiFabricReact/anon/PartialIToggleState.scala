package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
trait PartialIToggleState extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
}
object PartialIToggleState {
  
  inline def apply(): PartialIToggleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIToggleState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIToggleState] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
