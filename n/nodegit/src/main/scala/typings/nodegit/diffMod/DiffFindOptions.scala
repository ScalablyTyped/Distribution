package typings.nodegit.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffFindOptions extends js.Object {
  var breakRewriteThreshold: js.UndefOr[Double] = js.undefined
  var copyThreshold: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var renameFromRewriteThreshold: js.UndefOr[Double] = js.undefined
  var renameLimit: js.UndefOr[Double] = js.undefined
  var renameThreshold: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object DiffFindOptions {
  @scala.inline
  def apply(
    breakRewriteThreshold: js.UndefOr[Double] = js.undefined,
    copyThreshold: js.UndefOr[Double] = js.undefined,
    flags: js.UndefOr[Double] = js.undefined,
    renameFromRewriteThreshold: js.UndefOr[Double] = js.undefined,
    renameLimit: js.UndefOr[Double] = js.undefined,
    renameThreshold: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): DiffFindOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakRewriteThreshold)) __obj.updateDynamic("breakRewriteThreshold")(breakRewriteThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyThreshold)) __obj.updateDynamic("copyThreshold")(copyThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renameFromRewriteThreshold)) __obj.updateDynamic("renameFromRewriteThreshold")(renameFromRewriteThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renameLimit)) __obj.updateDynamic("renameLimit")(renameLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renameThreshold)) __obj.updateDynamic("renameThreshold")(renameThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffFindOptions]
  }
}

