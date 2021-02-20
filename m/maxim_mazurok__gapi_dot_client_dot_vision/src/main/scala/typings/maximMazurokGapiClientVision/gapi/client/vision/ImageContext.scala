package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageContext extends StObject {
  
  /** Parameters for crop hints annotation request. */
  var cropHintsParams: js.UndefOr[CropHintsParams] = js.native
  
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty value yields the best results since it enables automatic language detection. For languages based on the Latin
    * alphabet, setting `language_hints` is not needed. In rare cases, when the language of the text in the image is known, setting a hint will help get better results (although it will
    * be a significant hindrance if the hint is wrong). Text detection returns an error if one or more of the specified languages is not one of the [supported
    * languages](https://cloud.google.com/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  
  /** Not used. */
  var latLongRect: js.UndefOr[LatLongRect] = js.native
  
  /** Parameters for product search. */
  var productSearchParams: js.UndefOr[ProductSearchParams] = js.native
  
  /** Parameters for web detection. */
  var webDetectionParams: js.UndefOr[WebDetectionParams] = js.native
}
object ImageContext {
  
  @scala.inline
  def apply(): ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageContext]
  }
  
  @scala.inline
  implicit class ImageContextMutableBuilder[Self <: ImageContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHintsParams(value: CropHintsParams): Self = StObject.set(x, "cropHintsParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsParamsUndefined: Self = StObject.set(x, "cropHintsParams", js.undefined)
    
    @scala.inline
    def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    @scala.inline
    def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
    
    @scala.inline
    def setLatLongRect(value: LatLongRect): Self = StObject.set(x, "latLongRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLongRectUndefined: Self = StObject.set(x, "latLongRect", js.undefined)
    
    @scala.inline
    def setProductSearchParams(value: ProductSearchParams): Self = StObject.set(x, "productSearchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSearchParamsUndefined: Self = StObject.set(x, "productSearchParams", js.undefined)
    
    @scala.inline
    def setWebDetectionParams(value: WebDetectionParams): Self = StObject.set(x, "webDetectionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDetectionParamsUndefined: Self = StObject.set(x, "webDetectionParams", js.undefined)
  }
}
