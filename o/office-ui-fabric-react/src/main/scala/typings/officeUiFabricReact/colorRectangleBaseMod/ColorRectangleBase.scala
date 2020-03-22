package typings.officeUiFabricReact.colorRectangleBaseMod

import typings.officeUiFabricReact.PartialIColorRectanglePro
import typings.officeUiFabricReact.ReadonlyIColorRectanglePr
import typings.officeUiFabricReact.ReadonlyIColorRectangleSt
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleProps
import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
@js.native
class ColorRectangleBase protected ()
  extends Component[IColorRectangleProps, IColorRectangleState, js.Any]
     with IColorRectangle {
  def this(props: IColorRectangleProps) = this()
  var _descriptionId: js.Any = js.native
  var _disableEvents: js.Any = js.native
  var _events: js.Any = js.native
  var _isAdjustingSaturation: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  var _onMouseMove: js.Any = js.native
  var _root: js.Any = js.native
  var _updateColor: js.Any = js.native
  /** Currently selected color. */
  /* CompleteClass */
  override var color: IColor = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MColorRectangleBase(prevProps: ReadonlyIColorRectanglePr, prevState: ReadonlyIColorRectangleSt): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorRectangleBase(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
@js.native
object ColorRectangleBase extends js.Object {
  var defaultProps: PartialIColorRectanglePro = js.native
}

