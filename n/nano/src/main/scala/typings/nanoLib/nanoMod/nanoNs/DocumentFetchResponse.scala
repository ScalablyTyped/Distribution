package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchResponse[D] extends js.Object {
  var offset: scala.Double
  var rows: js.Array[DocumentResponseRow[D]]
  var total_rows: scala.Double
  var update_seq: js.UndefOr[scala.Double] = js.undefined
}

