package typings.postcss.postcssMod

import typings.postcss.postcssStrings.from
import typings.postcss.postcssStrings.map
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Syntax extends js.Object {
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.undefined
}

object Syntax {
  @scala.inline
  def apply(
    parse: (/* css */ ParserInput, /* opts */ js.UndefOr[Pick[ProcessOptions, map | from]]) => Root = null,
    stringify: (/* node */ Node, /* builder */ Builder) => Unit = null
  ): Syntax = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction2(stringify))
    __obj.asInstanceOf[Syntax]
  }
}

