package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  @js.native
  class LayerBase protected ()
    extends typings.officeUiFabricReact.layerBaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  
  @js.native
  class LayerHost ()
    extends typings.officeUiFabricReact.layerHostMod.LayerHost
  
  val Layer: FunctionComponent[ILayerProps] = js.native
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    var defaultProps: ILayerProps = js.native
  }
  
}

