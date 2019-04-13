package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var lg: js.UndefOr[scala.Double] = js.undefined
  var `lg-offset`: js.UndefOr[scala.Double] = js.undefined
  var md: js.UndefOr[scala.Double] = js.undefined
  var `md-offset`: js.UndefOr[scala.Double] = js.undefined
  var sm: js.UndefOr[scala.Double] = js.undefined
  var `sm-offset`: js.UndefOr[scala.Double] = js.undefined
  var xl: js.UndefOr[scala.Double] = js.undefined
  var `xl-offset`: js.UndefOr[scala.Double] = js.undefined
  var xs: js.UndefOr[scala.Double] = js.undefined
  var `xs-offset`: js.UndefOr[scala.Double] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    lg: scala.Int | scala.Double = null,
    `lg-offset`: scala.Int | scala.Double = null,
    md: scala.Int | scala.Double = null,
    `md-offset`: scala.Int | scala.Double = null,
    sm: scala.Int | scala.Double = null,
    `sm-offset`: scala.Int | scala.Double = null,
    xl: scala.Int | scala.Double = null,
    `xl-offset`: scala.Int | scala.Double = null,
    xs: scala.Int | scala.Double = null,
    `xs-offset`: scala.Int | scala.Double = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (`lg-offset` != null) __obj.updateDynamic("lg-offset")(`lg-offset`.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (`md-offset` != null) __obj.updateDynamic("md-offset")(`md-offset`.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (`sm-offset` != null) __obj.updateDynamic("sm-offset")(`sm-offset`.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (`xl-offset` != null) __obj.updateDynamic("xl-offset")(`xl-offset`.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (`xs-offset` != null) __obj.updateDynamic("xs-offset")(`xs-offset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

