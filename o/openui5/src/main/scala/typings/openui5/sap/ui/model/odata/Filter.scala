package typings.openui5.sap.ui.model.odata

import typings.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.Filter")
@js.native
class Filter protected () extends Object {
  /**
    * Constructor for Filter
    * @param sPath the binding path for this filter
    * @param aValues Array of FilterOperators and their values:
    * @param bAND If true the values from aValues will be ANDed; otherwise ORed
    */
  def this(sPath: String, aValues: js.Array[_]) = this()
  def this(sPath: String, aValues: js.Array[_], bAND: Boolean) = this()
  /**
    * Converts the <code>sap.ui.model.odata.Filter</code> into a<code>sap.ui.model.Filter</code>.
    * @returns a <code>sap.ui.model.Filter</code> object
    */
  def convert(): typings.openui5.sap.ui.model.Filter = js.native
}

