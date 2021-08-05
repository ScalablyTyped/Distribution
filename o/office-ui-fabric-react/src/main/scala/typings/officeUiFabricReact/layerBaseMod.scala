package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
  @js.native
  class LayerBase protected ()
    extends Component[ILayerProps, ILayerBaseState, js.Any] {
    def this(props: ILayerProps) = this()
    
    /* private */ var _createLayerElement: js.Any = js.native
    
    /* private */ var _getClassNames: js.Any = js.native
    
    /* private */ var _getHost: js.Any = js.native
    
    /* private */ var _removeLayerElement: js.Any = js.native
    
    /* private */ var _rootRef: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MLayerBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLayerBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLayerBase(): Unit = js.native
  }
  /* static members */
  object LayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase.defaultProps")
    @js.native
    def defaultProps: ILayerProps = js.native
    inline def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ILayerBaseState extends StObject {
    
    var hostId: js.UndefOr[String] = js.undefined
    
    var layerElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object ILayerBaseState {
    
    inline def apply(): ILayerBaseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILayerBaseState]
    }
    
    extension [Self <: ILayerBaseState](x: Self) {
      
      inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      inline def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      inline def setLayerElement(value: HTMLElement): Self = StObject.set(x, "layerElement", value.asInstanceOf[js.Any])
      
      inline def setLayerElementUndefined: Self = StObject.set(x, "layerElement", js.undefined)
    }
  }
}
