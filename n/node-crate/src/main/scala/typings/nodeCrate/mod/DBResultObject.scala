package typings.nodeCrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBResultObject extends js.Object {
  var cols: js.Array[String]
  var duration: Double
  var json: js.Array[js.Object]
  var rowcount: Double
  var rows: js.Array[js.Array[js.Object]]
}

object DBResultObject {
  @scala.inline
  def apply(
    cols: js.Array[String],
    duration: Double,
    json: js.Array[js.Object],
    rowcount: Double,
    rows: js.Array[js.Array[js.Object]]
  ): DBResultObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], rowcount = rowcount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBResultObject]
  }
}

