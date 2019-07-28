package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends HTMLAttributes[HTMLDivElement] {
  var lg: js.UndefOr[Double] = js.undefined
  var md: js.UndefOr[Double] = js.undefined
  var sm: js.UndefOr[Double] = js.undefined
  var xs: js.UndefOr[Double] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    lg: Int | Double = null,
    md: Int | Double = null,
    sm: Int | Double = null,
    xs: Int | Double = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

