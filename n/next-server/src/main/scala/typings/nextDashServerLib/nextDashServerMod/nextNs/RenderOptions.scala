package typings
package nextDashServerLib.nextDashServerMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var buildId: java.lang.String
  var distDir: java.lang.String
  var generateETags: scala.Boolean
  var runtimeConfig: js.UndefOr[stdLib.Record[_, _]] = js.undefined
  var staticMarkup: scala.Boolean
}

object RenderOptions {
  @scala.inline
  def apply(
    buildId: java.lang.String,
    distDir: java.lang.String,
    generateETags: scala.Boolean,
    staticMarkup: scala.Boolean,
    runtimeConfig: stdLib.Record[_, _] = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(buildId = buildId, distDir = distDir, generateETags = generateETags, staticMarkup = staticMarkup)
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig)
    __obj.asInstanceOf[RenderOptions]
  }
}

