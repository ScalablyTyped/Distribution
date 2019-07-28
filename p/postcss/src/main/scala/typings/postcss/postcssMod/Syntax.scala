package typings.postcss.postcssMod

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
  def apply(parse: Parser = null, stringify: Stringifier = null): Syntax = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[Syntax]
  }
}

