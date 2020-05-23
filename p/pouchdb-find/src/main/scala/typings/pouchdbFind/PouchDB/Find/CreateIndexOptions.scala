package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.anon.Ddoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var index: Ddoc
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: Ddoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

