package typings.postcssDashModulesDashResolveDashImports.postcssDashModulesDashResolveDashImportsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  var alias: js.UndefOr[StringDictionary[String]] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var mainFile: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
}

object Resolve {
  @scala.inline
  def apply(
    alias: StringDictionary[String] = null,
    extensions: js.Array[String] = null,
    mainFile: String = null,
    modules: js.Array[String] = null,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  ): Resolve = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (mainFile != null) __obj.updateDynamic("mainFile")(mainFile.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolve]
  }
}

