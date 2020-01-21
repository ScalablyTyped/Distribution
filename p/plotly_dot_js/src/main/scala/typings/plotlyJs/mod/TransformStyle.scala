package typings.plotlyJs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformStyle extends js.Object {
  var target: Double | String | (js.Array[Double | String])
  var value: Partial[PlotData]
}

object TransformStyle {
  @scala.inline
  def apply(target: Double | String | (js.Array[Double | String]), value: Partial[PlotData]): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformStyle]
  }
}

