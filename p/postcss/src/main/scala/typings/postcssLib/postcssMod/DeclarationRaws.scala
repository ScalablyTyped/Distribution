package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationRaws extends NodeRaws {
  /**
    * The declaration's value. This value will be cleaned of comments.
    * If the source value contained comments, those comments will be
    * available in the _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DeclarationRaws {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    afterName: java.lang.String = null,
    before: java.lang.String = null,
    between: java.lang.String = null,
    important: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    semicolon: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): DeclarationRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterName != null) __obj.updateDynamic("afterName")(afterName)
    if (before != null) __obj.updateDynamic("before")(before)
    if (between != null) __obj.updateDynamic("between")(between)
    if (important != null) __obj.updateDynamic("important")(important)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DeclarationRaws]
  }
}

