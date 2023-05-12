package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvCascadeClassifierMod {
  
  @JSImport("mirada/dist/src/types/opencv/CascadeClassifier", "CascadeClassifier")
  @js.native
  open class CascadeClassifier () extends Mat {
    /**
      * @param filename Name of the file from which the classifier is loaded.
      */
    def this(filename: String) = this()
    
    var cc: Ptr = js.native
    
    /**
      *   The function is parallelized with the TBB library.
      *
      * (Python) A face detection example using cascade classifiers can be found at
      * opencv_source_code/samples/python/facedetect.py
      *
      * @param image Matrix of the type CV_8U containing an image where objects are detected.
      *
      * @param objects Vector of rectangles where each rectangle contains the detected object, the
      * rectangles may be partially outside the original image.
      *
      * @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
      *
      * @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
      * to retain it.
      *
      * @param flags Parameter with the same meaning for an old cascade as in the function
      * cvHaarDetectObjects. It is not used for a new cascade.
      *
      * @param minSize Minimum possible object size. Objects smaller than that are ignored.
      *
      * @param maxSize Maximum possible object size. Objects larger than that are ignored. If maxSize ==
      * minSize model is evaluated on single scale.
      */
    def detectMultiScale(image: InputArray, objects: Any): InputArray = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param image Matrix of the type CV_8U containing an image where objects are detected.
      *
      * @param objects Vector of rectangles where each rectangle contains the detected object, the
      * rectangles may be partially outside the original image.
      *
      * @param numDetections Vector of detection numbers for the corresponding objects. An object's number
      * of detections is the number of neighboring positively classified rectangles that were joined
      * together to form the object.
      *
      * @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
      *
      * @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
      * to retain it.
      *
      * @param flags Parameter with the same meaning for an old cascade as in the function
      * cvHaarDetectObjects. It is not used for a new cascade.
      *
      * @param minSize Minimum possible object size. Objects smaller than that are ignored.
      *
      * @param maxSize Maximum possible object size. Objects larger than that are ignored. If maxSize ==
      * minSize model is evaluated on single scale.
      */
    def detectMultiScale(image: InputArray, objects: Any, numDetections: Any): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, numDetections: Any, scaleFactor: Unit, minNeighbors: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, numDetections: Any, scaleFactor: double): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, numDetections: Any, scaleFactor: double, minNeighbors: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      numDetections: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts. This function allows you to retrieve the final stage
      * decision certainty of classification. For this, one needs to set `outputRejectLevels` on true and
      * provide the `rejectLevels` and `levelWeights` parameter. For each resulting detection,
      * `levelWeights` will then contain the certainty of classification at the final stage. This value can
      * then be used to separate strong from weaker classifications.
      *
      *   A code sample on how to use it efficiently can be found below:
      *
      *   ```cpp
      *   Mat img;
      *   vector<double> weights;
      *   vector<int> levels;
      *   vector<Rect> detections;
      *   CascadeClassifier model("/path/to/your/model.xml");
      *   model.detectMultiScale(img, detections, levels, weights, 1.1, 3, 0, Size(), Size(), true);
      *   cerr << "Detection " << detections[0] << " with weight " << weights[0] << endl;
      *   ```
      */
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      rejectLevels: Any,
      levelWeights: Any,
      scaleFactor: js.UndefOr[double],
      minNeighbors: js.UndefOr[int],
      flags: js.UndefOr[int],
      minSize: js.UndefOr[Size],
      maxSize: js.UndefOr[Size],
      outputRejectLevels: js.UndefOr[bool]
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: Unit, flags: Unit, minSize: Size): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: Unit, flags: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: Unit, flags: int, minSize: Size): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: Unit,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: int, flags: Unit, minSize: Size): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: int, flags: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: Unit, minNeighbors: int, flags: int, minSize: Size): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: Unit,
      minNeighbors: int,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: double): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: double, minNeighbors: Unit, flags: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: Unit,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: double, minNeighbors: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Size
    ): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: Unit,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: double, minNeighbors: int, flags: int): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int,
      minSize: Unit,
      maxSize: Size
    ): InputArray = js.native
    def detectMultiScale(image: InputArray, objects: Any, scaleFactor: double, minNeighbors: int, flags: int, minSize: Size): InputArray = js.native
    def detectMultiScale(
      image: InputArray,
      objects: Any,
      scaleFactor: double,
      minNeighbors: int,
      flags: int,
      minSize: Size,
      maxSize: Size
    ): InputArray = js.native
    
    def getFeatureType(): int = js.native
    
    def getMaskGenerator(): Ptr = js.native
    
    def getOldCascade(): Any = js.native
    
    def getOriginalWindowSize(): Size = js.native
    
    def isOldFormatCascade(): bool = js.native
    
    /**
      * @param filename Name of the file from which the classifier is loaded. The file may contain an old
      * HAAR classifier trained by the haartraining application or a new cascade classifier trained by the
      * traincascade application.
      */
    def load(filename: String): String = js.native
    
    /**
      *   The file may contain a new cascade classifier (trained traincascade application) only.
      */
    def read(node: FileNode): FileNode = js.native
    
    def setMaskGenerator(maskGenerator: Ptr): Ptr = js.native
  }
  /* static members */
  object CascadeClassifier {
    
    @JSImport("mirada/dist/src/types/opencv/CascadeClassifier", "CascadeClassifier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(oldcascade: String, newcascade: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(oldcascade.asInstanceOf[js.Any], newcascade.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
