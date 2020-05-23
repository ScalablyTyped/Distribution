package typings.mz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
}

object `1` {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined): `1` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

