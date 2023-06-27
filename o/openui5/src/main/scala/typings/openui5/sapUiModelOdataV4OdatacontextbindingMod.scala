package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelBindingMod.Binding$ChangeEventParameters
import typings.openui5.sapUiModelBindingMod.Binding$DataReceivedEventParameters
import typings.openui5.sapUiModelBindingMod.Binding$DataRequestedEventParameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatacontextbindingMod {
  
  @JSImport("sap/ui/model/odata/v4/ODataContextBinding", JSImport.Default)
  @js.native
  open class default () extends ODataContextBinding
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/ODataContextBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.ODataContextBinding with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ContextBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataContextBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataContextBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.ODataContextBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataContextBinding
    extends typings.openui5.sapUiModelContextBindingMod.default {
    
    /**
      * @since 1.37.0
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
      * @since 1.59.0
      *
      * Attach event handler `fnFunction` to the 'patchCompleted' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachPatchCompleted(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachPatchCompleted(
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
      * @since 1.59.0
      *
      * Attach event handler `fnFunction` to the 'patchSent' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachPatchSent(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachPatchSent(
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
      * @since 1.45.0
      *
      * Changes this binding's parameters and refreshes the binding. Since 1.111.0, a list binding's header context
      * is deselected.
      *
      * If there are pending changes that cannot be ignored, an error is thrown. Use {@link #hasPendingChanges }
      * to check if there are such pending changes. If there are, call {@link sap.ui.model.odata.v4.ODataModel#submitBatch }
      * to submit the changes or {@link sap.ui.model.odata.v4.ODataModel#resetChanges} to reset the changes before
      * calling {@link #changeParameters}.
      *
      * The parameters are changed according to the given map of parameters: Parameters with an `undefined` value
      * are removed, the other parameters are set, and missing parameters remain unchanged.
      */
    def changeParameters(
      /**
      * Map of binding parameters, see {@link sap.ui.model.odata.v4.ODataModel#bindList} and {@link sap.ui.model.odata.v4.ODataModel#bindContext}
      */
    mParameters: js.Object
    ): Unit = js.native
    
    /**
      * @since 1.59.0
      *
      * Detach event handler `fnFunction` from the 'patchCompleted' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def detachPatchCompleted(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachPatchCompleted(
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
      * @since 1.59.0
      *
      * Detach event handler `fnFunction` from the 'patchSent' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def detachPatchSent(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachPatchSent(
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
      * @since 1.37.0
      *
      * Calls the OData operation that corresponds to this operation binding.
      *
      * Parameters for the operation must be set via {@link #setParameter} beforehand.
      *
      * The value of this binding is the result of the operation. To access a result of primitive type, bind
      * a control to the path "value", for example `<Text text="{value}"/>`. If the result has a complex or
      * entity type, you can bind properties as usual, for example `<Text text="{street}"/>`.
      *
      * Since 1.98.0, a single-valued navigation property can be treated like a function if
      * 	 it has the same type as the operation binding's parent context,  that parent context is in a list
      * binding for a top-level entity set,  there is a navigation property binding which points to that
      * same entity set,  no operation parameters have been set,  the `bReplaceWithRVC` parameter is
      * used.
      *
      * @returns A promise that is resolved without data or with a return value context when the operation call
      * succeeded, or rejected with an `Error` instance `oError` in case of failure, for instance if the operation
      * metadata is not found, if overloading is not supported, if a collection-valued function parameter is
      * encountered, or if `bIgnoreETag` is used for an operation other than a bound action. It is also rejected
      * if `fnOnStrictHandlingFailed` is supplied and
      * 	 is used for an operation other than an action,  another request that applies the preference "handling=strict"
      * exists in a different change set of the same $batch request,  it does not return a `Promise`,
      * returns a `Promise` that resolves with `false`. In this case `oError.canceled === true`.  It is
      * also rejected if `bReplaceWithRVC` is supplied, and there is no return value context at all or the existing
      * context as described above is currently part of the list's collection (that is, has an index).
      *  A return value context is an {@link sap.ui.model.odata.v4.Context} which represents a bound operation
      * response. It is created only if the operation is bound and has a single entity return value from the
      * same entity set as the operation's binding parameter and has a parent context which is an {@link sap.ui.model.odata.v4.Context }
      * and points to an entity from an entity set. It is destroyed the next time this operation binding is executed
      * again!
      *  If a return value context is created, it must be used instead of `this.getBoundContext()`. All bound
      * messages will be related to the return value context only. Such a message can only be connected to a
      * corresponding control if the control's property bindings use the return value context as binding context.
      */
    def execute(): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: Unit,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: Unit,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Boolean,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: Unit,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: js.Function,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    def execute(
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link sap.ui.model.odata.v4.ODataContextBinding#constructor} and {@link #getGroupId}. To use the update
      * group ID, see {@link #getUpdateGroupId}, it needs to be specified explicitly. Valid values are `undefined`,
      * '$auto', '$auto.*', '$direct' or application group IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: Unit,
      /**
      * Whether the entity's ETag should be actively ignored (If-Match:*); supported for bound actions only,
      * since 1.90.0. Ignored if there is no ETag (since 1.93.0).
      */
    bIgnoreETag: Unit,
      /**
      * If this callback is given for an action, the preference "handling=strict" is applied. If the service
      * responds with the HTTP status code 412 and a "Preference-applied: handling=strict" header, the details
      * from the OData error response are extracted and passed to the callback as an array of {@link sap.ui.core.message.Message }
      * items. The callback has to return a `Promise` resolving with a `boolean` value in order to indicate whether
      * the bound action should either be repeated **without** applying the preference or rejected with an `Error`
      * instance `oError` where `oError.canceled === true`. Since 1.92.0.
      */
    fnOnStrictHandlingFailed: Unit,
      /**
      * Whether this operation binding's parent context, which must belong to a list binding, is replaced with
      * the operation's return value context (see below) and that list context is returned instead. That list
      * context may be a newly created context or an existing context. A newly created context has the same `keepAlive`
      * attribute and `fnOnBeforeDestroy` function as the parent context, see {@link sap.ui.model.odata.v4.Context#setKeepAlive};
      * `fnOnBeforeDestroy` will be called with the new context instance as the only argument in this case. An
      * existing context does not change its `keepAlive` attribute. In any case, the resulting context takes
      * the place (index, position) of the parent context (see {@link sap.ui.model.odata.v4.Context#getIndex}),
      * which need not be in the collection currently if it is {@link sap.ui.model.odata.v4.Context#isKeepAlive kept alive}.
      * If the parent context has requested messages when it was kept alive, they will be inherited if the $$inheritExpandSelect
      * binding parameter is set to `true`. Since 1.97.0.
      */
    bReplaceWithRVC: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * @since 1.81.0
      *
      * Returns the group ID of the binding that is used for read requests. The group ID of the binding is alternatively
      * defined by
      * 	 the `groupId` parameter of the OData model; see {@link sap.ui.model.odata.v4.ODataModel#constructor},
      *  the `$$groupId` binding parameter; see {@link sap.ui.model.odata.v4.ODataModel#bindList} and {@link sap.ui.model.odata.v4.ODataModel#bindContext}.
      *
      *
      * @returns The group ID
      */
    def getGroupId(): String = js.native
    
    /**
      * @since 1.73.0
      *
      * Returns the context pointing to the parameters of a deferred operation binding.
      *
      * @returns The parameter context
      */
    def getParameterContext(): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    
    /**
      * @since 1.53.0
      *
      * Returns the root binding of this binding's hierarchy, see {@link https://ui5.sap.com/#/topic/fccfb2eb41414f0792c165e69a878717 Initialization and Read Requests}.
      *
      * @returns The root binding or `undefined` if this binding is unresolved (see {@link sap.ui.model.Binding#isResolved}).
      */
    def getRootBinding(): js.UndefOr[
        ODataContextBinding | typings.openui5.sapUiModelOdataV4OdatalistbindingMod.default | typings.openui5.sapUiModelOdataV4OdatapropertybindingMod.default
      ] = js.native
    
    /**
      * @since 1.81.0
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
      * @since 1.39.0
      *
      * Returns `true` if this binding or its dependent bindings have property changes, created entities, or
      * entity deletions which have not been sent successfully to the server. This function does not take the
      * execution of OData operations (see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}) into account.
      * Since 1.98.0, {@link sap.ui.model.odata.v4.Context#isInactive inactive} contexts are ignored, unless
      * (since 1.100.0) their {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate activation }
      * has been prevented and {@link sap.ui.model.odata.v4.Context#isInactive} therefore returns `1`.
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
      * Whether to ignore changes which will not be lost by APIs like {@link sap.ui.model.odata.v4.ODataListBinding#changeParameters changeParameters},
      * {@link sap.ui.model.odata.v4.ODataListBinding#filter filter}, {@link sap.ui.model.odata.v4.ODataListBinding#refresh refresh }
      * (since 1.100.0), {@link sap.ui.model.odata.v4.ODataListBinding#sort sort}, or {@link sap.ui.model.odata.v4.ODataListBinding#suspend suspend }
      * because they relate to a {@link sap.ui.model.odata.v4.Context#isKeepAlive kept-alive} (since 1.97.0)
      * or {@link sap.ui.model.odata.v4.Context#delete deleted} (since 1.108.0) context of this binding. Since
      * 1.98.0, {@link sap.ui.model.odata.v4.Context#isTransient transient} contexts of a {@link #getRootBinding root binding }
      * are treated as kept-alive by this flag. Since 1.99.0, the same happens for bindings using the `$$ownRequest`
      * parameter (see {@link sap.ui.model.odata.v4.ODataModel#bindList}).
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
      * @since 1.69.0
      *
      * Returns a promise on the value for the given path relative to this binding. The function allows access
      * to the complete data the binding points to (if `sPath` is "") or any part thereof. The data is a JSON
      * structure as described in "OData JSON Format Version 4.0". Note that the function clones the result. Modify values via {@link sap.ui.model.odata.v4.Context#setProperty}.
      *
      * If you want {@link #requestObject} to read fresh data, call `oBinding.refresh()` first.
      * See:
      * 	sap.ui.model.odata.v4.Context#requestObject
      *
      * @returns A promise on the requested value; in case there is no bound context this promise resolves with
      * `undefined`
      */
    def requestObject(): js.Promise[js.UndefOr[Any]] = js.native
    def requestObject(/**
      * A path relative to this context binding
      */
    sPath: String): js.Promise[js.UndefOr[Any]] = js.native
    
    /**
      * @since 1.87.0
      *
      * Refreshes the binding and returns a promise to wait for it. See {@link #refresh} for details. Use {@link #refresh }
      * if you do not need the promise.
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
      * @since 1.40.1
      *
      * Resets all pending changes of this binding, see {@link #hasPendingChanges}. Resets also invalid user
      * input.
      *
      * @returns A promise which is resolved without a defined result as soon as all changes in the binding itself
      * and all dependent bindings are canceled (since 1.72.0)
      */
    def resetChanges(): js.Promise[Any] = js.native
    
    /**
      * @since 1.37.0
      *
      * Sets a parameter for an operation call.
      *
      * @returns `this` to enable method chaining
      */
    def setParameter(
      /**
      * The parameter name
      */
    sParameterName: String,
      /**
      * The parameter value
      */
    vValue: Any
    ): this.type = js.native
  }
  
  type ODataContextBinding$ChangeEventParameters = Binding$ChangeEventParameters
  
  type ODataContextBinding$DataReceivedEventParameters = Binding$DataReceivedEventParameters
  
  type ODataContextBinding$DataRequestedEventParameters = Binding$DataRequestedEventParameters
  
  trait ODataContextBinding$PatchCompletedEventParameters extends StObject
  
  trait ODataContextBinding$PatchSentEventParameters extends StObject
  
  type ODataContextBindingChangeEvent = typings.openui5.sapUiBaseEventMod.default[ODataContextBinding$ChangeEventParameters]
  
  type ODataContextBindingChangeEventParameters = ODataContextBinding$ChangeEventParameters
  
  type ODataContextBindingDataReceivedEvent = typings.openui5.sapUiBaseEventMod.default[ODataContextBinding$DataReceivedEventParameters]
  
  type ODataContextBindingDataReceivedEventParameters = ODataContextBinding$DataReceivedEventParameters
  
  type ODataContextBindingDataRequestedEvent = typings.openui5.sapUiBaseEventMod.default[ODataContextBinding$DataRequestedEventParameters]
  
  type ODataContextBindingDataRequestedEventParameters = ODataContextBinding$DataRequestedEventParameters
  
  type ODataContextBindingPatchCompletedEvent = typings.openui5.sapUiBaseEventMod.default[ODataContextBinding$PatchCompletedEventParameters]
  
  type ODataContextBindingPatchCompletedEventParameters = ODataContextBinding$PatchCompletedEventParameters
  
  type ODataContextBindingPatchSentEvent = typings.openui5.sapUiBaseEventMod.default[ODataContextBinding$PatchSentEventParameters]
  
  type ODataContextBindingPatchSentEventParameters = ODataContextBinding$PatchSentEventParameters
}
