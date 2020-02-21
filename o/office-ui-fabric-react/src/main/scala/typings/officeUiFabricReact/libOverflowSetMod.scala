package typings.officeUiFabricReact

import typings.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/OverflowSet", JSImport.Namespace)
@js.native
object libOverflowSetMod extends js.Object {
  @js.native
  class OverflowSetBase protected ()
    extends typings.officeUiFabricReact.overflowSetMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
  
  val OverflowSet: FunctionComponent[IOverflowSetProps] = js.native
}

