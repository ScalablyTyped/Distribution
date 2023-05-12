package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.FileStorage
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvFlannBasedMatcherMod {
  
  @JSImport("mirada/dist/src/types/opencv/FlannBasedMatcher", "FlannBasedMatcher")
  @js.native
  open class FlannBasedMatcher () extends StObject {
    def this(indexParams: Ptr) = this()
    def this(indexParams: Unit, searchParams: Ptr) = this()
    def this(indexParams: Ptr, searchParams: Ptr) = this()
    
    /**
      *   If the collection is not empty, the new descriptors are added to existing train descriptors.
      *
      * @param descriptors Descriptors to add. Each descriptors[i] is a set of descriptors from the same
      * train image.
      */
    def add(descriptors: InputArrayOfArrays): InputArrayOfArrays = js.native
    
    def clear(): Unit = js.native
    
    def clone(emptyTrainData: bool): Ptr = js.native
    
    def isMaskSupported(): bool = js.native
    
    def read(fn: FileNode): FileNode = js.native
    
    /**
      *   Trains a descriptor matcher (for example, the flann index). In all methods to match, the method
      * [train()] is run every time before matching. Some descriptor matchers (for example,
      * BruteForceMatcher) have an empty implementation of this method. Other matchers really train their
      * inner structures (for example, [FlannBasedMatcher] trains [flann::Index] ).
      */
    def train(): Unit = js.native
    
    def write(fs: FileStorage): FileStorage = js.native
  }
  /* static members */
  object FlannBasedMatcher {
    
    @JSImport("mirada/dist/src/types/opencv/FlannBasedMatcher", "FlannBasedMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Ptr]
  }
}
