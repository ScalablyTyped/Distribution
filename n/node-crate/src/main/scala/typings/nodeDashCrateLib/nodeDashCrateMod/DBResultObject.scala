package typings
package nodeDashCrateLib.nodeDashCrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBResultObject extends js.Object {
  var cols: js.Array[java.lang.String]
  var duration: scala.Double
  var json: js.Array[js.Object]
  var rowcount: scala.Double
  var rows: js.Array[js.Array[js.Object]]
}

object DBResultObject {
  @scala.inline
  def apply(
    cols: js.Array[java.lang.String],
    duration: scala.Double,
    json: js.Array[js.Object],
    rowcount: scala.Double,
    rows: js.Array[js.Array[js.Object]]
  ): DBResultObject = {
    val __obj = js.Dynamic.literal(cols = cols, duration = duration, json = json, rowcount = rowcount, rows = rows)
  
    __obj.asInstanceOf[DBResultObject]
  }
}

