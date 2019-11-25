package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRaws extends js.Object {
  /**
    * The space symbols after the last child of the node to the end of
    * the node.
    */
  var after: js.UndefOr[String] = js.undefined
  /**
    * The space between the at-rule's name and parameters.
    */
  var afterName: js.UndefOr[String] = js.undefined
  /**
    * The space symbols before the node. It also stores `*` and `_`
    * symbols before the declaration (IE hack).
    */
  var before: js.UndefOr[String] = js.undefined
  /**
    * The symbols between the property and value for declarations,
    * selector and "{" for rules, last parameter and "{" for at-rules.
    */
  var between: js.UndefOr[String] = js.undefined
  /**
    * The content of important statement, if it is not just "!important".
    */
  var important: js.UndefOr[String] = js.undefined
  /**
    * The space symbols between "/ *" and comment's text.
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * The space symbols between comment's text and "*\/".
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * True if last child has (optional) semicolon.
    */
  var semicolon: js.UndefOr[Boolean] = js.undefined
}

object NodeRaws {
  @scala.inline
  def apply(
    after: String = null,
    afterName: String = null,
    before: String = null,
    between: String = null,
    important: String = null,
    left: String = null,
    right: String = null,
    semicolon: js.UndefOr[Boolean] = js.undefined
  ): NodeRaws = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterName != null) __obj.updateDynamic("afterName")(afterName.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (important != null) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRaws]
  }
}

