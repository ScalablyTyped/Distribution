package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mjml2HtmlOptions extends js.Object {
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  var fonts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var keepComments: js.UndefOr[scala.Boolean] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var validationLevel: js.UndefOr[
    mjmlDashReactLib.mjmlDashReactLibStrings.strict | mjmlDashReactLib.mjmlDashReactLibStrings.soft | mjmlDashReactLib.mjmlDashReactLibStrings.skip
  ] = js.undefined
}

object Mjml2HtmlOptions {
  @scala.inline
  def apply(
    beautify: js.UndefOr[scala.Boolean] = js.undefined,
    filePath: java.lang.String = null,
    fonts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    keepComments: js.UndefOr[scala.Boolean] = js.undefined,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    validationLevel: mjmlDashReactLib.mjmlDashReactLibStrings.strict | mjmlDashReactLib.mjmlDashReactLibStrings.soft | mjmlDashReactLib.mjmlDashReactLibStrings.skip = null
  ): Mjml2HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(keepComments)) __obj.updateDynamic("keepComments")(keepComments)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (validationLevel != null) __obj.updateDynamic("validationLevel")(validationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mjml2HtmlOptions]
  }
}

