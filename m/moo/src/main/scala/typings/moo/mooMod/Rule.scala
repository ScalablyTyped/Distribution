package typings.moo.mooMod

import typings.moo.mooNumbers.`true`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * You can have a token type that both matches tokens and contains error values.
    */
  var error: js.UndefOr[`true`] = js.undefined
  /**
    * Moo tracks detailed information about the input for you.
    * It will track line numbers, as long as you apply the `lineBreaks: true`
    * option to any tokens which might contain newlines. Moo will try to warn you if you forget to do this.
    */
  var lineBreaks: js.UndefOr[Boolean] = js.undefined
  var `match`: js.UndefOr[RegExp | String | js.Array[String]] = js.undefined
  /**
    * Moves to a new state, but does not affect the stack.
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * Returns to a previous state, by removing one or more states from the stack.
    */
  var pop: js.UndefOr[Double] = js.undefined
  /**
    * Moves the lexer to a new state, and pushes the old state onto the stack.
    */
  var push: js.UndefOr[String] = js.undefined
  /**
    * Used for mapping one set of types to another.
    * See https://github.com/no-context/moo#keywords for an example
    */
  var `type`: js.UndefOr[TypeMapper] = js.undefined
  /**
    * Moo doesn't allow capturing groups, but you can supply a transform function, value(),
    * which will be called on the value before storing it in the Token object.
    */
  var value: js.UndefOr[js.Function1[/* x */ String, String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    error: `true` = null,
    lineBreaks: js.UndefOr[Boolean] = js.undefined,
    `match`: RegExp | String | js.Array[String] = null,
    next: String = null,
    pop: Int | Double = null,
    push: String = null,
    `type`: /* x */ String => String = null,
    value: /* x */ String => String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(lineBreaks)) __obj.updateDynamic("lineBreaks")(lineBreaks.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (pop != null) __obj.updateDynamic("pop")(pop.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[Rule]
  }
}

