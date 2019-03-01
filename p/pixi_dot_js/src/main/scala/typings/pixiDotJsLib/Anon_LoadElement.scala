package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoadElement extends js.Object {
  var loadElement: js.UndefOr[stdLib.HTMLImageElement | stdLib.HTMLAudioElement | stdLib.HTMLVideoElement] = js.undefined
  var mimeType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var skipSource: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_LoadElement {
  @scala.inline
  def apply(
    loadElement: stdLib.HTMLImageElement | stdLib.HTMLAudioElement | stdLib.HTMLVideoElement = null,
    mimeType: java.lang.String | js.Array[java.lang.String] = null,
    skipSource: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_LoadElement = {
    val __obj = js.Dynamic.literal()
    if (loadElement != null) __obj.updateDynamic("loadElement")(loadElement.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSource)) __obj.updateDynamic("skipSource")(skipSource)
    __obj.asInstanceOf[Anon_LoadElement]
  }
}

