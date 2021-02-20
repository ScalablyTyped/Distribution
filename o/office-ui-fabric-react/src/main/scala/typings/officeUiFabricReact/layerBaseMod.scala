package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerBaseMod {
  
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
  object LayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.base", "LayerBase.defaultProps")
    @js.native
    def defaultProps: ILayerProps = js.native
    @scala.inline
    def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ILayerBaseState extends StObject {
    
    var hostId: js.UndefOr[String] = js.native
    
    var layerElement: js.UndefOr[HTMLElement] = js.native
  }
  object ILayerBaseState {
    
    @scala.inline
    def apply(): ILayerBaseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILayerBaseState]
    }
    
    @scala.inline
    implicit class ILayerBaseStateMutableBuilder[Self <: ILayerBaseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
      
      @scala.inline
      def setLayerElement(value: HTMLElement): Self = StObject.set(x, "layerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerElementUndefined: Self = StObject.set(x, "layerElement", js.undefined)
    }
  }
}
