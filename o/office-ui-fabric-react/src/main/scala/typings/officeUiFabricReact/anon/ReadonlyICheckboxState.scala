package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.base.ICheckboxState> */
trait ReadonlyICheckboxState extends StObject {
  
  val isChecked: js.UndefOr[Boolean] = js.undefined
  
  val isIndeterminate: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyICheckboxState {
  
  inline def apply(): ReadonlyICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyICheckboxState]
  }
  
  extension [Self <: ReadonlyICheckboxState](x: Self) {
    
    inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
    
    inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
    
    inline def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
  }
}
