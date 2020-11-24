package typings.officeUiFabricReact

import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Nav", JSImport.Namespace)
@js.native
object navMod extends js.Object {
  
  val Nav: FunctionComponent[INavProps] = js.native
  
  def isRelativeUrl(url: String): Boolean = js.native
  
  @js.native
  class NavBase protected ()
    extends typings.officeUiFabricReact.navBaseMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  @js.native
  object NavBase extends js.Object {
    
    var defaultProps: INavProps = js.native
  }
}
