package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inlinePicture.toJSON()`. */
trait InlinePictureData extends StObject {
  
  /**
    * Specifies a string that represents the alternative text associated with the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a string that contains the title for the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a number that describes the height of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a number that describes the width of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object InlinePictureData {
  
  inline def apply(): InlinePictureData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlinePictureData] (val x: Self) extends AnyVal {
    
    inline def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    inline def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    inline def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    inline def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
