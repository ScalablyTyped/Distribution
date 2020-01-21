package typings.officeUiFabricReact

import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
@js.native
object navMod extends js.Object {
  @js.native
  class NavBase protected ()
    extends typings.officeUiFabricReact.navBaseMod.NavBase {
    def this(props: INavProps) = this()
  }
  
  val Nav: StatelessComponent[INavProps] = js.native
  def isRelativeUrl(url: String): Boolean = js.native
  /* static members */
  @js.native
  object NavBase extends js.Object {
    var defaultProps: INavProps = js.native
  }
  
}

