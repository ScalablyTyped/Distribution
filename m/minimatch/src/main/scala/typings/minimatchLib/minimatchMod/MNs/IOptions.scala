package typings
package minimatchLib.minimatchMod.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * Dump a ton of stuff to stderr.
    *
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow patterns to match filenames starting with a period,
    * even if the pattern does not explicitly have a period in that spot.
    *
    * @default false
    */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Returns from negate expressions the same as if they were not negated.
    * (Ie, true on a hit, false on a miss.)
    *
    * @default false
    */
  var flipNegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, then patterns without slashes will be matched against
    * the basename of the path if it contains slashes.
    *
    * @default false
    */
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not expand {a,b} and {1..3} brace sets.
    *
    * @default false
    */
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Perform a case-insensitive match.
    *
    * @default false
    */
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Suppress the behavior of treating #
    * at the start of a pattern as a comment.
    *
    * @default false
    */
  var nocomment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable "extglob" style patterns like +(a|b).
    *
    * @default false
    */
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable ** matching against multiple folder names.
    *
    * @default false
    */
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Suppress the behavior of treating a leading ! character as negation.
    *
    * @default false
    */
  var nonegate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When a match is not found by minimatch.match,
    * return a list containing the pattern itself if this option is set.
    * Otherwise, an empty list is returned if there are no matches.
    *
    * @default false
    */
  var nonull: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    flipNegate: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nocomment: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    __obj.asInstanceOf[IOptions]
  }
}

