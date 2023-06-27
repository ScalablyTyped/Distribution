package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.ListLevel} objects.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ListLevelCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the horizontal alignment of the list level. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets a Font object that represents the character formatting of the specified object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the name of the style that's linked to the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var linkedStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the number format for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the position (in points) of the number or bullet for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the number style for the list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the list level that must appear before the specified list level restarts numbering at 1.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var resetOnHigher: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the starting number for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startAt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the tab position for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tabPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the position (in points) for the second line of wrapping text for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var textPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies the character inserted after the number for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var trailingCharacter: js.UndefOr[Boolean] = js.undefined
}
object ListLevelCollectionLoadOptions {
  
  inline def apply(): ListLevelCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLevelCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLevelCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLinkedStyle(value: Boolean): Self = StObject.set(x, "linkedStyle", value.asInstanceOf[js.Any])
    
    inline def setLinkedStyleUndefined: Self = StObject.set(x, "linkedStyle", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setNumberPosition(value: Boolean): Self = StObject.set(x, "numberPosition", value.asInstanceOf[js.Any])
    
    inline def setNumberPositionUndefined: Self = StObject.set(x, "numberPosition", js.undefined)
    
    inline def setNumberStyle(value: Boolean): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
    
    inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
    
    inline def setResetOnHigher(value: Boolean): Self = StObject.set(x, "resetOnHigher", value.asInstanceOf[js.Any])
    
    inline def setResetOnHigherUndefined: Self = StObject.set(x, "resetOnHigher", js.undefined)
    
    inline def setStartAt(value: Boolean): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setTabPosition(value: Boolean): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    inline def setTextPosition(value: Boolean): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
    
    inline def setTrailingCharacter(value: Boolean): Self = StObject.set(x, "trailingCharacter", value.asInstanceOf[js.Any])
    
    inline def setTrailingCharacterUndefined: Self = StObject.set(x, "trailingCharacter", js.undefined)
  }
}
