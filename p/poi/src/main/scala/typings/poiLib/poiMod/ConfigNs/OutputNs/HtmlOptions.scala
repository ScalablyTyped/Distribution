package typings
package poiLib.poiMod.ConfigNs.OutputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var inject: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object HtmlOptions {
  @scala.inline
  def apply(
    filename: java.lang.String = null,
    inject: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    title: java.lang.String = null
  ): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HtmlOptions]
  }
}

