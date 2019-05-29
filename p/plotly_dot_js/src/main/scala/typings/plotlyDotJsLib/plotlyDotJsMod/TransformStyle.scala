package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformStyle extends js.Object {
  var target: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])
  var value: stdLib.Partial[PlotData]
}

object TransformStyle {
  @scala.inline
  def apply(
    target: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]),
    value: stdLib.Partial[PlotData]
  ): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[TransformStyle]
  }
}

