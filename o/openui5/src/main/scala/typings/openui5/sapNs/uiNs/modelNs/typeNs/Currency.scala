package typings.openui5.sapNs.uiNs.modelNs.typeNs

import typings.openui5.sapNs.uiNs.modelNs.CompositeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.type.Currency")
@js.native
class Currency protected () extends CompositeType {
  /**
    * Constructor for a Currency type.
    * @param oFormatOptions formatting options. Supports the same options as {@link
    * sap.ui.core.format.NumberFormat.getCurrencyInstance NumberFormat.getCurrencyInstance}
    * @param oConstraints value constraints.
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  def formatValue(vValue: java.lang.String, sInternalType: java.lang.String): js.Any = js.native
}

