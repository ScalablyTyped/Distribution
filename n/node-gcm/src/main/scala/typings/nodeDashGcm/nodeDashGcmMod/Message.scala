package typings.nodeDashGcm.nodeDashGcmMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gcm", "Message")
@js.native
class Message () extends js.Object {
  def this(options: IMessageOptions) = this()
  var collapseKey: String = js.native
  var delayWhileIdle: Boolean = js.native
  var dryRun: Boolean = js.native
  var timeToLive: Double = js.native
  def addData(data: StringDictionary[String]): Unit = js.native
  def addData(key: String, value: String): Unit = js.native
  def addNotification(key: String, value: INotificationOptions): Unit = js.native
  def addNotification(value: INotificationOptions): Unit = js.native
}

