package typings.openui5

import typings.openui5.anon.AddToDependents
import typings.openui5.anon.NameString
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMvcControllerMod {
  
  @JSImport("sap/ui/core/mvc/Controller", JSImport.Default)
  @js.native
  open class default protected () extends Controller {
    /**
      * Instantiates a (MVC-style) controller.
      */
    def this(/**
      * The name of the controller to instantiate. If a controller is defined as real sub-class, the "arguments"
      * of the sub-class constructor should be given instead.
      */
    sName: String) = this()
    def this(/**
      * The name of the controller to instantiate. If a controller is defined as real sub-class, the "arguments"
      * of the sub-class constructor should be given instead.
      */
    sName: js.Array[js.Object]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/mvc/Controller", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Creates an instance of controller class.
      *
      * @returns the Promise resolves with a new instance of the controller
      */
    inline def create(/**
      * A map containing the controller configuration options.
      */
    mOptions: NameString): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    /**
      * Creates a new subclass of class sap.ui.core.mvc.Controller with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, Controller]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Controller],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.mvc.Controller.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * @SINCE 1.34.0
      *
      * Registers a callback module, which provides code enhancements for the lifecycle and event handler functions
      * of a specific controller. The code enhancements are returned either in sync or async mode.
      *
      * The extension provider module provides the `getControllerExtensions` function which returns either directly
      * an array of objects or a Promise that returns an array of objects when it resolves. These objects are
      * object literals defining the methods and properties of the controller in a similar way as for {@link
      * sap.ui.core.mvc.Controller Controller} subclasses.
      *
      * **Example for a callback module definition (sync):**
      * ```javascript
      *
      * sap.ui.define("my/custom/sync/ExtensionProvider", [], function() {
      *   var ExtensionProvider = function() {};
      *   ExtensionProvider.prototype.getControllerExtensions = function(sControllerName, sComponentId, bAsync) {
      *     if (!bAsync && sControllerName == "my.own.Controller") {
      *       // IMPORTANT: only return extensions for a specific controller
      *       return [{
      *         onInit: function() {
      *           // Do something here...
      *         },
      *         onAfterRendering: function() {
      *           // Do something here...
      *         },
      *         onButtonClick: function(oEvent) {
      *           // Handle the button click event
      *         }
      *       }
      *     }];
      *   };
      *   return ExtensionProvider;
      * });
      * ```
      *
      *
      * **Example for a callback module definition (async):**
      * ```javascript
      *
      * sap.ui.define("my/custom/async/ExtensionProvider", [], function() {
      *   var ExtensionProvider = function() {};
      *   ExtensionProvider.prototype.getControllerExtensions = function(sControllerName, sComponentId, bAsync) {
      *     if (bAsync && sControllerName == "my.own.Controller") {
      *       // IMPORTANT:
      *       // only return a Promise for a specific controller since it
      *       // requires the View/Controller and its parents to run in async
      *       // mode!
      *       return new Promise(function(fnResolve, fnReject) {
      *         fnResolve([{
      *           onInit: function() {
      *             // Do something here...
      *           },
      *           onAfterRendering: function() {
      *             // Do something here...
      *           },
      *           onButtonClick: function(oEvent) {
      *             // Handle the button click event
      *           }
      *         }]);
      *       }
      *     };
      *   };
      *   return ExtensionProvider;
      * });
      * ```
      *
      *
      * The lifecycle functions `onInit`, `onExit`, `onBeforeRendering` and `onAfterRendering` are added before
      * or after the lifecycle functions of the original controller. The event handler functions, such as `onButtonClick`,
      * are replacing the original controller's function.
      *
      * When using an async extension provider, you need to ensure that the view is loaded in async mode.
      *
      * In both cases, return `undefined` if no controller extension shall be applied.
      */
    inline def registerExtensionProvider(
      /**
      * the module name of the extension provider
      *
      * See {@link sap.ui.core.mvc.Controller} for an overview of the available functions for controllers.
      */
    sExtensionProvider: String
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerExtensionProvider")(sExtensionProvider.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait Controller
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Returns an Element of the connected view with the given local ID.
      *
      * Views automatically prepend their own ID as a prefix to created Elements to make the IDs unique even
      * in the case of multiple view instances. This method helps to find an element by its local ID only.
      *
      * If no view is connected or if the view doesn't contain an element with the given local ID, `undefined`
      * is returned.
      *
      * @returns Element by its (view local) ID
      */
    def byId(/**
      * View-local ID
      */
    sId: String): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Converts a view local ID to a globally unique one by prepending the view ID.
      *
      * If no view is connected, `undefined` is returned.
      *
      * @returns Prefixed ID
      */
    def createId(/**
      * View-local ID
      */
    sId: String): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.23.0
      *
      * Gets the component of the controller's view
      *
      * If there is no Component connected to the view or the view is not connected to the controller, `undefined`
      * is returned.
      *
      * @returns Component instance
      */
    def getOwnerComponent(): js.UndefOr[typings.openui5.sapUiCoreComponentMod.default] = js.native
    
    /**
      * Returns the view associated with this controller or `undefined`.
      *
      * @returns View connected to this controller.
      */
    def getView(): js.UndefOr[typings.openui5.sapUiCoreMvcViewMod.default] = js.native
    
    /**
      * @SINCE 1.93
      *
      * Loads a Fragment by {@link sap.ui.core.Fragment.load}.
      *
      * The fragment content will be added to the `dependents` aggregation of the view by default. This behavior
      * can be suppressed by setting `mOptions.addToDependents` to false.
      *
      * The controller is passed to the Fragment by default, so the (event handler) methods referenced in the
      * Fragment will be called on this Controller.
      *
      * If the controller has an owner component, it is passed to the fragment content. By default the fragment
      * content will be prefixed with the view ID to avoid duplicate ID issues. The prefixing can be switched
      * off with the `autoPrefixId` option.
      *
      * When `autoPrefixId` is enabled, the fragment content can be accessed by calling {@link sap.ui.core.mvc.Controller.byId}.
      *
      * **Destroy behavior**: Different scenarios concerning the destruction of the fragment's content exist,
      * of which some must be addressed by the caller, while others are handled automatically.
      * 	 - The controller instance is destroyed before the fragment content creation has finished: In this case,
      * 			the controller instance takes care of asynchronously destroying the fragment content
      * 	 - The fragment content is aggregated within a control (e.g. `dependents` aggregation by default): In
      * 			this case, the content will be destroyed during the regular destroy lifecycle.
      * 	 - The fragment content is not aggregated within a control: In this case, ***it must be destroyed manually***
      * 			in the exit hook of the controller.
      *
      * @returns A Promise that resolves with the fragment content
      */
    def loadFragment(/**
      * Options regarding fragment loading
      */
    mOptions: AddToDependents): js.Promise[
        typings.openui5.sapUiCoreControlMod.default | js.Array[typings.openui5.sapUiCoreControlMod.default]
      ] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called every time the View is rendered, after the HTML is placed in the DOM-Tree. It can
      * be used to apply additional changes to the DOM after the Renderer has finished. (Even though this method
      * is declared as "abstract", it does not need to be defined in controllers, if the method does not exist,
      * it will simply not be called.)
      * See:
      * 	sap.ui.core.Control.prototype.onAfterRendering
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called every time the View is rendered, before the Renderer is called and the HTML is
      * placed in the DOM-Tree. It can be used to perform clean-up-tasks before re-rendering. (Even though this
      * method is declared as "abstract", it does not need to be defined in controllers, if the method does not
      * exist, it will simply not be called.)
      * See:
      * 	sap.ui.core.Control.prototype.onBeforeRendering
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called upon desctuction of the View. The controller should perform its internal destruction
      * in this hook. It is only called once per View instance, unlike the onBeforeRendering and onAfterRendering
      * hooks. (Even though this method is declared as "abstract", it does not need to be defined in controllers,
      * if the method does not exist, it will simply not be called.)
      */
    def onExit(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is called upon initialization of the View. The controller can perform its internal setup
      * in this hook. It is only called once per View instance, unlike the onBeforeRendering and onAfterRendering
      * hooks. (Even though this method is declared as "abstract", it does not need to be defined in controllers,
      * if the method does not exist, it will simply not be called.)
      *
      * **Note:** In component-based apps `this.getOwnerComponent().getModel()` should be used inside `onInit()`
      * to get a model assigned to the component instead of using `this.getView().getModel()`. The latter call
      * might return `undefined` because the view might not have been attached to a parent yet (i.e. the component),
      * and thus the view can't inherit a model from that parent. You could also attach to the `modelContextChange`
      * event. The event is fired when either the context or the model changes for the control.
      */
    def onInit(): Unit = js.native
  }
}
