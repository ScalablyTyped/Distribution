package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "NotificationPoller")
@js.native
class NotificationPoller ()
  extends nodeLib.NodeJSNs.EventEmitter {
  // must to be public?
  def checkForChanges(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

