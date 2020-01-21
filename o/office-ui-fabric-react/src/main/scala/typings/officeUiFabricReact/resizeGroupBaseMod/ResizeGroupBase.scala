package typings.officeUiFabricReact.resizeGroupBaseMod

import typings.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.base", "ResizeGroupBase")
@js.native
class ResizeGroupBase protected () extends BaseComponent[IResizeGroupProps, IResizeGroupState] {
  def this(props: IResizeGroupProps) = this()
  var _afterComponentRendered: js.Any = js.native
  var _hasRenderedContent: js.Any = js.native
  var _initialHiddenDiv: js.Any = js.native
  var _nextResizeGroupStateProvider: js.Any = js.native
  var _onResize: js.Any = js.native
  var _root: js.Any = js.native
  var _updateHiddenDiv: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MResizeGroupBase(nextProps: IResizeGroupProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MResizeGroupBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MResizeGroupBase(prevProps: IResizeGroupProps): Unit = js.native
  def remeasure(): Unit = js.native
}

