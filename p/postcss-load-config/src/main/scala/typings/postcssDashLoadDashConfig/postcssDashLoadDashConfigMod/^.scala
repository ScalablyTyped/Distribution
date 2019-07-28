package typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigMod

import typings.cosmiconfig.cosmiconfigMod.ExplorerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss-load-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext, path: String): js.Promise[Result] = js.native
  def apply(ctx: ConfigContext, path: String, options: ExplorerOptions): js.Promise[Result] = js.native
  def sync(): Result = js.native
  def sync(ctx: ConfigContext): Result = js.native
  def sync(ctx: ConfigContext, path: String): Result = js.native
  def sync(ctx: ConfigContext, path: String, options: ExplorerOptions): Result = js.native
}

