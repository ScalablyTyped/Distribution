package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.BackupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errorcode extends js.Object {
  var errorcode: Double
  var status: BackupStatus
}

object Errorcode {
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): Errorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcode]
  }
}

