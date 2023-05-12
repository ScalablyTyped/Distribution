package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options describing the operation.
  * @optionobject
  * @targetfolder objects/options
  * @minVersion 24.4
  */
trait GetPixelsOptions extends StObject {
  
  /**
    * If true, then RGBA pixels will be converted to RGB by matting on white.
    * The returned imageData property will not contain an alpha channel. Note that any areas devoid of pixel
    * data will still be trimmed, see `sourceBounds` above.
    * @minVersion 24.4
    */
  var applyAlpha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of a color profile to apply to the returned pixels. If omitted, then the resulting color profile
    * depends on the requested color space:
    * - If the requested color space matches the source document, then the returned data will use the color
    * profile of the source document.
    * - If the requested color space is different from the source document, then the working color profile for
    * that color space is used to convert colors.
    * @minVersion 24.4
    */
  var colorProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Requested color space of the returned pixels. If omitted, then the color space of the source document
    * is used to convert colors.
    * @minVersion 24.4
    */
  var colorSpace: js.UndefOr[String] = js.undefined
  
  /**
    * The requested `componentSize` of the returned image data. If this property is omitted then the
    * `componentSize` of the source pixel data is used. The value can be: -1
    * (for using the source document's depth), 8, 16, or 32.
    * @minVersion 24.4
    */
  var componentSize: js.UndefOr[ComponentSize] = js.undefined
  
  /**
    * The id of the source document. If missing, or negative, then the source is the active document.
    * @minVersion 24.4
    */
  var documentID: js.UndefOr[Double] = js.undefined
  
  /**
    * The id of the source layer. If the value is not provided then the API returns pixels
    * from the composite document image.
    * @minVersion 24.4
    */
  var layerID: js.UndefOr[Double] = js.undefined
  
  /**
    * The region whose pixels should be returned. If the value is not provided, then pixels from the entire
    * layer or document are is returned. The provided bounds will be trimmed to only that region that contains
    * pixel data. In this event, the returned `sourceBounds` will reflect this smaller region.
    * @minVersion 24.4
    */
  var sourceBounds: js.UndefOr[Bounds] = js.undefined
  
  /**
    * The dimensions of the returned image. If this value is not provided then the returned size will match
    * the requested size. That is, no scaling will be performed on the returned pixels.
    * @minVersion 24.4
    */
  var targetSize: js.UndefOr[Size] = js.undefined
}
object GetPixelsOptions {
  
  inline def apply(): GetPixelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPixelsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPixelsOptions] (val x: Self) extends AnyVal {
    
    inline def setApplyAlpha(value: Boolean): Self = StObject.set(x, "applyAlpha", value.asInstanceOf[js.Any])
    
    inline def setApplyAlphaUndefined: Self = StObject.set(x, "applyAlpha", js.undefined)
    
    inline def setColorProfile(value: String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    inline def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setComponentSize(value: ComponentSize): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
    
    inline def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setDocumentIDUndefined: Self = StObject.set(x, "documentID", js.undefined)
    
    inline def setLayerID(value: Double): Self = StObject.set(x, "layerID", value.asInstanceOf[js.Any])
    
    inline def setLayerIDUndefined: Self = StObject.set(x, "layerID", js.undefined)
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
    
    inline def setSourceBoundsUndefined: Self = StObject.set(x, "sourceBounds", js.undefined)
    
    inline def setTargetSize(value: Size): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
