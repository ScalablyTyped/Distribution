package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.FileStorage
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvDescriptorMatcherMod {
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "BRUTEFORCE")
  @js.native
  val BRUTEFORCE: MatcherType = js.native
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "BRUTEFORCE_HAMMING")
  @js.native
  val BRUTEFORCE_HAMMING: MatcherType = js.native
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "BRUTEFORCE_HAMMINGLUT")
  @js.native
  val BRUTEFORCE_HAMMINGLUT: MatcherType = js.native
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "BRUTEFORCE_L1")
  @js.native
  val BRUTEFORCE_L1: MatcherType = js.native
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "BRUTEFORCE_SL2")
  @js.native
  val BRUTEFORCE_SL2: MatcherType = js.native
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "DescriptorMatcher")
  @js.native
  open class DescriptorMatcher () extends StObject {
    
    /**
      *   If the collection is not empty, the new descriptors are added to existing train descriptors.
      *
      * @param descriptors Descriptors to add. Each descriptors[i] is a set of descriptors from the same
      * train image.
      */
    def add(descriptors: InputArrayOfArrays): InputArrayOfArrays = js.native
    
    def clear(): Unit = js.native
    
    def clone(emptyTrainData: bool): Ptr = js.native
    
    def empty(): bool = js.native
    
    def getTrainDescriptors(): Mat = js.native
    
    def isMaskSupported(): bool = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param matches Matches. Each matches[i] is k or less matches for the same query descriptor.
      *
      * @param k Count of best matches found per each query descriptor or less if a query descriptor has
      * less than k possible matches in total.
      *
      * @param masks Set of masks. Each masks[i] specifies permissible matches between the input query
      * descriptors and stored train descriptors from the i-th image trainDescCollection[i].
      *
      * @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
      * false, the matches vector has the same size as queryDescriptors rows. If compactResult is true, the
      * matches vector does not contain matches for fully masked-out query descriptors.
      */
    def knnMatch(queryDescriptors: InputArray, matches: Any, k: int): InputArray = js.native
    def knnMatch(queryDescriptors: InputArray, matches: Any, k: int, masks: Unit, compactResult: bool): InputArray = js.native
    def knnMatch(queryDescriptors: InputArray, matches: Any, k: int, masks: InputArrayOfArrays): InputArray = js.native
    def knnMatch(queryDescriptors: InputArray, matches: Any, k: int, masks: InputArrayOfArrays, compactResult: bool): InputArray = js.native
    /**
      *   These extended variants of [DescriptorMatcher::match] methods find several best matches for each
      * query descriptor. The matches are returned in the distance increasing order. See
      * [DescriptorMatcher::match] for the details about query and train descriptors.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
      * collection stored in the class object.
      *
      * @param matches Matches. Each matches[i] is k or less matches for the same query descriptor.
      *
      * @param k Count of best matches found per each query descriptor or less if a query descriptor has
      * less than k possible matches in total.
      *
      * @param mask Mask specifying permissible matches between an input query and train matrices of
      * descriptors.
      *
      * @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
      * false, the matches vector has the same size as queryDescriptors rows. If compactResult is true, the
      * matches vector does not contain matches for fully masked-out query descriptors.
      */
    def knnMatch(queryDescriptors: InputArray, trainDescriptors: InputArray, matches: Any, k: int): InputArray = js.native
    def knnMatch(
      queryDescriptors: InputArray,
      trainDescriptors: InputArray,
      matches: Any,
      k: int,
      mask: Unit,
      compactResult: bool
    ): InputArray = js.native
    def knnMatch(queryDescriptors: InputArray, trainDescriptors: InputArray, matches: Any, k: int, mask: InputArray): InputArray = js.native
    def knnMatch(
      queryDescriptors: InputArray,
      trainDescriptors: InputArray,
      matches: Any,
      k: int,
      mask: InputArray,
      compactResult: bool
    ): InputArray = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param matches Matches. If a query descriptor is masked out in mask , no match is added for this
      * descriptor. So, matches size may be smaller than the query descriptors count.
      *
      * @param masks Set of masks. Each masks[i] specifies permissible matches between the input query
      * descriptors and stored train descriptors from the i-th image trainDescCollection[i].
      */
    def `match`(queryDescriptors: InputArray, matches: Any): InputArray = js.native
    def `match`(queryDescriptors: InputArray, matches: Any, masks: InputArrayOfArrays): InputArray = js.native
    /**
      *   In the first variant of this method, the train descriptors are passed as an input argument. In the
      * second variant of the method, train descriptors collection that was set by [DescriptorMatcher::add]
      * is used. Optional mask (or masks) can be passed to specify which query and training descriptors can
      * be matched. Namely, queryDescriptors[i] can be matched with trainDescriptors[j] only if
      * mask.at<uchar>(i,j) is non-zero.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
      * collection stored in the class object.
      *
      * @param matches Matches. If a query descriptor is masked out in mask , no match is added for this
      * descriptor. So, matches size may be smaller than the query descriptors count.
      *
      * @param mask Mask specifying permissible matches between an input query and train matrices of
      * descriptors.
      */
    def `match`(queryDescriptors: InputArray, trainDescriptors: InputArray, matches: Any): InputArray = js.native
    def `match`(queryDescriptors: InputArray, trainDescriptors: InputArray, matches: Any, mask: InputArray): InputArray = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param matches Found matches.
      *
      * @param maxDistance Threshold for the distance between matched descriptors. Distance means here
      * metric distance (e.g. Hamming distance), not the distance between coordinates (which is measured in
      * Pixels)!
      *
      * @param masks Set of masks. Each masks[i] specifies permissible matches between the input query
      * descriptors and stored train descriptors from the i-th image trainDescCollection[i].
      *
      * @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
      * false, the matches vector has the same size as queryDescriptors rows. If compactResult is true, the
      * matches vector does not contain matches for fully masked-out query descriptors.
      */
    def radiusMatch(queryDescriptors: InputArray, matches: Any, maxDistance: float): InputArray = js.native
    def radiusMatch(queryDescriptors: InputArray, matches: Any, maxDistance: float, masks: Unit, compactResult: bool): InputArray = js.native
    def radiusMatch(queryDescriptors: InputArray, matches: Any, maxDistance: float, masks: InputArrayOfArrays): InputArray = js.native
    def radiusMatch(
      queryDescriptors: InputArray,
      matches: Any,
      maxDistance: float,
      masks: InputArrayOfArrays,
      compactResult: bool
    ): InputArray = js.native
    /**
      *   For each query descriptor, the methods find such training descriptors that the distance between
      * the query descriptor and the training descriptor is equal or smaller than maxDistance. Found matches
      * are returned in the distance increasing order.
      *
      * @param queryDescriptors Query set of descriptors.
      *
      * @param trainDescriptors Train set of descriptors. This set is not added to the train descriptors
      * collection stored in the class object.
      *
      * @param matches Found matches.
      *
      * @param maxDistance Threshold for the distance between matched descriptors. Distance means here
      * metric distance (e.g. Hamming distance), not the distance between coordinates (which is measured in
      * Pixels)!
      *
      * @param mask Mask specifying permissible matches between an input query and train matrices of
      * descriptors.
      *
      * @param compactResult Parameter used when the mask (or masks) is not empty. If compactResult is
      * false, the matches vector has the same size as queryDescriptors rows. If compactResult is true, the
      * matches vector does not contain matches for fully masked-out query descriptors.
      */
    def radiusMatch(queryDescriptors: InputArray, trainDescriptors: InputArray, matches: Any, maxDistance: float): InputArray = js.native
    def radiusMatch(
      queryDescriptors: InputArray,
      trainDescriptors: InputArray,
      matches: Any,
      maxDistance: float,
      mask: Unit,
      compactResult: bool
    ): InputArray = js.native
    def radiusMatch(
      queryDescriptors: InputArray,
      trainDescriptors: InputArray,
      matches: Any,
      maxDistance: float,
      mask: InputArray
    ): InputArray = js.native
    def radiusMatch(
      queryDescriptors: InputArray,
      trainDescriptors: InputArray,
      matches: Any,
      maxDistance: float,
      mask: InputArray,
      compactResult: bool
    ): InputArray = js.native
    
    def read(fileName: String): String = js.native
    def read(fn: FileNode): FileNode = js.native
    
    /**
      *   Trains a descriptor matcher (for example, the flann index). In all methods to match, the method
      * [train()] is run every time before matching. Some descriptor matchers (for example,
      * BruteForceMatcher) have an empty implementation of this method. Other matchers really train their
      * inner structures (for example, [FlannBasedMatcher] trains [flann::Index] ).
      */
    def train(): Unit = js.native
    
    def write(fileName: String): String = js.native
    def write(fs: Ptr): Ptr = js.native
    def write(fs: Ptr, name: String): Ptr = js.native
    @JSName("write")
    def write_FileStorage(fs: FileStorage): FileStorage = js.native
  }
  /* static members */
  object DescriptorMatcher {
    
    @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "DescriptorMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param descriptorMatcherType Descriptor matcher type. Now the following matcher types are
      * supported:
      *   BruteForce (it uses L2 )BruteForce-L1BruteForce-HammingBruteForce-Hamming(2)FlannBased
      */
    inline def create(descriptorMatcherType: String): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(descriptorMatcherType.asInstanceOf[js.Any]).asInstanceOf[Ptr]
    inline def create(matcherType: Any): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(matcherType.asInstanceOf[js.Any]).asInstanceOf[Ptr]
  }
  
  @JSImport("mirada/dist/src/types/opencv/DescriptorMatcher", "FLANNBASED")
  @js.native
  val FLANNBASED: MatcherType = js.native
  
  type MatcherType = Any
}
