package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var ascent: scala.Double
  var descent: scala.Double
  var path: java.lang.String
  var width: scala.Double
}

object Icon {
  @scala.inline
  def apply(ascent: scala.Double, descent: scala.Double, path: java.lang.String, width: scala.Double): Icon = {
    val __obj = js.Dynamic.literal(ascent = ascent, descent = descent, path = path, width = width)
  
    __obj.asInstanceOf[Icon]
  }
}

