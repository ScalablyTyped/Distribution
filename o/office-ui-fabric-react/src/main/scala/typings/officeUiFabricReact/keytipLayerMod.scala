package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer", JSImport.Namespace)
@js.native
object keytipLayerMod extends js.Object {
  @js.native
  class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.keytipLayerBaseMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  
  val KeytipLayer: StatelessComponent[IKeytipLayerProps] = js.native
  /* static members */
  @js.native
  object KeytipLayerBase extends js.Object {
    var defaultProps: IKeytipLayerProps = js.native
  }
  
}

