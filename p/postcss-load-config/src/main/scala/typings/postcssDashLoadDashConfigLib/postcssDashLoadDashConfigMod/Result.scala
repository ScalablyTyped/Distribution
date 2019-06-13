package typings
package postcssDashLoadDashConfigLib.postcssDashLoadDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var file: java.lang.String
  var options: postcssLib.postcssMod.ProcessOptions
  var plugins: js.Array[ResultPlugin]
}

object Result {
  @scala.inline
  def apply(
    file: java.lang.String,
    options: postcssLib.postcssMod.ProcessOptions,
    plugins: js.Array[ResultPlugin]
  ): Result = {
    val __obj = js.Dynamic.literal(file = file, options = options, plugins = plugins)
  
    __obj.asInstanceOf[Result]
  }
}

