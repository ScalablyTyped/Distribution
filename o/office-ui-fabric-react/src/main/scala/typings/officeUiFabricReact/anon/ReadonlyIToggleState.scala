package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
trait ReadonlyIToggleState extends StObject {
  
  val checked: Boolean
}
object ReadonlyIToggleState {
  
  @scala.inline
  def apply(checked: Boolean): ReadonlyIToggleState = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIToggleState]
  }
  
  @scala.inline
  implicit class ReadonlyIToggleStateMutableBuilder[Self <: ReadonlyIToggleState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
