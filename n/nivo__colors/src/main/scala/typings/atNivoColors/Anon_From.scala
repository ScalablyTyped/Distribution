package typings.atNivoColors

import typings.atNivoColors.atNivoColorsMod.ColorModifier
import typings.atNivoColors.atNivoColorsMod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From
  extends _InheritedColorProp[js.Any] {
  var from: String
  var modifiers: js.UndefOr[js.Array[ColorModifier]] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: String, modifiers: js.Array[ColorModifier] = null): Anon_From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_From]
  }
}

