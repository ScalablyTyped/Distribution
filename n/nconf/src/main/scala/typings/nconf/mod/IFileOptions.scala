package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[IFormat] = js.undefined
  var json_spacing: js.UndefOr[Double] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var secure: js.UndefOr[ISecureFileOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    dir: String = null,
    file: String = null,
    format: IFormat = null,
    json_spacing: Int | Double = null,
    search: js.UndefOr[Boolean] = js.undefined,
    secure: ISecureFileOptions = null,
    `type`: String = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (json_spacing != null) __obj.updateDynamic("json_spacing")(json_spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

