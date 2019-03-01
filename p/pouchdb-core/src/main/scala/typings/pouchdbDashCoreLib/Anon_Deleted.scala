package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deleted extends js.Object {
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId
}

object Anon_Deleted {
  @scala.inline
  def apply(
    rev: pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId,
    deleted: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Deleted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rev")(rev)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[Anon_Deleted]
  }
}

