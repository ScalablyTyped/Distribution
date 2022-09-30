package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
trait ListLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the list's id.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[Boolean] = js.undefined
}
object ListLoadOptions {
  
  inline def apply(): ListLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoadOptions]
  }
  
  extension [Self <: ListLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLevelExistences(value: Boolean): Self = StObject.set(x, "levelExistences", value.asInstanceOf[js.Any])
    
    inline def setLevelExistencesUndefined: Self = StObject.set(x, "levelExistences", js.undefined)
    
    inline def setLevelTypes(value: Boolean): Self = StObject.set(x, "levelTypes", value.asInstanceOf[js.Any])
    
    inline def setLevelTypesUndefined: Self = StObject.set(x, "levelTypes", js.undefined)
  }
}
