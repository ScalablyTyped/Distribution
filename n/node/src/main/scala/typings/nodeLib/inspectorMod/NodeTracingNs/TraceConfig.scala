package typings
package nodeLib.inspectorMod.NodeTracingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceConfig extends js.Object {
  /**
    * Included category filters.
    */
  var includedCategories: js.Array[java.lang.String]
  /**
    * Controls how the trace buffer stores data.
    */
  var recordMode: js.UndefOr[java.lang.String] = js.undefined
}

