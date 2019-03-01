package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionInfo extends js.Object {
  var rev: RevisionId
  var status: Availability
}

object RevisionInfo {
  @scala.inline
  def apply(rev: RevisionId, status: Availability): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rev")(rev)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[RevisionInfo]
  }
}

