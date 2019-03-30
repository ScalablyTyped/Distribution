package typings
package naverDashWhaleLib.whaleNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms")
@js.native
object ^ extends js.Object {
  var onAlarm: chromeLib.chromeNs.alarmsNs.AlarmEvent = js.native
  def clear(): scala.Unit = js.native
  def clear(callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def clear(name: java.lang.String): scala.Unit = js.native
  def clear(name: java.lang.String, callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def create(alarmInfo: chromeLib.chromeNs.alarmsNs.AlarmCreateInfo): scala.Unit = js.native
  def create(name: java.lang.String, alarmInfo: chromeLib.chromeNs.alarmsNs.AlarmCreateInfo): scala.Unit = js.native
  def get(callback: js.Function1[/* alarm */ chromeLib.chromeNs.alarmsNs.Alarm, scala.Unit]): scala.Unit = js.native
  def get(
    name: java.lang.String,
    callback: js.Function1[/* alarm */ chromeLib.chromeNs.alarmsNs.Alarm, scala.Unit]
  ): scala.Unit = js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[chromeLib.chromeNs.alarmsNs.Alarm], scala.Unit]): scala.Unit = js.native
}

