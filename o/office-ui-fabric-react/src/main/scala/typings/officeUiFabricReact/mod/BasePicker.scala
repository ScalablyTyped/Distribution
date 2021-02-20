package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Items
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typings.officeUiFabricReact.libPickersMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
object BasePicker {
  
  @JSImport("office-ui-fabric-react", "BasePicker.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
}
