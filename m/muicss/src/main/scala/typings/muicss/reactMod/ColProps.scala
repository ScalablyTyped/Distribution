package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps extends HTMLAttributes[HTMLDivElement] {
  var lg: js.UndefOr[Double] = js.undefined
  var `lg-offset`: js.UndefOr[Double] = js.undefined
  var md: js.UndefOr[Double] = js.undefined
  var `md-offset`: js.UndefOr[Double] = js.undefined
  var sm: js.UndefOr[Double] = js.undefined
  var `sm-offset`: js.UndefOr[Double] = js.undefined
  var xl: js.UndefOr[Double] = js.undefined
  var `xl-offset`: js.UndefOr[Double] = js.undefined
  var xs: js.UndefOr[Double] = js.undefined
  var `xs-offset`: js.UndefOr[Double] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    lg: Int | Double = null,
    `lg-offset`: Int | Double = null,
    md: Int | Double = null,
    `md-offset`: Int | Double = null,
    sm: Int | Double = null,
    `sm-offset`: Int | Double = null,
    xl: Int | Double = null,
    `xl-offset`: Int | Double = null,
    xs: Int | Double = null,
    `xs-offset`: Int | Double = null
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

