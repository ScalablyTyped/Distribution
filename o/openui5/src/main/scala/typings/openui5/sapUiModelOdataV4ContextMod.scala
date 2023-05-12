package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4ContextMod {
  
  @JSImport("sap/ui/model/odata/v4/Context", JSImport.Default)
  @js.native
  open class default () extends Context
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/Context", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.Context with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Context.extend}.
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
    oClassInfo: ClassInfo[T, Context]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Context],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.Context.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Context
    extends typings.openui5.sapUiModelContextMod.default {
    
    /**
      * @SINCE 1.83.0
      *
      * Collapses the group node that this context points to.
      * See:
      * 	#expand
      * 	#isExpanded
      */
    def collapse(): Unit = js.native
    
    /**
      * @SINCE 1.43.0
      *
      * Returns a promise that is resolved without data when the entity represented by this context has been
      * created in the back end and all selected properties of this entity are available. Expanded navigation
      * properties are only available if the context's binding is refreshable. {@link sap.ui.model.odata.v4.ODataContextBinding#refresh}
      * and {@link sap.ui.model.odata.v4.ODataListBinding#refresh} describe which bindings are refreshable.
      *
      * As long as the promise is not yet resolved or rejected, the entity represented by this context is transient.
      *
      * Once the promise is resolved, {@link #getPath} returns a path including the key predicate of the new
      * entity. This requires that all key properties are available.
      *
      * @returns A promise that is resolved without data when the entity represented by this context has been
      * created in the back end. It is rejected with an `Error` instance where `oError.canceled === true` if
      * the transient entity is deleted before it is created in the back end, for example via {@link sap.ui.model.odata.v4.Context#delete},
      * {@link sap.ui.model.odata.v4.ODataListBinding#resetChanges} or {@link sap.ui.model.odata.v4.ODataModel#resetChanges}.
      * It is rejected with an `Error` instance without `oError.canceled` if loading of $metadata fails. Returns
      * `undefined` if the context has not been created using {@link sap.ui.model.odata.v4.ODataListBinding#create}.
      */
    def created(): js.UndefOr[js.Promise[Unit]] = js.native
    
    /**
      * @SINCE 1.41.0
      *
      * Deletes the OData entity this context points to. The context is removed from the binding immediately,
      * even if {@link sap.ui.model.odata.v4.SubmitMode.API} is used, and the request is only sent later when
      * {@link sap.ui.model.odata.v4.ODataModel#submitBatch} is called. As soon as the context is deleted on
      * the client, {@link #isDeleted} returns `true` and the context must not be used anymore (except for status
      * APIs like {@link #isDeleted}, {@link #isKeepAlive}, {@link #hasPendingChanges}, {@link #resetChanges}),
      * especially not as a binding context.
      *
      * Since 1.105 such a pending deletion is a pending change. It causes `hasPendingChanges` to return `true`
      * for the context, the binding containing it, and the model. The `resetChanges` method called on the context
      * (since 1.109.0), the binding, or the model cancels the deletion and restores the context.
      *
      * If the DELETE request succeeds, the context is destroyed and must not be used anymore. If it fails or
      * is canceled, the context is restored, reinserted into the list, and fully functional again.
      *
      * If the deleted context is used as binding context of a control or view, the application is advised to
      * unbind it via `{@link sap.ui.base.ManagedObject#setBindingContext setBindingContext(null)}` before calling
      * `delete`, and to possibly rebind it after reset or failure. The model itself ensures that all bindings
      * depending on this context become unresolved, but no attempt is made to restore these bindings in case
      * of reset or failure.
      * See:
      * 	#hasPendingChanges
      * 	#resetChanges
      * 	sap.ui.model.odata.v4.ODataContextBinding#hasPendingChanges
      * 	sap.ui.model.odata.v4.ODataListBinding#hasPendingChanges
      * 	sap.ui.model.odata.v4.ODataModel#hasPendingChanges
      * 	sap.ui.model.odata.v4.ODataContextBinding#resetChanges
      * 	sap.ui.model.odata.v4.ODataListBinding#resetChanges
      * 	sap.ui.model.odata.v4.ODataModel#resetChanges
      *
      * @returns A promise which is resolved without a result in case of success, or rejected with an instance
      * of `Error` in case of failure, for example if:
      * 	 the given context does not point to an entity,  the deletion on the server fails,  the deletion
      * is canceled via `resetChanges` (in this case the error instance has the property `canceled` with value
      * `true`).  The error instance has the property `isConcurrentModification` with value `true` in case
      * a concurrent modification (e.g. by another user) of the entity between loading and deletion has been
      * detected; this should be shown to the user who needs to decide whether to try deletion again. If the
      * entity does not exist, we assume it has already been deleted by someone else and report success.
      */
    def delete(): js.Promise[Any] = js.native
    def delete(
      /**
      * The group ID to be used for the DELETE request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.81, if this context is transient (see {@link
      * #isTransient}), no group ID needs to be specified. Since 1.98.0, you can use `null` to prevent the DELETE
      * request in case of a kept-alive context that is not in the collection and of which you know that it does
      * not exist on the server anymore (for example, a draft after activation). Since 1.108.0 the usage of a
      * group ID with {@link sap.ui.model.odata.v4.SubmitMode.API} is possible.
      */
    sGroupId: String
    ): js.Promise[Any] = js.native
    def delete(
      /**
      * The group ID to be used for the DELETE request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.81, if this context is transient (see {@link
      * #isTransient}), no group ID needs to be specified. Since 1.98.0, you can use `null` to prevent the DELETE
      * request in case of a kept-alive context that is not in the collection and of which you know that it does
      * not exist on the server anymore (for example, a draft after activation). Since 1.108.0 the usage of a
      * group ID with {@link sap.ui.model.odata.v4.SubmitMode.API} is possible.
      */
    sGroupId: String,
      /**
      * Whether not to request the new count from the server; useful in case of {@link #replaceWith} where it
      * is known that the count remains unchanged (since 1.97.0). Since 1.98.0, this is implied if a `null` group
      * ID is used.
      */
    bDoNotRequestCount: Boolean
    ): js.Promise[Any] = js.native
    def delete(
      /**
      * The group ID to be used for the DELETE request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.81, if this context is transient (see {@link
      * #isTransient}), no group ID needs to be specified. Since 1.98.0, you can use `null` to prevent the DELETE
      * request in case of a kept-alive context that is not in the collection and of which you know that it does
      * not exist on the server anymore (for example, a draft after activation). Since 1.108.0 the usage of a
      * group ID with {@link sap.ui.model.odata.v4.SubmitMode.API} is possible.
      */
    sGroupId: Unit,
      /**
      * Whether not to request the new count from the server; useful in case of {@link #replaceWith} where it
      * is known that the count remains unchanged (since 1.97.0). Since 1.98.0, this is implied if a `null` group
      * ID is used.
      */
    bDoNotRequestCount: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.77.0
      *
      * Expands the group node that this context points to.
      * See:
      * 	#collapse
      * 	#isExpanded
      */
    def expand(): Unit = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns the binding this context belongs to.
      *
      * @returns The context's binding
      */
    def getBinding(): typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default | typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns the "canonical path" of the entity for this context. According to "4.3.1 Canonical URL" of the specification "OData Version 4.0 Part 2: URL Conventions", this is
      * the "name of the entity set associated with the entity followed by the key predicate identifying the
      * entity within the collection". Use the canonical path in {@link sap.ui.core.Element#bindElement} to create
      * an element binding.
      *
      * Note: For a transient context (see {@link #isTransient}) a wrong path is returned unless all key properties
      * are available within the initial data.
      *
      * @returns The canonical path (e.g. "/SalesOrderList('0500000000')")
      */
    def getCanonicalPath(): String = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Returns the group ID of the context's binding that is used for read requests. See {@link sap.ui.model.odata.v4.ODataListBinding#getGroupId}
      * and {@link sap.ui.model.odata.v4.ODataContextBinding#getGroupId}.
      *
      * @returns The group ID
      */
    def getGroupId(): String = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns the context's index within the binding's collection. The return value changes when a new entity
      * is added via {@link sap.ui.model.odata.v4.ODataListBinding#create} without `bAtEnd`, and when a context
      * representing a created entity is deleted again.
      *
      * @returns The context's index within the binding's collection. It is `undefined` if
      * 	 it does not belong to a list binding,  it is {@link #isKeepAlive kept alive}, but not in the collection
      * currently.
      */
    def getIndex(): js.UndefOr[Double] = js.native
    
    def getProperty(
      /**
      * A path relative to this context
      */
    sPath: String,
      /**
      * If `true`, the value is returned in external format using a UI5 type for the given property path that
      * formats corresponding to the property's EDM type and constraints. If the type is not yet available, `undefined`
      * is returned.
      */
    bExternalFormat: Boolean
    ): Any = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Returns the group ID of the context's binding that is used for update requests. See {@link sap.ui.model.odata.v4.ODataListBinding#getUpdateGroupId}
      * and {@link sap.ui.model.odata.v4.ODataContextBinding#getUpdateGroupId}.
      *
      * @returns The update group ID
      */
    def getUpdateGroupId(): String = js.native
    
    /**
      * @SINCE 1.53.0
      *
      * Returns whether there are pending changes for bindings dependent on this context, or for unresolved bindings
      * (see {@link sap.ui.model.Binding#isResolved}) which were dependent on this context at the time the pending
      * change was created. This includes the context itself being {@link #isTransient transient} or {@link #delete
      * deleted} on the client, but not yet on the server. Since 1.98.0, {@link #isInactive inactive} contexts
      * are ignored, unless their {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate activation}
      * has been prevented and therefore {@link #isInactive} returns `1`.
      *
      * @returns Whether there are pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    
    /**
      * @SINCE 1.105.0
      *
      * Returns whether this context is deleted. It becomes `true` immediately after calling {@link #delete},
      * even while the request is waiting for {@link sap.ui.model.odata.v4.ODataModel#submitBatch submitBatch}
      * or is in process. It becomes `false` again when the DELETE request fails or is canceled. The result of
      * this function can also be accessed via the "@$ui5.context.isDeleted" instance annotation at the entity.
      * See:
      * 	#delete
      *
      * @returns `true` if this context is deleted
      */
    def isDeleted(): Boolean = js.native
    
    /**
      * @SINCE 1.77.0
      *
      * Tells whether the group node that this context points to is expanded.
      * See:
      * 	#collapse
      * 	#expand
      *
      * @returns Whether the group node that this context points to is expanded, or `undefined` if the node is
      * not expandable
      */
    def isExpanded(): js.UndefOr[Boolean] = js.native
    
    /**
      * @SINCE 1.98.0
      *
      * Returns whether this context is inactive. The result of this function can also be accessed via instance
      * annotation "@$ui5.context.isInactive" at the entity.
      *
      * Since 1.110.0, `1` is returned in case {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate
      * activation} has been prevented. Note that
      * 	 it is truthy: `!!1 === true`,  it is almost like `true`: `1 == true`,  but it can easily be
      * distinguished: `1 !== true`,  and `if (oContext.isInactive()) {...}` treats inactive contexts the
      * same, no matter whether activation has been prevented or not.
      * See:
      * 	#isTransient
      * 	sap.ui.model.odata.v4.ODataListBinding#create
      *
      * @returns `true` if this context is inactive, `false` if it was created in an inactive state and has been
      * activated, `1` in case activation has been prevented (since 1.110.0), and `undefined` otherwise.
      */
    def isInactive(): js.UndefOr[Boolean | Double] = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Returns whether this context is kept alive even when it is removed from its binding's collection, for
      * example if a filter is applied and the entity represented by this context does not match the filter criteria.
      * See:
      * 	#setKeepAlive
      *
      * @returns `true` if this context is kept alive
      */
    def isKeepAlive(): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.111.0)
      *
      * Tells whether this context is currently selected.
      * See:
      * 	#setSelected
      *
      * @returns Whether this context is currently selected
      */
    def isSelected(): Boolean = js.native
    
    /**
      * @SINCE 1.43.0
      *
      * For a context created using {@link sap.ui.model.odata.v4.ODataListBinding#create}, the method returns
      * `true` if the context is transient, meaning that the promise returned by {@link #created} is not yet
      * resolved or rejected, and returns `false` if the context is not transient. The result of this function
      * can also be accessed via instance annotation "@$ui5.context.isTransient" at the entity.
      * See:
      * 	#isInactive
      *
      * @returns Whether this context is transient if it is created using {@link sap.ui.model.odata.v4.ODataListBinding#create};
      * `undefined` if it is not created using {@link sap.ui.model.odata.v4.ODataListBinding#create}
      */
    def isTransient(): js.UndefOr[Boolean] = js.native
    
    /**
      * @SINCE 1.53.0
      *
      * Refreshes the single entity represented by this context. Use {@link #requestRefresh} if you want to wait
      * for the refresh.
      */
    def refresh(): Unit = js.native
    def refresh(
      /**
      * The group ID to be used for the refresh; if not specified, the group ID for the context's binding is
      * used, see {@link #getGroupId}.
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * The group ID to be used for the refresh; if not specified, the group ID for the context's binding is
      * used, see {@link #getGroupId}.
      */
    sGroupId: String,
      /**
      * If the context belongs to a list binding, the parameter allows the list binding to remove the context
      * from the list binding's collection because the entity does not match the binding's filter anymore, see
      * {@link sap.ui.model.odata.v4.ODataListBinding#filter}; a removed context is destroyed, see {@link #destroy}.
      * If the context belongs to a context binding, the parameter must not be used. Supported since 1.55.0
      *
      * Since 1.84.0, if this context is {@link #isKeepAlive kept alive}, it is only destroyed if the corresponding
      * entity does no longer exist in the back end. In this case, the `fnOnBeforeDestroy` callback passed with
      * {@link #setKeepAlive}) is called.
      */
    bAllowRemoval: Boolean
    ): Unit = js.native
    def refresh(
      /**
      * The group ID to be used for the refresh; if not specified, the group ID for the context's binding is
      * used, see {@link #getGroupId}.
      */
    sGroupId: Unit,
      /**
      * If the context belongs to a list binding, the parameter allows the list binding to remove the context
      * from the list binding's collection because the entity does not match the binding's filter anymore, see
      * {@link sap.ui.model.odata.v4.ODataListBinding#filter}; a removed context is destroyed, see {@link #destroy}.
      * If the context belongs to a context binding, the parameter must not be used. Supported since 1.55.0
      *
      * Since 1.84.0, if this context is {@link #isKeepAlive kept alive}, it is only destroyed if the corresponding
      * entity does no longer exist in the back end. In this case, the `fnOnBeforeDestroy` callback passed with
      * {@link #setKeepAlive}) is called.
      */
    bAllowRemoval: Boolean
    ): Unit = js.native
    
    /**
      * @SINCE 1.97.0
      *
      * Replaces this context with the given other context "in situ", that is, at the index it currently has
      * in its list binding's collection. You probably want to delete this context afterwards without requesting
      * the new count from the server, see the `bDoNotRequestCount` parameter of {@link #delete}.
      */
    def replaceWith(/**
      * The other context
      */
    oOtherContext: Context): Unit = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns a promise for the "canonical path" of the entity for this context. According to "4.3.1 Canonical URL" of the specification "OData Version 4.0 Part 2: URL Conventions", this is
      * the "name of the entity set associated with the entity followed by the key predicate identifying the
      * entity within the collection". Use the canonical path in {@link sap.ui.core.Element#bindElement} to create
      * an element binding.
      *
      * Note: For a transient context (see {@link #isTransient}) a wrong path is returned unless all key properties
      * are available within the initial data.
      *
      * @returns A promise which is resolved with the canonical path (e.g. "/SalesOrderList('0500000000')") in
      * case of success, or rejected with an instance of `Error` in case of failure, e.g. if the given context
      * does not point to an entity
      */
    def requestCanonicalPath(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns a promise on the value for the given path relative to this context. The function allows access
      * to the complete data the context points to (if `sPath` is "") or any part thereof. The data is a JSON
      * structure as described in "OData JSON Format Version 4.0". Note that the function clones the result. Modify values via {@link
      * sap.ui.model.odata.v4.Context#setProperty}.
      *
      * The header context of a list binding only delivers `$count` (wrapped in an object if `sPath` is "").
      *
      * If you want {@link #requestObject} to read fresh data, call {@link #refresh} first.
      * See:
      * 	#getBinding
      * 	sap.ui.model.odata.v4.ODataContextBinding#refresh
      * 	sap.ui.model.odata.v4.ODataListBinding#refresh
      *
      * @returns A promise on the requested value; it is rejected if the context is a header context and the
      * path is neither empty nor "$count".
      */
    def requestObject(): js.Promise[Any] = js.native
    def requestObject(/**
      * A path relative to this context
      */
    sPath: String): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns a promise on the property value for the given path relative to this context. The path is expected
      * to point to a structural property with primitive type. Since 1.81.1 it is possible to request more than
      * one property. Property values that are not cached yet are requested from the back end.
      * See:
      * 	sap.ui.model.odata.v4.ODataMetaModel#requestUI5Type
      *
      * @returns A promise on the requested value or values; it is rejected if a value is not primitive or if
      * the context is a header context and a path is not "$count"
      */
    def requestProperty(): js.Promise[Any] = js.native
    def requestProperty(/**
      * One or multiple paths relative to this context
      */
    vPath: String): js.Promise[Any] = js.native
    def requestProperty(
      /**
      * One or multiple paths relative to this context
      */
    vPath: String,
      /**
      * If `true`, the values are returned in external format using UI5 types for the given property paths that
      * format corresponding to the properties' EDM types and constraints
      */
    bExternalFormat: Boolean
    ): js.Promise[Any] = js.native
    def requestProperty(/**
      * One or multiple paths relative to this context
      */
    vPath: js.Array[String]): js.Promise[Any] = js.native
    def requestProperty(
      /**
      * One or multiple paths relative to this context
      */
    vPath: js.Array[String],
      /**
      * If `true`, the values are returned in external format using UI5 types for the given property paths that
      * format corresponding to the properties' EDM types and constraints
      */
    bExternalFormat: Boolean
    ): js.Promise[Any] = js.native
    def requestProperty(
      /**
      * One or multiple paths relative to this context
      */
    vPath: Unit,
      /**
      * If `true`, the values are returned in external format using UI5 types for the given property paths that
      * format corresponding to the properties' EDM types and constraints
      */
    bExternalFormat: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.87.0
      *
      * Refreshes the single entity represented by this context and returns a promise to wait for it. See {@link
      * #refresh} for details. Use {@link #refresh} if you do not need the promise.
      *
      * @returns A promise which resolves without a defined result when the refresh is finished and rejects with
      * an instance of `Error` if the refresh failed
      */
    def requestRefresh(): js.Promise[Any] = js.native
    def requestRefresh(/**
      * The group ID to be used
      */
    sGroupId: String): js.Promise[Any] = js.native
    def requestRefresh(
      /**
      * The group ID to be used
      */
    sGroupId: String,
      /**
      * Allows to remove the context
      */
    bAllowRemoval: Boolean
    ): js.Promise[Any] = js.native
    def requestRefresh(
      /**
      * The group ID to be used
      */
    sGroupId: Unit,
      /**
      * Allows to remove the context
      */
    bAllowRemoval: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.61.0
      *
      * Loads side effects for this context using the given "14.5.11 Expression edm:NavigationPropertyPath" or
      * "14.5.13 Expression edm:PropertyPath" objects. Use this method to explicitly load side effects in case
      * implicit loading is switched off via the binding-specific parameter `$$patchWithoutSideEffects`. The
      * method can be called on
      * 	 the bound context of a context binding,  the return value context of an operation binding,
      * a context of a list binding representing a single entity,  the header context of a list binding;
      * side effects are loaded for the whole binding in this case.  Key predicates must be available in
      * this context's path. Avoid navigation properties as part of a binding's $select system query option as
      * they may trigger pointless requests. There must be only context bindings between this context and its
      * first ancestor binding which uses own data service requests.
      *
      * If the first ancestor binding has an empty path, it is a context binding. In this case, we look for the
      * farthest ancestor binding with the following characteristics: It uses own data service requests, it can
      * be reached via a sequence of only empty paths, and it is actually being used. This way, side effects
      * are loaded also for siblings of that first ancestor binding which show the same data, but useless requests
      * are avoided.
      *
      * By default, the request uses the update group ID for this context's binding; this way, it can easily
      * be part of the same batch request as the corresponding update. **Caution:** If a dependent binding uses
      * a different update group ID, it may lose its pending changes. The same will happen if a different group
      * ID is provided, and the side effects affect properties for which there are pending changes.
      *
      * All failed updates or creates for the group ID are repeated within the same batch request. If the group
      * ID has submit mode {@link sap.ui.model.odata.v4.SubmitMode.Auto} and there are currently running updates
      * or creates this method first waits for them to be processed.
      *
      * The events 'dataRequested' and 'dataReceived' are not fired. Whatever should happen in the event handler
      * attached to...
      * 	 'dataRequested', can instead be done before calling {@link #requestSideEffects}.  'dataReceived',
      * can instead be done once the `oPromise` returned by {@link #requestSideEffects} fulfills or rejects (using
      * `oPromise.then(function () {...}, function () {...})`).
      * See:
      * 	sap.ui.model.odata.v4.ODataContextBinding#execute
      * 	sap.ui.model.odata.v4.ODataContextBinding#getBoundContext
      * 	sap.ui.model.odata.v4.ODataListBinding#getHeaderContext
      * 	sap.ui.model.odata.v4.ODataModel#bindContext
      *
      * @returns Promise resolved with `undefined`, or rejected with an error if loading of side effects fails.
      * Use it to set fields affected by side effects to read-only before {@link #requestSideEffects} and make
      * them editable again when the promise resolves; in the error handler, you can repeat the loading of side
      * effects.
      *  The promise is rejected if the call wants to refresh a whole list binding (via header context or an
      * absolute path), but the deletion of a row context (see {@link #delete}) is pending with a different group
      * ID.
      */
    def requestSideEffects(
      /**
      * The "14.5.11 Expression edm:NavigationPropertyPath" or "14.5.13 Expression edm:PropertyPath" objects
      * describing which properties need to be loaded because they may have changed due to side effects of a
      * previous update, for example `[{$PropertyPath : "TEAM_ID"}, {$NavigationPropertyPath : "EMPLOYEE_2_MANAGER"},
      * {$PropertyPath : "EMPLOYEE_2_TEAM/Team_Id"}]`. An empty navigation property path means that the whole
      * entity may have changed, including its navigation properties. Since 1.75, a property path may end with
      * a "*" segment to indicate that all structural properties may have changed, but no navigation properties
      * (unless listed explicitly), for example `[{$PropertyPath : "*"}, {$NavigationPropertyPath : "EMPLOYEE_2_MANAGER"}]`
      * or `[{$PropertyPath : "EMPLOYEE_2_MANAGER/ *"}]`.
      *
      * Since 1.82.0 absolute paths are supported. Absolute paths must start with the entity container (example
      * "/com.sap.gateway.default.iwbep.tea_busi.v0001.Container/TEAMS") of the service. All (navigation) properties
      * in the complete model matching such an absolute path are updated. Since 1.85.0, "14.4.11 Expression edm:String"
      * is accepted as well.
      *
      * Since 1.108.8, a property path matching the "com.sap.vocabularies.Common.v1.Messages" annotation of a
      * list binding's entity type is treated specially for a row context of a list binding: It is loaded even
      * if it has not yet been requested by that list binding. This way, exactly the messages for a single row
      * can be updated. Same for a "*" segment or an empty navigation property path.
      */
    aPathExpressions: js.Array[js.Object | String]
    ): js.Promise[Unit] = js.native
    def requestSideEffects(
      /**
      * The "14.5.11 Expression edm:NavigationPropertyPath" or "14.5.13 Expression edm:PropertyPath" objects
      * describing which properties need to be loaded because they may have changed due to side effects of a
      * previous update, for example `[{$PropertyPath : "TEAM_ID"}, {$NavigationPropertyPath : "EMPLOYEE_2_MANAGER"},
      * {$PropertyPath : "EMPLOYEE_2_TEAM/Team_Id"}]`. An empty navigation property path means that the whole
      * entity may have changed, including its navigation properties. Since 1.75, a property path may end with
      * a "*" segment to indicate that all structural properties may have changed, but no navigation properties
      * (unless listed explicitly), for example `[{$PropertyPath : "*"}, {$NavigationPropertyPath : "EMPLOYEE_2_MANAGER"}]`
      * or `[{$PropertyPath : "EMPLOYEE_2_MANAGER/ *"}]`.
      *
      * Since 1.82.0 absolute paths are supported. Absolute paths must start with the entity container (example
      * "/com.sap.gateway.default.iwbep.tea_busi.v0001.Container/TEAMS") of the service. All (navigation) properties
      * in the complete model matching such an absolute path are updated. Since 1.85.0, "14.4.11 Expression edm:String"
      * is accepted as well.
      *
      * Since 1.108.8, a property path matching the "com.sap.vocabularies.Common.v1.Messages" annotation of a
      * list binding's entity type is treated specially for a row context of a list binding: It is loaded even
      * if it has not yet been requested by that list binding. This way, exactly the messages for a single row
      * can be updated. Same for a "*" segment or an empty navigation property path.
      */
    aPathExpressions: js.Array[js.Object | String],
      /**
      * The group ID to be used (since 1.69.0); if not specified, the update group ID for the context's binding
      * is used, see {@link #getUpdateGroupId}. If a different group ID is specified, make sure that {@link #requestSideEffects}
      * is called after the corresponding updates have been successfully processed by the server and that there
      * are no pending changes for the affected properties.
      */
    sGroupId: String
    ): js.Promise[Unit] = js.native
    
    /**
      * @SINCE 1.113.0
      *
      * Resets all property changes, created entities, and entity deletions of this context. Resets also invalid
      * user input and inactive contexts which had their activation prevented (see {@link sap.ui.model.odata.v4.Context#isInactive}).
      * This function does not reset the execution of OData operations (see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}).
      * For a context which is currently {@link #delete deleted} on the client, but not yet on the server, this
      * method cancels the deletion and restores the context.
      * See:
      * 	#hasPendingChanges
      *
      * @returns A promise which is resolved without a defined result as soon as all changes in the context and
      * its current dependent bindings are canceled
      */
    def resetChanges(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Sets this context's `keepAlive` attribute. If `true` the context is kept alive even when it is removed
      * from its binding's collection, for example if a filter is applied and the entity represented by this
      * context does not match the filter criteria.
      *
      * Normally, a context's lifecycle is managed implicitly. It is created once it is needed and destroyed
      * if it is not needed anymore, for example, because it is no longer part of its list binding's collection.
      * It is thus unsafe to keep a reference to a context instance which is not explicitly kept alive. Once
      * a context is not kept alive anymore, the implicit lifecycle management again takes control and destroys
      * the context if it is no longer needed.
      *
      * Note: This is only supported if the model uses the `autoExpandSelect` parameter.
      * See:
      * 	#isKeepAlive
      */
    def setKeepAlive(/**
      * Whether to keep the context alive
      */
    bKeepAlive: Boolean): Unit = js.native
    def setKeepAlive(
      /**
      * Whether to keep the context alive
      */
    bKeepAlive: Boolean,
      /**
      * Callback function that is executed once for a kept-alive context just before it is destroyed, see {@link
      * #destroy}. Supported since 1.84.0
      */
    fnOnBeforeDestroy: js.Function
    ): Unit = js.native
    def setKeepAlive(
      /**
      * Whether to keep the context alive
      */
    bKeepAlive: Boolean,
      /**
      * Callback function that is executed once for a kept-alive context just before it is destroyed, see {@link
      * #destroy}. Supported since 1.84.0
      */
    fnOnBeforeDestroy: js.Function,
      /**
      * Whether to request messages for this entity. Only used if `bKeepAlive` is `true`. Determines the messages
      * property from the annotation "com.sap.vocabularies.Common.v1.Messages" at the entity type. If found,
      * the binding keeps requesting messages until it is destroyed. Otherwise an error is logged in the console
      * and no messages are requested. Supported since 1.92.0
      */
    bRequestMessages: Boolean
    ): Unit = js.native
    def setKeepAlive(
      /**
      * Whether to keep the context alive
      */
    bKeepAlive: Boolean,
      /**
      * Callback function that is executed once for a kept-alive context just before it is destroyed, see {@link
      * #destroy}. Supported since 1.84.0
      */
    fnOnBeforeDestroy: Unit,
      /**
      * Whether to request messages for this entity. Only used if `bKeepAlive` is `true`. Determines the messages
      * property from the annotation "com.sap.vocabularies.Common.v1.Messages" at the entity type. If found,
      * the binding keeps requesting messages until it is destroyed. Otherwise an error is logged in the console
      * and no messages are requested. Supported since 1.92.0
      */
    bRequestMessages: Boolean
    ): Unit = js.native
    
    /**
      * @SINCE 1.67.0
      *
      * Sets a new value for the property identified by the given path. The path is relative to this context
      * and is expected to point to a structural property with primitive type or, since 1.85.0, to an instance
      * annotation.
      * See:
      * 	#getProperty
      * 	sap.ui.model.odata.v4.ODataContextBinding#event:patchSent
      * 	sap.ui.model.odata.v4.ODataContextBinding#event:patchCompleted
      * 	sap.ui.model.odata.v4.ODataListBinding#event:patchSent
      * 	sap.ui.model.odata.v4.ODataListBinding#event:patchCompleted
      *
      * @returns A promise which is resolved without a result in case of success, or rejected with an instance
      * of `Error` in case of failure, for example if the annotation belongs to the read-only namespace "@$ui5.*".
      * With `bRetry` it is only rejected with an `Error` instance where `oError.canceled === true` when the
      * entity has been deleted while the request was pending or the property has been reset via the methods
      *
      * 	 {@link sap.ui.model.odata.v4.ODataModel#resetChanges}  {@link sap.ui.model.odata.v4.ODataContextBinding#resetChanges}
      * or  {@link sap.ui.model.odata.v4.ODataListBinding#resetChanges}.
      */
    def setProperty(
      /**
      * A path relative to this context
      */
    sPath: String,
      /**
      * The new value which must be primitive
      */
    vValue: Any
    ): js.Promise[Any] = js.native
    def setProperty(
      /**
      * A path relative to this context
      */
    sPath: String,
      /**
      * The new value which must be primitive
      */
    vValue: Any,
      /**
      * The group ID to be used for the PATCH request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.74.0, you can use `null` to prevent the PATCH
      * request.
      */
    sGroupId: String
    ): js.Promise[Any] = js.native
    def setProperty(
      /**
      * A path relative to this context
      */
    sPath: String,
      /**
      * The new value which must be primitive
      */
    vValue: Any,
      /**
      * The group ID to be used for the PATCH request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.74.0, you can use `null` to prevent the PATCH
      * request.
      */
    sGroupId: String,
      /**
      * Since 1.85.0, if `true` the property is not reset if the PATCH request failed. It contributes to the
      * pending changes instead (see {@link sap.ui.model.odata.v4.ODataModel#hasPendingChanges}, {@link sap.ui.model.odata.v4.ODataContextBinding#hasPendingChanges}
      * and {@link sap.ui.model.odata.v4.ODataListBinding#hasPendingChanges}) and can be reset via the corresponding
      * `resetChanges` methods.
      *
      * The PATCH is automatically repeated with the next call of {@link sap.ui.model.odata.v4.ODataModel#submitBatch}
      * if the group ID has {@link sap.ui.model.odata.v4.SubmitMode.API}. Otherwise it is repeated when the property
      * is modified again.
      *
      * Each time the PATCH request is sent to the server, a 'patchSent' event is fired on the binding sending
      * the request. When the response for this request is received, a 'patchCompleted' with a boolean parameter
      * 'success' is fired.
      */
    bRetry: Boolean
    ): js.Promise[Any] = js.native
    def setProperty(
      /**
      * A path relative to this context
      */
    sPath: String,
      /**
      * The new value which must be primitive
      */
    vValue: Any,
      /**
      * The group ID to be used for the PATCH request; if not specified, the update group ID for the context's
      * binding is used, see {@link #getUpdateGroupId}. Since 1.74.0, you can use `null` to prevent the PATCH
      * request.
      */
    sGroupId: Unit,
      /**
      * Since 1.85.0, if `true` the property is not reset if the PATCH request failed. It contributes to the
      * pending changes instead (see {@link sap.ui.model.odata.v4.ODataModel#hasPendingChanges}, {@link sap.ui.model.odata.v4.ODataContextBinding#hasPendingChanges}
      * and {@link sap.ui.model.odata.v4.ODataListBinding#hasPendingChanges}) and can be reset via the corresponding
      * `resetChanges` methods.
      *
      * The PATCH is automatically repeated with the next call of {@link sap.ui.model.odata.v4.ODataModel#submitBatch}
      * if the group ID has {@link sap.ui.model.odata.v4.SubmitMode.API}. Otherwise it is repeated when the property
      * is modified again.
      *
      * Each time the PATCH request is sent to the server, a 'patchSent' event is fired on the binding sending
      * the request. When the response for this request is received, a 'patchCompleted' with a boolean parameter
      * 'success' is fired.
      */
    bRetry: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.111.0)
      *
      * Determines whether this context is currently selected.
      * See:
      * 	#isSelected
      */
    def setSelected(/**
      * Whether this context is currently selected
      */
    bSelected: Boolean): Unit = js.native
  }
}
