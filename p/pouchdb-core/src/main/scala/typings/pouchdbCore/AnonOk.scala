package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core.GetMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOk[Content /* <: js.Object */] extends js.Object {
  var ok: Content with GetMeta
}

object AnonOk {
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Content with GetMeta): AnonOk[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOk[Content]]
  }
}

