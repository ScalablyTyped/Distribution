package typings.multivariateNormal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends js.Object {
  
  def getCov(): js.Array[js.Array[Double]] = js.native
  
  def getMean(): js.Array[Double] = js.native
  
  def sample(): js.Array[Double] = js.native
  
  def setCov(newCov: js.Array[js.Array[Double]]): Distribution = js.native
  
  def setMean(newMean: js.Array[Double]): Distribution = js.native
}
object Distribution {
  
  @scala.inline
  def apply(
    getCov: () => js.Array[js.Array[Double]],
    getMean: () => js.Array[Double],
    sample: () => js.Array[Double],
    setCov: js.Array[js.Array[Double]] => Distribution,
    setMean: js.Array[Double] => Distribution
  ): Distribution = {
    val __obj = js.Dynamic.literal(getCov = js.Any.fromFunction0(getCov), getMean = js.Any.fromFunction0(getMean), sample = js.Any.fromFunction0(sample), setCov = js.Any.fromFunction1(setCov), setMean = js.Any.fromFunction1(setMean))
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    
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
    def setGetCov(value: () => js.Array[js.Array[Double]]): Self = this.set("getCov", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMean(value: () => js.Array[Double]): Self = this.set("getMean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSample(value: () => js.Array[Double]): Self = this.set("sample", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCov(value: js.Array[js.Array[Double]] => Distribution): Self = this.set("setCov", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMean(value: js.Array[Double] => Distribution): Self = this.set("setMean", js.Any.fromFunction1(value))
  }
}
