package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeArrayIndex extends js.Object {
  var includeArrayIndex: js.UndefOr[String] = js.undefined
  var path: String
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeArrayIndex {
  @scala.inline
  def apply(
    path: String,
    includeArrayIndex: String = null,
    preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
  ): AnonIncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (includeArrayIndex != null) __obj.updateDynamic("includeArrayIndex")(includeArrayIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNullAndEmptyArrays)) __obj.updateDynamic("preserveNullAndEmptyArrays")(preserveNullAndEmptyArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeArrayIndex]
  }
}

