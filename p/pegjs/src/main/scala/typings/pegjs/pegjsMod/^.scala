package typings.pegjs.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pegjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GrammarError: js.Any = js.native
  def generate(grammar: String): Parser = js.native
  def generate(grammar: String, options: OutputFormatAmdCommonjs): String = js.native
  def generate(grammar: String, options: OutputFormatBare): String = js.native
  def generate(grammar: String, options: OutputFormatGlobals): String = js.native
  def generate(grammar: String, options: OutputFormatUmd): String = js.native
  def generate(grammar: String, options: ParserBuildOptions): Parser = js.native
}

