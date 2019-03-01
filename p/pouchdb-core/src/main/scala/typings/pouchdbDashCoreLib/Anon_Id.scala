package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var _id: js.UndefOr[pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(_id: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    __obj.asInstanceOf[Anon_Id]
  }
}

