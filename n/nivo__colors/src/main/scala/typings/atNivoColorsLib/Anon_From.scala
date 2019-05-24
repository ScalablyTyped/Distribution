package typings
package atNivoColorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From
  extends atNivoColorsLib.atNivoColorsMod._InheritedColorProp[js.Any] {
  var from: java.lang.String
  var modifiers: js.UndefOr[js.Array[atNivoColorsLib.atNivoColorsMod.ColorModifier]] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: java.lang.String, modifiers: js.Array[atNivoColorsLib.atNivoColorsMod.ColorModifier] = null): Anon_From = {
    val __obj = js.Dynamic.literal(from = from)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[Anon_From]
  }
}

