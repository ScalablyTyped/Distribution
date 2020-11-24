package typings.nodeGcm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-gcm", "Message")
@js.native
class Message () extends js.Object {
  def this(options: IMessageOptions) = this()
  
  def addData(data: StringDictionary[String]): Unit = js.native
  def addData(key: String, value: String): Unit = js.native
  
  def addNotification(key: String, value: INotificationOptions): Unit = js.native
  def addNotification(value: INotificationOptions): Unit = js.native
  
  var collapseKey: String = js.native
  
  var delayWhileIdle: Boolean = js.native
  
  var dryRun: Boolean = js.native
  
  var timeToLive: Double = js.native
}
