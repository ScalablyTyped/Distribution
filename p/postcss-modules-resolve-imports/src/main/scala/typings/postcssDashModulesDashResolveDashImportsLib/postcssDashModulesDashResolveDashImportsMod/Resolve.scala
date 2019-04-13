package typings
package postcssDashModulesDashResolveDashImportsLib.postcssDashModulesDashResolveDashImportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  var alias: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mainFile: js.UndefOr[java.lang.String] = js.undefined
  var modules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
}

object Resolve {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    extensions: js.Array[java.lang.String] = null,
    mainFile: java.lang.String = null,
    modules: js.Array[java.lang.String] = null,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  ): Resolve = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (mainFile != null) __obj.updateDynamic("mainFile")(mainFile)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    __obj.asInstanceOf[Resolve]
  }
}

