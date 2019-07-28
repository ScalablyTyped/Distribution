package typings.moo.mooMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(rules: Rules): Lexer = js.native
  def keywords(kws: StringDictionary[String | js.Array[String]]): TypeMapper = js.native
  def states(states: StringDictionary[Rules]): Lexer = js.native
  def states(states: StringDictionary[Rules], start: String): Lexer = js.native
}

