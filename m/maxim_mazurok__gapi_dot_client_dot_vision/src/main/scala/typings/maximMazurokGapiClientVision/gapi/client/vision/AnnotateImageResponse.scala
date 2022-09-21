package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotateImageResponse extends StObject {
  
  /** If present, contextual information is needed to understand where this image comes from. */
  var context: js.UndefOr[ImageAnnotationContext] = js.undefined
  
  /** If present, crop hints have completed successfully. */
  var cropHintsAnnotation: js.UndefOr[CropHintsAnnotation] = js.undefined
  
  /** If set, represents the error message for the operation. Note that filled-in image annotations are guaranteed to be correct, even when `error` is set. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** If present, face detection has completed successfully. */
  var faceAnnotations: js.UndefOr[js.Array[FaceAnnotation]] = js.undefined
  
  /** If present, text (OCR) detection or document (OCR) text detection has completed successfully. This annotation provides the structural hierarchy for the OCR detected text. */
  var fullTextAnnotation: js.UndefOr[TextAnnotation] = js.undefined
  
  /** If present, image properties were extracted successfully. */
  var imagePropertiesAnnotation: js.UndefOr[ImageProperties] = js.undefined
  
  /** If present, label detection has completed successfully. */
  var labelAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  
  /** If present, landmark detection has completed successfully. */
  var landmarkAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  
  /** If present, localized object detection has completed successfully. This will be sorted descending by confidence score. */
  var localizedObjectAnnotations: js.UndefOr[js.Array[LocalizedObjectAnnotation]] = js.undefined
  
  /** If present, logo detection has completed successfully. */
  var logoAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  
  /** If present, product search has completed successfully. */
  var productSearchResults: js.UndefOr[ProductSearchResults] = js.undefined
  
  /** If present, safe-search annotation has completed successfully. */
  var safeSearchAnnotation: js.UndefOr[SafeSearchAnnotation] = js.undefined
  
  /** If present, text (OCR) detection has completed successfully. */
  var textAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  
  /** If present, web detection has completed successfully. */
  var webDetection: js.UndefOr[WebDetection] = js.undefined
}
object AnnotateImageResponse {
  
  inline def apply(): AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateImageResponse]
  }
  
  extension [Self <: AnnotateImageResponse](x: Self) {
    
    inline def setContext(value: ImageAnnotationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCropHintsAnnotation(value: CropHintsAnnotation): Self = StObject.set(x, "cropHintsAnnotation", value.asInstanceOf[js.Any])
    
    inline def setCropHintsAnnotationUndefined: Self = StObject.set(x, "cropHintsAnnotation", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFaceAnnotations(value: js.Array[FaceAnnotation]): Self = StObject.set(x, "faceAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFaceAnnotationsUndefined: Self = StObject.set(x, "faceAnnotations", js.undefined)
    
    inline def setFaceAnnotationsVarargs(value: FaceAnnotation*): Self = StObject.set(x, "faceAnnotations", js.Array(value*))
    
    inline def setFullTextAnnotation(value: TextAnnotation): Self = StObject.set(x, "fullTextAnnotation", value.asInstanceOf[js.Any])
    
    inline def setFullTextAnnotationUndefined: Self = StObject.set(x, "fullTextAnnotation", js.undefined)
    
    inline def setImagePropertiesAnnotation(value: ImageProperties): Self = StObject.set(x, "imagePropertiesAnnotation", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesAnnotationUndefined: Self = StObject.set(x, "imagePropertiesAnnotation", js.undefined)
    
    inline def setLabelAnnotations(value: js.Array[EntityAnnotation]): Self = StObject.set(x, "labelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLabelAnnotationsUndefined: Self = StObject.set(x, "labelAnnotations", js.undefined)
    
    inline def setLabelAnnotationsVarargs(value: EntityAnnotation*): Self = StObject.set(x, "labelAnnotations", js.Array(value*))
    
    inline def setLandmarkAnnotations(value: js.Array[EntityAnnotation]): Self = StObject.set(x, "landmarkAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLandmarkAnnotationsUndefined: Self = StObject.set(x, "landmarkAnnotations", js.undefined)
    
    inline def setLandmarkAnnotationsVarargs(value: EntityAnnotation*): Self = StObject.set(x, "landmarkAnnotations", js.Array(value*))
    
    inline def setLocalizedObjectAnnotations(value: js.Array[LocalizedObjectAnnotation]): Self = StObject.set(x, "localizedObjectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLocalizedObjectAnnotationsUndefined: Self = StObject.set(x, "localizedObjectAnnotations", js.undefined)
    
    inline def setLocalizedObjectAnnotationsVarargs(value: LocalizedObjectAnnotation*): Self = StObject.set(x, "localizedObjectAnnotations", js.Array(value*))
    
    inline def setLogoAnnotations(value: js.Array[EntityAnnotation]): Self = StObject.set(x, "logoAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLogoAnnotationsUndefined: Self = StObject.set(x, "logoAnnotations", js.undefined)
    
    inline def setLogoAnnotationsVarargs(value: EntityAnnotation*): Self = StObject.set(x, "logoAnnotations", js.Array(value*))
    
    inline def setProductSearchResults(value: ProductSearchResults): Self = StObject.set(x, "productSearchResults", value.asInstanceOf[js.Any])
    
    inline def setProductSearchResultsUndefined: Self = StObject.set(x, "productSearchResults", js.undefined)
    
    inline def setSafeSearchAnnotation(value: SafeSearchAnnotation): Self = StObject.set(x, "safeSearchAnnotation", value.asInstanceOf[js.Any])
    
    inline def setSafeSearchAnnotationUndefined: Self = StObject.set(x, "safeSearchAnnotation", js.undefined)
    
    inline def setTextAnnotations(value: js.Array[EntityAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    inline def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    inline def setTextAnnotationsVarargs(value: EntityAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value*))
    
    inline def setWebDetection(value: WebDetection): Self = StObject.set(x, "webDetection", value.asInstanceOf[js.Any])
    
    inline def setWebDetectionUndefined: Self = StObject.set(x, "webDetection", js.undefined)
  }
}
