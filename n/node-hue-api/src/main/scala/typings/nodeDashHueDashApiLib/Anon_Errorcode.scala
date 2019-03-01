package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errorcode extends js.Object {
  var errorcode: scala.Double
  var status: nodeDashHueDashApiLib.nodeDashHueDashApiMod.BackupStatus
}

object Anon_Errorcode {
  @scala.inline
  def apply(errorcode: scala.Double, status: nodeDashHueDashApiLib.nodeDashHueDashApiMod.BackupStatus): Anon_Errorcode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorcode")(errorcode)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_Errorcode]
  }
}

