package typings
package nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * If true, splits the data in multiple deflate blocks with optimal choice for the block boundaries.
           * Block splitting gives better compression.
           */
  var blocksplitting: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If true, chooses the optimal block split points only after doing the iterative LZ77 compression.
           * If false, chooses the block split points first, then does iterative LZ77 on each individual block.
           * Depending on the file, either first or last gives the best compression.
           */
  var blocksplittinglast: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Maximum amount of blocks to split into (0 for unlimited,
           * but this can give extreme results that hurt compression on some files).
           */
  var blocksplittingmax: js.UndefOr[scala.Double] = js.undefined
  /**
           * Maximum amount of times to rerun forward and backward pass to optimize LZ77 compression cost.
           * Good values: 10, 15 for small files, 5 for files over several MB in size or it will be too slow.
           */
  var numiterations: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var verbose_more: js.UndefOr[scala.Boolean] = js.undefined
}

