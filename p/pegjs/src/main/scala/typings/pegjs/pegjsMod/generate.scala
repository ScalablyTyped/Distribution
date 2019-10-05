package typings.pegjs.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pegjs", "generate")
@js.native
object generate extends js.Object {
  def apply(grammar: String): Parser = js.native
  def apply(grammar: String, options: OutputFormatAmdCommonjs): String = js.native
  def apply(grammar: String, options: OutputFormatBare): String = js.native
  def apply(grammar: String, options: OutputFormatGlobals): String = js.native
  def apply(grammar: String, options: OutputFormatUmd): String = js.native
  def apply(grammar: String, options: ParserBuildOptions): Parser = js.native
}

