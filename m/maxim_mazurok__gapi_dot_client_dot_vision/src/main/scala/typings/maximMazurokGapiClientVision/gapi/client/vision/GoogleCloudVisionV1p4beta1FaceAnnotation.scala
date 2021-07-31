package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1FaceAnnotation extends StObject {
  
  /** Anger likelihood. */
  var angerLikelihood: js.UndefOr[String] = js.undefined
  
  /** Blurred likelihood. */
  var blurredLikelihood: js.UndefOr[String] = js.undefined
  
  /**
    * The bounding polygon around the face. The coordinates of the bounding box are in the original image's scale. The bounding box is computed to "frame" the face in accordance with
    * human expectations. It is based on the landmarker results. Note that one or more x and/or y coordinates may not be generated in the `BoundingPoly` (the polygon will be unbounded) if
    * only a partial face appears in the image to be annotated.
    */
  var boundingPoly: js.UndefOr[GoogleCloudVisionV1p4beta1BoundingPoly] = js.undefined
  
  /** Detection confidence. Range [0, 1]. */
  var detectionConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * The `fd_bounding_poly` bounding polygon is tighter than the `boundingPoly`, and encloses only the skin part of the face. Typically, it is used to eliminate the face from any image
    * analysis that detects the "amount of skin" visible in an image. It is not based on the landmarker results, only on the initial face detection, hence the fd (face detection) prefix.
    */
  var fdBoundingPoly: js.UndefOr[GoogleCloudVisionV1p4beta1BoundingPoly] = js.undefined
  
  /** Headwear likelihood. */
  var headwearLikelihood: js.UndefOr[String] = js.undefined
  
  /** Joy likelihood. */
  var joyLikelihood: js.UndefOr[String] = js.undefined
  
  /** Face landmarking confidence. Range [0, 1]. */
  var landmarkingConfidence: js.UndefOr[Double] = js.undefined
  
  /** Detected face landmarks. */
  var landmarks: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1FaceAnnotationLandmark]] = js.undefined
  
  /** Yaw angle, which indicates the leftward/rightward angle that the face is pointing relative to the vertical plane perpendicular to the image. Range [-180,180]. */
  var panAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional recognition information. Only computed if image_context.face_recognition_params is provided, **and** a match is found to a Celebrity in the input CelebritySet. This field
    * is sorted in order of decreasing confidence values.
    */
  var recognitionResult: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1FaceRecognitionResult]] = js.undefined
  
  /** Roll angle, which indicates the amount of clockwise/anti-clockwise rotation of the face relative to the image vertical about the axis perpendicular to the face. Range [-180,180]. */
  var rollAngle: js.UndefOr[Double] = js.undefined
  
  /** Sorrow likelihood. */
  var sorrowLikelihood: js.UndefOr[String] = js.undefined
  
  /** Surprise likelihood. */
  var surpriseLikelihood: js.UndefOr[String] = js.undefined
  
  /** Pitch angle, which indicates the upwards/downwards angle that the face is pointing relative to the image's horizontal plane. Range [-180,180]. */
  var tiltAngle: js.UndefOr[Double] = js.undefined
  
  /** Under-exposed likelihood. */
  var underExposedLikelihood: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p4beta1FaceAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1FaceAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1FaceAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p4beta1FaceAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngerLikelihood(value: String): Self = StObject.set(x, "angerLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngerLikelihoodUndefined: Self = StObject.set(x, "angerLikelihood", js.undefined)
    
    @scala.inline
    def setBlurredLikelihood(value: String): Self = StObject.set(x, "blurredLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurredLikelihoodUndefined: Self = StObject.set(x, "blurredLikelihood", js.undefined)
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setDetectionConfidence(value: Double): Self = StObject.set(x, "detectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionConfidenceUndefined: Self = StObject.set(x, "detectionConfidence", js.undefined)
    
    @scala.inline
    def setFdBoundingPoly(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "fdBoundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdBoundingPolyUndefined: Self = StObject.set(x, "fdBoundingPoly", js.undefined)
    
    @scala.inline
    def setHeadwearLikelihood(value: String): Self = StObject.set(x, "headwearLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadwearLikelihoodUndefined: Self = StObject.set(x, "headwearLikelihood", js.undefined)
    
    @scala.inline
    def setJoyLikelihood(value: String): Self = StObject.set(x, "joyLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoyLikelihoodUndefined: Self = StObject.set(x, "joyLikelihood", js.undefined)
    
    @scala.inline
    def setLandmarkingConfidence(value: Double): Self = StObject.set(x, "landmarkingConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarkingConfidenceUndefined: Self = StObject.set(x, "landmarkingConfidence", js.undefined)
    
    @scala.inline
    def setLandmarks(value: js.Array[GoogleCloudVisionV1p4beta1FaceAnnotationLandmark]): Self = StObject.set(x, "landmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandmarksUndefined: Self = StObject.set(x, "landmarks", js.undefined)
    
    @scala.inline
    def setLandmarksVarargs(value: GoogleCloudVisionV1p4beta1FaceAnnotationLandmark*): Self = StObject.set(x, "landmarks", js.Array(value :_*))
    
    @scala.inline
    def setPanAngle(value: Double): Self = StObject.set(x, "panAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanAngleUndefined: Self = StObject.set(x, "panAngle", js.undefined)
    
    @scala.inline
    def setRecognitionResult(value: js.Array[GoogleCloudVisionV1p4beta1FaceRecognitionResult]): Self = StObject.set(x, "recognitionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognitionResultUndefined: Self = StObject.set(x, "recognitionResult", js.undefined)
    
    @scala.inline
    def setRecognitionResultVarargs(value: GoogleCloudVisionV1p4beta1FaceRecognitionResult*): Self = StObject.set(x, "recognitionResult", js.Array(value :_*))
    
    @scala.inline
    def setRollAngle(value: Double): Self = StObject.set(x, "rollAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollAngleUndefined: Self = StObject.set(x, "rollAngle", js.undefined)
    
    @scala.inline
    def setSorrowLikelihood(value: String): Self = StObject.set(x, "sorrowLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorrowLikelihoodUndefined: Self = StObject.set(x, "sorrowLikelihood", js.undefined)
    
    @scala.inline
    def setSurpriseLikelihood(value: String): Self = StObject.set(x, "surpriseLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurpriseLikelihoodUndefined: Self = StObject.set(x, "surpriseLikelihood", js.undefined)
    
    @scala.inline
    def setTiltAngle(value: Double): Self = StObject.set(x, "tiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltAngleUndefined: Self = StObject.set(x, "tiltAngle", js.undefined)
    
    @scala.inline
    def setUnderExposedLikelihood(value: String): Self = StObject.set(x, "underExposedLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderExposedLikelihoodUndefined: Self = StObject.set(x, "underExposedLikelihood", js.undefined)
  }
}
