package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(rules: Rules): Lexer = js.native
  def keywords(kws: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]): TypeMapper = js.native
  def states(states: org.scalablytyped.runtime.StringDictionary[Rules]): Lexer = js.native
  def states(states: org.scalablytyped.runtime.StringDictionary[Rules], start: java.lang.String): Lexer = js.native
}

