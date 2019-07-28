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
    breakRewriteThreshold: Int | Double = null,
    copyThreshold: Int | Double = null,
    flags: Int | Double = null,
    renameFromRewriteThreshold: Int | Double = null,
    renameLimit: Int | Double = null,
    renameThreshold: Int | Double = null,
    version: Int | Double = null
  ): DiffFindOptions = {
    val __obj = js.Dynamic.literal()
    if (breakRewriteThreshold != null) __obj.updateDynamic("breakRewriteThreshold")(breakRewriteThreshold.asInstanceOf[js.Any])
    if (copyThreshold != null) __obj.updateDynamic("copyThreshold")(copyThreshold.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (renameFromRewriteThreshold != null) __obj.updateDynamic("renameFromRewriteThreshold")(renameFromRewriteThreshold.asInstanceOf[js.Any])
    if (renameLimit != null) __obj.updateDynamic("renameLimit")(renameLimit.asInstanceOf[js.Any])
    if (renameThreshold != null) __obj.updateDynamic("renameThreshold")(renameThreshold.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffFindOptions]
  }
}

