package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "compileFunction")
@js.native
object compileFunction extends js.Object {
  def apply(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
}

