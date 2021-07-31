package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "LayerBase")
@js.native
class LayerBase protected ()
  extends typings.officeUiFabricReact.libLayerMod.LayerBase {
  def this(props: ILayerProps) = this()
}
/* static members */
object LayerBase {
  
  @JSImport("office-ui-fabric-react", "LayerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "LayerBase.defaultProps")
  @js.native
  def defaultProps: ILayerProps = js.native
  @scala.inline
  def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
