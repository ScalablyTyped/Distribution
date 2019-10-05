package typings.openui5.sap.ui.core

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.ManagedObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Component")
@js.native
abstract class Component protected () extends ManagedObject {
  /**
    * Creates and initializes a new Component with the given <code>sId</code> andsettings.The set of
    * allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
    * described there. See {@link sap.ui.core.Component}for a general description of this argument.Accepts
    * an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
    * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
    * general description of the syntax of the settings object.This class does not have its own settings,
    * but all settings applicable to the base type{@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    * @param sId Optional ID for the new control; generated automatically if           no non-empty ID is
    * given. Note: this can be omitted, no matter           whether <code>mSettings</code> are given or
    * not!
    * @param mSettings Optional map or JSON-object with initial settings for the           new Component
    * instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Cleans up the Component instance before destruction.Applications must not call this hook method
    * directly, it is called by theframework when the element is {@link #destroy destroyed}.Subclasses of
    * Component should override this hook to implement any necessarycleanup.
    */
  def exit(): Unit = js.native
  /**
    * Returns user specific data object
    * @since 1.15.0
    * @returns componentData
    */
  def getComponentData(): js.Any = js.native
  /**
    * Returns the event bus of this component.
    * @since 1.20.0
    * @returns the event bus
    */
  def getEventBus(): EventBus = js.native
  /**
    * Returns the manifest defined in the metadata of the component.If not specified, the return value is
    * null.
    * @since 1.33.0
    * @returns manifest.
    */
  def getManifest(): js.Any = js.native
  /**
    * Returns the configuration of a manifest section or the value for aspecific path. If no section or
    * key is specified, the return value is null.Example:<code>  {    "sap.ui5": {      "dependencies": { 
    *       "libs": {          "sap.m": {}        },        "components": {          "my.component.a": {} 
    *       }      }  });</code>The configuration above can be accessed in the following
    * ways:<ul><li><b>By section/namespace</b>:
    * <code>oComponent.getManifestEntry("sap.ui5")</code></li><li><b>By path</b>:
    * <code>oComponent.getManifestEntry("/sap.ui5/dependencies/libs")</code></li></ul>By section/namespace
    * returns the configuration for the specified manifestsection and by path allows to specify a concrete
    * path to a dedicated entryinside the manifest. The path syntax always starts with a slash (/).
    * @since 1.33.0
    * @param sKey Either the manifest section name (namespace) or a concrete path
    * @returns Value of the manifest section or the key (could be any kind of value)
    */
  def getManifestEntry(sKey: String): js.Any = js.native
  /**
    * Returns the manifest object.
    * @since 1.33.0
    * @returns manifest.
    */
  def getManifestObject(): Manifest = js.native
  /**
    * Returns the Component instance in whose "context" the given ManagedObject has been createdor
    * <code>undefined</code>.This is a convenience wrapper around {@link
    * sap.ui.core.Component.getOwnerIdFor Component.getOwnerIdFor}.If the owner ID cannot be determined
    * for reasons documented on <code>getOwnerForId</code>or when the Component for the determined ID no
    * longer exists, <code>undefined</code>will be returned.
    * @since 1.25.1
    * @param oObject Object to retrieve the owner Component for
    * @returns the owner Component or <code>undefined</code>.
    */
  def getOwnerComponentFor(oObject: ManagedObject): Component = js.native
  /**
    * Returns the ID of the object in whose "context" the given ManagedObject has been created.For objects
    * that are not ManagedObjects or for which the owner is unknown,<code>undefined</code> will be
    * returned as owner ID.<strong>Note</strong>: Ownership for objects is only checked by the framework
    * at the timewhen they are created. It is not checked or updated afterwards. And it can only be
    * detectedwhile the {@link sap.ui.core.Component.runAsOwner Component.runAsOwner} function is
    * executing.Without further action, this is only the case while the content of an UIComponent is{@link
    * sap.ui.core.UIComponent.createContent constructed} or when a{@link sap.ui.core.routing.Router
    * Router} creates a new View and its content.<strong>Note</strong>: This method does not guarantee
    * that the returned owner ID belongsto a Component. Currently, it always does. But future versions of
    * UI5 might introduce amore fine grained ownership concept, e.g. taking Views into account. Callers
    * thatwant to deal only with components as owners, should use the following method:{@link
    * sap.ui.core.Component.getOwnerComponentFor Component.getOwnerComponentFor}.It guarantees that the
    * returned object (if any) will be a Component.<strong>Further note</strong> that only the ID of the
    * owner is recorded. In rare cases,when the lifecycle of a ManagedObject is not bound to the lifecycle
    * of its owner,(e.g. by the means of aggregations), then the owner might have been destroyed
    * alreadywhereas the ManagedObject is still alive. So even the existence of an owner ID isnot a
    * guarantee for the existence of the corresponding owner.
    * @since 1.15.1
    * @param oObject Object to retrieve the owner ID for
    * @returns ID of the owner or <code>undefined</code>
    */
  def getOwnerIdFor(oObject: ManagedObject): String = js.native
  /**
    * Returns a service interface for the {@link sap.ui.core.service.Service Service}declared in the
    * descriptor for components (manifest.json). The declaration needsto be done in the
    * <code>sap.ui5/services</code> section as follows:<pre>{  [...]  "sap.ui5": {    "services": {     
    * "myLocalServiceAlias": {        "factoryName": "my.ServiceFactory",        ["optional": true]      }
    *    }  }  [...]}</pre>The service declaration is used to define a mapping between the localalias for
    * the service that can be used in the Component and the name ofthe service factory which will be used
    * to create a service instance.The <code>getService</code> function will look up the service factory
    * and willcreate a new instance by using the service factory function{@link
    * sap.ui.core.service.ServiceFactory#createInstance createInstance}The optional property defines that
    * the service is not mandatory and theusage will not depend on the availability of this service. When
    * requestingan optional service the <code>getService</code> function will reject butthere will be no
    * error logged in the console.When creating a new instance of the service the Component context will
    * bepassed as <code>oServiceContext</code> as follows:<pre>{  "scopeObject": this,     // the
    * Component instance  "scopeType": "component" // the stereotype of the scopeObject}</pre>The service
    * will be created only once per Component and reused in futurecalls to the <code>getService</code>
    * function.<p>This function will return a <code>Promise</code> which provides the serviceinterface
    * when resolved. If the <code>factoryName</code> could notbe found in the {@link
    * sap.ui.core.service.ServiceFactoryRegistry Service Factory Registry}or the service declaration in
    * the descriptor for components (manifest.json)is missing the Promise will reject.This is an example
    * of how the <code>getService</code> function can be
    * used:<pre>oComponent.getService("myLocalServiceAlias").then(function(oService) { 
    * oService.doSomething();}).catch(function(oError) {  jQuery.sap.log.error(oError);});</pre>
    * @since 1.37.0
    * @param sLocalServiceAlias Local service alias as defined in the manifest.json
    * @returns Promise which will be resolved with the Service interface
    */
  def getService(sLocalServiceAlias: String): JQueryPromise[_] = js.native
  /**
    * Initializes the Component instance after creation.Applications must not call this hook method
    * directly, it is called by theframework while the constructor of an Component is executed.Subclasses
    * of Component should override this hook to implement any necessaryinitialization.
    */
  def init(): Unit = js.native
  /**
    * The hook which gets called when the static configuration of the componenthas been changed by some
    * configuration extension.
    * @since 1.15.1
    * @param sConfigKey Error message.
    */
  def onConfigChange(sConfigKey: String): Unit = js.native
  /**
    * The window before unload hook. Override this method in your Component classimplementation, to handle
    * cleanup before the real unload or to prompt a questionto the user, if the component should be
    * exited.
    * @since 1.15.1
    * @returns a string if a prompt should be displayed to the user                 confirming closing the
    * Component (e.g. when the Component is not yet saved).
    */
  def onWindowBeforeUnload(): String = js.native
  /**
    * The window error hook. Override this method in your Component class implementationto listen to
    * unhandled errors.
    * @since 1.15.1
    * @param sMessage The error message.
    * @param sFile File where the error occurred
    * @param iLine Line number of the error
    */
  def onWindowError(sMessage: String, sFile: String, iLine: Double): Unit = js.native
  /**
    * The window unload hook. Override this method in your Component classimplementation, to handle
    * cleanup of the component once the windowwill be unloaded (e.g. closed).
    * @since 1.15.1
    */
  def onWindowUnload(): Unit = js.native
  /**
    * Calls the function <code>fn</code> once and marks all ManagedObjectscreated during that call as
    * "owned" by this Component.Nested calls of this method are supported (e.g. inside a newly
    * created,nested component). The currently active owner Component will be rememberedbefore executing
    * <code>fn</code> and restored afterwards.
    * @since 1.25.1
    * @param fn Function to execute
    * @returns result of function <code>fn</code>
    */
  def runAsOwner(fn: js.Any): js.Any = js.native
}

