package typings
package popperDotJsLib.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[BaseModifier with (stdLib.Record[java.lang.String, _])]] {
  var applyStyle: js.UndefOr[BaseModifier with popperDotJsLib.Anon_GpuAcceleration] = js.undefined
  var arrow: js.UndefOr[BaseModifier with popperDotJsLib.Anon_Element] = js.undefined
  var computeStyle: js.UndefOr[BaseModifier with popperDotJsLib.Anon_Bottom] = js.undefined
  var flip: js.UndefOr[BaseModifier with popperDotJsLib.Anon_Behavior] = js.undefined
  var hide: js.UndefOr[BaseModifier] = js.undefined
  var inner: js.UndefOr[BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[BaseModifier] = js.undefined
  var offset: js.UndefOr[BaseModifier with popperDotJsLib.Anon_Offset] = js.undefined
  var preventOverflow: js.UndefOr[BaseModifier with popperDotJsLib.Anon_BoundariesElement] = js.undefined
  var shift: js.UndefOr[BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[BaseModifier with (stdLib.Record[java.lang.String, _])]] = null,
    applyStyle: BaseModifier with popperDotJsLib.Anon_GpuAcceleration = null,
    arrow: BaseModifier with popperDotJsLib.Anon_Element = null,
    computeStyle: BaseModifier with popperDotJsLib.Anon_Bottom = null,
    flip: BaseModifier with popperDotJsLib.Anon_Behavior = null,
    hide: BaseModifier = null,
    inner: BaseModifier = null,
    keepTogether: BaseModifier = null,
    offset: BaseModifier with popperDotJsLib.Anon_Offset = null,
    preventOverflow: BaseModifier with popperDotJsLib.Anon_BoundariesElement = null,
    shift: BaseModifier = null
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

