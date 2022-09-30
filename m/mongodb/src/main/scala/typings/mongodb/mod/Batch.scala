package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Batch")
@js.native
open class Batch[T] protected () extends StObject {
  def this(batchType: BatchType, originalZeroIndex: scala.Double) = this()
  
  var batchType: BatchType = js.native
  
  var currentIndex: scala.Double = js.native
  
  var operations: js.Array[T] = js.native
  
  var originalIndexes: js.Array[scala.Double] = js.native
  
  var originalZeroIndex: scala.Double = js.native
  
  var size: scala.Double = js.native
  
  var sizeBytes: scala.Double = js.native
}
