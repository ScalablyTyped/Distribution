package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.mvc.Controller")
@js.native
class Controller protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
             * Instantiates a (MVC-style) controller. Consumers should call the constructor only in thetyped
             * controller scenario. In the generic controller use case, they should use{@link sap.ui.controller}
             * instead.
             * @param sName The name of the controller to instantiate. If a controller is defined as real
             * sub-class,                                  the "arguments" of the sub-class constructor should be
             * given instead.
            */
  def this(sName: java.lang.String) = this()
  /**
             * Instantiates a (MVC-style) controller. Consumers should call the constructor only in thetyped
             * controller scenario. In the generic controller use case, they should use{@link sap.ui.controller}
             * instead.
             * @param sName The name of the controller to instantiate. If a controller is defined as real
             * sub-class,                                  the "arguments" of the sub-class constructor should be
             * given instead.
            */
  def this(sName: js.Array[_]) = this()
  /**
             * Returns an Element of the connected view with the given local ID.Views automatically prepend their
             * own ID as a prefix to created Elementsto make the IDs unique even in the case of multiple view
             * instances.This method helps to find an element by its local ID only.If no view is connected or if
             * the view doesn't contain an element withthe given local ID, undefined is returned.
             * @param sId View-local ID
             * @returns Element by its (view local) ID
            */
  def byId(sId: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Converts a view local ID to a globally unique one by prependingthe view ID.If no view is connected,
             * undefined is returned.
             * @param sId View-local ID
             * @returns Prefixed ID
            */
  def createId(sId: java.lang.String): java.lang.String = js.native
  /**
             * Gets the component of the controller's viewIf there is no Component connected to the view or the
             * view is not connected to the controller,undefined is returned.
             * @since 1.23.0
             * @returns Component instance
            */
  def getOwnerComponent(): openui5Lib.sapNs.uiNs.coreNs.Component = js.native
  /**
             * Returns the view associated with this controller or undefined.
             * @returns View connected to this controller.
            */
  def getView(): View = js.native
  /**
             * This method is called every time the View is rendered, after the HTML is placed in the DOM-Tree. It
             * can beused to apply additional changes to the DOM after the Renderer has finished.(Even though this
             * method is declared as "abstract", it does not need to be defined in controllers, if themethod does
             * not exist, it will simply not be called.)
            */
  def onAfterRendering(): scala.Unit = js.native
  /**
             * This method is called every time the View is rendered, before the Renderer is called and the HTML is
             * placed inthe DOM-Tree. It can be used to perform clean-up-tasks before re-rendering.(Even though
             * this method is declared as "abstract", it does not need to be defined in controllers, if themethod
             * does not exist, it will simply not be called.)
            */
  def onBeforeRendering(): scala.Unit = js.native
  /**
             * This method is called upon desctuction of the View. The controller should perform its internal
             * destruction inthis hook. It is only called once per View instance, unlike the onBeforeRendering and
             * onAfterRenderinghooks.(Even though this method is declared as "abstract", it does not need to be
             * defined in controllers, if themethod does not exist, it will simply not be called.)
            */
  def onExit(): scala.Unit = js.native
  /**
             * This method is called upon initialization of the View. The controller can perform its internal setup
             * inthis hook. It is only called once per View instance, unlike the onBeforeRendering and
             * onAfterRenderinghooks.(Even though this method is declared as "abstract", it does not need to be
             * defined in controllers, if themethod does not exist, it will simply not be called.)
            */
  def onInit(): scala.Unit = js.native
  /**
             * Registers a callback module, which provides code enhancements for thelifecycle and event handler
             * functions of a specific controller. The codeenhancements are returned either in sync or async
             * mode.The extension provider module provides the <code>getControllerExtensions</code> functionwhich
             * returns either directly an array of objects or a Promise that returns an arrayof objects when it
             * resolves. These objects are object literals defining themethods and properties of the controller in
             * a similar way as {@link sap.ui.controller}.<b>Example for a callback module definition
             * (sync):</b><pre>sap.ui.define("my/custom/sync/ExtensionProvider", ['jquery.sap.global'],
             * function(jQuery) {  var ExtensionProvider = function() {}; 
             * ExtensionProvider.prototype.getControllerExtensions = function(sControllerName, sComponentId,
             * bAsync) {    if (!bAsync && sControllerName == "my.own.Controller") {      // IMPORTANT: only return
             * extensions for a specific controller      return [{        onInit: function() {          // Do
             * something here...        },        onAfterRendering: function() {          // Do something here...  
             *      },        onButtonClick: function(oEvent) {          // Handle the button click event        } 
             *     }    }];  };  return ExtensionProvider;}, true);</pre><b>Example for a callback module
             * definition (async):</b><pre>sap.ui.define("my/custom/async/ExtensionProvider",
             * ['jquery.sap.global'], function(jQuery) {  var ExtensionProvider = function() {}; 
             * ExtensionProvider.prototype.getControllerExtensions = function(sControllerName, sComponentId,
             * bAsync) {    if (bAsync && sControllerName == "my.own.Controller") {      // IMPORTANT:      // only
             * return a Promise for a specific controller since it      // requires the View/Controller and its
             * parents to run in async      // mode!      return new Promise(function(fnResolve, fnReject) {       
             * fnResolve([{          onInit: function() {            // Do something here...          },         
             * onAfterRendering: function() {            // Do something here...          },         
             * onButtonClick: function(oEvent) {            // Handle the button click event          }        }]);
             *      }    };  };  return ExtensionProvider;}, true);</pre>The lifecycle functions
             * <code>onInit</code>, <code>onExit</code>,<code>onBeforeRendering</code> and
             * <code>onAfterRendering</code>are added before or after the lifecycle functions of the
             * originalcontroller. The event handler functions, such as <code>onButtonClick</code>,are replacing
             * the original controller's function.When using an async extension provider you need to ensure that
             * theview is loaded in async mode.In both cases, return <code>undefined</code> if no controller
             * extension shall be applied.
             * @since 1.34.0
             * @param sExtensionProvider the module name of the extension provider
            */
  def registerExtensionProvider(sExtensionProvider: java.lang.String): scala.Unit = js.native
}

