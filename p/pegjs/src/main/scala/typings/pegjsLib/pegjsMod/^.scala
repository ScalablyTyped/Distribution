package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pegjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GrammarError: js.Any = js.native
  def generate(grammar: java.lang.String): Parser = js.native
  def generate(grammar: java.lang.String, options: OutputFormatAmdCommonjs): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: OutputFormatBare): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: OutputFormatGlobals): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: OutputFormatUmd): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: ParserBuildOptions): Parser = js.native
}

