package typings.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSizeSpec extends js.Object {
  var key: String
  var sizes: js.Tuple2[Double, Double]
  var values: js.Tuple2[Double, Double]
}

object DynamicSizeSpec {
  @scala.inline
  def apply(key: String, sizes: js.Tuple2[Double, Double], values: js.Tuple2[Double, Double]): DynamicSizeSpec = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamicSizeSpec]
  }
}

