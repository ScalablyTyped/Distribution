package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTitleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.base", "DocumentCardTitleBase")
  @js.native
  class DocumentCardTitleBase protected ()
    extends Component[IDocumentCardTitleProps, IDocumentCardTitleState, js.Any] {
    def this(props: IDocumentCardTitleProps) = this()
    
    /* private */ var _async: js.Any = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    /* private */ var _measureTitleElement: js.Any = js.native
    
    /* private */ var _shrinkTitle: js.Any = js.native
    
    /* private */ var _titleElement: js.Any = js.native
    
    /* private */ var _titleTruncationTimer: js.Any = js.native
    
    /* private */ var _truncateTitle: js.Any = js.native
    
    /* private */ var _truncateWhenInAnimation: js.Any = js.native
    
    /* private */ var _updateTruncation: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDocumentCardTitleBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDocumentCardTitleBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDocumentCardTitleBase(): Unit = js.native
  }
  
  trait IDocumentCardTitleState extends StObject {
    
    var clientWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * In measuring, it will render a same style text with whiteSpace: 'nowrap', to get overflow rate.
      * So that the logic can predict truncated text well.
      */
    var needMeasurement: Boolean
    
    var previousTitle: String
    
    var truncatedTitleFirstPiece: js.UndefOr[String] = js.undefined
    
    var truncatedTitleSecondPiece: js.UndefOr[String] = js.undefined
  }
  object IDocumentCardTitleState {
    
    inline def apply(needMeasurement: Boolean, previousTitle: String): IDocumentCardTitleState = {
      val __obj = js.Dynamic.literal(needMeasurement = needMeasurement.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleState]
    }
    
    extension [Self <: IDocumentCardTitleState](x: Self) {
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setClientWidthUndefined: Self = StObject.set(x, "clientWidth", js.undefined)
      
      inline def setNeedMeasurement(value: Boolean): Self = StObject.set(x, "needMeasurement", value.asInstanceOf[js.Any])
      
      inline def setPreviousTitle(value: String): Self = StObject.set(x, "previousTitle", value.asInstanceOf[js.Any])
      
      inline def setTruncatedTitleFirstPiece(value: String): Self = StObject.set(x, "truncatedTitleFirstPiece", value.asInstanceOf[js.Any])
      
      inline def setTruncatedTitleFirstPieceUndefined: Self = StObject.set(x, "truncatedTitleFirstPiece", js.undefined)
      
      inline def setTruncatedTitleSecondPiece(value: String): Self = StObject.set(x, "truncatedTitleSecondPiece", value.asInstanceOf[js.Any])
      
      inline def setTruncatedTitleSecondPieceUndefined: Self = StObject.set(x, "truncatedTitleSecondPiece", js.undefined)
    }
  }
}
