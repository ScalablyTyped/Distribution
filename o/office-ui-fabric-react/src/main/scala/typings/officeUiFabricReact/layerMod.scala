package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerHostTypesMod.ILayerHostProps
import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "Layer")
  @js.native
  val Layer: FunctionComponent[ILayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase")
  @js.native
  class LayerBase protected ()
    extends typings.officeUiFabricReact.layerBaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  /* static members */
  object LayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase.defaultProps")
    @js.native
    def defaultProps: ILayerProps = js.native
    @scala.inline
    def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerHost")
  @js.native
  class LayerHost protected ()
    extends typings.officeUiFabricReact.layerHostMod.LayerHost {
    def this(props: ILayerHostProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ILayerHostProps, context: js.Any) = this()
  }
}
