package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdMeta extends js.Object {
  var _id: DocumentId
}

object IdMeta {
  @scala.inline
  def apply(_id: DocumentId): IdMeta = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdMeta]
  }
}

