package typings.officeUiFabricReact.libPickersMod

import typings.officeUiFabricReact.anon.Items
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typings.officeUiFabricReact.pickersMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
@js.native
object BasePicker extends js.Object {
  
  def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
}
