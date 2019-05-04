package typings
package atPhosphorApplicationLib.atPhosphorApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/application", "Application")
@js.native
class Application[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] protected () extends js.Object {
  /**
    * Construct a new application.
    *
    * @param options - The options for creating the application.
    */
  def this(options: atPhosphorApplicationLib.atPhosphorApplicationMod.ApplicationNs.IOptions[T]) = this()
  var _delegate: js.Any = js.native
  var _pluginMap: js.Any = js.native
  var _serviceMap: js.Any = js.native
  var _started: js.Any = js.native
  /**
    * The application command registry.
    */
  val commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry = js.native
  /**
    * The application context menu.
    */
  val contextMenu: atPhosphorWidgetsLib.atPhosphorWidgetsMod.ContextMenu = js.native
  /**
    * The application shell widget.
    *
    * #### Notes
    * The shell widget is the root "container" widget for the entire
    * application. It will typically expose an API which allows the
    * application plugins to insert content in a variety of places.
    */
  val shell: T = js.native
  /**
    * A promise which resolves after the application has started.
    *
    * #### Notes
    * This promise will resolve after the `start()` method is called,
    * when all the bootstrapping and shell mounting work is complete.
    */
  val started: js.Promise[scala.Unit] = js.native
  /**
    * Activate the plugin with the given id.
    *
    * @param id - The ID of the plugin of interest.
    *
    * @returns A promise which resolves when the plugin is activated
    *   or rejects with an error if it cannot be activated.
    */
  def activatePlugin(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Add the application event listeners.
    *
    * #### Notes
    * The default implementation of this method adds listeners for
    * `'keydown'` and `'resize'` events.
    *
    * A subclass may reimplement this method as needed.
    */
  /* protected */ def addEventListeners(): scala.Unit = js.native
  /**
    * Attach the application shell to the DOM.
    *
    * @param id - The id of the host node for the shell, or `''`.
    *
    * #### Notes
    * If the id is not provided, the document body will be the host.
    *
    * A subclass may reimplement this method as needed.
    */
  /* protected */ def attachShell(id: java.lang.String): scala.Unit = js.native
  /**
    * A method invoked on a document `'contextmenu'` event.
    *
    * #### Notes
    * The default implementation of this method opens the application
    * `contextMenu` at the current mouse position.
    *
    * If the application context menu has no matching content *or* if
    * the shift key is pressed, the default browser context menu will
    * be opened instead.
    *
    * A subclass may reimplement this method as needed.
    */
  /* protected */ def evtContextMenu(event: stdLib.MouseEvent): scala.Unit = js.native
  /**
    * A method invoked on a document `'keydown'` event.
    *
    * #### Notes
    * The default implementation of this method invokes the key down
    * processing method of the application command registry.
    *
    * A subclass may reimplement this method as needed.
    */
  /* protected */ def evtKeydown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * A method invoked on a window `'resize'` event.
    *
    * #### Notes
    * The default implementation of this method updates the shell.
    *
    * A subclass may reimplement this method as needed.
    */
  /* protected */ def evtResize(event: stdLib.Event): scala.Unit = js.native
  /**
    * Handle the DOM events for the application.
    *
    * @param event - The DOM event sent to the application.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events registered for the application. It
    * should not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Test whether a plugin is registered with the application.
    *
    * @param id - The id of the plugin of interest.
    *
    * @returns `true` if the plugin is registered, `false` otherwise.
    */
  def hasPlugin(id: java.lang.String): scala.Boolean = js.native
  /**
    * List the IDs of the plugins registered with the application.
    *
    * @returns A new array of the registered plugin IDs.
    */
  def listPlugins(): js.Array[java.lang.String] = js.native
  /**
    * Register a plugin with the application.
    *
    * @param plugin - The plugin to register.
    *
    * #### Notes
    * An error will be thrown if a plugin with the same id is already
    * registered, or if the plugin has a circular dependency.
    *
    * If the plugin provides a service which has already been provided
    * by another plugin, the new service will override the old service.
    */
  def registerPlugin(plugin: IPlugin[this.type, _]): scala.Unit = js.native
  /**
    * Register multiple plugins with the application.
    *
    * @param plugins - The plugins to register.
    *
    * #### Notes
    * This calls `registerPlugin()` for each of the given plugins.
    */
  def registerPlugins(plugins: js.Array[IPlugin[this.type, _]]): scala.Unit = js.native
  /**
    * Resolve an optional service of a given type.
    *
    * @param token - The token for the service type of interest.
    *
    * @returns A promise which resolves to an instance of the requested
    *   service, or `null` if it cannot be resolved.
    *
    * #### Notes
    * Services are singletons. The same instance will be returned each
    * time a given service token is resolved.
    *
    * If the plugin which provides the service has not been activated,
    * resolving the service will automatically activate the plugin.
    *
    * User code will not typically call this method directly. Instead,
    * the optional services for the user's plugins will be resolved
    * automatically when the plugin is activated.
    */
  def resolveOptionalService[U](token: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[U]): js.Promise[U | scala.Null] = js.native
  /**
    * Resolve a required service of a given type.
    *
    * @param token - The token for the service type of interest.
    *
    * @returns A promise which resolves to an instance of the requested
    *   service, or rejects with an error if it cannot be resolved.
    *
    * #### Notes
    * Services are singletons. The same instance will be returned each
    * time a given service token is resolved.
    *
    * If the plugin which provides the service has not been activated,
    * resolving the service will automatically activate the plugin.
    *
    * User code will not typically call this method directly. Instead,
    * the required services for the user's plugins will be resolved
    * automatically when the plugin is activated.
    */
  def resolveRequiredService[U](token: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[U]): js.Promise[U] = js.native
  /**
    * Start the application.
    *
    * @param options - The options for starting the application.
    *
    * @returns A promise which resolves when all bootstrapping work
    *   is complete and the shell is mounted to the DOM.
    *
    * #### Notes
    * This should be called once by the application creator after all
    * initial plugins have been registered.
    *
    * If a plugin fails to the load, the error will be logged and the
    * other valid plugins will continue to be loaded.
    *
    * Bootstrapping the application consists of the following steps:
    * 1. Activate the startup plugins
    * 2. Wait for those plugins to activate
    * 3. Attach the shell widget to the DOM
    * 4. Add the application event listeners
    */
  def start(): js.Promise[scala.Unit] = js.native
  def start(options: atPhosphorApplicationLib.atPhosphorApplicationMod.ApplicationNs.IStartOptions): js.Promise[scala.Unit] = js.native
}

