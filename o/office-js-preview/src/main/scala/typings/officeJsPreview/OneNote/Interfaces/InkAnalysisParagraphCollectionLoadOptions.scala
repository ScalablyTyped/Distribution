package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of InkAnalysisParagraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisParagraphCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisPage.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ink analysis lines in this ink analysis paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[InkAnalysisLineCollectionLoadOptions] = js.native
}
object InkAnalysisParagraphCollectionLoadOptions {
  
  @scala.inline
  def apply(): InkAnalysisParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InkAnalysisParagraphCollectionLoadOptionsMutableBuilder[Self <: InkAnalysisParagraphCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInkAnalysis(value: InkAnalysisLoadOptions): Self = StObject.set(x, "inkAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkAnalysisUndefined: Self = StObject.set(x, "inkAnalysis", js.undefined)
    
    @scala.inline
    def setLines(value: InkAnalysisLineCollectionLoadOptions): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
  }
}
