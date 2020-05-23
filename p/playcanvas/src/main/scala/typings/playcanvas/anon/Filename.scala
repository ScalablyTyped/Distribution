package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Filename {
  @scala.inline
  def apply(
    filename: String = null,
    hash: String = null,
    size: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Filename = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

