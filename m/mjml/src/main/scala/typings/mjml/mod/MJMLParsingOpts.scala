package typings.mjml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mjml.mjmlStrings.skip
import typings.mjml.mjmlStrings.soft
import typings.mjml.mjmlStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParsingOpts extends js.Object {
  var beautify: js.UndefOr[Boolean] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
  var keepComments: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var minifyOptions: js.UndefOr[MJMLMinifyOptions] = js.undefined
  var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
}

object MJMLParsingOpts {
  @scala.inline
  def apply(
    beautify: js.UndefOr[Boolean] = js.undefined,
    filePath: String = null,
    fonts: StringDictionary[String] = null,
    keepComments: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    minifyOptions: MJMLMinifyOptions = null,
    validationLevel: strict | soft | skip = null
  ): MJMLParsingOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(keepComments)) __obj.updateDynamic("keepComments")(keepComments.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (minifyOptions != null) __obj.updateDynamic("minifyOptions")(minifyOptions.asInstanceOf[js.Any])
    if (validationLevel != null) __obj.updateDynamic("validationLevel")(validationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLParsingOpts]
  }
}

