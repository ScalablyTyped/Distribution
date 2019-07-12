package typings
package podcastLib.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemEnclosure extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ItemEnclosure {
  @scala.inline
  def apply(
    url: java.lang.String,
    file: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ItemEnclosure = {
    val __obj = js.Dynamic.literal(url = url)
    if (file != null) __obj.updateDynamic("file")(file)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemEnclosure]
  }
}

