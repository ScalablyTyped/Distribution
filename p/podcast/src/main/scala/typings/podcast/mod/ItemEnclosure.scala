package typings.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemEnclosure extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
}

object ItemEnclosure {
  @scala.inline
  def apply(url: String, file: String = null, size: js.UndefOr[Double] = js.undefined, `type`: String = null): ItemEnclosure = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEnclosure]
  }
}

