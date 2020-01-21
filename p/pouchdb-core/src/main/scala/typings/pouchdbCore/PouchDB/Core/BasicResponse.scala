package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicResponse extends js.Object {
  /** `true` if the operation was successful; `false` otherwise */
  var ok: Boolean
}

object BasicResponse {
  @scala.inline
  def apply(ok: Boolean): BasicResponse = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasicResponse]
  }
}

