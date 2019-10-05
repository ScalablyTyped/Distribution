package typings.atNivoChord

import typings.atNivoChord.atNivoChordMod.ChordRibbonMouseHandler
import typings.atNivoChord.atNivoChordMod.RibbonData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRibbonClick extends js.Object {
  var onRibbonClick: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var onRibbonMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.undefined
  var ribbonTooltip: js.UndefOr[js.Any] = js.undefined
}

object Anon_OnRibbonClick {
  @scala.inline
  def apply(
    onRibbonClick: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseEnter: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseLeave: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onRibbonMouseMove: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    ribbonTooltip: js.Any = null
  ): Anon_OnRibbonClick = {
    val __obj = js.Dynamic.literal()
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(js.Any.fromFunction2(onRibbonClick))
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(js.Any.fromFunction2(onRibbonMouseEnter))
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(js.Any.fromFunction2(onRibbonMouseLeave))
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(js.Any.fromFunction2(onRibbonMouseMove))
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip)
    __obj.asInstanceOf[Anon_OnRibbonClick]
  }
}

