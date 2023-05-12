package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.Style} objects.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait StyleCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the name of an existing style to use as the base formatting of another style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var baseStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets whether the specified style is a built-in style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var builtIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the description of the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var description: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets a font object that represents the character formatting of the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets whether the specified style is a built-in style that has been modified or applied in the document or a new style that has been created in the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var inUse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets whether a style is a linked style that can be used for both paragraph and character formatting.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var linked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets a ListTemplate object that represents the list formatting for the specified Style object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var listTemplate: js.UndefOr[ListTemplateLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the name of a style in the language of the user.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the name of the style to be applied automatically to a new paragraph that is inserted after a paragraph formatted with the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nextParagraphStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets a ParagraphFormat object that represents the paragraph settings for the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var paragraphFormat: js.UndefOr[ParagraphFormatLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets the priority.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var priority: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets whether the style corresponds to an available quick style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var quickStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the style type.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets whether the specified style is made visible as a recommended style in the Styles and in the Styles task pane in Microsoft Word after it's used in the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var unhideWhenUsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets whether the specified style is visible as a recommended style in the Styles gallery and in the Styles task pane.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object StyleCollectionLoadOptions {
  
  inline def apply(): StyleCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBaseStyle(value: Boolean): Self = StObject.set(x, "baseStyle", value.asInstanceOf[js.Any])
    
    inline def setBaseStyleUndefined: Self = StObject.set(x, "baseStyle", js.undefined)
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    inline def setBuiltInUndefined: Self = StObject.set(x, "builtIn", js.undefined)
    
    inline def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
    
    inline def setLinked(value: Boolean): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
    
    inline def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
    
    inline def setListTemplate(value: ListTemplateLoadOptions): Self = StObject.set(x, "listTemplate", value.asInstanceOf[js.Any])
    
    inline def setListTemplateUndefined: Self = StObject.set(x, "listTemplate", js.undefined)
    
    inline def setNameLocal(value: Boolean): Self = StObject.set(x, "nameLocal", value.asInstanceOf[js.Any])
    
    inline def setNameLocalUndefined: Self = StObject.set(x, "nameLocal", js.undefined)
    
    inline def setNextParagraphStyle(value: Boolean): Self = StObject.set(x, "nextParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setNextParagraphStyleUndefined: Self = StObject.set(x, "nextParagraphStyle", js.undefined)
    
    inline def setParagraphFormat(value: ParagraphFormatLoadOptions): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormatUndefined: Self = StObject.set(x, "paragraphFormat", js.undefined)
    
    inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuickStyle(value: Boolean): Self = StObject.set(x, "quickStyle", value.asInstanceOf[js.Any])
    
    inline def setQuickStyleUndefined: Self = StObject.set(x, "quickStyle", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnhideWhenUsed(value: Boolean): Self = StObject.set(x, "unhideWhenUsed", value.asInstanceOf[js.Any])
    
    inline def setUnhideWhenUsedUndefined: Self = StObject.set(x, "unhideWhenUsed", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
