package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialGaugeLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  var line: PartialGaugeLine
  var thickness: Double
  var value: Double
}

object Threshold {
  @scala.inline
  def apply(line: PartialGaugeLine, thickness: Double, value: Double): Threshold = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

