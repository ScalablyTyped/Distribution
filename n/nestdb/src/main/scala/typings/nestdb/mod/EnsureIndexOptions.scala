package typings.nestdb.mod

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
    expireAfterSeconds: js.UndefOr[Double] = js.undefined,
    sparse: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): EnsureIndexOptions = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(expireAfterSeconds)) __obj.updateDynamic("expireAfterSeconds")(expireAfterSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureIndexOptions]
  }
}

