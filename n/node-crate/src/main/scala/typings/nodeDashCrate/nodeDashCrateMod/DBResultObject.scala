package typings.nodeDashCrate.nodeDashCrateMod

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
    val __obj = js.Dynamic.literal(cols = cols, duration = duration, json = json, rowcount = rowcount, rows = rows)
  
    __obj.asInstanceOf[DBResultObject]
  }
}

