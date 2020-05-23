package typings.nodeZopfliEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
    * Block splitting gives better compression.
    */
  var blocksplitting: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
    * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
    * Depending on the file, either first or last gives the best compression.
    */
  var blocksplittinglast: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum amount of blocks to split into (0 for unlimited,
    * but this can give extreme results that hurt compression on some files).
    */
  var blocksplittingmax: js.UndefOr[Double] = js.undefined
  /**
    * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
    * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
    */
  var numiterations: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var verbose_more: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blocksplitting: js.UndefOr[Boolean] = js.undefined,
    blocksplittinglast: js.UndefOr[Boolean] = js.undefined,
    blocksplittingmax: js.UndefOr[Double] = js.undefined,
    numiterations: js.UndefOr[Double] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    verbose_more: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocksplitting)) __obj.updateDynamic("blocksplitting")(blocksplitting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blocksplittinglast)) __obj.updateDynamic("blocksplittinglast")(blocksplittinglast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blocksplittingmax)) __obj.updateDynamic("blocksplittingmax")(blocksplittingmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numiterations)) __obj.updateDynamic("numiterations")(numiterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose_more)) __obj.updateDynamic("verbose_more")(verbose_more.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

