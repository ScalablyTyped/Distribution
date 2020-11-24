package typings.officeUiFabricReact.pickersMod

import typings.officeUiFabricReact.anon.Items
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typings.officeUiFabricReact.basePickerMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
@js.native
object BasePicker extends js.Object {
  
  def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
}
