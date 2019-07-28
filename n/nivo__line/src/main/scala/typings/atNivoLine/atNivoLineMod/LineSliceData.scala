package typings.atNivoLine.atNivoLineMod

import typings.atNivoLine.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSliceData extends js.Object {
  var data: js.Array[Anon_Data]
  var id: LineValue
  var x: Double
}

object LineSliceData {
  @scala.inline
  def apply(data: js.Array[Anon_Data], id: LineValue, x: Double): LineSliceData = {
    val __obj = js.Dynamic.literal(data = data, id = id.asInstanceOf[js.Any], x = x)
  
    __obj.asInstanceOf[LineSliceData]
  }
}

