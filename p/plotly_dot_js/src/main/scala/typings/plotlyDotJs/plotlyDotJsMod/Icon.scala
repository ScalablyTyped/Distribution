package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var ascent: Double
  var descent: Double
  var path: String
  var width: Double
}

object Icon {
  @scala.inline
  def apply(ascent: Double, descent: Double, path: String, width: Double): Icon = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

