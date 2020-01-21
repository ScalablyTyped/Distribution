package typings.postcssLoadConfig.mod

import typings.cosmiconfig.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss-load-config", "sync")
@js.native
object sync extends js.Object {
  def apply(): Result = js.native
  def apply(ctx: ConfigContext): Result = js.native
  def apply(ctx: ConfigContext, path: String): Result = js.native
  def apply(ctx: ConfigContext, path: String, options: Options): Result = js.native
}

