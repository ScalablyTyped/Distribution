package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision[Content /* <: js.Object */] extends js.Object {
  var ok: Document[Content] with RevisionIdMeta
}

object Revision {
  @scala.inline
  def apply[Content /* <: js.Object */](ok: Document[Content] with RevisionIdMeta): Revision[Content] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Revision[Content]]
  }
}

