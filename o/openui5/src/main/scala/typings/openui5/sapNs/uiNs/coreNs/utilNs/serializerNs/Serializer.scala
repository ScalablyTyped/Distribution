package typings.openui5.sapNs.uiNs.coreNs.utilNs.serializerNs

import typings.openui5.sapNs.uiNs.baseNs.EventProvider
import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.UIArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.serializer.Serializer")
@js.native
class Serializer protected () extends EventProvider {
  /**
    * Serializer class. Iterates over all controls and call a given serializer delegate.
    * @param oRootControl the root control to serialize
    * @param serializeDelegate the serializer delegate. Has to implement start/middle/end methods.
    * @param bSkipRoot whether to skip the root node or not
    * @param fnSkipAggregations whether to skip aggregations
    * @param fnSkipElement whether to skip an element
    */
  def this(
    oRootControl: Control,
    serializeDelegate: js.Any,
    bSkipRoot: Boolean,
    fnSkipAggregations: js.Any,
    fnSkipElement: js.Any
  ) = this()
  def this(
    oRootControl: UIArea,
    serializeDelegate: js.Any,
    bSkipRoot: Boolean,
    fnSkipAggregations: js.Any,
    fnSkipElement: js.Any
  ) = this()
}

