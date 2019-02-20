package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.v4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4.ODataModel")
@js.native
class ODataModel protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.Model {
  /**
    * Constructor for a new ODataModel.
    * @param mParameters The parameters
    */
  def this(mParameters: js.Any) = this()
  def bindContext(sPath: java.lang.String, oContext: Context): ODataContextBinding = js.native
  def bindContext(sPath: java.lang.String, oContext: Context, mParameters: js.Any): ODataContextBinding = js.native
  def bindList(sPath: java.lang.String, oContext: Context): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter]
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter],
    vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter],
    vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter],
    mParameters: js.Any
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter],
    vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter],
    vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter,
    mParameters: js.Any
  ): ODataListBinding = js.native
  def bindList(sPath: java.lang.String, oContext: Context, vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter,
    vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter,
    vFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter],
    mParameters: js.Any
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter,
    vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter
  ): ODataListBinding = js.native
  def bindList(
    sPath: java.lang.String,
    oContext: Context,
    vSorters: openui5Lib.sapNs.uiNs.modelNs.Sorter,
    vFilters: openui5Lib.sapNs.uiNs.modelNs.Filter,
    mParameters: js.Any
  ): ODataListBinding = js.native
  def bindProperty(sPath: java.lang.String, oContext: Context): ODataPropertyBinding = js.native
  def bindProperty(sPath: java.lang.String, oContext: Context, mParameters: js.Any): ODataPropertyBinding = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def destroyBindingContext(): scala.Unit = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def getObject(): scala.Unit = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def getOriginalProperty(): scala.Unit = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def getProperty(): scala.Unit = js.native
  /**
    * Returns <code>true</code> if there are pending changes that would be reset by{@link #refresh}.
    * @since 1.39.0
    * @returns <code>true</code> if there are pending changes
    */
  def hasPendingChanges(): scala.Boolean = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def isList(): scala.Unit = js.native
  /**
    * Returns a promise for the "canonical path" of the entity for the given context.According to "4.3.1
    * Canonical URL" of the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of
    * the entity set associated with the entity followed by thekey predicate identifying the entity within
    * the collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
    * elementbinding.
    * @since 1.37.0
    * @param oEntityContext A context in this model which must point to a non-contained OData entity
    * @returns A promise which is resolved with the canonical path (e.g. "/EMPLOYEES(ID='1')") in case of 
    * success, or rejected with an instance of <code>Error</code> in case of failure, e.g. when  the given
    * context does not point to an entity
    */
  def requestCanonicalPath(oEntityContext: Context): jqueryLib.JQueryPromise[_] = js.native
  /**
    * Resets all property changes associated with the given application group ID which have notyet been
    * submitted via {@link #submitBatch}.
    * @since 1.39.0
    * @param sGroupId The application group ID, which is a non-empty string consisting of alphanumeric 
    * characters from the basic Latin alphabet, including the underscore. If it is 
    * <code>undefined</code>, the model's <code>updateGroupId</code> is used. Note that the  default
    * <code>updateGroupId</code> is "$auto", which is invalid here.
    */
  def resetChanges(sGroupId: java.lang.String): scala.Unit = js.native
  /**
    * Method not supported
    * @since 1.37.0
    */
  def setLegacySyntax(): scala.Unit = js.native
  /**
    * Submits the requests associated with the given application group ID in one batch request.
    * @since 1.37.0
    * @param sGroupId The application group ID, which is a non-empty string consisting of alphanumeric 
    * characters from the basic Latin alphabet, including the underscore.
    * @returns A promise on the outcome of the HTTP request resolving with <code>undefined</code>; it is 
    * rejected with an error if the batch request itself fails
    */
  def submitBatch(sGroupId: java.lang.String): jqueryLib.JQueryPromise[_] = js.native
}

