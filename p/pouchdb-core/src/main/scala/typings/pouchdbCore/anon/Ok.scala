package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.GetMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ok[Content /* <: js.Object */] extends js.Object {
  var ok: Content with GetMeta
}

object Ok {
  @scala.inline
  def apply[Content](ok: Content with GetMeta): Ok[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok[Content]]
  }
}

