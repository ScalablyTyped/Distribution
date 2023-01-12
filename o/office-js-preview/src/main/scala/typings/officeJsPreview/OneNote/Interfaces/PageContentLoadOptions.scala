package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait PageContentLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  
  /**
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  
  /**
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.undefined
  
  /**
    * Gets the page that contains the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentPage: js.UndefOr[PageLoadOptions] = js.undefined
  
  /**
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the type of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object PageContentLoadOptions {
  
  inline def apply(): PageContentLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageContentLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: ImageLoadOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInk(value: FloatingInkLoadOptions): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    inline def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOutline(value: OutlineLoadOptions): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setParentPage(value: PageLoadOptions): Self = StObject.set(x, "parentPage", value.asInstanceOf[js.Any])
    
    inline def setParentPageUndefined: Self = StObject.set(x, "parentPage", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
