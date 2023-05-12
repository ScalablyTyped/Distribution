package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvBowtrainerMod {
  
  @JSImport("mirada/dist/src/types/opencv/BOWTrainer", "BOWTrainer")
  @js.native
  open class BOWTrainer () extends StObject {
    
    /**
      *   The training set is clustered using clustermethod to construct the vocabulary.
      *
      * @param descriptors Descriptors to add to a training set. Each row of the descriptors matrix is a
      * descriptor.
      */
    def add(descriptors: Mat): Mat = js.native
    
    def clear(): Unit = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def cluster(): Mat = js.native
    /**
      *   The vocabulary consists of cluster centers. So, this method returns the vocabulary. In the first
      * variant of the method, train descriptors stored in the object are clustered. In the second variant,
      * input descriptors are clustered.
      *
      * @param descriptors Descriptors to cluster. Each row of the descriptors matrix is a descriptor.
      * Descriptors are not added to the inner train descriptor set.
      */
    def cluster(descriptors: Mat): Mat = js.native
    
    def descriptorsCount(): int = js.native
    
    def getDescriptors(): Mat = js.native
  }
}
