package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "NotificationConfig")
@js.native
class NotificationConfig () extends js.Object {
  def add(target: CloudFunctionConfig): scala.Unit = js.native
  def add(target: QueueConfig): scala.Unit = js.native
  def add(target: TopicConfig): scala.Unit = js.native
}

