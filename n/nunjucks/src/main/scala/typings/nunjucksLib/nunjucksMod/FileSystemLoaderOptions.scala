package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemLoaderOptions extends js.Object {
  /**  if true, the system will avoid using a cache and templates will be recompiled every single time */
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  /** if true, the system will automatically update templates when they are changed on the filesystem */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

