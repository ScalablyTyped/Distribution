package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pegjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GrammarError: js.Any = js.native
  def generate(grammar: java.lang.String): pegjsLib.pegjsMod.Parser = js.native
  def generate(grammar: java.lang.String, options: pegjsLib.pegjsMod.OutputFormatAmdCommonjs): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: pegjsLib.pegjsMod.OutputFormatBare): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: pegjsLib.pegjsMod.OutputFormatGlobals): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: pegjsLib.pegjsMod.OutputFormatUmd): java.lang.String = js.native
  def generate(grammar: java.lang.String, options: pegjsLib.pegjsMod.ParserBuildOptions): pegjsLib.pegjsMod.Parser = js.native
}

