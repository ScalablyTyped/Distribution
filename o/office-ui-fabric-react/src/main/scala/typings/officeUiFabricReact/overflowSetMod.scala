package typings.officeUiFabricReact

import typings.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/OverflowSet", JSImport.Namespace)
@js.native
object overflowSetMod extends js.Object {
  @js.native
  class OverflowSetBase protected ()
    extends typings.officeUiFabricReact.overflowSetBaseMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
  
  val OverflowSet: StatelessComponent[IOverflowSetProps] = js.native
}

