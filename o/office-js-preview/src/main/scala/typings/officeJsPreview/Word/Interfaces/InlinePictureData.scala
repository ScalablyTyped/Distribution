package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.ImageFormat
import typings.officeJsPreview.officeJsPreviewStrings.Bmp_
import typings.officeJsPreview.officeJsPreviewStrings.Emf
import typings.officeJsPreview.officeJsPreviewStrings.Exif
import typings.officeJsPreview.officeJsPreviewStrings.Gif_
import typings.officeJsPreview.officeJsPreviewStrings.Icon
import typings.officeJsPreview.officeJsPreviewStrings.Jpeg_
import typings.officeJsPreview.officeJsPreviewStrings.Pdf
import typings.officeJsPreview.officeJsPreviewStrings.Pict
import typings.officeJsPreview.officeJsPreviewStrings.Png_
import typings.officeJsPreview.officeJsPreviewStrings.Svg_
import typings.officeJsPreview.officeJsPreviewStrings.Tiff
import typings.officeJsPreview.officeJsPreviewStrings.Undefined
import typings.officeJsPreview.officeJsPreviewStrings.Unsupported
import typings.officeJsPreview.officeJsPreviewStrings.Wmf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inlinePicture.toJSON()`. */
trait InlinePictureData extends StObject {
  
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the format of the inline image. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var imageFormat: js.UndefOr[
    ImageFormat | Unsupported | Undefined | Bmp_ | Jpeg_ | Gif_ | Tiff | Png_ | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg_
  ] = js.undefined
  
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object InlinePictureData {
  
  @scala.inline
  def apply(): InlinePictureData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureData]
  }
  
  @scala.inline
  implicit class InlinePictureDataMutableBuilder[Self <: InlinePictureData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setImageFormat(
      value: ImageFormat | Unsupported | Undefined | Bmp_ | Jpeg_ | Gif_ | Tiff | Png_ | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg_
    ): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
