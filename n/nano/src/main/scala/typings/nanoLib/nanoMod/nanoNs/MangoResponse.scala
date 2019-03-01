package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangoResponse[D] extends js.Object {
  // A string that enables you to specify which page of results you require. Used for paging through result sets.
  var bookmark: js.UndefOr[java.lang.String] = js.undefined
  // Array of documents matching the search. In each matching document, the fields specified in
  // the fields part of the request body are listed, along with their values.
  var docs: js.Array[D]
  // Basic execution statistics for a specific request.
  var execution_stats: js.UndefOr[MangoExecutionStats] = js.undefined
  // Execution warnings
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object MangoResponse {
  @scala.inline
  def apply[D](
    docs: js.Array[D],
    bookmark: java.lang.String = null,
    execution_stats: MangoExecutionStats = null,
    warning: java.lang.String = null
  ): MangoResponse[D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("docs")(docs)
    if (bookmark != null) __obj.updateDynamic("bookmark")(bookmark)
    if (execution_stats != null) __obj.updateDynamic("execution_stats")(execution_stats)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[MangoResponse[D]]
  }
}

