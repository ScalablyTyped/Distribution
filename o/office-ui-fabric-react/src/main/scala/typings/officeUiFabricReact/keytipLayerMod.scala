package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipLayerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipLayer", "KeytipLayer")
  @js.native
  val KeytipLayer: FunctionComponent[IKeytipLayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipLayer", "KeytipLayerBase")
  @js.native
  open class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.keytipLayerBaseMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: Any) = this()
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/KeytipLayer", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/KeytipLayer", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    inline def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
