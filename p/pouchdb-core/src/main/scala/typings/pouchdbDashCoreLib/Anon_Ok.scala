package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ok[Content /* <: js.Object */] extends js.Object {
  var ok: Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta
}

object Anon_Ok {
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Content with pouchdbDashCoreLib.PouchDBNs.CoreNs.GetMeta): Anon_Ok[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ok[Content]]
  }
}

