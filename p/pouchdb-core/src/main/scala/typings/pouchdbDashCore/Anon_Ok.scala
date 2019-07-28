package typings.pouchdbDashCore

import typings.pouchdbDashCore.PouchDBNs.CoreNs.GetMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ok[Content /* <: js.Object */] extends js.Object {
  var ok: Content with GetMeta
}

object Anon_Ok {
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Content with GetMeta): Anon_Ok[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ok[Content]]
  }
}

