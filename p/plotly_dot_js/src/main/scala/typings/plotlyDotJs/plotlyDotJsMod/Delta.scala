package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_ColorSymbol
import typings.plotlyDotJs.plotlyDotJsStrings.bottom
import typings.plotlyDotJs.plotlyDotJsStrings.left
import typings.plotlyDotJs.plotlyDotJsStrings.right
import typings.plotlyDotJs.plotlyDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var decreasing: Anon_ColorSymbol
  var increasing: Anon_ColorSymbol
  var position: top | bottom | left | right
  var reference: Double
  var relative: Boolean
  var valueformat: String
}

object Delta {
  @scala.inline
  def apply(
    decreasing: Anon_ColorSymbol,
    increasing: Anon_ColorSymbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
}

