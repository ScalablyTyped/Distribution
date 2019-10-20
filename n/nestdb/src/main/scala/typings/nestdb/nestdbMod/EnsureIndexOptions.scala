package typings.nestdb.nestdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureIndexOptions extends js.Object {
  var expireAfterSeconds: js.UndefOr[Double] = js.undefined
  var fieldName: String
  var sparse: js.UndefOr[Boolean] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object EnsureIndexOptions {
  @scala.inline
  def apply(
    fieldName: String,
    expireAfterSeconds: Int | Double = null,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): EnsureIndexOptions = {
    val __obj = js.Dynamic.literal(fieldName = fieldName)
    if (expireAfterSeconds != null) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[EnsureIndexOptions]
  }
}

