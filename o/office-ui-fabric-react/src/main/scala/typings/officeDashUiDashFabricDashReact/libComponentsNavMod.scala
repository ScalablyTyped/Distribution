package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
@js.native
object libComponentsNavMod extends js.Object {
  @js.native
  class NavBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotBaseMod.NavBase {
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

