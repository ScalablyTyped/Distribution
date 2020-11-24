package typings.nearley.mod

import typings.nearley.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nearley", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(grammar: Grammar) = this()
  def this(grammar: Grammar, options: ParserOptions) = this()
  
  var current: Double = js.native
  
  /**
    * The Parser object can be fed data in parts with .feed(data).
    * You can then find an array of parsings with the .results property.
    * If results is empty, then there are no parsings.
    * If results contains multiple values, then that combination is ambiguous.
    *
    * @throws If there are no possible parsings, nearley will throw an error
    * whose offset property is the index of the offending token.
    */
  def feed(chunk: String): this.type = js.native
  
  def finish(): js.Array[_] = js.native
  
  var grammar: Grammar = js.native
  
  var lexer: Lexer = js.native
  
  var lexerState: js.UndefOr[LexerState] = js.native
  
  var options: ParserOptions = js.native
  
  def restore(column: Dictkey): Unit = js.native
  
  /**
    * An array of possible parsings. Each element is the thing returned by your grammar.
    *
    * Note that this is undefined before the first feed() call.
    * It isn't typed as `any[] | undefined` to spare you the null checks when it's definitely an array.
    */
  var results: js.Array[_] = js.native
  
  def save(): Dictkey = js.native
}
