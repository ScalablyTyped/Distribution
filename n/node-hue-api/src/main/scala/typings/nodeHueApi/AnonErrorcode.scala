package typings.nodeHueApi

import typings.nodeHueApi.mod.BackupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorcode extends js.Object {
  var errorcode: Double
  var status: BackupStatus
}

object AnonErrorcode {
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): AnonErrorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorcode]
  }
}

