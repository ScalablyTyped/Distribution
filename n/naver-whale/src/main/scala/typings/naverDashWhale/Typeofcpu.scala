package typings.naverDashWhale

import typings.chrome.chrome.system.cpu.CpuInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcpu extends js.Object {
  def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit
}

object Typeofcpu {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ CpuInfo, Unit] => Unit): Typeofcpu = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Typeofcpu]
  }
}

