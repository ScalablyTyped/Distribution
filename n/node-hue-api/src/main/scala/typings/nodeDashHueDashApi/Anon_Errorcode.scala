package typings.nodeDashHueDashApi

import typings.nodeDashHueDashApi.nodeDashHueDashApiMod.BackupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errorcode extends js.Object {
  var errorcode: Double
  var status: BackupStatus
}

object Anon_Errorcode {
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): Anon_Errorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Errorcode]
  }
}

