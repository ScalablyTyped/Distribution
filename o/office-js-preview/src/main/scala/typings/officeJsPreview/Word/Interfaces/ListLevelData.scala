package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.Word.TrailingCharacter
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.TrailingNone
import typings.officeJsPreview.officeJsPreviewStrings.TrailingSpace
import typings.officeJsPreview.officeJsPreviewStrings.TrailingTab
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listLevel.toJSON()`. */
trait ListLevelData extends StObject {
  
  /**
    * Specifies the horizontal alignment of the list level. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets a Font object that represents the character formatting of the specified object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Specifies the name of the style that's linked to the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var linkedStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the number format for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the position (in points) of the number or bullet for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the number style for the list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberStyle: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70, starting with typings.officeJsPreview.Word.ListBuiltInNumberStyle, typings.officeJsPreview.officeJsPreviewStrings.None, typings.officeJsPreview.officeJsPreviewStrings.Arabic */ Any
  ] = js.undefined
  
  /**
    * Specifies the list level that must appear before the specified list level restarts numbering at 1.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var resetOnHigher: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the starting number for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startAt: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the tab position for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tabPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the position (in points) for the second line of wrapping text for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var textPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the character inserted after the number for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var trailingCharacter: js.UndefOr[TrailingCharacter | TrailingTab | TrailingSpace | TrailingNone] = js.undefined
}
object ListLevelData {
  
  inline def apply(): ListLevelData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLevelData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLevelData] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLinkedStyle(value: String): Self = StObject.set(x, "linkedStyle", value.asInstanceOf[js.Any])
    
    inline def setLinkedStyleUndefined: Self = StObject.set(x, "linkedStyle", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setNumberPosition(value: Double): Self = StObject.set(x, "numberPosition", value.asInstanceOf[js.Any])
    
    inline def setNumberPositionUndefined: Self = StObject.set(x, "numberPosition", js.undefined)
    
    inline def setNumberStyle(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70, starting with typings.officeJsPreview.Word.ListBuiltInNumberStyle, typings.officeJsPreview.officeJsPreviewStrings.None, typings.officeJsPreview.officeJsPreviewStrings.Arabic */ Any
    ): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
    
    inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
    
    inline def setResetOnHigher(value: Double): Self = StObject.set(x, "resetOnHigher", value.asInstanceOf[js.Any])
    
    inline def setResetOnHigherUndefined: Self = StObject.set(x, "resetOnHigher", js.undefined)
    
    inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setTabPosition(value: Double): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
    
    inline def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    
    inline def setTextPosition(value: Double): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
    
    inline def setTrailingCharacter(value: TrailingCharacter | TrailingTab | TrailingSpace | TrailingNone): Self = StObject.set(x, "trailingCharacter", value.asInstanceOf[js.Any])
    
    inline def setTrailingCharacterUndefined: Self = StObject.set(x, "trailingCharacter", js.undefined)
  }
}
