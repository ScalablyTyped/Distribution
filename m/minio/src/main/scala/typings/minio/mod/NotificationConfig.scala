package typings.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "NotificationConfig")
@js.native
class NotificationConfig () extends js.Object {
  
  def add(target: CloudFunctionConfig): Unit = js.native
  def add(target: QueueConfig): Unit = js.native
  def add(target: TopicConfig): Unit = js.native
}
