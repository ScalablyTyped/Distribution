package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Syntax extends js.Object {
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parse] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringify] = js.undefined
}

object Syntax {
  @scala.inline
  def apply(parse: Parse = null, stringify: Stringify = null): Syntax = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[Syntax]
  }
}

