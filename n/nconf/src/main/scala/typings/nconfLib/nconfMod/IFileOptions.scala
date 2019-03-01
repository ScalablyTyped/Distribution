package typings
package nconfLib.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOptions extends js.Object {
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[IFormat] = js.undefined
  var json_spacing: js.UndefOr[scala.Double] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var secure: js.UndefOr[ISecureFileOptions] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    dir: java.lang.String = null,
    file: java.lang.String = null,
    format: IFormat = null,
    json_spacing: scala.Int | scala.Double = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    secure: ISecureFileOptions = null,
    `type`: java.lang.String = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (file != null) __obj.updateDynamic("file")(file)
    if (format != null) __obj.updateDynamic("format")(format)
    if (json_spacing != null) __obj.updateDynamic("json_spacing")(json_spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFileOptions]
  }
}

