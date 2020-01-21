package typings.pouchdbCore.PouchDB.Core

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
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RevisionInfo]
  }
}

