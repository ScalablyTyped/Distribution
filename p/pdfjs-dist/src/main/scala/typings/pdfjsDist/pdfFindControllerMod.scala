package typings.pdfjsDist

import typings.pdfjsDist.anon.MatchIdx
import typings.pdfjsDist.anon.MatchIndex
import typings.pdfjsDist.anon.PageIdx
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfFindControllerMod {
  
  object FindState {
    
    @JSImport("pdfjs-dist/types/web/pdf_find_controller", "FindState.FOUND")
    @js.native
    val FOUND: Double = js.native
    
    @JSImport("pdfjs-dist/types/web/pdf_find_controller", "FindState.NOT_FOUND")
    @js.native
    val NOT_FOUND: Double = js.native
    
    @JSImport("pdfjs-dist/types/web/pdf_find_controller", "FindState.PENDING")
    @js.native
    val PENDING: Double = js.native
    
    @JSImport("pdfjs-dist/types/web/pdf_find_controller", "FindState.WRAPPED")
    @js.native
    val WRAPPED: Double = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/pdf_find_controller", "PDFFindController")
  @js.native
  open class PDFFindController protected () extends StObject {
    /**
      * @param {PDFFindControllerOptions} options
      */
    def this(hasLinkServiceEventBus: PDFFindControllerOptions) = this()
    
    var _dirtyMatch: js.UndefOr[Boolean] = js.native
    
    var _eventBus: typings.pdfjsDist.eventUtilsMod.EventBus = js.native
    
    var _extractTextPromises: js.UndefOr[js.Array[Any]] = js.native
    
    var _findTimeout: Any = js.native
    
    var _firstPageCapability: Any = js.native
    
    var _hasDiacritics: js.UndefOr[js.Array[Any]] = js.native
    
    var _highlightMatches: js.UndefOr[Boolean] = js.native
    
    var _linkService: typings.pdfjsDist.interfacesMod.IPDFLinkService = js.native
    
    var _matchesCountTotal: js.UndefOr[Double] = js.native
    
    var _offset: js.UndefOr[PageIdx] = js.native
    
    var _pageContents: js.UndefOr[js.Array[Any]] = js.native
    
    var _pageDiffs: js.UndefOr[js.Array[Any]] = js.native
    
    var _pageMatches: js.UndefOr[js.Array[Any]] = js.native
    
    var _pageMatchesLength: js.UndefOr[js.Array[Any]] = js.native
    
    var _pagesToSearch: js.UndefOr[Double | Null] = js.native
    
    var _pdfDocument: js.UndefOr[typings.pdfjsDist.apiMod.PDFDocumentProxy | Null] = js.native
    
    var _pendingFindMatches: js.UndefOr[Set[Any]] = js.native
    
    var _rawQuery: Any = js.native
    
    var _resumePageIdx: Any = js.native
    
    var _scrollMatches: js.UndefOr[Boolean] = js.native
    
    var _selected: js.UndefOr[MatchIdx] = js.native
    
    var _state: Any = js.native
    
    def highlightMatches: js.UndefOr[Boolean] = js.native
    
    def pageMatches: js.UndefOr[js.Array[Any]] = js.native
    
    def pageMatchesLength: js.UndefOr[js.Array[Any]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def scrollMatchIntoView(hasElementSelectedLeftPageIndexMatchIndex: MatchIndex): Unit = js.native
    
    def selected: js.UndefOr[MatchIdx] = js.native
    
    /**
      * Set a reference to the PDF document in order to search it.
      * Note that searching is not possible if this method is not called.
      *
      * @param {PDFDocumentProxy} pdfDocument - The PDF document to search.
      */
    def setDocument(pdfDocument: PDFDocumentProxy): Unit = js.native
    
    def state: Any = js.native
  }
  
  type EventBus = typings.pdfjsDist.eventUtilsMod.EventBus
  
  type IPDFLinkService = typings.pdfjsDist.interfacesMod.IPDFLinkService
  
  type PDFDocumentProxy = typings.pdfjsDist.apiMod.PDFDocumentProxy
  
  trait PDFFindControllerOptions extends StObject {
    
    /**
      * - The application event bus.
      */
    var eventBus: EventBus
    
    /**
      * - The navigation/linking service.
      */
    var linkService: IPDFLinkService
  }
  object PDFFindControllerOptions {
    
    inline def apply(eventBus: EventBus, linkService: IPDFLinkService): PDFFindControllerOptions = {
      val __obj = js.Dynamic.literal(eventBus = eventBus.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFFindControllerOptions]
    }
    
    extension [Self <: PDFFindControllerOptions](x: Self) {
      
      inline def setEventBus(value: EventBus): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
    }
  }
}
