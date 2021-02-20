package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.base.ICheckboxState> */
@js.native
trait ReadonlyICheckboxState extends StObject {
  
  val isChecked: js.UndefOr[Boolean] = js.native
  
  val isIndeterminate: js.UndefOr[Boolean] = js.native
}
object ReadonlyICheckboxState {
  
  @scala.inline
  def apply(): ReadonlyICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyICheckboxState]
  }
  
  @scala.inline
  implicit class ReadonlyICheckboxStateMutableBuilder[Self <: ReadonlyICheckboxState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    @scala.inline
    def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
  }
}
