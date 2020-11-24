package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  
  val Layer: FunctionComponent[ILayerProps] = js.native
  
  @js.native
  class LayerBase protected ()
    extends typings.officeUiFabricReact.layerBaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    
    var defaultProps: ILayerProps = js.native
  }
  
  @js.native
  class LayerHost ()
    extends typings.officeUiFabricReact.layerHostMod.LayerHost
}
