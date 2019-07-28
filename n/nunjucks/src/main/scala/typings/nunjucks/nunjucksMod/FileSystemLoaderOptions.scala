package typings.nunjucks.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemLoaderOptions extends js.Object {
  /**  if true, the system will avoid using a cache and templates will be recompiled every single time */
  var noCache: js.UndefOr[Boolean] = js.undefined
  /** if true, the system will automatically update templates when they are changed on the filesystem */
  var watch: js.UndefOr[Boolean] = js.undefined
}

object FileSystemLoaderOptions {
  @scala.inline
  def apply(noCache: js.UndefOr[Boolean] = js.undefined, watch: js.UndefOr[Boolean] = js.undefined): FileSystemLoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[FileSystemLoaderOptions]
  }
}

