package typings.mjmlDashReact.mjmlDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.mjmlDashReact.mjmlDashReactStrings.skip
import typings.mjmlDashReact.mjmlDashReactStrings.soft
import typings.mjmlDashReact.mjmlDashReactStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mjml2HtmlOptions extends js.Object {
  var beautify: js.UndefOr[Boolean] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
  var keepComments: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
}

object Mjml2HtmlOptions {
  @scala.inline
  def apply(
    beautify: js.UndefOr[Boolean] = js.undefined,
    filePath: String = null,
    fonts: StringDictionary[String] = null,
    keepComments: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    validationLevel: strict | soft | skip = null
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

