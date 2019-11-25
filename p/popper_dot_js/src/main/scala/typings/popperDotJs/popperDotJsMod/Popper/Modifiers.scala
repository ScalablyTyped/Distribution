package typings.popperDotJs.popperDotJsMod.Popper

import org.scalablytyped.runtime.StringDictionary
import typings.popperDotJs.Anon_Behavior
import typings.popperDotJs.Anon_Bottom
import typings.popperDotJs.Anon_BoundariesElement
import typings.popperDotJs.Anon_Element
import typings.popperDotJs.Anon_GpuAcceleration
import typings.popperDotJs.Anon_Offset
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* name */ StringDictionary[
      js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])]
    ] {
  var applyStyle: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration] = js.undefined
  var arrow: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element] = js.undefined
  var computeStyle: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom] = js.undefined
  var flip: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior] = js.undefined
  var hide: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var inner: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var offset: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset] = js.undefined
  var preventOverflow: js.UndefOr[
    typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement
  ] = js.undefined
  var shift: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])]
    ] = null,
    applyStyle: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration = null,
    arrow: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element = null,
    computeStyle: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom = null,
    flip: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior = null,
    hide: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    inner: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    keepTogether: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    offset: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset = null,
    preventOverflow: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement = null,
    shift: typings.popperDotJs.popperDotJsMod.Popper.BaseModifier = null
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

