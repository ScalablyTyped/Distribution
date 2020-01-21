package typings.plotlyJs

import typings.plotlyJs.mod.Color
import typings.plotlyJs.plotlyJsStrings.horizontal
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.radial
import typings.plotlyJs.plotlyJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorColorsrc extends js.Object {
  var color: Color
  var colorsrc: js.Any
  var `type`: radial | horizontal | vertical | none
  var typesrc: js.Any
}

object AnonColorColorsrc {
  @scala.inline
  def apply(color: Color, colorsrc: js.Any, `type`: radial | horizontal | vertical | none, typesrc: js.Any): AnonColorColorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorColorsrc]
  }
}

