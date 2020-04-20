package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.AnonDdoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var index: AnonDdoc
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: AnonDdoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

