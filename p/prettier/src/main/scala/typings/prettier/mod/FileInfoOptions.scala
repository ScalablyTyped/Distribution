package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoOptions extends js.Object {
  var ignorePath: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var resolveConfig: js.UndefOr[Boolean] = js.undefined
  var withNodeModules: js.UndefOr[Boolean] = js.undefined
}

object FileInfoOptions {
  @scala.inline
  def apply(
    ignorePath: String = null,
    plugins: js.Array[String] = null,
    resolveConfig: js.UndefOr[Boolean] = js.undefined,
    withNodeModules: js.UndefOr[Boolean] = js.undefined
  ): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveConfig)) __obj.updateDynamic("resolveConfig")(resolveConfig.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withNodeModules)) __obj.updateDynamic("withNodeModules")(withNodeModules.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfoOptions]
  }
}

