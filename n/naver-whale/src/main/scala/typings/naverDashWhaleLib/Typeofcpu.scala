package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcpu extends js.Object {
  def getInfo(callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit]): scala.Unit
}

object Typeofcpu {
  @scala.inline
  def apply(
    getInfo: js.Function1[/* info */ chromeLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit] => scala.Unit
  ): Typeofcpu = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Typeofcpu]
  }
}

