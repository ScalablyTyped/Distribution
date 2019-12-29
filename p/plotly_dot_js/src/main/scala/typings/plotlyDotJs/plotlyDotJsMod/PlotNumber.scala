package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNumber extends js.Object {
  var font: Partial[Font]
  var prefix: String
  var suffix: String
  var valueformat: String
}

object PlotNumber {
  @scala.inline
  def apply(font: Partial[Font], prefix: String, suffix: String, valueformat: String): PlotNumber = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotNumber]
  }
}

