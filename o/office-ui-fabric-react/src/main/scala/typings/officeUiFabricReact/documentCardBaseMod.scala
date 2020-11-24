package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCard
import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCardProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", JSImport.Namespace)
@js.native
object documentCardBaseMod extends js.Object {
  
  @js.native
  class DocumentCardBase protected ()
    extends Component[IDocumentCardProps, js.Any, js.Any]
       with IDocumentCard {
    def this(props: IDocumentCardProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _onAction: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _rootElement: js.Any = js.native
  }
  /* static members */
  @js.native
  object DocumentCardBase extends js.Object {
    
    var defaultProps: IDocumentCardProps = js.native
  }
}
