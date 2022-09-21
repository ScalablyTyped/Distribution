package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Image object, for use in `image.set({ ... })`. */
trait ImageUpdateData extends StObject {
  
  /**
    * Gets or sets the description of the Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the height of the Image layout.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the hyperlink of the Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the width of the Image layout.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageUpdateData {
  
  inline def apply(): ImageUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageUpdateData]
  }
  
  extension [Self <: ImageUpdateData](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
