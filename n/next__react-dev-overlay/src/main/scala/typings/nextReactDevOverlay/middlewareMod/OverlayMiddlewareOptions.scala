package typings.nextReactDevOverlay.middlewareMod

import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayMiddlewareOptions extends js.Object {
  var rootDirectory: String
  def serverStats(): Stats
  def stats(): Stats
}

object OverlayMiddlewareOptions {
  @scala.inline
  def apply(rootDirectory: String, serverStats: () => Stats, stats: () => Stats): OverlayMiddlewareOptions = {
    val __obj = js.Dynamic.literal(rootDirectory = rootDirectory.asInstanceOf[js.Any], serverStats = js.Any.fromFunction0(serverStats), stats = js.Any.fromFunction0(stats))
    __obj.asInstanceOf[OverlayMiddlewareOptions]
  }
}

