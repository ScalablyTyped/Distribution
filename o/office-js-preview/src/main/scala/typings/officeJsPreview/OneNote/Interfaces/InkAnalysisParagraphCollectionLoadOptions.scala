package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of InkAnalysisParagraph objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait InkAnalysisParagraphCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisPage.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ink analysis lines in this ink analysis paragraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[InkAnalysisLineCollectionLoadOptions] = js.undefined
}
object InkAnalysisParagraphCollectionLoadOptions {
  
  inline def apply(): InkAnalysisParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkAnalysisParagraphCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInkAnalysis(value: InkAnalysisLoadOptions): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    inline def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
    
    inline def setLines(value: InkAnalysisLineCollectionLoadOptions): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
  }
}
