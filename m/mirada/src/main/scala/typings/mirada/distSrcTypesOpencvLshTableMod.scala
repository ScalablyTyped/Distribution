package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.Bucket
import typings.mirada.distSrcTypesOpencvHacksMod.BucketKey
import typings.mirada.distSrcTypesOpencvHacksMod.LshStats
import typings.mirada.distSrcTypesOpencvHacksMod.Matrix
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvLshTableMod {
  
  @JSImport("mirada/dist/src/types/opencv/LshTable", "LshTable")
  @js.native
  /**
    *   Default constructor
    */
  open class LshTable () extends StObject {
    /**
      *   Default constructor Create the mask and allocate the memory
      *
      * @param feature_size is the size of the feature (considered as a ElementType[])
      *
      * @param key_size is the number of bits that are turned on in the feature
      */
    def this(feature_size: Any, key_size: Any) = this()
    
    /**
      *   Add a set of features to the table
      *
      * @param dataset the values to store
      */
    def add(dataset: Matrix): Matrix = js.native
    /**
      *   Add a feature to the table
      *
      * @param value the value to store for that feature
      *
      * @param feature the feature itself
      */
    def add(value: Any, feature: Any): Unit = js.native
    
    /**
      *   Get a bucket given the key
      */
    def getBucketFromKey(key: BucketKey): Bucket = js.native
    
    /**
      *   Compute the sub-signature of a feature
      */
    def getKey(arg50: Any): sizeT = js.native
    
    /**
      *   Get statistics about the table
      */
    def getStats(): LshStats = js.native
  }
  
  @JSImport("mirada/dist/src/types/opencv/LshTable", "kArray")
  @js.native
  val kArray: SpeedLevel = js.native
  
  @JSImport("mirada/dist/src/types/opencv/LshTable", "kBitsetHash")
  @js.native
  val kBitsetHash: SpeedLevel = js.native
  
  @JSImport("mirada/dist/src/types/opencv/LshTable", "kHash")
  @js.native
  val kHash: SpeedLevel = js.native
  
  type SpeedLevel = Any
}
