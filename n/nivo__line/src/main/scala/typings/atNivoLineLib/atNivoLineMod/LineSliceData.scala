package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSliceData extends js.Object {
  var data: js.Array[atNivoLineLib.Anon_Data]
  var id: java.lang.String | scala.Double | stdLib.Date
  var x: scala.Double
}

object LineSliceData {
  @scala.inline
  def apply(
    data: js.Array[atNivoLineLib.Anon_Data],
    id: java.lang.String | scala.Double | stdLib.Date,
    x: scala.Double
  ): LineSliceData = {
    val __obj = js.Dynamic.literal(data = data, id = id.asInstanceOf[js.Any], x = x)
  
    __obj.asInstanceOf[LineSliceData]
  }
}

