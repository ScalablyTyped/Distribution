package typings.officeUiFabricReact.toggleBaseMod

import typings.officeUiFabricReact.toggleTypesMod.IToggle
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends BaseComponent[IToggleProps, IToggleState]
     with IToggle {
  def this(props: IToggleProps) = this()
  var _id: js.Any = js.native
  var _noop: js.Any = js.native
  var _onClick: js.Any = js.native
  var _toggleButton: js.Any = js.native
  /**
    * Gets the current checked state of the toggle.
    */
  val checked: Boolean = js.native
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
object ToggleBase extends js.Object {
  def getDerivedStateFromProps(nextProps: IToggleProps, prevState: IToggleState): Partial[IToggleState] | Null = js.native
}

