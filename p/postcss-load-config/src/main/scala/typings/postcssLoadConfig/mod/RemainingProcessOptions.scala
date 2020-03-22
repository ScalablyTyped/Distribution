package typings.postcssLoadConfig.mod

import typings.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The remaining ProcessOptions, sans the three above.
/* Inlined std.Pick<postcss.postcss.ProcessOptions, std.Exclude<keyof postcss.postcss.ProcessOptions, keyof postcss-load-config.postcss-load-config.ProcessOptionsPreload>> */
trait RemainingProcessOptions extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object RemainingProcessOptions {
  @scala.inline
  def apply(from: String = null, map: SourceMapOptions | Boolean = null, to: String = null): RemainingProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemainingProcessOptions]
  }
}

