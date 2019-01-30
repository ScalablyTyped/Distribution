package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * You can have a token type that both matches tokens and contains error values.
    */
  var error: js.UndefOr[mooLib.mooLibNumbers.`true`] = js.undefined
  /**
    * Moo tracks detailed information about the input for you.
    * It will track line numbers, as long as you apply the `lineBreaks: true`
    * option to any tokens which might contain newlines. Moo will try to warn you if you forget to do this.
    */
  var lineBreaks: js.UndefOr[scala.Boolean] = js.undefined
  var `match`: js.UndefOr[stdLib.RegExp | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Moves to a new state, but does not affect the stack.
    */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns to a previous state, by removing one or more states from the stack.
    */
  var pop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Moves the lexer to a new state, and pushes the old state onto the stack.
    */
  var push: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for mapping one set of types to another.
    * See https://github.com/no-context/moo#keywords for an example
    */
  var `type`: js.UndefOr[TypeMapper] = js.undefined
  /**
    * Moo doesn't allow capturing groups, but you can supply a transform function, value(),
    * which will be called on the value before storing it in the Token object.
    */
  var value: js.UndefOr[js.Function1[/* x */ java.lang.String, java.lang.String]] = js.undefined
}

