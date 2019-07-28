package typings.naverDashWhale.whaleNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorInfo extends js.Object {
  /** Cumulative usage info for this logical processor. */
  var usage: typings.chrome.chromeNs.systemNs.cpuNs.ProcessorUsage
}

object ProcessorInfo {
  @scala.inline
  def apply(usage: typings.chrome.chromeNs.systemNs.cpuNs.ProcessorUsage): ProcessorInfo = {
    val __obj = js.Dynamic.literal(usage = usage)
  
    __obj.asInstanceOf[ProcessorInfo]
  }
}

