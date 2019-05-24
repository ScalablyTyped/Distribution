package typings
package atNivoChordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRibbonClick extends js.Object {
  var onRibbonClick: js.UndefOr[atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseEnter: js.UndefOr[atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseLeave: js.UndefOr[atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseMove: js.UndefOr[atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler] = js.undefined
  var ribbonTooltip: js.UndefOr[js.Any] = js.undefined
}

object Anon_OnRibbonClick {
  @scala.inline
  def apply(
    onRibbonClick: atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler = null,
    onRibbonMouseEnter: atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler = null,
    onRibbonMouseLeave: atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler = null,
    onRibbonMouseMove: atNivoChordLib.atNivoChordMod.ChordRibbonMouseHandler = null,
    ribbonTooltip: js.Any = null
  ): Anon_OnRibbonClick = {
    val __obj = js.Dynamic.literal()
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(onRibbonClick)
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(onRibbonMouseEnter)
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(onRibbonMouseLeave)
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(onRibbonMouseMove)
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip)
    __obj.asInstanceOf[Anon_OnRibbonClick]
  }
}

