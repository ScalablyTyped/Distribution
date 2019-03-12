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

object Rule {
  @scala.inline
  def apply(
    error: mooLib.mooLibNumbers.`true` = null,
    lineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    `match`: stdLib.RegExp | java.lang.String | js.Array[java.lang.String] = null,
    next: java.lang.String = null,
    pop: scala.Int | scala.Double = null,
    push: java.lang.String = null,
    `type`: TypeMapper = null,
    value: /* x */ java.lang.String => java.lang.String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(lineBreaks)) __obj.updateDynamic("lineBreaks")(lineBreaks)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next)
    if (pop != null) __obj.updateDynamic("pop")(pop.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[Rule]
  }
}

