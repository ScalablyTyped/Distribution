package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetInfoInfo extends js.Object {
  def getInfo(callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]): scala.Unit
}

object Anon_CallbackGetInfoInfo {
  @scala.inline
  def apply(
    getInfo: js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit] => scala.Unit
  ): Anon_CallbackGetInfoInfo = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Anon_CallbackGetInfoInfo]
  }
}

