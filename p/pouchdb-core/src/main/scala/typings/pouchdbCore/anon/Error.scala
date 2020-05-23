package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: typings.pouchdbCore.PouchDB.Core.Error
}

object Error {
  @scala.inline
  def apply(error: typings.pouchdbCore.PouchDB.Core.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

