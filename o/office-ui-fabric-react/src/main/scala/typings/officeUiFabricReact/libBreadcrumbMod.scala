package typings.officeUiFabricReact

import typings.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Breadcrumb", JSImport.Namespace)
@js.native
object libBreadcrumbMod extends js.Object {
  
  val Breadcrumb: FunctionComponent[IBreadcrumbProps] = js.native
  
  @js.native
  class BreadcrumbBase protected ()
    extends typings.officeUiFabricReact.breadcrumbMod.BreadcrumbBase {
    def this(props: IBreadcrumbProps) = this()
  }
  /* static members */
  @js.native
  object BreadcrumbBase extends js.Object {
    
    var defaultProps: IBreadcrumbProps = js.native
  }
}
