package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.Items
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "BasePicker")
@js.native
class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typings.officeUiFabricReact.mod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
object BasePicker {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "BasePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDerivedStateFromProps(newProps: IBasePickerProps[js.Any]): Items | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any]).asInstanceOf[Items | Null]
}
