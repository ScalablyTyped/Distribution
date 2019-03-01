package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids extends js.Object {
  var ids: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId]
  var start: scala.Double
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.RevisionId], start: scala.Double): Anon_Ids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ids")(ids)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_Ids]
  }
}

