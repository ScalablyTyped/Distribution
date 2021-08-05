package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents ink analysis data for an identified word formed by ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkAnalysisWordLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineLoadOptions] = js.undefined
  
  /**
    *
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.undefined
}
object InkAnalysisWordLoadOptions {
  
  inline def apply(): InkAnalysisWordLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordLoadOptions]
  }
  
  extension [Self <: InkAnalysisWordLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguageId(value: Boolean): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    inline def setLine(value: InkAnalysisLineLoadOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setStrokePointers(value: Boolean): Self = StObject.set(x, "strokePointers", value.asInstanceOf[js.Any])
    
    inline def setStrokePointersUndefined: Self = StObject.set(x, "strokePointers", js.undefined)
    
    inline def setWordAlternates(value: Boolean): Self = StObject.set(x, "wordAlternates", value.asInstanceOf[js.Any])
    
    inline def setWordAlternatesUndefined: Self = StObject.set(x, "wordAlternates", js.undefined)
  }
}
