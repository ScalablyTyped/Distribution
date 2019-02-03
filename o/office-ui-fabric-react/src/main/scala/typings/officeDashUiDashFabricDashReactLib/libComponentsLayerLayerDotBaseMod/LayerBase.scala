package typings
package officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
@js.native
class LayerBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps, 
      ILayerBaseState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps) = this()
  /**
    * Helper to stop events from bubbling up out of Layer.
    */
  var _filterEvent: js.Any = js.native
  /**
    * rootElement wrapper for setting virtual parent as soon as root element ref is available.
    */
  var _handleRootElementRef: js.Any = js.native
  var _host: js.Any = js.native
  var _layerElement: js.Any = js.native
  var _rootElement: js.Any = js.native
  /* private */ def _getClassNames(): js.Any = js.native
  /* private */ def _getHost(): js.Any = js.native
  /* private */ def _getLayerElement(): js.Any = js.native
  /* private */ def _removeLayerElement(): js.Any = js.native
  /* private */ def _setVirtualParent(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MLayerBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MLayerBase(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MLayerBase(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MLayerBase(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MLayerBase(): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
@js.native
object LayerBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsLayerLayerDotTypesMod.ILayerProps = js.native
}

