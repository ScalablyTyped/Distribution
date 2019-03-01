package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeArrayIndex extends js.Object {
  var includeArrayIndex: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var preserveNullAndEmptyArrays: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeArrayIndex {
  @scala.inline
  def apply(
    path: java.lang.String,
    includeArrayIndex: java.lang.String = null,
    preserveNullAndEmptyArrays: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncludeArrayIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (includeArrayIndex != null) __obj.updateDynamic("includeArrayIndex")(includeArrayIndex)
    if (!js.isUndefined(preserveNullAndEmptyArrays)) __obj.updateDynamic("preserveNullAndEmptyArrays")(preserveNullAndEmptyArrays)
    __obj.asInstanceOf[Anon_IncludeArrayIndex]
  }
}

