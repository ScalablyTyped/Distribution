package typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns

import typings.openui5.sapNs.uiNs.modelNs.PropertyBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4.ODataPropertyBinding")
@js.native
class ODataPropertyBinding protected () extends PropertyBinding {
  /**
    * DO NOT CALL this private constructor for a new <code>ODataPropertyBinding</code>,but rather use
    * {@link sap.ui.model.odata.v4.ODataModel#bindProperty bindProperty} instead!
    * @param oModel The OData V4 model
    * @param sPath The binding path in the model; must not be empty or end with a slash
    * @param oContext The context which is required as base for a relative path
    * @param mParameters Map of binding parameters which can be OData query options as specified in 
    * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
    * "$$updateGroupId".  Note: Binding parameters may only be provided for absolute binding paths as only
    * those  lead to a data service request.  All "5.2 Custom Query Options" are allowed except for those
    * with a name starting with  "sap-". All other query options lead to an error.  Query options
    * specified for the binding overwrite model query options.
    */
  def this(oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel, sPath: String) = this()
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    sPath: String,
    oContext: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.Context
  ) = this()
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    sPath: String,
    oContext: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.Context,
    mParameters: js.Any
  ) = this()
  /**
    * Returns <code>true</code> if the binding has pending changes, that is updates via two-waybinding
    * that have not yet been sent to the server.
    * @since 1.39.0
    * @returns <code>true</code> if the binding has pending changes
    */
  def hasPendingChanges(): Boolean = js.native
  def setValue(vValue: js.Any, sGroupId: String): Unit = js.native
}

