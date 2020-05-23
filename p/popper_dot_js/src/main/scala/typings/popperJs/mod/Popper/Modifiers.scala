package typings.popperJs.mod.Popper

import org.scalablytyped.runtime.StringDictionary
import typings.popperJs.anon.BaseModifierbehaviorBehav
import typings.popperJs.anon.BaseModifierelementstring
import typings.popperJs.anon.BaseModifiergpuAccelerati
import typings.popperJs.anon.BaseModifieroffsetnumbers
import typings.popperJs.anon.BaseModifieronLoadFunctio
import typings.popperJs.anon.BaseModifierpriorityArray
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* name */ StringDictionary[js.UndefOr[BaseModifier with (Record[String, _])]] {
  var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.undefined
  var arrow: js.UndefOr[BaseModifierelementstring] = js.undefined
  var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.undefined
  var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.undefined
  var hide: js.UndefOr[BaseModifier] = js.undefined
  var inner: js.UndefOr[BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[BaseModifier] = js.undefined
  var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.undefined
  var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.undefined
  var shift: js.UndefOr[BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.UndefOr[BaseModifier with (Record[String, _])]] = null,
    applyStyle: BaseModifieronLoadFunctio = null,
    arrow: BaseModifierelementstring = null,
    computeStyle: BaseModifiergpuAccelerati = null,
    flip: BaseModifierbehaviorBehav = null,
    hide: BaseModifier = null,
    inner: BaseModifier = null,
    keepTogether: BaseModifier = null,
    offset: BaseModifieroffsetnumbers = null,
    preventOverflow: BaseModifierpriorityArray = null,
    shift: BaseModifier = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (applyStyle != null) __obj.updateDynamic("applyStyle")(applyStyle.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (computeStyle != null) __obj.updateDynamic("computeStyle")(computeStyle.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (keepTogether != null) __obj.updateDynamic("keepTogether")(keepTogether.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}

