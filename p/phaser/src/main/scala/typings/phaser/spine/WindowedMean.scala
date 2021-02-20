package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowedMean extends StObject {
  
  def addValue(value: Double): Unit = js.native
  
  var addedValues: Double = js.native
  
  var dirty: Boolean = js.native
  
  def getMean(): Double = js.native
  
  def hasEnoughData(): Boolean = js.native
  
  var lastValue: Double = js.native
  
  var mean: Double = js.native
  
  var values: js.Array[Double] = js.native
}
object WindowedMean {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WindowedMeanMutableBuilder[Self <: WindowedMean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddValue(value: Double => Unit): Self = StObject.set(x, "addValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddedValues(value: Double): Self = StObject.set(x, "addedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMean(value: () => Double): Self = StObject.set(x, "getMean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasEnoughData(value: () => Boolean): Self = StObject.set(x, "hasEnoughData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
