package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Fabric", JSImport.Namespace)
@js.native
object fabricMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends typings.officeUiFabricReact.fabricBaseMod.FabricBase {
    def this(props: IFabricProps) = this()
  }
  
  val Fabric: StatelessComponent[IFabricProps] = js.native
}

