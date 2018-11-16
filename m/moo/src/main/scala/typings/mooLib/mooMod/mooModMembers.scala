package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moo", JSImport.Namespace)
@js.native
object mooModMembers extends js.Object {
  val error: mooLib.Anon_Error = js.native
  def compile(rules: Rules): Lexer = js.native
  def states(states: ScalablyTyped.runtime.StringDictionary[Rules]): Lexer = js.native
  def states(states: ScalablyTyped.runtime.StringDictionary[Rules], start: java.lang.String): Lexer = js.native
}

