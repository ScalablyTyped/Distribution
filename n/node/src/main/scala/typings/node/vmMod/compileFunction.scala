package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vm", "compileFunction")
@js.native
object compileFunction extends js.Object {
  
  def apply(code: String): js.Function = js.native
  def apply(code: String, params: js.UndefOr[scala.Nothing], options: CompileFunctionOptions): js.Function = js.native
  def apply(code: String, params: js.Array[String]): js.Function = js.native
  def apply(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
}
