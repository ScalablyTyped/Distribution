package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageContext extends StObject {
  
  /** Parameters for crop hints annotation request. */
  var cropHintsParams: js.UndefOr[CropHintsParams] = js.undefined
  
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best results since it enables automatic language detection. For languages based on the Latin
    * alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text in the image is known, setting a hint will help get better results (although it will
    * be a significant hindrance if the hint is wrong). Text detection returns an error if one or more of the specified languages is not one of the [supported
    * languages](https://cloud.google.com/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Not used. */
  var latLongRect: js.UndefOr[LatLongRect] = js.undefined
  
  /** Parameters for product search. */
  var productSearchParams: js.UndefOr[ProductSearchParams] = js.undefined
  
  /** Parameters for text detection and document text detection. */
  var textDetectionParams: js.UndefOr[TextDetectionParams] = js.undefined
  
  /** Parameters for web detection. */
  var webDetectionParams: js.UndefOr[WebDetectionParams] = js.undefined
}
object ImageContext {
  
  inline def apply(): ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageContext]
  }
  
  extension [Self <: ImageContext](x: Self) {
    
    inline def setCropHintsParams(value: CropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    inline def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    inline def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    inline def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value*))
    
    inline def setLatLongRect(value: LatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    inline def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    inline def setProductSearchParams(value: ProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    inline def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    inline def setTextDetectionParams(value: TextDetectionParams): Self = StObject.set(x, "textDetectionParams", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionParamsUndefined: Self = StObject.set(x, "textDetectionParams", js.undefined)
    
    inline def setWebDetectionParams(value: WebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    inline def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
