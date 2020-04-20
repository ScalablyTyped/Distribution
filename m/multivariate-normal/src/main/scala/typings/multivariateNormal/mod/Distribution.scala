package typings.multivariateNormal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def getCov(): js.Array[js.Array[Double]]
  def getMean(): js.Array[Double]
  def sample(): js.Array[Double]
  def setCov(newCov: js.Array[js.Array[Double]]): Distribution
  def setMean(newMean: js.Array[Double]): Distribution
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
}

