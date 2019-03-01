package typings
package nedbLib.nedbMod.NedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureIndexOptions extends js.Object {
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  var fieldName: java.lang.String
  var sparse: js.UndefOr[scala.Boolean] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object EnsureIndexOptions {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    expireAfterSeconds: scala.Int | scala.Double = null,
    sparse: js.UndefOr[scala.Boolean] = js.undefined,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): EnsureIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldName")(fieldName)
    if (expireAfterSeconds != null) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[EnsureIndexOptions]
  }
}

