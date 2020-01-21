package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "createLanguage")
@js.native
object createLanguage extends js.Object {
  /**
  	 * Starting point for building a language parser in Parsimmon.
  	 *
  	 * For having the resulting language rules return typed parsers, e.g. `Parser<Foo>` instead of
  	 * `Parser<any>`, pass a language specification as type parameter to this function. The language
  	 * specification should be of the following form:
  	 *
  	 * ```javascript
  	 * {
  	 *   rule1: type;
  	 *   rule2: type;
  	 * }
  	 * ```
  	 *
  	 * For example:
  	 *
  	 * ```javascript
  	 * const language = Parsimmon.createLanguage<{
  	 *   expr: Expr;
  	 *   numberLiteral: number;
  	 *   stringLiteral: string;
  	 * }>({
  	 *   expr: r => (some expression that yields Parser<Expr>),
  	 *   numberLiteral: r => (some expression that yields Parser<number>),
  	 *   stringLiteral: r => (some expression that yields Parser<string>)
  	 * });
  	 * ```
  	 *
  	 * Now both `language` and the parameter `r` that is passed into every parser rule will be of the
  	 * following type:
  	 *
  	 * ```javascript
  	 * {
  	 *   expr: Parser<Expr>;
  	 *   numberLiteral: Parser<number>;
  	 *   stringLiteral: Parser<string>;
  	 * }
  	 * ```
  	 *
  	 * Another benefit is that both the `rules` parameter and the resulting `language` should match the
  	 * properties defined in the language specification type, which means that the compiler checks that
  	 * there are no missing or superfluous rules in the language definition, and that the rules you access
  	 * on the resulting language do actually exist.
  	 */
  def apply(rules: Rule): Language = js.native
  def apply[TLanguageSpec](rules: TypedRule[TLanguageSpec]): TypedLanguage[TLanguageSpec] = js.native
}

