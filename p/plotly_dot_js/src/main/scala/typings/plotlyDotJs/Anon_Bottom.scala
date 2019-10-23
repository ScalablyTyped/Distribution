package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var decreasing: Anon_Color
  var increasing: Anon_Color
  var position: top | bottom | left | right
  var reference: Double
  var relative: Boolean
  var valueformat: String
}

object Anon_Bottom {
  @scala.inline
  def apply(
    decreasing: Anon_Color,
    increasing: Anon_Color,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(decreasing = decreasing, increasing = increasing, position = position.asInstanceOf[js.Any], reference = reference, relative = relative, valueformat = valueformat)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

