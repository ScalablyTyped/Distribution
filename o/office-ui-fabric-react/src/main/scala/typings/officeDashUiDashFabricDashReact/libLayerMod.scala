package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Layer", JSImport.Namespace)
@js.native
object libLayerMod extends js.Object {
  @js.native
  class LayerBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsLayerMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  
  @js.native
  class LayerHost ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerHostMod.LayerHost
  
  val Layer: StatelessComponent[ILayerProps] = js.native
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    var defaultProps: ILayerProps = js.native
  }
  
}

