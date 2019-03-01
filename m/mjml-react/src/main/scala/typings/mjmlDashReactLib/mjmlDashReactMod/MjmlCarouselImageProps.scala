package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlCarouselImageProps extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailsSrc: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlCarouselImageProps {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    src: java.lang.String = null,
    thumbnailsSrc: java.lang.String = null,
    title: java.lang.String = null
  ): MjmlCarouselImageProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (src != null) __obj.updateDynamic("src")(src)
    if (thumbnailsSrc != null) __obj.updateDynamic("thumbnailsSrc")(thumbnailsSrc)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MjmlCarouselImageProps]
  }
}

