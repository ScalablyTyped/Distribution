package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSizeSpec extends js.Object {
  var key: java.lang.String
  var sizes: js.Tuple2[scala.Double, scala.Double]
  var values: js.Tuple2[scala.Double, scala.Double]
}

object DynamicSizeSpec {
  @scala.inline
  def apply(
    key: java.lang.String,
    sizes: js.Tuple2[scala.Double, scala.Double],
    values: js.Tuple2[scala.Double, scala.Double]
  ): DynamicSizeSpec = {
    val __obj = js.Dynamic.literal(key = key, sizes = sizes, values = values)
  
    __obj.asInstanceOf[DynamicSizeSpec]
  }
}

