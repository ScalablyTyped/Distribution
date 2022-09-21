package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowedMean extends StObject {
  
  def addValue(value: Double): Unit
  
  var addedValues: Double
  
  var dirty: Boolean
  
  def getMean(): Double
  
  def hasEnoughData(): Boolean
  
  var lastValue: Double
  
  var mean: Double
  
  var values: js.Array[Double]
}
object WindowedMean {
  
  inline def apply(
    addValue: Double => Unit,
    addedValues: Double,
    dirty: Boolean,
    getMean: () => Double,
    hasEnoughData: () => Boolean,
    lastValue: Double,
    mean: Double,
    values: js.Array[Double]
  ): WindowedMean = {
    val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction1(addValue), addedValues = addedValues.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], getMean = js.Any.fromFunction0(getMean), hasEnoughData = js.Any.fromFunction0(hasEnoughData), lastValue = lastValue.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowedMean]
  }
  
  extension [Self <: WindowedMean](x: Self) {
    
    inline def setAddValue(value: Double => Unit): Self = StObject.set(x, "addValue", js.Any.fromFunction1(value))
    
    inline def setAddedValues(value: Double): Self = StObject.set(x, "addedValues", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setGetMean(value: () => Double): Self = StObject.set(x, "getMean", js.Any.fromFunction0(value))
    
    inline def setHasEnoughData(value: () => Boolean): Self = StObject.set(x, "hasEnoughData", js.Any.fromFunction0(value))
    
    inline def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
