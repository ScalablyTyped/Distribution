package typings.podcast.podcastMod

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
  def apply(url: String, file: String = null, size: Int | Double = null, `type`: String = null): ItemEnclosure = {
    val __obj = js.Dynamic.literal(url = url)
    if (file != null) __obj.updateDynamic("file")(file)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemEnclosure]
  }
}

