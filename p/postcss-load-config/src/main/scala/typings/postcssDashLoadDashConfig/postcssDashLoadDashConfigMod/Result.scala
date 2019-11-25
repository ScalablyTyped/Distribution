package typings.postcssDashLoadDashConfig.postcssDashLoadDashConfigMod

import typings.postcss.postcssMod.ProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var file: String
  var options: ProcessOptions
  var plugins: js.Array[ResultPlugin]
}

object Result {
  @scala.inline
  def apply(file: String, options: ProcessOptions, plugins: js.Array[ResultPlugin]): Result = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

