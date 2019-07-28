package typings.msnodesql.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRawResult extends js.Object {
  var meta: js.Array[QueryRawColumn]
  var rows: js.Array[js.Array[_]]
}

object QueryRawResult {
  @scala.inline
  def apply(meta: js.Array[QueryRawColumn], rows: js.Array[js.Array[_]]): QueryRawResult = {
    val __obj = js.Dynamic.literal(meta = meta, rows = rows)
  
    __obj.asInstanceOf[QueryRawResult]
  }
}

