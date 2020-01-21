package typings.postcssLoadConfig.mod

import typings.cosmiconfig.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss-load-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext, path: String): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext, path: String, options: Options): js.Promise[Result] = js.native
}

