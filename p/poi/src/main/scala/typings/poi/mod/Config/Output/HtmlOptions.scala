package typings.poi.mod.Config.Output

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var inject: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object HtmlOptions {
  @scala.inline
  def apply(
    filename: String = null,
    inject: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    title: String = null
  ): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlOptions]
  }
}

