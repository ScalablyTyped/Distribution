package typings.openui5

import typings.openui5.anon.Aggregate
import typings.openui5.anon.As
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelBindingMod.Binding$ChangeEventParameters
import typings.openui5.sapUiModelBindingMod.Binding$DataReceivedEventParameters
import typings.openui5.sapUiModelBindingMod.Binding$DataRequestedEventParameters
import typings.openui5.sapUiModelFilterTypeMod.FilterType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatalistbindingMod {
  
  @JSImport("sap/ui/model/odata/v4/ODataListBinding", JSImport.Default)
  @js.native
  open class default () extends ODataListBinding
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/ODataListBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.ODataListBinding with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ListBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataListBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataListBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.ODataListBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataListBinding
    extends typings.openui5.sapUiModelListBindingMod.default {
    
    /**
      * @since 1.98.0
      *
      * Attach event handler `fnFunction` to the 'createActivate' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachCreateActivate(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachCreateActivate(
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
      * @since 1.66.0
      *
      * Attach event handler `fnFunction` to the 'createCompleted' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachCreateCompleted(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachCreateCompleted(
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
      * @since 1.66.0
      *
      * Attach event handler `fnFunction` to the 'createSent' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def attachCreateSent(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachCreateSent(
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
      * @since 1.43.0
      *
      * Creates a new entity and inserts it at the start or the end of the list.
      *
      * For creating the new entity, the binding's update group ID is used, see {@link #getUpdateGroupId}.
      *
      * You can call {@link sap.ui.model.odata.v4.Context#delete} to delete the created context again. As long
      * as the context is {@link sap.ui.model.odata.v4.Context#isTransient transient} and {@link sap.ui.model.odata.v4.Context#isInactive active},
      * {@link #resetChanges} and a call to {@link sap.ui.model.odata.v4.ODataModel#resetChanges} with the update
      * group ID as parameter also delete the created context together with other changes.
      *
      * If the creation of the entity on the server failed, the creation is repeated automatically. If the binding's
      * update group ID has {@link sap.ui.model.odata.v4.SubmitMode.API}, it is repeated with the next call of
      * {@link sap.ui.model.odata.v4.ODataModel#submitBatch}. Otherwise it is repeated with the next update for
      * the entity. Since 1.67.0, {@link sap.ui.model.odata.v4.ODataModel#submitBatch} can also be used for group
      * IDs with {@link sap.ui.model.odata.v4.SubmitMode.Auto} in order to repeat the creation even if there
      * is no update for the entity.
      *
      * Each time the data for the created entity is sent to the server, a {@link #event:createSent 'createSent' }
      * event is fired and each time the client receives a response for the creation, a {@link #event:createCompleted 'createCompleted' }
      * event is fired, independent of whether the creation was successful or not.
      *
      * The initial data for the created entity can be supplied via the parameter `oInitialData` and modified
      * via property bindings. Properties that are not part of the initial data show the default value from the
      * service metadata on the UI, but they are not sent to the server. If there is no default value, `null`
      * is used instead, even if the property is not `Nullable`. The initial data may contain instance annotations.
      *
      * Note: If a server requires a property in the request, you must supply this property in the initial data,
      * for example if the server requires a unit for an amount. This also applies if this property has a default
      * value.
      *
      * Note: After creation, the created entity is refreshed to ensure that the data specified in this list
      * binding's $expand is available. This refresh is done via the group ID of the binding, unless the group
      * ID has {@link sap.ui.model.odata.v4.SubmitMode.API}, in which case '$auto' is used. To skip this refresh,
      * set `bSkipRefresh` to `true`. To avoid errors you must skip this refresh when using {@link sap.ui.model.odata.v4.Context#requestSideEffects }
      * in the same $batch to refresh the complete collection containing the newly created entity.
      *
      * Since 1.115.0 it is possible to create nested entities in a collection-valued navigation property together
      * with the entity (so-called "deep create"), for example a list of items for an order. For this purpose,
      * bind the list relative to a transient context. Calling this method then adds a transient entity to the
      * parent's navigation property, which is sent with the payload of the parent entity. Such a nested context
      * cannot be inactive.
      *
      * **Beware:** After a succesful creation of the main entity the context returned for a nested entity is
      * no longer valid. Do not use the {@link sap.ui.model.odata.v4.Context#created created} promise of such
      * a context! New contexts are created for the nested collection because it is not possible to reliably
      * assign the response entities to those of the request, especially if the count differs. For this reason,
      * the `created` promises of all nested contexts are always rejected with an instance of `Error`, even if
      * the deep create succeeds. This error always has the property `canceled` with the value `true`.
      *
      * Deep create requires the `autoExpandSelect` parameter at the {@link sap.ui.model.odata.v4.ODataModel#constructor model}.
      * The refresh after a deep create is optimized. Only the (navigation) properties missing from the POST
      * response are actually requested. If the POST response contains all required properties, no request is
      * sent at all.
      *
      * Note: Creating at the end is only allowed if the final length of the binding is known (see {@link #isLengthFinal}),
      * so that there is a clear position to place this entity at. This is the case if the complete collection
      * has been read or if the system query option `$count` is `true` and the binding has processed at least
      * one request.
      *
      * @returns The context object for the created entity; its method {@link sap.ui.model.odata.v4.Context#created }
      * returns a promise that is resolved when the creation is finished
      */
    def create(): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(/**
      * The initial data for the created entity
      */
    oInitialData: js.Object): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Unit,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: js.Object,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Unit,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Boolean,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Unit,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Boolean,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def create(
      /**
      * The initial data for the created entity
      */
    oInitialData: Unit,
      /**
      * Whether an automatic refresh of the created entity will be skipped; ignored within a deep create (when
      * the binding's parent context is transient)
      */
    bSkipRefresh: Unit,
      /**
      * Whether the entity is inserted at the end of the list. Supported since 1.66.0. Since 1.99.0 the first
      * insertion determines the overall position of created contexts within the binding's context list. Every
      * succeeding insertion is relative to the created contexts within this list.
      */
    bAtEnd: Unit,
      /**
      * Create an inactive context. Such a context will only be sent to the server after the first property update.
      * From then on it behaves like any other created context. Supported since 1.97.0
      *  Since 1.98.0, when the first property updates happens, the context is no longer {@link sap.ui.model.odata.v4.Context#isInactive inactive }
      * and the {@link sap.ui.model.odata.v4.ODataListBinding#event:createActivate 'createActivate'} event is
      * fired. While inactive, it does not count as a {@link #hasPendingChanges pending change} and does not
      * contribute to the {@link #getCount count}.
      */
    bInactive: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    
    /**
      * @since 1.98.0
      *
      * Detach event handler `fnFunction` from the 'createActivate' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def detachCreateActivate(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachCreateActivate(
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
      * @since 1.66.0
      *
      * Detach event handler `fnFunction` from the 'createCompleted' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def detachCreateCompleted(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachCreateCompleted(
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
      * @since 1.66.0
      *
      * Detach event handler `fnFunction` from the 'createSent' event of this binding.
      *
      * @returns `this` to allow method chaining
      */
    def detachCreateSent(/**
      * The function to call when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachCreateSent(
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
      * @since 1.39.0
      *
      * Filters the list with the given filters. Since 1.97.0, if filters are unchanged, no request is sent,
      * regardless of pending changes. Since 1.111.0, the header context is deselected.
      *
      * If there are pending changes that cannot be ignored, an error is thrown. Use {@link #hasPendingChanges }
      * to check if there are such pending changes. If there are, call {@link sap.ui.model.odata.v4.ODataModel#submitBatch }
      * to submit the changes or {@link sap.ui.model.odata.v4.ODataModel#resetChanges} to reset the changes before
      * calling {@link #filter}.
      *
      * Filters are case sensitive unless the property `caseSensitive` is set to `false`. This property has to
      * be set on each filter, it is not inherited from a multi-filter.
      *
      * Application and Control Filters: Each list binding maintains two separate lists of filters, one for filters
      * defined by the control that owns the binding, and another list for filters that an application can define
      * in addition. When executing the filter operation, both sets of filters are combined.
      *
      * By using the `sFilterType` parameter of the `filter` method, the caller can control which set of filters
      * is modified.
      *
      * Auto-Grouping of Filters: Filters are first grouped according to their binding path. All filters belonging
      * to the same path are ORed, and after that the results of all paths are ANDed. Usually this means that
      * all filters applied to the same property are ORed, while filters on different properties are ANDed. Please
      * use either the automatic grouping of filters (where applicable) or explicit AND/OR filters, as a mixture
      * of both is not supported.
      * See:
      * 	sap.ui.model.ListBinding#filter
      * 	#setAggregation
      *
      * @returns `this` to facilitate method chaining
      */
    def filter(): this.type = js.native
    def filter(
      /**
      * The dynamic filters to be used; replaces the dynamic filters given in {@link sap.ui.model.odata.v4.ODataModel#bindList}.
      * The filter executed on the list is created from the following parts, which are combined with a logical
      * 'and':
      * 	 Dynamic filters of type {@link sap.ui.model.FilterType.Application}  Dynamic filters of type {@link sap.ui.model.FilterType.Control }
      *  The static filters, as defined in the '$filter' binding parameter
      */
    vFilters: Unit,
      /**
      * The filter type to be used
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String
    ): this.type = js.native
    def filter(
      /**
      * The dynamic filters to be used; replaces the dynamic filters given in {@link sap.ui.model.odata.v4.ODataModel#bindList}.
      * The filter executed on the list is created from the following parts, which are combined with a logical
      * 'and':
      * 	 Dynamic filters of type {@link sap.ui.model.FilterType.Application}  Dynamic filters of type {@link sap.ui.model.FilterType.Control }
      *  The static filters, as defined in the '$filter' binding parameter
      */
    vFilters: Unit,
      /**
      * The filter type to be used
      */
    sFilterType: FilterType
    ): this.type = js.native
    
    /**
      * @since 1.109.0
      *
      * Returns the current object holding the information needed for data aggregation, see {@link #setAggregation}.
      *
      * @returns The current data aggregation object, incl. some default values, or `undefined` if there is no
      * data aggregation
      */
    def getAggregation(): js.UndefOr[js.Object] = js.native
    def getAggregation(
      /**
      * Whether to additionally return the "$"-prefixed values described below which obviously cannot be given
      * back to the setter (@experimental as of version 1.111.0). They are retrieved from the pair of "Org.OData.Aggregation.V1.RecursiveHierarchy"
      * and "com.sap.vocabularies.Hierarchy.v1.RecursiveHierarchy" annotations at this binding's entity type,
      * identified via the `hierarchyQualifier` given to {@link #setAggregation}.
      * 	 "$DistanceFromRootProperty" holds the path to the property which provides the raw value for "@$ui5.node.level"
      * (minus one) and should be used only to interpret the response retrieved via {@link #getDownloadUrl}.
      *  "$NodeProperty" holds the path to the property which provides the hierarchy node value. That property
      * is always $select'ed automatically and can be accessed as usual.
      */
    bVerbose: Boolean
    ): js.UndefOr[js.Object] = js.native
    
    /**
      * @since 1.37.0
      *
      * Method not supported
      * See:
      * 	sap.ui.model.ListBinding#getDistinctValues
      */
    def getDistinctValues(): js.Array[Any] = js.native
    
    /**
      * @since 1.74.0
      *
      * Returns a URL by which the complete content of the list can be downloaded in JSON format. The request
      * delivers all entities considering the binding's query options (such as filters or sorters).
      *
      * The returned URL does not specify `$skip` and `$top` and leaves it up to the server how many rows it
      * delivers. Many servers tend to choose a small limit without `$skip` and `$top`, so it might be wise to
      * add an appropriate value for `$top` at least.
      *
      * Additionally, you must be aware of server-driven paging and be ready to send a follow-up request if the
      * response contains `@odata.nextlink`.
      * See:
      * 	#requestDownloadUrl
      *
      * @returns The download URL
      */
    def getDownloadUrl(): String = js.native
    
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
      * @since 1.45.0
      *
      * Returns the header context which allows binding to `$count`.
      * See:
      * 	#getCount
      *
      * @returns The header context or `null` if the binding is relative and has no context
      */
    def getHeaderContext(): typings.openui5.sapUiModelOdataV4ContextMod.default | Null = js.native
    
    /**
      * @since 1.99.0
      *
      * Calls {@link sap.ui.model.odata.v4.Context#setKeepAlive} at the context for the given path and returns
      * it. Since 1.100.0 the function always returns such a context. If none exists yet, it is created without
      * data and a request for its entity is sent.
      * See:
      * 	sap.ui.model.odata.v4.Model#getKeepAliveContext
      *
      * @returns The kept-alive context
      */
    def getKeepAliveContext(/**
      * The path of the context to be kept alive
      */
    sPath: String): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * The path of the context to be kept alive
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Boolean
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * The path of the context to be kept alive
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Boolean,
      /**
      * The group ID used for read requests for the context's entity or its properties. If not given, the binding's
      * {@link #getGroupId group ID} is used. Supported since 1.100.0
      */
    sGroupId: String
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    def getKeepAliveContext(
      /**
      * The path of the context to be kept alive
      */
    sPath: String,
      /**
      * Whether to request messages for the context's entity
      */
    bRequestMessages: Unit,
      /**
      * The group ID used for read requests for the context's entity or its properties. If not given, the binding's
      * {@link #getGroupId group ID} is used. Supported since 1.100.0
      */
    sGroupId: String
    ): typings.openui5.sapUiModelOdataV4ContextMod.default = js.native
    
    /**
      * @since 1.66.0
      *
      * Returns the query options of the binding.
      *
      * @returns mQueryOptions The object with the query options. Query options can be provided with {@link sap.ui.model.odata.v4.ODataModel#bindList},
      * {@link sap.ui.model.odata.v4.ODataModel#bindContext}, {@link sap.ui.model.odata.v4.ODataListBinding#changeParameters},
      * and {@link sap.ui.model.odata.v4.ODataContextBinding#changeParameters}. System query options can also
      * be calculated, e.g. `$filter` can be calculated based on provided filter objects.
      */
    def getQueryOptions(): js.Object = js.native
    def getQueryOptions(
      /**
      * Whether system query options should be returned as well. The parameter value `true` is not supported.
      */
    bWithSystemQueryOptions: Boolean
    ): js.Object = js.native
    
    /**
      * @since 1.53.0
      *
      * Returns the root binding of this binding's hierarchy, see {@link https://ui5.sap.com/#/topic/fccfb2eb41414f0792c165e69a878717 Initialization and Read Requests}.
      *
      * @returns The root binding or `undefined` if this binding is unresolved (see {@link sap.ui.model.Binding#isResolved}).
      */
    def getRootBinding(): js.UndefOr[
        typings.openui5.sapUiModelOdataV4OdatacontextbindingMod.default | ODataListBinding | typings.openui5.sapUiModelOdataV4OdatapropertybindingMod.default
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
    
    /**
      * @since 1.99.0
      *
      * Returns whether the overall position of created entries is at the end of the list; this is determined
      * by the first call to {@link #create}.
      *
      * @returns Whether the overall position of created contexts is at the end, or `undefined` if there are
      * no created contexts
      */
    def isFirstCreateAtEnd(): js.UndefOr[Boolean] = js.native
    
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
      * @since 1.70.0
      *
      * Requests the entities for the given index range of the binding's collection and resolves with the corresponding
      * contexts.
      *
      * @returns A promise which is resolved with the array of the contexts, the first entry containing the context
      * for `iStart`; it is rejected if `iStart` or `iLength` are less than 0 or when requesting the data fails
      */
    def requestContexts(): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Double
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Double,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Double
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Double,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Double,
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link #getGroupId}. Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group
      * IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Double,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Unit,
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link #getGroupId}. Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group
      * IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Unit,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Double
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Unit,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Double,
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link #getGroupId}. Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group
      * IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    def requestContexts(
      /**
      * The index where to start the retrieval of contexts; must be greater than or equal to 0
      */
    iStart: Unit,
      /**
      * The number of contexts to retrieve beginning from the start index; defaults to the model's size limit,
      * see {@link sap.ui.model.Model#setSizeLimit}; must be greater than 0, `Infinity` may be used to retrieve
      * all data
      */
    iLength: Unit,
      /**
      * The group ID to be used for the request; if not specified, the group ID for this binding is used, see
      * {@link #getGroupId}. Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group
      * IDs as specified in {@link sap.ui.model.odata.v4.ODataModel}.
      */
    sGroupId: String
    ): js.Promise[js.Array[typings.openui5.sapUiModelOdataV4ContextMod.default]] = js.native
    
    /**
      * @since 1.74.0
      *
      * Returns a URL by which the complete content of the list can be downloaded in JSON format. The request
      * delivers all entities considering the binding's query options (such as filters or sorters).
      *
      * The returned URL does not specify `$skip` and `$top` and leaves it up to the server how many rows it
      * delivers. Many servers tend to choose a small limit without `$skip` and `$top`, so it might be wise to
      * add an appropriate value for `$top` at least.
      *
      * Additionally, you must be aware of server-driven paging and be ready to send a follow-up request if the
      * response contains `@odata.nextlink`.
      * See:
      * 	#getDownloadUrl
      *
      * @returns A promise that is resolved with the download URL
      */
    def requestDownloadUrl(): js.Promise[String] = js.native
    
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
      * @since 1.55.0
      *
      * Sets a new data aggregation object and derives the system query option `$apply` implicitly from it.
      * See:
      * 	#getAggregation
      */
    def setAggregation(): Unit = js.native
    def setAggregation(
      /**
      * An object holding the information needed for data aggregation; see also OData
      * Extension for Data Aggregation Version 4.0. Since 1.76.0, `undefined` can be used to remove the data
      * aggregation object, which allows to set `$apply` explicitly afterwards. `null` is not supported.
      *  Since 1.89.0, the deprecated property `"grandTotal like 1.84" : true` can be used to turn on the handling
      * of grand totals like in 1.84.0, using aggregates of aggregates and thus allowing to filter by aggregated
      * properties while grand totals are needed. Beware that methods like "average" or "countdistinct" are not
      * compatible with this approach, and it cannot be combined with group levels.
      *  Since 1.105.0, either a recursive hierarchy or pure data aggregation is supported, but no mix; `hierarchyQualifier`
      * is the leading property that decides between those two use cases - this is an **experimental API** and
      * is only supported if the model uses the `autoExpandSelect` parameter!
      */
    oAggregation: Aggregate
    ): Unit = js.native
    
    /**
      * @since 1.39.0
      *
      * Sort the entries represented by this list binding according to the given sorters. The sorters are stored
      * at this list binding and they are used for each following data request. Since 1.97.0, if sorters are
      * unchanged, no request is sent, regardless of pending changes.
      *
      * **Note:** To allow proper detection whether sorters are unchanged, care must be taken if a sorter uses
      * a function (for example via the `vGroup` parameter): it must be the exact same function instance which
      * was given before, and not a newly created one, for example because `Function.prototype.bind` is called
      * repeatedly.
      *
      * If there are pending changes that cannot be ignored, an error is thrown. Use {@link #hasPendingChanges }
      * to check if there are such pending changes. If there are, call {@link sap.ui.model.odata.v4.ODataModel#submitBatch }
      * to submit the changes or {@link sap.ui.model.odata.v4.ODataModel#resetChanges} to reset the changes before
      * calling {@link #sort}.
      * See:
      * 	sap.ui.model.ListBinding#sort
      *
      * @returns `this` to facilitate method chaining
      */
    def sort(): this.type = js.native
    
    /**
      * @since 1.53.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Updates the binding's system query option `$apply` based on the given data aggregation information. Its
      * value is "groupby((<dimension_1,...,dimension_N,unit_or_text_1,...,unit_or_text_K>), aggregate(<measure>
      * with <method> as <alias>, ...))" where the "aggregate" part is only present if measures are given
      * and both "with" and "as" are optional. Since 1.93.0, a previous "search before data aggregation" is considered
      * (see the `oAggregation.search` parameter of {@link #setAggregation}).
      * See:
      * 	sap.ui.model.analytics.AnalyticalBinding#updateAnalyticalInfo
      * 	#changeParameters
      * 	#setAggregation
      *
      * @returns The return object contains a property `measureRangePromise` if and only if at least one measure
      * has requested a minimum or maximum value; its value is a promise which resolves with the measure range
      * map as soon as data has been received; the measure range map contains measure names as keys and objects
      * as values which have a `min` and `max` property as requested above. In case of multiple calls to this
      * method while the binding's root binding is suspended, only the last call's promise will resolve with
      * the right result; the other calls just get the same result as the last call, which may or may not fit
      * to their `aAggregation` argument. `undefined` is returned instead of an empty object.
      */
    def updateAnalyticalInfo(
      /**
      * An array with objects holding the information needed for data aggregation; see also OData
      * Extension for Data Aggregation Version 4.0
      */
    aAggregation: js.Array[As]
    ): js.UndefOr[js.Object] = js.native
  }
  
  type ODataListBinding$ChangeEventParameters = Binding$ChangeEventParameters
  
  trait ODataListBinding$CreateActivateEventParameters extends StObject
  
  trait ODataListBinding$CreateCompletedEventParameters extends StObject
  
  trait ODataListBinding$CreateSentEventParameters extends StObject
  
  type ODataListBinding$DataReceivedEventParameters = Binding$DataReceivedEventParameters
  
  type ODataListBinding$DataRequestedEventParameters = Binding$DataRequestedEventParameters
  
  trait ODataListBinding$PatchCompletedEventParameters extends StObject
  
  trait ODataListBinding$PatchSentEventParameters extends StObject
  
  trait ODataListBinding$RefreshEventParameters extends StObject
  
  type ODataListBindingChangeEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$ChangeEventParameters]
  
  type ODataListBindingChangeEventParameters = ODataListBinding$ChangeEventParameters
  
  type ODataListBindingCreateActivateEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$CreateActivateEventParameters]
  
  type ODataListBindingCreateActivateEventParameters = ODataListBinding$CreateActivateEventParameters
  
  type ODataListBindingCreateCompletedEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$CreateCompletedEventParameters]
  
  type ODataListBindingCreateCompletedEventParameters = ODataListBinding$CreateCompletedEventParameters
  
  type ODataListBindingCreateSentEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$CreateSentEventParameters]
  
  type ODataListBindingCreateSentEventParameters = ODataListBinding$CreateSentEventParameters
  
  type ODataListBindingDataReceivedEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$DataReceivedEventParameters]
  
  type ODataListBindingDataReceivedEventParameters = ODataListBinding$DataReceivedEventParameters
  
  type ODataListBindingDataRequestedEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$DataRequestedEventParameters]
  
  type ODataListBindingDataRequestedEventParameters = ODataListBinding$DataRequestedEventParameters
  
  type ODataListBindingPatchCompletedEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$PatchCompletedEventParameters]
  
  type ODataListBindingPatchCompletedEventParameters = ODataListBinding$PatchCompletedEventParameters
  
  type ODataListBindingPatchSentEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$PatchSentEventParameters]
  
  type ODataListBindingPatchSentEventParameters = ODataListBinding$PatchSentEventParameters
  
  type ODataListBindingRefreshEvent = typings.openui5.sapUiBaseEventMod.default[ODataListBinding$RefreshEventParameters]
  
  type ODataListBindingRefreshEventParameters = ODataListBinding$RefreshEventParameters
}
