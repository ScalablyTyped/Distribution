package typings.openui5

import typings.openui5.anon.Aggregation
import typings.openui5.anon.Apply
import typings.openui5.anon.AutoExpandSelect
import typings.openui5.anon.CanonicalPath
import typings.openui5.anon.PatchWithoutSideEffects
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatamodelMod {
  
  @JSImport("sap/ui/model/odata/v4/ODataModel", JSImport.Default)
  @js.native
  open class default protected () extends ODataModel {
    /**
      * Constructor for a new ODataModel.
      */
    def this(/**
      * The parameters
      */
    mParameters: AutoExpandSelect) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/ODataModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.ODataModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Model.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.ODataModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataModel
    extends typings.openui5.sapUiModelModelMod.default {
    
    /**
      * @SINCE 1.106.0
      *
      * Attach event handler `fnFunction` to the 'dataReceived' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachDataReceived(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachDataReceived(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Attach event handler `fnFunction` to the 'dataRequested' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachDataRequested(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachDataRequested(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * See {@link sap.ui.base.EventProvider#attachEvent}
      * See:
      * 	sap.ui.base.EventProvider#attachEvent
      *
      * @returns `this` to allow method chaining
      */
    def attachEvent(/**
      * The identifier of the event to listen for
      */
    sEventId: String): this.type = js.native
    def attachEvent(/**
      * The identifier of the event to listen for
      */
    sEventId: String, _oData: js.Object): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: js.Object,
      _fnFunction: Unit,
      _oListener: js.Object
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: js.Function
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: js.Function,
      _oListener: js.Object
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: Unit,
      _oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.66.0
      *
      * Attach event handler `fnFunction` to the 'sessionTimeout' event of this model.
      *
      * @returns `this` to allow method chaining
      */
    def attachSessionTimeout(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachSessionTimeout(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    def bindContext(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters as specified below.
      * Note: The binding creates its own data service request if it is absolute or if it has any parameters
      * or if it is relative and has a context created via {@link #createBindingContext}. The following OData
      * query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $count, $expand, $filter, $levels, $orderby, $search and $select "5.1 System Query
      * Options"; OData V4 only allows $count, $filter, $levels, $orderby and $search inside resource paths that
      * identify a collection. In our case here, this means you can only use them inside $expand.  All other
      * query options lead to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: CanonicalPath
    ): typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default = js.native
    def bindContext(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelOdataV4ContextMod.default
    ): typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default = js.native
    def bindContext(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelOdataV4ContextMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters as specified below.
      * Note: The binding creates its own data service request if it is absolute or if it has any parameters
      * or if it is relative and has a context created via {@link #createBindingContext}. The following OData
      * query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $count, $expand, $filter, $levels, $orderby, $search and $select "5.1 System Query
      * Options"; OData V4 only allows $count, $filter, $levels, $orderby and $search inside resource paths that
      * identify a collection. In our case here, this means you can only use them inside $expand.  All other
      * query options lead to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: CanonicalPath
    ): typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default = js.native
    
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: Unit,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The dynamic sorters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#sort} to
      * replace them. Static sorters, as defined in the '$orderby' binding parameter, are always executed after
      * the dynamic sorters. Supported since 1.39.0.
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * The dynamic application filters to be used initially. Call {@link sap.ui.model.odata.v4.ODataListBinding#filter}
      * to replace them. Static filters, as defined in the '$filter' binding parameter, are always combined with
      * the dynamic filters using a logical `AND`. Supported since 1.39.0.
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or binding-specific parameters as specified below. Note:
      * The binding creates its own data service request if it is absolute or if it has any parameters or if
      * it is relative and has a context created via {@link #createBindingContext} or if it has sorters or filters.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $count, $expand, $filter, $levels, $orderby, $search, and $select "5.1
      * System Query Options"; OData V4 only allows $levels inside $expand.  All other query options lead
      * to an error. Query options specified for the binding overwrite model query options.
      */
    mParameters: Aggregation
    ): typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    
    def bindProperty(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters as specified below.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $filter, and $search "5.1 System Query Options" if the path ends with
      * a "$count" segment.  All other query options lead to an error. Query options specified for the binding
      * overwrite model query options. Note: The binding only creates its own data service request if it is absolute
      * or if it is relative to a context created via {@link #createBindingContext}. The binding parameters are
      * ignored in case the binding creates no own data service request or in case the binding points to metadata.
      */
    mParameters: Apply
    ): typings.openui5.sapUiModelOdataV4OdatapropertybindingMod.default = js.native
    def bindProperty(
      /**
      * The binding path in the model; must not end with a slash
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Map of binding parameters which can be OData query options as specified in "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters as specified below.
      * The following OData query options are allowed:
      * 	 All "5.2 Custom Query Options" except for those with a name starting with "sap-" (unless starting with
      * "sap-valid-")  The $apply, $filter, and $search "5.1 System Query Options" if the path ends with
      * a "$count" segment.  All other query options lead to an error. Query options specified for the binding
      * overwrite model query options. Note: The binding only creates its own data service request if it is absolute
      * or if it is relative to a context created via {@link #createBindingContext}. The binding parameters are
      * ignored in case the binding creates no own data service request or in case the binding points to metadata.
      */
    mParameters: Apply
    ): typings.openui5.sapUiModelOdataV4OdatapropertybindingMod.default = js.native
    
    /**
      * @SINCE 1.71.0
      *
      * Changes the HTTP headers used for data and metadata requests sent by this model.
      *
      * If batch requests are used, the headers will be set for the batch itself, as well as for the individual
      * requests within the batch. The headers are changed according to the given map of headers: Headers with
      * an `undefined` value are removed, the other headers are set, and missing headers remain unchanged. The
      * following headers must not be used:
      * 	 OData V4 requests headers as specified in "8.1 Common Headers" and "8.2 Request Headers" of the specification "OData Version 4.0 Part 1: Protocol"
      *  OData V2 request headers as specified in "2.2.5 HTTP Header Fields" of the specification "OData
      * Version 2 v10.1"  The headers "Content-Id" and "Content-Transfer-Encoding"  The header "SAP-ContextId"
      *  Note: The "X-CSRF-Token" header will not be used for metadata requests.
      *
      * If not `undefined`, a header value must conform to the following rules:
      * 	 It must be a non-empty string.  It must be completely in the US-ASCII character set.  It must
      * not contain control characters.
      * See:
      * 	#getHttpHeaders
      */
    def changeHttpHeaders(): Unit = js.native
    def changeHttpHeaders(/**
      * Map of HTTP header names to their values
      */
    mHeaders: js.Object): Unit = js.native
    
    /**
      * @SINCE 1.103.0
      *
      * Deletes the entity with the given canonical path on the server and in all bindings. Pending changes in
      * contexts for this entity or in dependents thereof are canceled.
      *
      * Deleting in the bindings is only possible if the given path is a canonical path, and all paths follow
      * these rules in addition to the OData 4.0 specification:
      * 	 Key properties are ordered just as in the metadata,  for single key properties, the name of the
      * key is omitted,  for collection-valued navigation properties, all keys are present,  the key-value
      * pairs are encoded via encodeURIComponent.
      *
      * @returns A promise resolving when the delete succeeded, and rejecting with an instance of Error otherwise.
      * In the latter case the HTTP status code of the response is given in the error's property `status`.
      */
    def delete(
      /**
      * The canonical path of the entity to delete, starting with a '/'
      */
    sCanonicalPath: String
    ): js.Promise[Any] = js.native
    def delete(
      /**
      * The canonical path of the entity to delete, starting with a '/'
      */
    sCanonicalPath: String,
      /**
      * The group ID that is used for the DELETE request; if not specified, the model's {@link #getUpdateGroupId
      * update group ID} is used; the resulting group ID must not have {@link sap.ui.model.odata.v4.SubmitMode.API}
      */
    sGroupId: String
    ): js.Promise[Any] = js.native
    def delete(
      /**
      * The canonical path of the entity to delete, starting with a '/'
      */
    sCanonicalPath: String,
      /**
      * The group ID that is used for the DELETE request; if not specified, the model's {@link #getUpdateGroupId
      * update group ID} is used; the resulting group ID must not have {@link sap.ui.model.odata.v4.SubmitMode.API}
      */
    sGroupId: String,
      /**
      * If `true`, deletion fails if the entity does not exist (HTTP status code 404 or 412 due to the `If-Match:
      * *` header); otherwise we assume that it has already been deleted by someone else and report success
      */
    bRejectIfNotFound: Boolean
    ): js.Promise[Any] = js.native
    def delete(
      /**
      * The canonical path of the entity to delete, starting with a '/'
      */
    sCanonicalPath: String,
      /**
      * The group ID that is used for the DELETE request; if not specified, the model's {@link #getUpdateGroupId
      * update group ID} is used; the resulting group ID must not have {@link sap.ui.model.odata.v4.SubmitMode.API}
      */
    sGroupId: Unit,
      /**
      * If `true`, deletion fails if the entity does not exist (HTTP status code 404 or 412 due to the `If-Match:
      * *` header); otherwise we assume that it has already been deleted by someone else and report success
      */
    bRejectIfNotFound: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def destroyBindingContext(): Unit = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Detach event handler `fnFunction` from the 'dataReceived' event of this model.
      *
      * @returns `this` to allow method chaining
      */
    def detachDataReceived(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachDataReceived(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.106.0
      *
      * Detach event handler `fnFunction` from the 'dataRequested' event of this model.
      *
      * @returns `this` to allow method chaining
      */
    def detachDataRequested(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachDataRequested(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.66.0
      *
      * Detach event handler `fnFunction` from the 'sessionTimeout' event of this model.
      *
      * @returns `this` to allow method chaining
      */
    def detachSessionTimeout(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachSessionTimeout(
      /**
      * The function to call when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.73.0
      *
      * Returns the model's bindings.
      *
      * @returns A copy of an array with all bindings, or an empty array if there are no bindings
      */
    def getAllBindings(): js.Array[typings.openui5.sapUiModelBindingMod.default] = js.native
    
    /**
      * @SINCE 1.41.0
      *
      * Returns the model's group ID.
      * See:
      * 	sap.ui.model.odata.v4.ODataModel#constructor
      *
      * @returns The group ID
      */
    def getGroupId(): String = js.native
    
    /**
      * @SINCE 1.71
      *
      * Returns a map of HTTP headers used for data and metadata requests. While the "X-CSRF-Token" header is
      * not used for metadata requests, it is still included here if available. The "SAP-ContextId" header is
      * only included if requested explicitly (@since 1.86.0).
      * See:
      * 	#changeHttpHeaders
      *
      * @returns The map of HTTP headers
      */
    def getHttpHeaders(): js.Object = js.native
    def getHttpHeaders(
      /**
      * Whether to include the "SAP-ContextId" header (@since 1.86.0)
      */
    bIncludeContextId: Boolean
    ): js.Object = js.native
    
    /**
      * @SINCE 1.99.0
      *
      * Returns a context with the given path belonging to a matching list binding that has been marked with
      * `$$getKeepAliveContext` (see {@link #bindList}). If such a matching binding can be found, a context is
      * returned and kept alive (see {@link sap.ui.model.odata.v4.ODataListBinding#getKeepAliveContext}). Since
      * 1.100.0 a temporary binding is used if no such binding could be found. If such a binding is created or
      * resolved later, the context and its data are transferred to it, and the temporary binding is destroyed
      * again.
      *
      * A `$$getKeepAliveContext` binding matches if its resolved binding path is the collection path of the
      * context. If the context is created using a temporary binding and the parameters of the `$$getKeepAliveContext`
      * binding differ from the given `mParameters` (except `$$groupId` which is especially used for the context),
      * that binding later runs into an error when trying to read data.
      *
      * **Note**: The context received by this function may change its {@link sap.ui.model.odata.v4.Context#getBinding
      * binding} during its lifetime.
      *
      * @returns The kept-alive context
      */
    def getKeepAliveContext(/**
      * A list context path to an entity, see also {@link #requestKeyPredicate}
      */
    sPath: String): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * A list context path to an entity, see also {@link #requestKeyPredicate}
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * A list context path to an entity, see also {@link #requestKeyPredicate}
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Boolean,
      /**
      * Parameters for the context or the temporary binding; supported since 1.100.0. All custom query options
      * and the following binding-specific parameters for a list binding may be given (see {@link #bindList}
      * for details).
      */
    mParameters: PatchWithoutSideEffects
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * A list context path to an entity, see also {@link #requestKeyPredicate}
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Unit,
      /**
      * Parameters for the context or the temporary binding; supported since 1.100.0. All custom query options
      * and the following binding-specific parameters for a list binding may be given (see {@link #bindList}
      * for details).
      */
    mParameters: PatchWithoutSideEffects
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    
    /**
      * @SINCE 1.107.0
      *
      * Takes the metadata for the given meta path and calculates the key predicate by taking the key properties
      * from the given entity instance.
      * See:
      * 	#requestKeyPredicate
      *
      * @returns The proper URI-encoded key predicate, for example "(Sector='A%2FB%26C',ID='42')" or "('42')",
      * or `undefined` if at least one key property is undefined.
      */
    def getKeyPredicate(
      /**
      * An absolute metadata path to an entity set
      */
    sMetaPath: String,
      /**
      * The entity instance with the key property values
      */
    oEntity: js.Object
    ): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.49.0
      *
      * Returns the version of the OData service.
      *
      * @returns The version of the OData service
      */
    def getODataVersion(): String = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def getObject(): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def getOriginalProperty(): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      * See:
      * 	sap.ui.model.Model#getProperty
      */
    def getProperty(): Unit = js.native
    
    /**
      * @SINCE 1.107.0
      *
      * Returns this model's root URL of the service to request data from (as defined by the "serviceUrl" model
      * parameter, see {@link sap.ui.model.odata.v4.ODataModel#constructor}), without query options.
      *
      * @returns The service URL
      */
    def getServiceUrl(): String = js.native
    
    /**
      * @SINCE 1.41.0
      *
      * Returns the model's update group ID.
      * See:
      * 	sap.ui.model.odata.v4.ODataModel#constructor
      *
      * @returns The update group ID
      */
    def getUpdateGroupId(): String = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns `true` if there are pending changes, which can be updates, created entities (see {@link sap.ui.model.odata.v4.ODataListBinding#create})
      * or entity deletions (see {@link sap.ui.model.odata.v4.Context#delete}) that have not yet been successfully
      * sent to the server. Since 1.98.0, {@link sap.ui.model.odata.v4.Context#isInactive inactive} contexts
      * are ignored.
      *
      * @returns `true` if there are pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    def hasPendingChanges(
      /**
      * A group ID as specified in {@link sap.ui.model.odata.v4.ODataModel}, except group IDs having {@link sap.ui.model.odata.v4.SubmitMode.Direct};
      * if specified, only pending changes related to that group ID are considered (since 1.70.0)
      */
    sGroupId: String
    ): Boolean = js.native
    
    def refresh(
      /**
      * The group ID to be used for refresh; valid values are `undefined`, '$auto', '$auto.*', '$direct' or application
      * group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}. It is ignored for suspended bindings,
      * because resume uses the binding's group ID. A value of type boolean is not accepted and an error will
      * be thrown (a forced refresh is not supported).
      */
    sGroupId: String
    ): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      * @deprecated (since 1.39.0) - Use {@link sap.ui.model.odata.v4.Context#requestCanonicalPath} instead.
      *
      * Returns a promise for the "canonical path" of the entity for the given context. According to "4.3.1 Canonical URL" of the specification "OData Version 4.0 Part 2: URL Conventions", this is
      * the "name of the entity set associated with the entity followed by the key predicate identifying the
      * entity within the collection". Use the canonical path in {@link sap.ui.core.Element#bindElement} to create
      * an element binding.
      *
      * @returns A promise which is resolved with the canonical path (e.g. "/SalesOrderList('0500000000')") in
      * case of success, or rejected with an instance of `Error` in case of failure, e.g. when the given context
      * does not point to an entity
      */
    def requestCanonicalPath(
      /**
      * A context in this model which must point to a non-contained OData entity
      */
    oEntityContext: typings.openui5.sapUiModelOdataV4ContextMod.default
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.107.0
      *
      * Requests the metadata for the given meta path and calculates the key predicate by taking the key properties
      * from the given entity instance.
      * See:
      * 	#getKeyPredicate
      *
      * @returns A promise that gets resolved with the proper URI-encoded key predicate, for example "(Sector='A%2FB%26C',ID='42')"
      * or "('42')", or `undefined` if at least one key property is undefined. It gets rejected if the metadata
      * cannot be fetched, or in case the entity has no key properties according to the metadata.
      */
    def requestKeyPredicate(
      /**
      * An absolute metadata path to the entity set
      */
    sMetaPath: String,
      /**
      * The entity instance with the key property values
      */
    oEntity: js.Object
    ): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Resets all property changes, created entities, and entity deletions associated with the given group ID
      * which have not been successfully submitted via {@link #submitBatch}. Resets also invalid user input for
      * the same group ID. This function does not reset the execution of OData operations (see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}).
      * See:
      * 	sap.ui.model.odata.v4.ODataModel#constructor.
      */
    def resetChanges(): Unit = js.native
    def resetChanges(
      /**
      * A valid group ID as specified in {@link sap.ui.model.odata.v4.ODataModel}. If it is `undefined`, the
      * model's `updateGroupId` is used. Note that the default `updateGroupId` is '$auto', which is valid here
      * since 1.67.0.
      */
    sGroupId: String
    ): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def setLegacySyntax(): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Submits the requests associated with the given group ID in one batch request. Requests from subsequent
      * calls to this method for the same group ID may be combined in one batch request using separate change
      * sets. For group IDs with {@link sap.ui.model.odata.v4.SubmitMode.Auto}, only a single change set is used;
      * this method is useful to repeat failed updates or creates (see {@link sap.ui.model.odata.v4.ODataListBinding#create})
      * together with all other requests for the given group ID in one batch request.
      *
      * @returns A promise on the outcome of the HTTP request resolving with `undefined`; it is rejected with
      * an error if the batch request itself fails
      */
    def submitBatch(
      /**
      * A valid group ID as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[Unit] = js.native
  }
}
