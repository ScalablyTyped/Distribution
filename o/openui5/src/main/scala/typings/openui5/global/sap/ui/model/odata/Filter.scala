package typings.openui5.global.sap.ui.model.odata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.Filter")
@js.native
class Filter protected ()
  extends typings.openui5.sap.ui.model.odata.Filter {
  /**
    * Constructor for Filter
    * @param sPath the binding path for this filter
    * @param aValues Array of FilterOperators and their values:
    * @param bAND If true the values from aValues will be ANDed; otherwise ORed
    */
  def this(sPath: String, aValues: js.Array[_]) = this()
  def this(sPath: String, aValues: js.Array[_], bAND: Boolean) = this()
}

