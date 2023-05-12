package typings.openui5

import typings.openui5.anon.Caller
import typings.openui5.anon.ComponentId
import typings.openui5.anon.Preprocessors
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcViewMod {
  
  @JSImport("sap/ui/core/mvc/View", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `View`.
    *
    * As `View` is an abstract base class for views, applications should not call the constructor, but rather
    * use one of the view factories instead, e.g. {@link #.create View.create}, to create an instance of a
    * concrete subclass (e.g. `XMLView`).
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends View {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ViewSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/mvc/View", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Creates a view of the given type, name and with the given ID.
      *
      * If the option `viewName` is given, the corresponding view module is loaded if needed.
      *
      * When the `viewName` starts with prefix `"module:"`, the remainder of the name is assumed to be the name
      * of a module that exports a typed view (subclass of `View`). The module name must use the same syntax
      * as for `sap.ui.define/sap.ui.require` (slash-separated name).
      *
      * @returns A Promise which resolves with the created View instance
      */
    inline def create(
      /**
      * Options for the view instantiation. Can contain any settings that are documented for the {@link sap.ui.core.mvc.View};
      * specialized view types could bring in additional settings.
      */
    oOptions: Preprocessors
    ): js.Promise[View] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[View]]
    
    /**
      * Creates a new subclass of class sap.ui.core.mvc.View with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, View]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, View],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.mvc.View.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * @SINCE 1.30
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Register a preprocessor for all views of a specific type.
      *
      * The preprocessor can be registered for several stages of view initialization, which are dependent on
      * the view type, e.g. "raw", "xml" or already initialized "controls". If there is a preprocessor passed
      * to or activated at the view instance already, that one is used. When several preprocessors are registered
      * for one hook, it has to be made sure that they do not conflict when being processed serially.
      *
      * It can be either a module name as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor}
      * or a function with a signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.
      *
      * **Note**: Preprocessors only work in async views and will be ignored when the view is instantiated in
      * sync mode by default, as this could have unexpected side effects. You may override this behaviour by
      * setting the `bSyncSupport` flag to `true`.
      */
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function,
      /**
      * type of the calling view, e.g. `XML`
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * on-demand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example. This should be false except for very special cases. There can
      * only be one on-demand preprocessor per content type.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait Preprocessor extends StObject {
    
    var __implements__sap_ui_core_mvc_View_Preprocessor: Boolean = js.native
    
    /**
      * @SINCE 1.40
      *
      * Cache key provider method that can be implemented by a preprocessor.
      *
      * This method should be used to invalidate a cache on the currently preprocessed view. Therefore, a Promise
      * needs to be passed which resolves with the according cache key increment.
      *
      * **Note:** Caching is only available for XMLViews! Some parts of the feature are still experimental, For
      * further information see {@link sap.ui.core.mvc.XMLView.create XMLView.create}
      *
      * @returns String or Promise resolving with a string
      */
    def getCacheKey(/**
      * identification information about the calling instance
      */
    oViewInfo: ComponentId): String | js.Promise[Any] = js.native
    
    /**
      * Processing method that must be implemented by a Preprocessor.
      *
      * @returns the processed resource or a promise which resolves with the processed resource or an error according
      * to the declared preprocessor sync capability
      */
    def process(
      /**
      * the source to be processed
      */
    vSource: js.Object,
      /**
      * identification information about the calling instance
      */
    oViewInfo: Caller
    ): js.Object | js.Promise[Any] = js.native
    def process(
      /**
      * the source to be processed
      */
    vSource: js.Object,
      /**
      * identification information about the calling instance
      */
    oViewInfo: Caller,
      /**
      * settings object containing the settings provided with the preprocessor
      */
    mSettings: js.Object
    ): js.Object | js.Promise[Any] = js.native
  }
  
  @js.native
  trait View
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterInit afterInit} event of this `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the View has parsed the UI description and instantiated the contained controls (/control tree).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterInit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterInit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterInit afterInit} event of this `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the View has parsed the UI description and instantiated the contained controls (/control tree).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterInit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterInit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the View has been (re-)rendered and its HTML is present in the DOM.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the View has been (re-)rendered and its HTML is present in the DOM.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeExit beforeExit} event of this `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the view has received the request to destroy itself, but before it has destroyed anything.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeExit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeExit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeExit beforeExit} event of this `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired when the view has received the request to destroy itself, but before it has destroyed anything.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeExit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeExit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRendering beforeRendering} event of this
      * `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired before this View is re-rendered. Use to unbind event handlers from HTML elements etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRendering beforeRendering} event of this
      * `sap.ui.core.mvc.View`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.mvc.View` itself.
      *
      * Fired before this View is re-rendered. Use to unbind event handlers from HTML elements etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.mvc.View` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Returns an element by its ID in the context of this view.
      *
      * This method expects a view-local ID of an element (the same as e.g. defined in the *.view.xml of an XMLView).
      * For a search with a global ID (the value returned by `oElement.getId()`) you should rather use {@link
      * sap.ui.core.Core#byId sap.ui.getCore().byId()}.
      *
      * @returns Element by its ID or `undefined`
      */
    def byId(/**
      * View local ID of the element
      */
    sId: String): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * A method to be implemented by typed `View`s, returning the view UI.
      *
      * While for declarative view types like `XMLView` or `JSONView` the user interface definition is declared
      * in a separate file, `View`s programmatically constructs the UI. This happens in the `createContent` method,
      * which every `View` needs to implement. The view implementation can construct the complete UI in this
      * method, or only return the root control and create the remainder of the UI lazily later on.
      *
      * @returns A control or array of controls representing the view user interface or a Promise resolving with
      * a control or an array of controls.
      */
    def createContent(): typings.openui5.sapUiCoreControlMod.default | js.Array[typings.openui5.sapUiCoreControlMod.default] | (js.Promise[
        typings.openui5.sapUiCoreControlMod.default | js.Array[typings.openui5.sapUiCoreControlMod.default]
      ]) = js.native
    
    /**
      * Convert the given view local element ID to a globally unique ID by prefixing it with the view ID.
      *
      * @returns prefixed id
      */
    def createId(/**
      * View local ID of the element
      */
    sId: String): String = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterInit afterInit} event of this `sap.ui.core.mvc.View`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterInit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterInit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.mvc.View`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeExit beforeExit} event of this `sap.ui.core.mvc.View`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeExit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeExit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeRendering beforeRendering} event of
      * this `sap.ui.core.mvc.View`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterInit afterInit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterInit(): this.type = js.native
    def fireAfterInit(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:afterRendering afterRendering} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterRendering(): this.type = js.native
    def fireAfterRendering(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforeExit beforeExit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeExit(): this.type = js.native
    def fireBeforeExit(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:beforeRendering beforeRendering} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeRendering(): this.type = js.native
    def fireBeforeRendering(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.88
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * A method to be implemented by typed views, returning the flag whether to prefix the IDs of controls automatically
      * or not, if the controls are created inside the {@link sap.ui.core.mvc.View#createContent} function. By
      * default this feature is not activated.
      *
      * You can overwrite this function and return `true` to activate the automatic prefixing.
      *
      * **Note**: Auto-prefixing is only available for synchronous content creation. For asynchronous content
      * creation use {@link #createId} instead, to prefix the IDs programmatically.
      *
      * @returns Whether the control IDs should be prefixed automatically
      */
    def getAutoPrefixId(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Child Controls of the view
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Returns the view's Controller instance or null for a controller-less View.
      *
      * @returns Controller of this view.
      */
    def getController(): typings.openui5.sapUiCoreMvcControllerMod.default = js.native
    
    /**
      * An (optional) method to be implemented by Views. When no controller instance is given at View instantiation
      * time AND this method exists and returns the (package and class) name of a controller, the View tries
      * to load and instantiate the controller and to connect it to itself.
      *
      * @returns the name of the controller
      */
    def getControllerName(): String = js.native
    
    /**
      * Gets current value of property {@link #getDisplayBlock displayBlock}.
      *
      * Whether the CSS display should be set to "block". Set this to "true" if the default display "inline-block"
      * causes a vertical scrollbar with Views that are set to 100% height. Do not set this to "true" if you
      * want to display other content in the same HTML parent on either side of the View (setting to "true" may
      * push that other content to the next/previous line).
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayBlock`
      */
    def getDisplayBlock(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.39.0
      *
      * Returns the local ID of an element by removing the view ID prefix or `null` if the ID does not contain
      * a prefix.
      *
      * @returns ID without prefix or `null`
      */
    def getLocalId(/**
      * Prefixed ID
      */
    sId: String): String | Null = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the info object which is also passed to the preprocessors
      * See:
      * 	sap.ui.core.mvc.View.Preprocessor.process
      *
      * @returns Info object for the view
      */
    def getPreprocessorInfo(/**
      * Describes the view execution, true if sync
      */
    bSync: Boolean): js.Object = js.native
    
    /**
      * Returns user specific data object.
      *
      * @returns viewData
      */
    def getViewData(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getViewName viewName}.
      *
      * Name of the View
      *
      * @returns Value of property `viewName`
      */
    def getViewName(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Checks if any preprocessors are active for the specified type
      *
      * @returns `true` if a preprocessor is active
      */
    def hasPreprocessor(/**
      * Type of the preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.30
      * @deprecated (since 1.66) - Use {@link sap.ui.core.mvc.View.create View.create} instead
      *
      * Returns a Promise representing the state of the view initialization.
      *
      * For views that are loading asynchronously (by setting async=true) this Promise is created by view initialization.
      * Synchronously loading views get wrapped in an immediately resolving Promise.
      *
      * @returns resolves with the complete view instance, rejects with any thrown error
      */
    def loaded(): js.Promise[Any] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: String
    ): js.Promise[Any] | js.Object | String | Element = js.native
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: String,
      /**
      * describes the view execution, true if sync
      */
    bSync: Boolean
    ): js.Promise[Any] | js.Object | String | Element = js.native
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Executes preprocessors for a type of source
      *
      * @returns a promise resolving with the processed source or an error | the source when bSync=true
      */
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: js.Object
    ): js.Promise[Any] | js.Object | String | Element = js.native
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: js.Object,
      /**
      * describes the view execution, true if sync
      */
    bSync: Boolean
    ): js.Promise[Any] | js.Object | String | Element = js.native
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: Element
    ): js.Promise[Any] | js.Object | String | Element = js.native
    def runPreprocessor(
      /**
      * the type of preprocessor, e.g. "raw", "xml" or "controls"
      */
    sType: String,
      /**
      * the view source as a JSON object, a raw text, an XML document element or a Promise resolving with those
      */
    vSource: Element,
      /**
      * describes the view execution, true if sync
      */
    bSync: Boolean
    ): js.Promise[Any] | js.Object | String | Element = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayBlock displayBlock}.
      *
      * Whether the CSS display should be set to "block". Set this to "true" if the default display "inline-block"
      * causes a vertical scrollbar with Views that are set to 100% height. Do not set this to "true" if you
      * want to display other content in the same HTML parent on either side of the View (setting to "true" may
      * push that other content to the next/previous line).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayBlock(): this.type = js.native
    def setDisplayBlock(/**
      * New value for property `displayBlock`
      */
    bDisplayBlock: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getViewName viewName}.
      *
      * Name of the View
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setViewName(): this.type = js.native
    def setViewName(/**
      * New value for property `viewName`
      */
    sViewName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ViewSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the View has parsed the UI description and instantiated the contained controls (/control tree).
      */
    var afterInit: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the View has been (re-)rendered and its HTML is present in the DOM.
      */
    var afterRendering: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the view has received the request to destroy itself, but before it has destroyed anything.
      */
    var beforeExit: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired before this View is re-rendered. Use to unbind event handlers from HTML elements etc.
      */
    var beforeRendering: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Child Controls of the view
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the CSS display should be set to "block". Set this to "true" if the default display "inline-block"
      * causes a vertical scrollbar with Views that are set to 100% height. Do not set this to "true" if you
      * want to display other content in the same HTML parent on either side of the View (setting to "true" may
      * push that other content to the next/previous line).
      */
    var displayBlock: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Name of the View
      */
    var viewName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The width
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ViewSettings {
    
    inline def apply(): ViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterInit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterRendering(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterRendering", js.Any.fromFunction1(value))
      
      inline def setAfterRenderingUndefined: Self = StObject.set(x, "afterRendering", js.undefined)
      
      inline def setBeforeExit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeExit", js.Any.fromFunction1(value))
      
      inline def setBeforeExitUndefined: Self = StObject.set(x, "beforeExit", js.undefined)
      
      inline def setBeforeRendering(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeRendering", js.Any.fromFunction1(value))
      
      inline def setBeforeRenderingUndefined: Self = StObject.set(x, "beforeRendering", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDisplayBlock(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayBlock", value.asInstanceOf[js.Any])
      
      inline def setDisplayBlockUndefined: Self = StObject.set(x, "displayBlock", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setViewName(value: String | PropertyBindingInfo): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      
      inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
