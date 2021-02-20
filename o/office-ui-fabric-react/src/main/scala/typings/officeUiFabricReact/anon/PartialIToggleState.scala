package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
@js.native
trait PartialIToggleState extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.native
}
object PartialIToggleState {
  
  @scala.inline
  def apply(): PartialIToggleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIToggleState]
  }
  
  @scala.inline
  implicit class PartialIToggleStateMutableBuilder[Self <: PartialIToggleState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
