package typings.postcss.mod

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
  var value: js.UndefOr[String] = js.undefined
}

object DeclarationRaws {
  @scala.inline
  def apply(
    after: String = null,
    afterName: String = null,
    before: String = null,
    between: String = null,
    important: String = null,
    left: String = null,
    right: String = null,
    semicolon: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): DeclarationRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterName != null) __obj.updateDynamic("afterName")(afterName.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (important != null) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationRaws]
  }
}

