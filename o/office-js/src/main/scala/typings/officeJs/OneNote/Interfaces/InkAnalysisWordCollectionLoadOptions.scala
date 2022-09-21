package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of InkAnalysisWord objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait InkAnalysisWordCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Reference to the parent InkAnalysisLine.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.undefined
}
object InkAnalysisWordCollectionLoadOptions {
  
  inline def apply(): InkAnalysisWordCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionLoadOptions]
  }
  
  extension [Self <: InkAnalysisWordCollectionLoadOptions](x: Self) {
    
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
