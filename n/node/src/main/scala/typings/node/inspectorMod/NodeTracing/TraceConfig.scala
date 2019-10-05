package typings.node.inspectorMod.NodeTracing

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

object TraceConfig {
  @scala.inline
  def apply(includedCategories: js.Array[java.lang.String], recordMode: java.lang.String = null): TraceConfig = {
    val __obj = js.Dynamic.literal(includedCategories = includedCategories)
    if (recordMode != null) __obj.updateDynamic("recordMode")(recordMode)
    __obj.asInstanceOf[TraceConfig]
  }
}

