package typings.pegjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pegjs", "generate")
@js.native
object generate extends js.Object {
  
  def apply(grammar: String): Parser_ = js.native
  def apply(grammar: String, options: OutputFormatAmdCommonjs): String = js.native
  def apply(grammar: String, options: OutputFormatBare): String = js.native
  def apply(grammar: String, options: OutputFormatGlobals): String = js.native
  def apply(grammar: String, options: OutputFormatUmd): String = js.native
  def apply(grammar: String, options: ParserBuildOptions): Parser_ = js.native
}
