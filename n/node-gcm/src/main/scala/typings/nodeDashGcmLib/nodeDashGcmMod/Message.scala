package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gcm", "Message")
@js.native
class Message () extends js.Object {
  def this(options: IMessageOptions) = this()
  var collapseKey: java.lang.String = js.native
  var delayWhileIdle: scala.Boolean = js.native
  var dryRun: scala.Boolean = js.native
  var timeToLive: scala.Double = js.native
  def addData(data: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def addData(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addNotification(key: java.lang.String, value: INotificationOptions): scala.Unit = js.native
  def addNotification(value: INotificationOptions): scala.Unit = js.native
}

