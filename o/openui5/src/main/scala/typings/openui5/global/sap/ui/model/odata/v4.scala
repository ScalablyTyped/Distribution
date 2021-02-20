package typings.openui5.global.sap.ui.model.odata

import typings.openui5.sap.ui.model.Sorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v4 {
  
  @JSGlobal("sap.ui.model.odata.v4.Context")
  @js.native
  class Context protected ()
    extends typings.openui5.sap.ui.model.odata.v4.Context {
    /**
      * Do <strong>NOT</strong> call this private constructor for a new <code>Context</code>. In theOData V4
      * model you cannot create contexts at will: retrieve them from a binding or a viewelement instead.
      * @param oModel The model
      * @param oBinding A binding that belongs to the model
      * @param sPath An absolute path without trailing slash
      * @param iIndex Index of item (within the collection addressed by <code>sPath</code>) represented  by
      * this context; used by list bindings, not context bindings
      */
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataContextBinding,
      sPath: String
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataListBinding,
      sPath: String
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataContextBinding,
      sPath: String,
      iIndex: Double
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataListBinding,
      sPath: String,
      iIndex: Double
    ) = this()
  }
  
  @JSGlobal("sap.ui.model.odata.v4.ODataContextBinding")
  @js.native
  class ODataContextBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v4.ODataContextBinding {
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
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      mParameters: js.Any
    ) = this()
  }
  
  @JSGlobal("sap.ui.model.odata.v4.ODataListBinding")
  @js.native
  class ODataListBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v4.ODataListBinding {
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
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter],
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter,
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.UndefOr[scala.Nothing],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter],
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter,
      vFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
  }
  
  @JSGlobal("sap.ui.model.odata.v4.ODataMetaModel")
  @js.native
  class ODataMetaModel protected ()
    extends typings.openui5.sap.ui.model.odata.v4.ODataMetaModel {
    /**
      * Do <strong>NOT</strong> call this private constructor for a new <code>ODataMetaModel</code>,but
      * rather use {@link sap.ui.model.odata.v4.ODataModel#getMetaModel getMetaModel} instead.
      * @param oRequestor The meta data requestor
      * @param sUrl The URL to the $metadata document of the service
      */
    def this(oRequestor: js.Any, sUrl: String) = this()
  }
  
  @JSGlobal("sap.ui.model.odata.v4.ODataModel")
  @js.native
  class ODataModel protected ()
    extends typings.openui5.sap.ui.model.odata.v4.ODataModel {
    /**
      * Constructor for a new ODataModel.
      * @param mParameters The parameters
      */
    def this(mParameters: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.model.odata.v4.ODataPropertyBinding")
  @js.native
  class ODataPropertyBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v4.ODataPropertyBinding {
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
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: typings.openui5.sap.ui.model.odata.v4.Context,
      mParameters: js.Any
    ) = this()
  }
}
