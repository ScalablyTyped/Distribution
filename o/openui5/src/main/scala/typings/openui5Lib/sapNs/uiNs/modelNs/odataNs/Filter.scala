package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.Filter")
@js.native
class Filter protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
             * Constructor for Filter
             * @param sPath the binding path for this filter
             * @param aValues Array of FilterOperators and their values:
             * @param bAND If true the values from aValues will be ANDed; otherwise ORed
            */
  def this(sPath: java.lang.String, aValues: js.Array[_]) = this()
  /**
             * Constructor for Filter
             * @param sPath the binding path for this filter
             * @param aValues Array of FilterOperators and their values:
             * @param bAND If true the values from aValues will be ANDed; otherwise ORed
            */
  def this(sPath: java.lang.String, aValues: js.Array[_], bAND: scala.Boolean) = this()
  /**
             * Converts the <code>sap.ui.model.odata.Filter</code> into a<code>sap.ui.model.Filter</code>.
             * @returns a <code>sap.ui.model.Filter</code> object
            */
  def convert(): openui5Lib.sapNs.uiNs.modelNs.Filter = js.native
}

