package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlCarouselImageProps extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var thumbnailsSrc: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MjmlCarouselImageProps {
  @scala.inline
  def apply(alt: String = null, src: String = null, thumbnailsSrc: String = null, title: String = null): MjmlCarouselImageProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (thumbnailsSrc != null) __obj.updateDynamic("thumbnailsSrc")(thumbnailsSrc.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlCarouselImageProps]
  }
}

