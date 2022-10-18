package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatapropertybindingMod {
  
  @JSImport("sap/ui/model/odata/v4/ODataPropertyBinding", JSImport.Default)
  @js.native
  open class default () extends ODataPropertyBinding
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/ODataPropertyBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.ODataPropertyBinding with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.PropertyBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataPropertyBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataPropertyBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.ODataPropertyBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataPropertyBinding
    extends typings.openui5.sapUiModelPropertyBindingMod.default {
    
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
      * @SINCE 1.81.0
      *
      * Returns the group ID of the binding that is used for read requests. The group ID of the binding is alternatively
      * defined by
      * 	 the `groupId` parameter of the OData model; see {@link sap.ui.model.odata.v4.ODataModel#constructor},
      *  the `$$groupId` binding parameter; see {@link sap.ui.model.odata.v4.ODataModel#bindList} and {@link
      * sap.ui.model.odata.v4.ODataModel#bindContext}.
      *
      * @returns The group ID
      */
    def getGroupId(): String = js.native
    
    /**
      * @SINCE 1.53.0
      *
      * Returns the root binding of this binding's hierarchy, see {@link topic:fccfb2eb41414f0792c165e69a878717
      * Initialization and Read Requests}.
      *
      * @returns The root binding or `undefined` if this binding is unresolved (see {@link sap.ui.model.Binding#isResolved}).
      */
    def getRootBinding(): js.UndefOr[
        typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default | typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default | ODataPropertyBinding
      ] = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Returns the group ID of the binding that is used for update requests. The update group ID of the binding
      * is alternatively defined by
      * 	 the `updateGroupId` parameter of the OData model; see {@link sap.ui.model.odata.v4.ODataModel#constructor},
      *  the `$$updateGroupId` binding parameter; see {@link sap.ui.model.odata.v4.ODataModel#bindList} and
      * {@link sap.ui.model.odata.v4.ODataModel#bindContext}.
      *
      * @returns The update group ID
      */
    def getUpdateGroupId(): String = js.native
    
    /**
      * @SINCE 1.45.0
      *
      * Determines which type of value list exists for this property.
      *
      * @returns The value list type
      */
    def getValueListType(): ValueListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueListType * / any */ String) = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns `true` if this binding or its dependent bindings have pending property changes or created entities
      * which have not been sent successfully to the server. This function does not take into account the deletion
      * of entities (see {@link sap.ui.model.odata.v4.Context#delete}) and the execution of OData operations
      * (see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}). Since 1.98.0, {@link sap.ui.model.odata.v4.Context#isInactive
      * inactive} contexts are ignored.
      *
      * Note: If this binding is relative, its data is cached separately for each parent context path. This method
      * returns `true` if there are pending changes for the current parent context path of this binding. If this
      * binding is unresolved (see {@link sap.ui.model.Binding#isResolved}), it returns `false`.
      *
      * @returns `true` if the binding is resolved and has pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    def hasPendingChanges(
      /**
      * Whether to ignore changes which will not be lost by APIs like {@link sap.ui.model.odata.v4.ODataListBinding#changeParameters
      * changeParameters}, {@link sap.ui.model.odata.v4.ODataListBinding#filter filter}, {@link sap.ui.model.odata.v4.ODataListBinding#refresh
      * refresh} (since 1.100.0), {@link sap.ui.model.odata.v4.ODataListBinding#sort sort}, or {@link sap.ui.model.odata.v4.ODataListBinding#suspend
      * suspend} because they relate to a {@link sap.ui.model.odata.v4.Context#isKeepAlive kept-alive} context
      * of this binding (since 1.97.0). Since 1.98.0, {@link sap.ui.model.odata.v4.Context#isTransient transient}
      * contexts of a {@link #getRootBinding root binding} are treated as kept-alive by this flag. Since 1.99.0,
      * the same happens for bindings using the `$$ownRequest` parameter (see {@link sap.ui.model.odata.v4.ODataModel#bindList}).
      */
    bIgnoreKeptAlive: Boolean
    ): Boolean = js.native
    
    def refresh(
      /**
      * The group ID to be used for refresh; if not specified, the binding's group ID is used, see {@link #getGroupId}.
      * For suspended bindings, only the binding's group ID is supported because {@link #resume} uses the binding's
      * group ID. A value of type boolean is not accepted and an error will be thrown (a forced refresh is not
      * supported).
      *
      * Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group IDs as specified in
      * {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): Unit = js.native
    
    /**
      * @SINCE 1.87.0
      *
      * Refreshes the binding and returns a promise to wait for it. See {@link #refresh} for details. Use {@link
      * #refresh} if you do not need the promise.
      *
      * @returns A promise which resolves without a defined result when the refresh is finished and rejects with
      * an instance of `Error` if the refresh failed
      */
    def requestRefresh(): js.Promise[Any] = js.native
    def requestRefresh(/**
      * The group ID to be used
      */
    sGroupId: String): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.69
      *
      * Requests the value of the property binding.
      *
      * @returns A promise resolving with the resulting value or `undefined` if it could not be determined, or
      * rejecting in case of an error
      */
    def requestValue(): js.Promise[js.UndefOr[Any]] = js.native
    
    /**
      * @SINCE 1.45.0
      *
      * Requests information to retrieve a value list for this property.
      *
      * @returns See {@link sap.ui.model.odata.v4.ODataMetaModel#requestValueListInfo}
      */
    def requestValueListInfo(): js.Promise[Any] = js.native
    def requestValueListInfo(
      /**
      * The value of the parameter `autoExpandSelect` for value list models created by this method. If the value
      * list model is this binding's model, this flag has no effect. Supported since 1.68.0
      */
    bAutoExpandSelect: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.47.0
      *
      * Determines which type of value list exists for this property.
      *
      * @returns A promise that is resolved with the type of the value list. It is rejected if the property cannot
      * be found in the metadata.
      */
    def requestValueListType(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.40.1
      *
      * Resets all pending changes of this binding, see {@link #hasPendingChanges}. Resets also invalid user
      * input.
      *
      * @returns A promise which is resolved without a defined result as soon as all changes in the binding itself
      * and all dependent bindings are canceled (since 1.72.0)
      */
    def resetChanges(): js.Promise[Any] = js.native
    
    def setValue(
      /**
      * The new value which must be primitive
      */
    vValue: Any,
      /**
      * The group ID to be used for this update call; if not specified, the update group ID for this binding
      * (or its relevant parent binding) is used, see {@link #getUpdateGroupId}. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): Unit = js.native
  }
}
