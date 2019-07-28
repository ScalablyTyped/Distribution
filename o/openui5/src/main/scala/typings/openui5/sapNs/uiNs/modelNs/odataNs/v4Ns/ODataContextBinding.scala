package typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns

import typings.jquery.JQueryPromise
import typings.openui5.sapNs.uiNs.modelNs.ContextBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4.ODataContextBinding")
@js.native
class ODataContextBinding protected () extends ContextBinding {
  /**
    * DO NOT CALL this private constructor for a new <code>ODataContextBinding</code>,but rather use
    * {@link sap.ui.model.odata.v4.ODataModel#bindContext bindContext} instead!
    * @param oModel The OData V4 model
    * @param sPath The binding path in the model; must not end with a slash
    * @param oContext The context which is required as base for a relative path
    * @param mParameters Map of binding parameters which can be OData query options as specified in 
    * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
    * "$$updateGroupId".  Note: If parameters are provided for a relative binding path, the binding
    * accesses data  with its own service requests instead of using its parent binding.  The following
    * OData query options are allowed:  <ul>  <li> All "5.2 Custom Query Options" except for those with a
    * name starting with "sap-"  <li> The $expand, $filter, $orderby and $select "5.1 System Query
    * Options"; OData V4 only  allows $filter and $orderby inside resource paths that identify a
    * collection. In our case  here, this means you can only use them inside $expand.  </ul>  All other
    * query options lead to an error.  Query options specified for the binding overwrite model query
    * options.
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
    * Returns the bound context.
    * @since 1.39.0
    */
  var getBoundContext: js.Any = js.native
  /**
    * Calls the OData operation that corresponds to this operation binding.Parameters for the operation
    * must be set via {@link #setParameter} beforehand.The value of this binding is the result of the
    * operation. To access a result of primitivetype, bind a control to the path "value", for
    * example<code>&lt;Text text="{value}"/&gt;</code>. If the result has a complex or entity type, youcan
    * bind properties as usual, for example <code>&lt;Text text="{street}"/&gt;</code>.
    * @since 1.37.0
    * @param sGroupId The group ID to be used for the request; if not specified, the group ID for this
    * binding is  used, see {@link sap.ui.model.odata.v4.ODataContextBinding#constructor}.  Valid values
    * are <code>undefined</code>, <code>'$auto'</code>, <code>'$direct'</code> or  application group IDs
    * as specified in {@link sap.ui.model.odata.v4.ODataModel#submitBatch}.
    * @returns A promise that is resolved without data when the operation call succeeded, or rejected 
    * with an instance of <code>Error</code> in case of failure.
    */
  def execute(sGroupId: String): JQueryPromise[_] = js.native
  /**
    * Returns <code>true</code> if the binding has pending changes, meaning updates via two-waybinding
    * that have not yet been sent to the server.
    * @since 1.39.0
    * @returns <code>true</code> if the binding has pending changes
    */
  def hasPendingChanges(): Boolean = js.native
  /**
    * Resets all pending property changes of this binding, meaning updates via two-way binding thathave
    * not yet been sent to the server.
    * @since 1.40.1
    */
  def resetChanges(): Unit = js.native
  /**
    * Sets a parameter for an operation call.
    * @since 1.37.0
    * @param sParameterName The parameter name
    * @param vValue The parameter value
    * @returns <code>this</code> to enable method chaining
    */
  def setParameter(sParameterName: String, vValue: js.Any): typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataContextBinding = js.native
}

