package typings.minio.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "NotificationConfig")
@js.native
class NotificationConfig () extends js.Object {
  def add(target: CloudFunctionConfig): Unit = js.native
  def add(target: QueueConfig): Unit = js.native
  def add(target: TopicConfig): Unit = js.native
}

