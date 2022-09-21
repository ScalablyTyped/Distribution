package typings.officeUiFabricReact

import typings.officeUiFabricReact.linkTypesMod.ILink
import typings.officeUiFabricReact.linkTypesMod.ILinkProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Link/Link.base", "LinkBase")
  @js.native
  open class LinkBase protected ()
    extends Component[ILinkProps, js.Object, Any]
       with ILink {
    def this(props: ILinkProps) = this()
    
    /* private */ var _adjustPropsForRootType: Any = js.native
    
    /* private */ var _getRootType: Any = js.native
    
    /* private */ var _link: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _renderContent: Any = js.native
    
    /** Sets focus to the link. */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
}
