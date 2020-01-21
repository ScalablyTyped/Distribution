package typings.officeUiFabricReact.layerBaseMod

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
@js.native
class LayerBase protected ()
  extends Component[ILayerProps, ILayerBaseState, js.Any] {
  def this(props: ILayerProps) = this()
  var _createLayerElement: js.Any = js.native
  var _getClassNames: js.Any = js.native
  var _getHost: js.Any = js.native
  var _removeLayerElement: js.Any = js.native
  var _rootRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MLayerBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLayerBase(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MLayerBase(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
@js.native
object LayerBase extends js.Object {
  var defaultProps: ILayerProps = js.native
}

