package typings.officeUiFabricReact

import typings.officeUiFabricReact.linkTypesMod.ILinkProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Link", JSImport.Namespace)
@js.native
object libLinkMod extends js.Object {
  
  val Link: FunctionComponent[ILinkProps] = js.native
  
  @js.native
  class LinkBase protected ()
    extends typings.officeUiFabricReact.linkMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
}
