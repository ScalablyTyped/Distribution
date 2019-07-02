package typings
package parquetjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var dlevels: js.Array[scala.Double]
  var rlevels: js.Array[scala.Double]
  var values: js.Array[nodeLib.Buffer]
}

object Anon_Count {
  @scala.inline
  def apply(
    count: scala.Double,
    dlevels: js.Array[scala.Double],
    rlevels: js.Array[scala.Double],
    values: js.Array[nodeLib.Buffer]
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, dlevels = dlevels, rlevels = rlevels, values = values)
  
    __obj.asInstanceOf[Anon_Count]
  }
}

