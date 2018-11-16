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

