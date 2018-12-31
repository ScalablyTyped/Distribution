package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.v4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4.ODataListBinding")
@js.native
class ODataListBinding protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ListBinding {
  /**
    * DO NOT CALL this private constructor for a new <code>ODataListBinding</code>,but rather use {@link
    * sap.ui.model.odata.v4.ODataModel#bindList bindList} instead!
    * @param oModel The OData V4 model
    * @param sPath The binding path in the model; must not be empty or end with a slash
    * @param oContext The parent context which is required as base for a relative path
    * @param vSorters The dynamic sorters to be used initially. Call {@link #sort} to replace them. Static
    *  sorters, as defined in the '$orderby' binding parameter, are always executed after the  dynamic
    * sorters.  Supported since 1.39.0.
    * @param vFilters The dynamic application filters to be used initially. Call {@link #filter} to
    * replace them.  Static filters, as defined in the '$filter' binding parameter, are always combined
    * with the  dynamic filters using a logical <code>AND</code>.  Supported since 1.39.0.
    * @param mParameters Map of binding parameters which can be OData query options as specified in 
    * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
    * "$$updateGroupId".  Note: If parameters are provided for a relative binding path, the binding
    * accesses data  with its own service requests instead of using its parent binding.  The following
    * OData query options are allowed:  <ul>  <li> All "5.2 Custom Query Options" except for those with a
    * name starting with "sap-"  <li> The $expand, $filter, $orderby and $select "5.1 System Query
    * Options"  </ul>  All other query options lead to an error.  Query options specified for the binding
    * overwrite model query options.
    */
  def this(oModel: ODataModel, sPath: java.lang.String) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter]) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter], vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter], vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter, vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter, vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter], vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter], mParameters: js.Any) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter], vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter, mParameters: js.Any) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter, vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter], mParameters: js.Any) = this()
  def this(oModel: ODataModel, sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter, vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter, mParameters: js.Any) = this()
  def filter(vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]): ODataListBinding = js.native
  /**
    * Filters the list with the given filters.If there are pending changes an error is thrown. Use {@link
    * #hasPendingChanges} to check ifthere are pending changes. If there are changes, call{@link
    * sap.ui.model.odata.v4.ODataModel#submitBatch} to submit the changes or{@link
    * sap.ui.model.odata.v4.ODataModel#resetChanges} to reset the changes before calling'filter'.
    * @since 1.39.0
    * @param vFilters The dynamic filters to be used; replaces the dynamic filters given in  {@link
    * sap.ui.model.odata.v4.ODataModel#bindList}.  The filter executed on the list is created from the
    * following parts, which are combined  with a logical 'and':  <ul>  <li> dynamic filters of type
    * sap.ui.model.FilterType.Application  <li> dynamic filters of type sap.ui.model.FilterType.Control 
    * <li> the static filters, as defined in the '$filter' binding parameter  </ul>
    * @param sFilterType The filter type to use
    * @returns <code>this</code> to facilitate method chaining
    */
  def filter(vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter): ODataListBinding = js.native
  def filter(vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter, sFilterType: openui5Lib.Anon_Control): ODataListBinding = js.native
  def getContexts(iStart: scala.Double, iLength: scala.Double, iMaximumPrefetchSize: scala.Double): js.Array[Context] = js.native
  /**
    * Returns <code>true</code> if the binding has pending changes, meaning updates via two-waybinding
    * that have not yet been sent to the server.
    * @since 1.39.0
    * @returns <code>true</code> if the binding has pending changes
    */
  def hasPendingChanges(): scala.Boolean = js.native
  /**
    * Resets all pending property changes of this binding, meaning updates via two-way binding thathave
    * not yet been sent to the server.
    * @since 1.40.1
    */
  def resetChanges(): scala.Unit = js.native
}

