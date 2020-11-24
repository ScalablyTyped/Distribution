package typings.officeUiFabricReact

import typings.officeUiFabricReact.linkTypesMod.ILink
import typings.officeUiFabricReact.linkTypesMod.ILinkProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Link/Link.base", JSImport.Namespace)
@js.native
object linkBaseMod extends js.Object {
  
  @js.native
  class LinkBase protected ()
    extends Component[ILinkProps, js.Object, js.Any]
       with ILink {
    def this(props: ILinkProps) = this()
    
    var _adjustPropsForRootType: js.Any = js.native
    
    var _getRootType: js.Any = js.native
    
    var _link: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _renderContent: js.Any = js.native
  }
}
