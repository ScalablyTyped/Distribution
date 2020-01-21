package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCard
import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCardProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", JSImport.Namespace)
@js.native
object documentCardBaseMod extends js.Object {
  @js.native
  class DocumentCardBase protected ()
    extends BaseComponent[IDocumentCardProps, js.Any]
       with IDocumentCard {
    def this(props: IDocumentCardProps) = this()
    var _classNames: js.Any = js.native
    var _onAction: js.Any = js.native
    var _onClick: js.Any = js.native
    var _onKeyDown: js.Any = js.native
    var _rootElement: js.Any = js.native
    /**
      * Sets focus to the DocumentCard.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object DocumentCardBase extends js.Object {
    var defaultProps: IDocumentCardProps = js.native
  }
  
}

