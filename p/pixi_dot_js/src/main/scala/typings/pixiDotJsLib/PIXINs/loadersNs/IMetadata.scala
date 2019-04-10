package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadata extends js.Object {
  var loadElement: js.UndefOr[stdLib.HTMLImageElement | stdLib.HTMLAudioElement | stdLib.HTMLVideoElement] = js.undefined
  var mimeType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var skipSource: js.UndefOr[scala.Boolean] = js.undefined
}

object IMetadata {
  @scala.inline
  def apply(
    loadElement: stdLib.HTMLImageElement | stdLib.HTMLAudioElement | stdLib.HTMLVideoElement = null,
    mimeType: java.lang.String | js.Array[java.lang.String] = null,
    skipSource: js.UndefOr[scala.Boolean] = js.undefined
  ): IMetadata = {
    val __obj = js.Dynamic.literal()
    if (loadElement != null) __obj.updateDynamic("loadElement")(loadElement.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSource)) __obj.updateDynamic("skipSource")(skipSource)
    __obj.asInstanceOf[IMetadata]
  }
}

