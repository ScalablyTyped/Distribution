package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RevRevisionId extends js.Object {
  var rev: js.UndefOr[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId] = js.undefined
}

object Anon_RevRevisionId {
  @scala.inline
  def apply(rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId = null): Anon_RevRevisionId = {
    val __obj = js.Dynamic.literal()
    if (rev != null) __obj.updateDynamic("rev")(rev)
    __obj.asInstanceOf[Anon_RevRevisionId]
  }
}

