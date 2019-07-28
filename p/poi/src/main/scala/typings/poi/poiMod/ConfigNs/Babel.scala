package typings.poi.poiMod.ConfigNs

import typings.poi.poiMod.ConfigNs.BabelNs.NamedImportsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Babel extends js.Object {
  var jsx: js.UndefOr[String] = js.undefined
  var namedImports: js.UndefOr[String | NamedImportsOptions] = js.undefined
  var transpileModules: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Babel {
  @scala.inline
  def apply(
    jsx: String = null,
    namedImports: String | NamedImportsOptions = null,
    transpileModules: String | js.Array[String] = null
  ): Babel = {
    val __obj = js.Dynamic.literal()
    if (jsx != null) __obj.updateDynamic("jsx")(jsx)
    if (namedImports != null) __obj.updateDynamic("namedImports")(namedImports.asInstanceOf[js.Any])
    if (transpileModules != null) __obj.updateDynamic("transpileModules")(transpileModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Babel]
  }
}

