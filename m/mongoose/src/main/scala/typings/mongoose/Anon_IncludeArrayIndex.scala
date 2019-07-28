package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeArrayIndex extends js.Object {
  var includeArrayIndex: js.UndefOr[String] = js.undefined
  var path: String
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeArrayIndex {
  @scala.inline
  def apply(
    path: String,
    includeArrayIndex: String = null,
    preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path)
    if (includeArrayIndex != null) __obj.updateDynamic("includeArrayIndex")(includeArrayIndex)
    if (!js.isUndefined(preserveNullAndEmptyArrays)) __obj.updateDynamic("preserveNullAndEmptyArrays")(preserveNullAndEmptyArrays)
    __obj.asInstanceOf[Anon_IncludeArrayIndex]
  }
}

