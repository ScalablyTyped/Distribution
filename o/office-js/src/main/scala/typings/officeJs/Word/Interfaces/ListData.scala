package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ListLevelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `list.toJSON()`. */
trait ListData extends StObject {
  
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[js.Array[ListLevelType]] = js.undefined
  
  /**
    *
    * Gets paragraphs in the list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}
object ListData {
  
  @scala.inline
  def apply(): ListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListData]
  }
  
  @scala.inline
  implicit class ListDataMutableBuilder[Self <: ListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLevelExistences(value: js.Array[Boolean]): Self = StObject.set(x, "levelExistences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelExistencesUndefined: Self = StObject.set(x, "levelExistences", js.undefined)
    
    @scala.inline
    def setLevelExistencesVarargs(value: Boolean*): Self = StObject.set(x, "levelExistences", js.Array(value :_*))
    
    @scala.inline
    def setLevelTypes(value: js.Array[ListLevelType]): Self = StObject.set(x, "levelTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTypesUndefined: Self = StObject.set(x, "levelTypes", js.undefined)
    
    @scala.inline
    def setLevelTypesVarargs(value: ListLevelType*): Self = StObject.set(x, "levelTypes", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value :_*))
  }
}
