package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardDottypesMod.IDocumentCard
import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardDottypesMod.IDocumentCardProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase")
  @js.native
  open class DocumentCardBase protected ()
    extends Component[IDocumentCardProps, Any, Any]
       with IDocumentCard {
    def this(props: IDocumentCardProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _onAction: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _rootElement: Any = js.native
    
    /**
      * Sets focus to the DocumentCard.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object DocumentCardBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.base", "DocumentCardBase.defaultProps")
    @js.native
    def defaultProps: IDocumentCardProps = js.native
    inline def defaultProps_=(x: IDocumentCardProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
