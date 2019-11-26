package typings.officeDashJsDashPreview.OfficeExtension

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var timeoutInMilliseconds: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object EmbeddedOptions {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    height: String = null,
    id: String = null,
    sessionKey: String = null,
    timeoutInMilliseconds: Int | Double = null,
    width: String = null
  ): EmbeddedOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (timeoutInMilliseconds != null) __obj.updateDynamic("timeoutInMilliseconds")(timeoutInMilliseconds.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedOptions]
  }
}

