package typings
package mjmlLib.mjmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParsingOpts extends js.Object {
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  var fonts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var keepComments: js.UndefOr[scala.Boolean] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var validationLevel: js.UndefOr[
    mjmlLib.mjmlLibStrings.strict | mjmlLib.mjmlLibStrings.soft | mjmlLib.mjmlLibStrings.skip
  ] = js.undefined
}

object MJMLParsingOpts {
  @scala.inline
  def apply(
    beautify: js.UndefOr[scala.Boolean] = js.undefined,
    filePath: java.lang.String = null,
    fonts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    keepComments: js.UndefOr[scala.Boolean] = js.undefined,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    validationLevel: mjmlLib.mjmlLibStrings.strict | mjmlLib.mjmlLibStrings.soft | mjmlLib.mjmlLibStrings.skip = null
  ): MJMLParsingOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(keepComments)) __obj.updateDynamic("keepComments")(keepComments)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (validationLevel != null) __obj.updateDynamic("validationLevel")(validationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLParsingOpts]
  }
}

