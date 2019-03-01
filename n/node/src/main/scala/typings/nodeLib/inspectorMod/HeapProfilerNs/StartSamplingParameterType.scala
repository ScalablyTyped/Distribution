package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSamplingParameterType extends js.Object {
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The
    * default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[scala.Double] = js.undefined
}

object StartSamplingParameterType {
  @scala.inline
  def apply(samplingInterval: scala.Int | scala.Double = null): StartSamplingParameterType = {
    val __obj = js.Dynamic.literal()
    if (samplingInterval != null) __obj.updateDynamic("samplingInterval")(samplingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSamplingParameterType]
  }
}

