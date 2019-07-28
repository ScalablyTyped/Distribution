package typings.pouchdbDashCore.PouchDBNs.CoreNs

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
    val __obj = js.Dynamic.literal(rev = rev, status = status)
  
    __obj.asInstanceOf[RevisionInfo]
  }
}

