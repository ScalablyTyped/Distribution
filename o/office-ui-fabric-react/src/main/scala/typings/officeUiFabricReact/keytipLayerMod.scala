package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer", JSImport.Namespace)
@js.native
object keytipLayerMod extends js.Object {
  
  val KeytipLayer: FunctionComponent[IKeytipLayerProps] = js.native
  
  @js.native
  class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.keytipLayerBaseMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object KeytipLayerBase extends js.Object {
    
    var defaultProps: IKeytipLayerProps = js.native
  }
}
