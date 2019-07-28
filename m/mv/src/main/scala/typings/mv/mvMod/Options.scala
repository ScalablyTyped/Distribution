package typings.mv.mvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.undefined
  var mkdirp: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(clobber: js.UndefOr[Boolean] = js.undefined, mkdirp: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber)
    if (!js.isUndefined(mkdirp)) __obj.updateDynamic("mkdirp")(mkdirp)
    __obj.asInstanceOf[Options]
  }
}

