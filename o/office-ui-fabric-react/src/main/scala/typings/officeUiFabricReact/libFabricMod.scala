package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Fabric", JSImport.Namespace)
@js.native
object libFabricMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends typings.officeUiFabricReact.fabricMod.FabricBase {
    def this(props: IFabricProps) = this()
  }
  
  val Fabric: FunctionComponent[IFabricProps] = js.native
}

