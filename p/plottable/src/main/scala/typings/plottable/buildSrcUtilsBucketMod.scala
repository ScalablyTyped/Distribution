package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsBucketMod {
  
  @JSImport("plottable/build/src/utils/bucket", "Bucket")
  @js.native
  open class Bucket protected () extends StObject {
    def this(index: Double, xValue: Double, yValue: Double) = this()
    
    def addToBucket(value: Double, index: Double): Unit = js.native
    
    /* private */ var bucketValue: Any = js.native
    
    /* private */ var entryIndex: Any = js.native
    
    /* private */ var exitIndex: Any = js.native
    
    def getUniqueIndices(): js.Array[Double] = js.native
    
    def isInBucket(value: Double): Boolean = js.native
    
    /* private */ var maxIndex: Any = js.native
    
    /* private */ var maxValue: Any = js.native
    
    /* private */ var minIndex: Any = js.native
    
    /* private */ var minValue: Any = js.native
  }
}
