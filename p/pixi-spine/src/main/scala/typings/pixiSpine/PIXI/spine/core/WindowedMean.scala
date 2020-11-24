package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowedMean extends js.Object {
  
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
  implicit class WindowedMeanOps[Self <: WindowedMean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddValue(value: Double => Unit): Self = this.set("addValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddedValues(value: Double): Self = this.set("addedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMean(value: () => Double): Self = this.set("getMean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasEnoughData(value: () => Boolean): Self = this.set("hasEnoughData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastValue(value: Double): Self = this.set("lastValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
