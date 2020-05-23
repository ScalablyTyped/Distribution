package typings.nextReactRefreshUtils.reactRefreshWebpackPluginMod

import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFreshWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object ReactFreshWebpackPlugin {
  @scala.inline
  def apply(apply: Compiler_ => Unit): ReactFreshWebpackPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[ReactFreshWebpackPlugin]
  }
}

