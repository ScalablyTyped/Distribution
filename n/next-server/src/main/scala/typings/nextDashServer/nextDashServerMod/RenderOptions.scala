package typings.nextDashServer.nextDashServerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var buildId: String
  var distDir: String
  var generateETags: Boolean
  var runtimeConfig: js.UndefOr[Record[_, _]] = js.undefined
  var staticMarkup: Boolean
}

object RenderOptions {
  @scala.inline
  def apply(
    buildId: String,
    distDir: String,
    generateETags: Boolean,
    staticMarkup: Boolean,
    runtimeConfig: Record[_, _] = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(buildId = buildId, distDir = distDir, generateETags = generateETags, staticMarkup = staticMarkup)
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig)
    __obj.asInstanceOf[RenderOptions]
  }
}

