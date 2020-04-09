package typings.pacote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectory extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonDirectory {
  @scala.inline
  def apply(directory: String = null, `type`: String = null, url: String = null): AnonDirectory = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectory]
  }
}

