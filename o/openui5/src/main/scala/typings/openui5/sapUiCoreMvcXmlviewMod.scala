package typings.openui5

import typings.openui5.anon.Cache
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreMvcViewMod.Preprocessor.ViewInfo
import typings.openui5.sapUiCoreMvcViewMod.ViewSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcXmlviewMod {
  
  @JSImport("sap/ui/core/mvc/XMLView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `XMLView`.
    *
    * **Note:** Application code shouldn't call the constructor directly, but rather use the factory {@link sap.ui.core.mvc.XMLView.create XMLView.create }
    * or {@link sap.ui.core.mvc.View.create View.create} with type {@link sap.ui.core.mvc.ViewType.XML XML}.
    * The factory provides more features than the constructor (e.g. caching and preprocessing) and simplifies
    * asynchronous loading of a view. Future features might only be available when using the factory.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.core.mvc.View#constructor sap.ui.core.mvc.View }
    * can be used.
    */
  open class default ()
    extends typings.openui5.sapUiCoreMvcViewMod.default {
    def this(/**
      * Initial settings for the new view
      */
    mSettings: XMLViewSettings) = this()
    def this(/**
      * ID for the new view, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new view, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new view
      */
    mSettings: XMLViewSettings
    ) = this()
    def this(
      /**
      * ID for the new view, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new view
      */
    mSettings: XMLViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/mvc/XMLView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @since 1.34
      *
      * Specifies the available preprocessor types for XMLViews
      * See:
      * 	sap.ui.core.mvc.XMLView
      * 	sap.ui.core.mvc.View.Preprocessor
      */
    @JSImport("sap/ui/core/mvc/XMLView", "default.PreprocessorType")
    @js.native
    def PreprocessorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PreprocessorType */ Any = js.native
    inline def PreprocessorType_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PreprocessorType */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreprocessorType")(x.asInstanceOf[js.Any])
    
    /**
      * @since 1.30
      *
      * Flag for feature detection of asynchronous loading/rendering
      */
    @JSImport("sap/ui/core/mvc/XMLView", "default.asyncSupport")
    @js.native
    def asyncSupport: Boolean = js.native
    inline def asyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncSupport")(x.asInstanceOf[js.Any])
    
    /**
      * @since 1.56.0
      *
      * Instantiates an XMLView from the given configuration options.
      *
      * If a `viewName` is given, it must be a dot-separated name of an XML view resource (without the mandatory
      * suffix ".view.xml"). The resource will be loaded asynchronously via the module system (preload caches
      * might apply) and will be parsed as XML. Alternatively, an already loaded view `definition` can be provided,
      * either as XML string or as an already parsed XML document. Exactly one of `viewName` or `definition`
      * must be given, if none or both are given, an error will be reported.
      *
      * The `controller` property is optional and can hold a controller instance. When given, it overrides the
      * controller class defined in the view definition.
      *
      * **Note**: On root level, you can only define content for the default aggregation, e.g. without adding
      * the `<content>` tag. If you want to specify content for another aggregation of a view like `dependents`,
      * place it in a child control's `dependents` aggregation or add it by using {@link sap.ui.core.mvc.XMLView#addDependent}.
      *
      * **Note**: If you enable caching, you need to take care of the invalidation via keys. Automatic invalidation
      * takes only place if the UI5 version or the component descriptor (manifest.json) change. This is still
      * an experimental feature and may experience slight changes of the invalidation parameters or the cache
      * key format.
      *
      * @returns A Promise that resolves with the view instance or rejects with any thrown error.
      */
    inline def create(/**
      * An object containing the view configuration options.
      */
    oOptions: Cache): js.Promise[XMLView] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(oOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[XMLView]]
    
    /**
      * Creates a new subclass of class sap.ui.core.mvc.XMLView with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.mvc.View.extend}.
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
    oClassInfo: ClassInfo[T, XMLView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, XMLView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.mvc.XMLView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * @since 1.30
      *
      * Register a preprocessor for all views of a specific type.
      *
      * The preprocessor can be registered for several stages of view initialization, for xml views these are
      * either the plain "xml" or the already initialized "controls" , see {@link sap.ui.core.mvc.XMLView.PreprocessorType}.
      * For each type one preprocessor is executed. If there is a preprocessor passed to or activated at the
      * view instance already, that one is used. When several preprocessors are registered for one hook, it has
      * to be made sure, that they do not conflict when being processed serially.
      *
      * It can be either a module name as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor }
      * or a function with a signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.
      *
      * **Note**: Preprocessors work only in async views and will be ignored when the view is instantiated in
      * sync mode by default, as this could have unexpected side effects. You may override this behaviour by
      * setting the bSyncSupport flag to true.
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
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @since 1.30
      *
      * Register a preprocessor for all views of a specific type.
      *
      * The preprocessor can be registered for several stages of view initialization, for xml views these are
      * either the plain "xml" or the already initialized "controls" , see {@link sap.ui.core.mvc.XMLView.PreprocessorType}.
      * For each type one preprocessor is executed. If there is a preprocessor passed to or activated at the
      * view instance already, that one is used. When several preprocessors are registered for one hook, it has
      * to be made sure, that they do not conflict when being processed serially.
      *
      * It can be either a module name as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor }
      * or a function with a signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.
      *
      * **Note**: Preprocessors work only in async views and will be ignored when the view is instantiated in
      * sync mode by default, as this could have unexpected side effects. You may override this behaviour by
      * setting the bSyncSupport flag to true.
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
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
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
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: String,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
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
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: String,
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerPreprocessor(
      /**
      * the type of content to be processed
      */
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
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
    sType: PreprocessorType,
      /**
      * module path of the preprocessor implementation or a preprocessor function
      */
    vPreprocessor: js.Function3[/* p1 */ js.Object, /* p2 */ ViewInfo, /* p3 */ js.Object, Unit],
      /**
      * Since 1.89, added for signature compatibility with {@link sap.ui.core.mvc.View#registerPreprocessor View#registerPreprocessor}.
      * Only supported value is "XML".
      */
    sViewType: String,
      /**
      * declares if the vPreprocessor ensures safe sync processing. This means the preprocessor will be executed
      * also for sync views. Please be aware that any kind of async processing (like Promises, XHR, etc) may
      * break the view initialization and lead to unexpected results.
      */
    bSyncSupport: Boolean,
      /**
      * ondemand preprocessor which enables developers to quickly activate the preprocessor for a view, by setting
      * `preprocessors : { xml }`, for example.
      */
    bOnDemand: Unit,
      /**
      * optional configuration for preprocessor
      */
    mSettings: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreprocessor")(sType.asInstanceOf[js.Any], vPreprocessor.asInstanceOf[js.Any], sViewType.asInstanceOf[js.Any], bSyncSupport.asInstanceOf[js.Any], bOnDemand.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait PreprocessorType extends StObject
  /**
    * @since 1.34
    *
    * Specifies the available preprocessor types for XMLViews
    * See:
    * 	sap.ui.core.mvc.XMLView
    * 	sap.ui.core.mvc.View.Preprocessor
    */
  @JSImport("sap/ui/core/mvc/XMLView", "PreprocessorType")
  @js.native
  object PreprocessorType extends StObject {
    
    /**
      * This preprocessor receives the control tree produced through the view source
      */
    @js.native
    sealed trait CONTROLS
      extends StObject
         with PreprocessorType
    
    /**
      * This preprocessor receives a valid xml source for View creation without any template tags but with control
      * declarations. These include their full IDs by which they can also be queried during runtime.
      */
    @js.native
    sealed trait VIEWXML
      extends StObject
         with PreprocessorType
    
    /**
      * This preprocessor receives the plain xml source of the view and should also return a valid xml ready
      * for view creation
      */
    @js.native
    sealed trait XML
      extends StObject
         with PreprocessorType
  }
  
  type XMLView = typings.openui5.sapUiCoreMvcViewMod.default
  
  type XMLViewSettings = ViewSettings
}
