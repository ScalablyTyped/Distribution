package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeRaws extends js.Object {
  /**
           * The space symbols after the last child of the node to the end of
           * the node.
           */
  var after: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The space between the at-rule's name and parameters.
           */
  var afterName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The space symbols before the node. It also stores `*` and `_`
           * symbols before the declaration (IE hack).
           */
  var before: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The symbols between the property and value for declarations,
           * selector and "{" for rules, last parameter and "{" for at-rules.
           */
  var between: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The content of important statement, if it is not just "!important".
           */
  var important: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The space symbols between "/ *" and comment's text.
           */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The space symbols between comment's text and "*\/".
           */
  var right: js.UndefOr[java.lang.String] = js.undefined
  /**
           * True if last child has (optional) semicolon.
           */
  var semicolon: js.UndefOr[scala.Boolean] = js.undefined
}

