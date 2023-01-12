package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ListLevelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `list.toJSON()`. */
trait ListData extends StObject {
  
  /**
    * Gets the list's id.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  /**
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[js.Array[ListLevelType]] = js.undefined
  
  /**
    * Gets paragraphs in the list. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}
object ListData {
  
  inline def apply(): ListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListData] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLevelExistences(value: js.Array[Boolean]): Self = StObject.set(x, "levelExistences", value.asInstanceOf[js.Any])
    
    inline def setLevelExistencesUndefined: Self = StObject.set(x, "levelExistences", js.undefined)
    
    inline def setLevelExistencesVarargs(value: Boolean*): Self = StObject.set(x, "levelExistences", js.Array(value*))
    
    inline def setLevelTypes(value: js.Array[ListLevelType]): Self = StObject.set(x, "levelTypes", value.asInstanceOf[js.Any])
    
    inline def setLevelTypesUndefined: Self = StObject.set(x, "levelTypes", js.undefined)
    
    inline def setLevelTypesVarargs(value: ListLevelType*): Self = StObject.set(x, "levelTypes", js.Array(value*))
    
    inline def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value*))
  }
}
