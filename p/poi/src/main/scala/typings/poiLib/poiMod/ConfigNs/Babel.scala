package typings
package poiLib.poiMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Babel extends js.Object {
  var jsx: js.UndefOr[java.lang.String] = js.undefined
  var namedImports: js.UndefOr[java.lang.String | poiLib.poiMod.ConfigNs.BabelNs.NamedImportsOptions] = js.undefined
  var transpileModules: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Babel {
  @scala.inline
  def apply(
    jsx: java.lang.String = null,
    namedImports: java.lang.String | poiLib.poiMod.ConfigNs.BabelNs.NamedImportsOptions = null,
    transpileModules: java.lang.String | js.Array[java.lang.String] = null
  ): Babel = {
    val __obj = js.Dynamic.literal()
    if (jsx != null) __obj.updateDynamic("jsx")(jsx)
    if (namedImports != null) __obj.updateDynamic("namedImports")(namedImports.asInstanceOf[js.Any])
    if (transpileModules != null) __obj.updateDynamic("transpileModules")(transpileModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Babel]
  }
}

