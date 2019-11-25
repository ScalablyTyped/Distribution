package typings.pouchdbDashFind.PouchDB.Find

import typings.pouchdbDashFind.Anon_Ddoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var index: Anon_Ddoc
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: Anon_Ddoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

