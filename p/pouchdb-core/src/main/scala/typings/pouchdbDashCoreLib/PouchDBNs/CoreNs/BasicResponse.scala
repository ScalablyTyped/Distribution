package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicResponse extends js.Object {
  /** `true` if the operation was successful; `false` otherwise */
  var ok: scala.Boolean
}

object BasicResponse {
  @scala.inline
  def apply(ok: scala.Boolean): BasicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[BasicResponse]
  }
}

