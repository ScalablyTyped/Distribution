package typings.popperDotJs.popperDotJsMod.PopperNs

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
      js.UndefOr[
        typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with (Record[String, _])
      ]
    ] {
  var applyStyle: js.UndefOr[
    typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_GpuAcceleration
  ] = js.undefined
  var arrow: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Element] = js.undefined
  var computeStyle: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Bottom] = js.undefined
  var flip: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Behavior] = js.undefined
  var hide: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier] = js.undefined
  var inner: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier] = js.undefined
  var offset: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Offset] = js.undefined
  var preventOverflow: js.UndefOr[
    typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_BoundariesElement
  ] = js.undefined
  var shift: js.UndefOr[typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      js.UndefOr[
        typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with (Record[String, _])
      ]
    ] = null,
    applyStyle: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_GpuAcceleration = null,
    arrow: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Element = null,
    computeStyle: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Bottom = null,
    flip: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Behavior = null,
    hide: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier = null,
    inner: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier = null,
    keepTogether: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier = null,
    offset: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_Offset = null,
    preventOverflow: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier with Anon_BoundariesElement = null,
    shift: typings.popperDotJs.popperDotJsMod.PopperNs.BaseModifier = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (applyStyle != null) __obj.updateDynamic("applyStyle")(applyStyle)
    if (arrow != null) __obj.updateDynamic("arrow")(arrow)
    if (computeStyle != null) __obj.updateDynamic("computeStyle")(computeStyle)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (keepTogether != null) __obj.updateDynamic("keepTogether")(keepTogether)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[Modifiers]
  }
}

