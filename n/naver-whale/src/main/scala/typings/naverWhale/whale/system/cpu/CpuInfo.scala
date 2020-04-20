package typings.naverWhale.whale.system.cpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: String
  /**
    * A set of feature codes indicating some of the processor's capabilities.
    * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
    */
  var features: js.Array[String]
  /** The model name of the processors. */
  var modelName: String
  /** The number of logical processors. */
  var numOfProcessors: Double
  /** Information about each logical processor. */
  var processors: js.Array[typings.chrome.chrome.system.cpu.ProcessorInfo]
}

object CpuInfo {
  @scala.inline
  def apply(
    archName: String,
    features: js.Array[String],
    modelName: String,
    numOfProcessors: Double,
    processors: js.Array[typings.chrome.chrome.system.cpu.ProcessorInfo]
  ): CpuInfo = {
    val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuInfo]
  }
}

