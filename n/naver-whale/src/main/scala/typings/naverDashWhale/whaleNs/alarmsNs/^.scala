package typings.naverDashWhale.whaleNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms")
@js.native
object ^ extends js.Object {
  var onAlarm: typings.chrome.chromeNs.alarmsNs.AlarmEvent = js.native
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: String): Unit = js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clearAll(): Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def create(alarmInfo: typings.chrome.chromeNs.alarmsNs.AlarmCreateInfo): Unit = js.native
  def create(name: String, alarmInfo: typings.chrome.chromeNs.alarmsNs.AlarmCreateInfo): Unit = js.native
  def get(callback: js.Function1[/* alarm */ typings.chrome.chromeNs.alarmsNs.Alarm, Unit]): Unit = js.native
  def get(name: String, callback: js.Function1[/* alarm */ typings.chrome.chromeNs.alarmsNs.Alarm, Unit]): Unit = js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[typings.chrome.chromeNs.alarmsNs.Alarm], Unit]): Unit = js.native
}

