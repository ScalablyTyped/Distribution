package typings.ncp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errs extends js.Object {
  var errs: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Errs {
  @scala.inline
  def apply(errs: js.UndefOr[scala.Nothing] = js.undefined): Anon_Errs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errs)) __obj.updateDynamic("errs")(errs)
    __obj.asInstanceOf[Anon_Errs]
  }
}

