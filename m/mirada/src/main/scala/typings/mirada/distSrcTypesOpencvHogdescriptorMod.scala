package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.FileStorage
import typings.mirada.distSrcTypesOpencvHacksMod.UMat
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Point
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvHogdescriptorMod {
  
  @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "DEFAULT_NLEVELS")
  @js.native
  val DEFAULT_NLEVELS: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "DESCR_FORMAT_COL_BY_COL")
  @js.native
  val DESCR_FORMAT_COL_BY_COL: DescriptorStorageFormat = js.native
  
  @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "DESCR_FORMAT_ROW_BY_ROW")
  @js.native
  val DESCR_FORMAT_ROW_BY_ROW: DescriptorStorageFormat = js.native
  
  @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "HOGDescriptor")
  @js.native
  /**
    *   aqual to [HOGDescriptor](Size(64,128), Size(16,16), Size(8,8), Size(8,8), 9 )
    */
  open class HOGDescriptor () extends StObject {
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param d the HOGDescriptor which cloned to create a new one.
      */
    def this(d: HOGDescriptor) = this()
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param filename The file name containing HOGDescriptor properties and coefficients for the linear
      * SVM classifier.
      */
    def this(filename: String) = this()
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param _winSize sets winSize with given value.
      *
      * @param _blockSize sets blockSize with given value.
      *
      * @param _blockStride sets blockStride with given value.
      *
      * @param _cellSize sets cellSize with given value.
      *
      * @param _nbins sets nbins with given value.
      *
      * @param _derivAperture sets derivAperture with given value.
      *
      * @param _winSigma sets winSigma with given value.
      *
      * @param _histogramNormType sets histogramNormType with given value.
      *
      * @param _L2HysThreshold sets L2HysThreshold with given value.
      *
      * @param _gammaCorrection sets gammaCorrection with given value.
      *
      * @param _nlevels sets nlevels with given value.
      *
      * @param _signedGradient sets signedGradient with given value.
      */
    def this(
      _winSize: Size,
      _blockSize: Size,
      _blockStride: Size,
      _cellSize: Size,
      _nbins: int,
      _derivAperture: js.UndefOr[int],
      _winSigma: js.UndefOr[double],
      _histogramNormType: js.UndefOr[Any],
      _L2HysThreshold: js.UndefOr[double],
      _gammaCorrection: js.UndefOr[bool],
      _nlevels: js.UndefOr[int],
      _signedGradient: js.UndefOr[bool]
    ) = this()
    
    var L2HysThreshold: double = js.native
    
    var blockSize: Size = js.native
    
    var blockStride: Size = js.native
    
    var cellSize: Size = js.native
    
    def checkDetectorSize(): bool = js.native
    
    /**
      * @param img Matrix of the type CV_8U containing an image where HOG features will be calculated.
      *
      * @param descriptors Matrix of the type CV_32F
      *
      * @param winStride Window stride. It must be a multiple of block stride.
      *
      * @param padding Padding
      *
      * @param locations Vector of Point
      */
    def compute(img: InputArray, descriptors: Any): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Unit, padding: Unit, locations: Point): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Unit, padding: Size): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Unit, padding: Size, locations: Point): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Size): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Size, padding: Unit, locations: Point): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Size, padding: Size): InputArray = js.native
    def compute(img: InputArray, descriptors: Any, winStride: Size, padding: Size, locations: Point): InputArray = js.native
    
    /**
      * @param img Matrix contains the image to be computed
      *
      * @param grad Matrix of type CV_32FC2 contains computed gradients
      *
      * @param angleOfs Matrix of type CV_8UC2 contains quantized gradient orientations
      *
      * @param paddingTL Padding from top-left
      *
      * @param paddingBR Padding from bottom-right
      */
    def computeGradient(img: InputArray, grad: InputOutputArray, angleOfs: InputOutputArray): InputArray = js.native
    def computeGradient(
      img: InputArray,
      grad: InputOutputArray,
      angleOfs: InputOutputArray,
      paddingTL: Unit,
      paddingBR: Size
    ): InputArray = js.native
    def computeGradient(img: InputArray, grad: InputOutputArray, angleOfs: InputOutputArray, paddingTL: Size): InputArray = js.native
    def computeGradient(
      img: InputArray,
      grad: InputOutputArray,
      angleOfs: InputOutputArray,
      paddingTL: Size,
      paddingBR: Size
    ): InputArray = js.native
    
    /**
      * @param c cloned HOGDescriptor
      */
    def copyTo(c: HOGDescriptor): HOGDescriptor = js.native
    
    var derivAperture: int = js.native
    
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param foundLocations Vector of point where each point contains left-top corner point of detected
      * object boundaries.
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here.
      *
      * @param winStride Window stride. It must be a multiple of block stride.
      *
      * @param padding Padding
      *
      * @param searchLocations Vector of Point includes locations to search.
      */
    def detect(img: InputArray, foundLocations: Any): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: Unit, winStride: Unit, padding: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: Unit, winStride: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: Unit,
      winStride: Size,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: Unit, winStride: Size, padding: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: Unit,
      winStride: Size,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: double): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: double, winStride: Unit, padding: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: double, winStride: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: double,
      winStride: Size,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, hitThreshold: double, winStride: Size, padding: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: double,
      winStride: Size,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param foundLocations Vector of point where each point contains left-top corner point of detected
      * object boundaries.
      *
      * @param weights Vector that will contain confidence values for each detected object.
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here.
      *
      * @param winStride Window stride. It must be a multiple of block stride.
      *
      * @param padding Padding
      *
      * @param searchLocations Vector of Point includes set of requested locations to be evaluated.
      */
    def detect(img: InputArray, foundLocations: Any, weights: Any): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Size
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, weights: Any, hitThreshold: Unit, winStride: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Size,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Size,
      padding: Size
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: Unit,
      winStride: Size,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, weights: Any, hitThreshold: double): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Size
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    def detect(img: InputArray, foundLocations: Any, weights: Any, hitThreshold: double, winStride: Size): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Size,
      padding: Unit,
      searchLocations: Point
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Size,
      padding: Size
    ): InputArray = js.native
    def detect(
      img: InputArray,
      foundLocations: Any,
      weights: Any,
      hitThreshold: double,
      winStride: Size,
      padding: Size,
      searchLocations: Point
    ): InputArray = js.native
    
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param foundLocations Vector of rectangles where each rectangle contains the detected object.
      *
      * @param foundWeights Vector that will contain confidence values for each detected object.
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here.
      *
      * @param winStride Window stride. It must be a multiple of block stride.
      *
      * @param padding Padding
      *
      * @param scale Coefficient of the detection window increase.
      *
      * @param finalThreshold Final threshold
      *
      * @param useMeanshiftGrouping indicates grouping algorithm
      */
    def detectMultiScale(
      img: InputArray,
      foundLocations: Any,
      foundWeights: Any,
      hitThreshold: js.UndefOr[double],
      winStride: js.UndefOr[Size],
      padding: js.UndefOr[Size],
      scale: js.UndefOr[double],
      finalThreshold: js.UndefOr[double],
      useMeanshiftGrouping: js.UndefOr[bool]
    ): InputArray = js.native
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param foundLocations Vector of rectangles where each rectangle contains the detected object.
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here.
      *
      * @param winStride Window stride. It must be a multiple of block stride.
      *
      * @param padding Padding
      *
      * @param scale Coefficient of the detection window increase.
      *
      * @param finalThreshold Final threshold
      *
      * @param useMeanshiftGrouping indicates grouping algorithm
      */
    def detectMultiScale(
      img: InputArray,
      foundLocations: Any,
      hitThreshold: js.UndefOr[double],
      winStride: js.UndefOr[Size],
      padding: js.UndefOr[Size],
      scale: js.UndefOr[double],
      finalThreshold: js.UndefOr[double],
      useMeanshiftGrouping: js.UndefOr[bool]
    ): InputArray = js.native
    
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param foundLocations Vector of rectangles where each rectangle contains the detected object.
      *
      * @param locations Vector of DetectionROI
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here.
      *
      * @param groupThreshold Minimum possible number of rectangles minus 1. The threshold is used in a
      * group of rectangles to retain it.
      */
    def detectMultiScaleROI(img: InputArray, foundLocations: Any, locations: Any): InputArray = js.native
    def detectMultiScaleROI(img: InputArray, foundLocations: Any, locations: Any, hitThreshold: Unit, groupThreshold: int): InputArray = js.native
    def detectMultiScaleROI(img: InputArray, foundLocations: Any, locations: Any, hitThreshold: double): InputArray = js.native
    def detectMultiScaleROI(img: InputArray, foundLocations: Any, locations: Any, hitThreshold: double, groupThreshold: int): InputArray = js.native
    
    /**
      * @param img Matrix of the type CV_8U or CV_8UC3 containing an image where objects are detected.
      *
      * @param locations Vector of Point
      *
      * @param foundLocations Vector of Point where each Point is detected object's top-left point.
      *
      * @param confidences confidences
      *
      * @param hitThreshold Threshold for the distance between features and SVM classifying plane. Usually
      * it is 0 and should be specified in the detector coefficients (as the last free coefficient). But if
      * the free coefficient is omitted (which is allowed), you can specify it manually here
      *
      * @param winStride winStride
      *
      * @param padding padding
      */
    def detectROI(img: InputArray, locations: Any, foundLocations: Any, confidences: Any): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: Unit,
      winStride: Any
    ): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: Unit,
      winStride: Any,
      padding: Any
    ): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: Unit,
      winStride: Unit,
      padding: Any
    ): InputArray = js.native
    def detectROI(img: InputArray, locations: Any, foundLocations: Any, confidences: Any, hitThreshold: double): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: double,
      winStride: Any
    ): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: double,
      winStride: Any,
      padding: Any
    ): InputArray = js.native
    def detectROI(
      img: InputArray,
      locations: Any,
      foundLocations: Any,
      confidences: Any,
      hitThreshold: double,
      winStride: Unit,
      padding: Any
    ): InputArray = js.native
    
    var free_coef: float = js.native
    
    var gammaCorrection: bool = js.native
    
    def getDescriptorSize(): sizeT = js.native
    
    def getWinSigma(): double = js.native
    
    /**
      * @param rectList Input/output vector of rectangles. Output vector includes retained and grouped
      * rectangles. (The Python list is not modified in place.)
      *
      * @param weights Input/output vector of weights of rectangles. Output vector includes weights of
      * retained and grouped rectangles. (The Python list is not modified in place.)
      *
      * @param groupThreshold Minimum possible number of rectangles minus 1. The threshold is used in a
      * group of rectangles to retain it.
      *
      * @param eps Relative difference between sides of the rectangles to merge them into a group.
      */
    def groupRectangles(rectList: Any, weights: Any, groupThreshold: int, eps: double): Any = js.native
    
    var histogramNormType: Any = js.native
    
    /**
      * @param filename Path of the file to read.
      *
      * @param objname The optional name of the node to read (if empty, the first top-level node will be
      * used).
      */
    def load(filename: String): String = js.native
    def load(filename: String, objname: String): String = js.native
    
    var nbins: int = js.native
    
    var nlevels: int = js.native
    
    var oclSvmDetector: UMat = js.native
    
    /**
      * @param fn File node
      */
    def read(fn: FileNode): FileNode = js.native
    
    /**
      * @param filename File name
      *
      * @param objname Object name
      */
    def save(filename: String): String = js.native
    def save(filename: String, objname: String): String = js.native
    
    /**
      * @param svmdetector coefficients for the linear SVM classifier.
      */
    def setSVMDetector(svmdetector: InputArray): InputArray = js.native
    
    var signedGradient: bool = js.native
    
    var svmDetector: Any = js.native
    
    var winSigma: double = js.native
    
    var winSize: Size = js.native
    
    /**
      * @param fs File storage
      *
      * @param objname Object name
      */
    def write(fs: FileStorage, objname: String): FileStorage = js.native
  }
  /* static members */
  object HOGDescriptor {
    
    @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "HOGDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDaimlerPeopleDetector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDaimlerPeopleDetector")().asInstanceOf[Any]
    
    inline def getDefaultPeopleDetector(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultPeopleDetector")().asInstanceOf[Any]
  }
  
  @JSImport("mirada/dist/src/types/opencv/HOGDescriptor", "L2Hys")
  @js.native
  val L2Hys: HistogramNormType = js.native
  
  type DescriptorStorageFormat = Any
  
  type HistogramNormType = Any
}
