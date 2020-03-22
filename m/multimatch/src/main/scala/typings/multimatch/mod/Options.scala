package typings.multimatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<minimatch.minimatch.IOptions> */
trait Options extends js.Object {
  val debug: js.UndefOr[Boolean] = js.undefined
  val dot: js.UndefOr[Boolean] = js.undefined
  val flipNegate: js.UndefOr[Boolean] = js.undefined
  val matchBase: js.UndefOr[Boolean] = js.undefined
  val nobrace: js.UndefOr[Boolean] = js.undefined
  val nocase: js.UndefOr[Boolean] = js.undefined
  val nocomment: js.UndefOr[Boolean] = js.undefined
  val noext: js.UndefOr[Boolean] = js.undefined
  val noglobstar: js.UndefOr[Boolean] = js.undefined
  val nonegate: js.UndefOr[Boolean] = js.undefined
  val nonull: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    flipNegate: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocomment: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    nonull: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.asInstanceOf[js.Any])
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

