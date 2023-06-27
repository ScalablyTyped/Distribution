package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Style object, for use in `style.set({ ... })`. */
trait StyleUpdateData extends StObject {
  
  /**
    * Gets a font object that represents the character formatting of the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  
  /**
    * Gets a ParagraphFormat object that represents the paragraph settings for the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var paragraphFormat: js.UndefOr[ParagraphFormatUpdateData] = js.undefined
  
  /**
    * Specifies the priority.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the style corresponds to an available quick style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var quickStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the specified style is made visible as a recommended style in the Styles and in the Styles task pane in Microsoft Word after it's used in the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var unhideWhenUsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the specified style is visible as a recommended style in the Styles gallery and in the Styles task pane.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object StyleUpdateData {
  
  inline def apply(): StyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleUpdateData] (val x: Self) extends AnyVal {
    
    inline def setFont(value: FontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setParagraphFormat(value: ParagraphFormatUpdateData): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormatUndefined: Self = StObject.set(x, "paragraphFormat", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuickStyle(value: Boolean): Self = StObject.set(x, "quickStyle", value.asInstanceOf[js.Any])
    
    inline def setQuickStyleUndefined: Self = StObject.set(x, "quickStyle", js.undefined)
    
    inline def setUnhideWhenUsed(value: Boolean): Self = StObject.set(x, "unhideWhenUsed", value.asInstanceOf[js.Any])
    
    inline def setUnhideWhenUsedUndefined: Self = StObject.set(x, "unhideWhenUsed", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
