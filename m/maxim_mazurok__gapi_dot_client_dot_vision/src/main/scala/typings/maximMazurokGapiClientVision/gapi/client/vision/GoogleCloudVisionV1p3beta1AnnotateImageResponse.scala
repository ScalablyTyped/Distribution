package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1AnnotateImageResponse extends StObject {
  
  /** If present, contextual information is needed to understand where this image comes from. */
  var context: js.UndefOr[GoogleCloudVisionV1p3beta1ImageAnnotationContext] = js.native
  
  /** If present, crop hints have completed successfully. */
  var cropHintsAnnotation: js.UndefOr[GoogleCloudVisionV1p3beta1CropHintsAnnotation] = js.native
  
  /** If set, represents the error message for the operation. Note that filled-in image annotations are guaranteed to be correct, even when `error` is set. */
  var error: js.UndefOr[Status] = js.native
  
  /** If present, face detection has completed successfully. */
  var faceAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1FaceAnnotation]] = js.native
  
  /** If present, text (OCR) detection or document (OCR) text detection has completed successfully. This annotation provides the structural hierarchy for the OCR detected text. */
  var fullTextAnnotation: js.UndefOr[GoogleCloudVisionV1p3beta1TextAnnotation] = js.native
  
  /** If present, image properties were extracted successfully. */
  var imagePropertiesAnnotation: js.UndefOr[GoogleCloudVisionV1p3beta1ImageProperties] = js.native
  
  /** If present, label detection has completed successfully. */
  var labelAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  
  /** If present, landmark detection has completed successfully. */
  var landmarkAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  
  /** If present, localized object detection has completed successfully. This will be sorted descending by confidence score. */
  var localizedObjectAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1LocalizedObjectAnnotation]] = js.native
  
  /** If present, logo detection has completed successfully. */
  var logoAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  
  /** If present, product search has completed successfully. */
  var productSearchResults: js.UndefOr[GoogleCloudVisionV1p3beta1ProductSearchResults] = js.native
  
  /** If present, safe-search annotation has completed successfully. */
  var safeSearchAnnotation: js.UndefOr[GoogleCloudVisionV1p3beta1SafeSearchAnnotation] = js.native
  
  /** If present, text (OCR) detection has completed successfully. */
  var textAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]] = js.native
  
  /** If present, web detection has completed successfully. */
  var webDetection: js.UndefOr[GoogleCloudVisionV1p3beta1WebDetection] = js.native
}
object GoogleCloudVisionV1p3beta1AnnotateImageResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1AnnotateImageResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1AnnotateImageResponseMutableBuilder[Self <: GoogleCloudVisionV1p3beta1AnnotateImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: GoogleCloudVisionV1p3beta1ImageAnnotationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCropHintsAnnotation(value: GoogleCloudVisionV1p3beta1CropHintsAnnotation): Self = StObject.set(x, "cropHintsAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsAnnotationUndefined: Self = StObject.set(x, "cropHintsAnnotation", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFaceAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1FaceAnnotation]): Self = StObject.set(x, "faceAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceAnnotationsUndefined: Self = StObject.set(x, "faceAnnotations", js.undefined)
    
    @scala.inline
    def setFaceAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1FaceAnnotation*): Self = StObject.set(x, "faceAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFullTextAnnotation(value: GoogleCloudVisionV1p3beta1TextAnnotation): Self = StObject.set(x, "fullTextAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextAnnotationUndefined: Self = StObject.set(x, "fullTextAnnotation", js.undefined)
    
    @scala.inline
    def setImagePropertiesAnnotation(value: GoogleCloudVisionV1p3beta1ImageProperties): Self = StObject.set(x, "imagePropertiesAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesAnnotationUndefined: Self = StObject.set(x, "imagePropertiesAnnotation", js.undefined)
    
    @scala.inline
    def setLabelAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]): Self = StObject.set(x, "labelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAnnotationsUndefined: Self = StObject.set(x, "labelAnnotations", js.undefined)
    
    @scala.inline
    def setLabelAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1EntityAnnotation*): Self = StObject.set(x, "labelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLandmarkAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]): Self = StObject.set(x, "landmarkAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarkAnnotationsUndefined: Self = StObject.set(x, "landmarkAnnotations", js.undefined)
    
    @scala.inline
    def setLandmarkAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1EntityAnnotation*): Self = StObject.set(x, "landmarkAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLocalizedObjectAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1LocalizedObjectAnnotation]): Self = StObject.set(x, "localizedObjectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedObjectAnnotationsUndefined: Self = StObject.set(x, "localizedObjectAnnotations", js.undefined)
    
    @scala.inline
    def setLocalizedObjectAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1LocalizedObjectAnnotation*): Self = StObject.set(x, "localizedObjectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLogoAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]): Self = StObject.set(x, "logoAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoAnnotationsUndefined: Self = StObject.set(x, "logoAnnotations", js.undefined)
    
    @scala.inline
    def setLogoAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1EntityAnnotation*): Self = StObject.set(x, "logoAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setProductSearchResults(value: GoogleCloudVisionV1p3beta1ProductSearchResults): Self = StObject.set(x, "productSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSearchResultsUndefined: Self = StObject.set(x, "productSearchResults", js.undefined)
    
    @scala.inline
    def setSafeSearchAnnotation(value: GoogleCloudVisionV1p3beta1SafeSearchAnnotation): Self = StObject.set(x, "safeSearchAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeSearchAnnotationUndefined: Self = StObject.set(x, "safeSearchAnnotation", js.undefined)
    
    @scala.inline
    def setTextAnnotations(value: js.Array[GoogleCloudVisionV1p3beta1EntityAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: GoogleCloudVisionV1p3beta1EntityAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setWebDetection(value: GoogleCloudVisionV1p3beta1WebDetection): Self = StObject.set(x, "webDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDetectionUndefined: Self = StObject.set(x, "webDetection", js.undefined)
  }
}
