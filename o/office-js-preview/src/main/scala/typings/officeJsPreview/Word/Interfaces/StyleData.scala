package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.StyleType
import typings.officeJsPreview.officeJsPreviewStrings.Character
import typings.officeJsPreview.officeJsPreviewStrings.Paragraph
import typings.officeJsPreview.officeJsPreviewStrings.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `style.toJSON()`. */
trait StyleData extends StObject {
  
  /**
    * Gets the name of an existing style to use as the base formatting of another style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var baseStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets whether the specified style is a built-in style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var builtIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the description of the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a font object that represents the character formatting of the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Gets whether the specified style is a built-in style that has been modified or applied in the document or a new style that has been created in the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var inUse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets whether a style is a linked style that can be used for both paragraph and character formatting.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var linked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a ListTemplate object that represents the list formatting for the specified Style object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var listTemplate: js.UndefOr[ListTemplateData] = js.undefined
  
  /**
    * Gets the name of a style in the language of the user.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var nameLocal: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the name of the style to be applied automatically to a new paragraph that is inserted after a paragraph formatted with the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var nextParagraphStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a ParagraphFormat object that represents the paragraph settings for the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var paragraphFormat: js.UndefOr[ParagraphFormatData] = js.undefined
  
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
    * Gets the style type.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var `type`: js.UndefOr[
    StyleType | Character | typings.officeJsPreview.officeJsPreviewStrings.List | Paragraph | Table
  ] = js.undefined
  
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
object StyleData {
  
  inline def apply(): StyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleData] (val x: Self) extends AnyVal {
    
    inline def setBaseStyle(value: String): Self = StObject.set(x, "baseStyle", value.asInstanceOf[js.Any])
    
    inline def setBaseStyleUndefined: Self = StObject.set(x, "baseStyle", js.undefined)
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    inline def setBuiltInUndefined: Self = StObject.set(x, "builtIn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
    
    inline def setLinked(value: Boolean): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
    
    inline def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
    
    inline def setListTemplate(value: ListTemplateData): Self = StObject.set(x, "listTemplate", value.asInstanceOf[js.Any])
    
    inline def setListTemplateUndefined: Self = StObject.set(x, "listTemplate", js.undefined)
    
    inline def setNameLocal(value: String): Self = StObject.set(x, "nameLocal", value.asInstanceOf[js.Any])
    
    inline def setNameLocalUndefined: Self = StObject.set(x, "nameLocal", js.undefined)
    
    inline def setNextParagraphStyle(value: String): Self = StObject.set(x, "nextParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setNextParagraphStyleUndefined: Self = StObject.set(x, "nextParagraphStyle", js.undefined)
    
    inline def setParagraphFormat(value: ParagraphFormatData): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormatUndefined: Self = StObject.set(x, "paragraphFormat", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuickStyle(value: Boolean): Self = StObject.set(x, "quickStyle", value.asInstanceOf[js.Any])
    
    inline def setQuickStyleUndefined: Self = StObject.set(x, "quickStyle", js.undefined)
    
    inline def setType(
      value: StyleType | Character | typings.officeJsPreview.officeJsPreviewStrings.List | Paragraph | Table
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnhideWhenUsed(value: Boolean): Self = StObject.set(x, "unhideWhenUsed", value.asInstanceOf[js.Any])
    
    inline def setUnhideWhenUsedUndefined: Self = StObject.set(x, "unhideWhenUsed", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
