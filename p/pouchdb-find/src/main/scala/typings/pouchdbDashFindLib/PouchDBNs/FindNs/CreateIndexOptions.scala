package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexOptions extends js.Object {
  var index: pouchdbDashFindLib.Anon_Ddoc
}

object CreateIndexOptions {
  @scala.inline
  def apply(index: pouchdbDashFindLib.Anon_Ddoc): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[CreateIndexOptions]
  }
}

