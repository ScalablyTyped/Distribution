package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerHostTypesMod.ILayerHostProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerHostMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/LayerHost", "LayerHost")
  @js.native
  class LayerHost protected ()
    extends Component[ILayerHostProps, js.Object, js.Any] {
    def this(props: ILayerHostProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILayerHostProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MLayerHost(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLayerHost(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLayerHost(): Boolean = js.native
  }
}
