package typings.nodeUci.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var binc: js.UndefOr[Double] = js.undefined
  var btime: js.UndefOr[Double] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var mate: js.UndefOr[Double] = js.undefined
  var movestogo: js.UndefOr[Double] = js.undefined
  var movetime: js.UndefOr[Double] = js.undefined
  var nodes: js.UndefOr[Double] = js.undefined
  var ponder: js.UndefOr[Boolean] = js.undefined
  var searchmoves: js.UndefOr[js.Array[String]] = js.undefined
  var winc: js.UndefOr[Double] = js.undefined
  var wtime: js.UndefOr[Double] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    binc: js.UndefOr[Double] = js.undefined,
    btime: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    mate: js.UndefOr[Double] = js.undefined,
    movestogo: js.UndefOr[Double] = js.undefined,
    movetime: js.UndefOr[Double] = js.undefined,
    nodes: js.UndefOr[Double] = js.undefined,
    ponder: js.UndefOr[Boolean] = js.undefined,
    searchmoves: js.Array[String] = null,
    winc: js.UndefOr[Double] = js.undefined,
    wtime: js.UndefOr[Double] = js.undefined
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binc)) __obj.updateDynamic("binc")(binc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(btime)) __obj.updateDynamic("btime")(btime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mate)) __obj.updateDynamic("mate")(mate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movestogo)) __obj.updateDynamic("movestogo")(movestogo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movetime)) __obj.updateDynamic("movetime")(movetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodes)) __obj.updateDynamic("nodes")(nodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ponder)) __obj.updateDynamic("ponder")(ponder.get.asInstanceOf[js.Any])
    if (searchmoves != null) __obj.updateDynamic("searchmoves")(searchmoves.asInstanceOf[js.Any])
    if (!js.isUndefined(winc)) __obj.updateDynamic("winc")(winc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wtime)) __obj.updateDynamic("wtime")(wtime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

