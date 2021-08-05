package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketMod {
  
  @JSImport("plottable/build/src/utils/bucket", "Bucket")
  @js.native
  class Bucket protected () extends StObject {
    def this(index: Double, xValue: Double, yValue: Double) = this()
    
    def addToBucket(value: Double, index: Double): Unit = js.native
    
    /* private */ var bucketValue: js.Any = js.native
    
    /* private */ var entryIndex: js.Any = js.native
    
    /* private */ var exitIndex: js.Any = js.native
    
    def getUniqueIndices(): js.Array[Double] = js.native
    
    def isInBucket(value: Double): Boolean = js.native
    
    /* private */ var maxIndex: js.Any = js.native
    
    /* private */ var maxValue: js.Any = js.native
    
    /* private */ var minIndex: js.Any = js.native
    
    /* private */ var minValue: js.Any = js.native
  }
}
