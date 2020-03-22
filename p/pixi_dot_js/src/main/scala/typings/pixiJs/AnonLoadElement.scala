package typings.pixiJs

import typings.std.HTMLAudioElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoadElement extends js.Object {
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.undefined
  var mimeType: js.UndefOr[String | js.Array[String]] = js.undefined
  var skipSource: js.UndefOr[Boolean] = js.undefined
}

object AnonLoadElement {
  @scala.inline
  def apply(
    loadElement: HTMLImageElement | HTMLAudioElement | HTMLVideoElement = null,
    mimeType: String | js.Array[String] = null,
    skipSource: js.UndefOr[Boolean] = js.undefined
  ): AnonLoadElement = {
    val __obj = js.Dynamic.literal()
    if (loadElement != null) __obj.updateDynamic("loadElement")(loadElement.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSource)) __obj.updateDynamic("skipSource")(skipSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoadElement]
  }
}

