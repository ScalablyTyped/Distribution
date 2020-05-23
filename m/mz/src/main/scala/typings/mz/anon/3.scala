package typings.mz.anon

import typings.mz.mzBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: `true`
}

object `3` {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: js.UndefOr[Null | String] = js.undefined): `3` = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

