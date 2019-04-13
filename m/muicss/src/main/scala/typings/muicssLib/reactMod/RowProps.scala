package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var lg: js.UndefOr[scala.Double] = js.undefined
  var md: js.UndefOr[scala.Double] = js.undefined
  var sm: js.UndefOr[scala.Double] = js.undefined
  var xs: js.UndefOr[scala.Double] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    lg: scala.Int | scala.Double = null,
    md: scala.Int | scala.Double = null,
    sm: scala.Int | scala.Double = null,
    xs: scala.Int | scala.Double = null
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

