package typings.openui5.sapNs.uiNs.coreNs.routingNs

import typings.openui5.sapNs.uiNs.baseNs.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing.Targets")
@js.native
class Targets protected () extends EventProvider {
  /**
    * Provides a convenient way for placing views into the correct containers of your application.The main
    * benefit of Targets is lazy loading: you do not have to create the views until you really need
    * them.If you are using the mobile library, please use {@link sap.m.routing.Targets} instead of this
    * class.
    * @param oOptions undefined
    */
  def this(oOptions: js.Any) = this()
  /**
    * Creates a target by using the given name and options. If there's already a target with the same name
    * exists, the existing target is kept from being overwritten and an error log will be written to the
    * development console.
    * @param sName the name of a target
    * @param oTarget the options of a target. The option names are the same as the ones in
    * "oOptions.targets.anyName" of {@link constructor}.
    * @returns Targets itself for method chaining
    */
  def addTarget(sName: String, oTarget: js.Any): Targets = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'display' event of this
    * <code>sap.ui.core.routing.Targets</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on
    * theoListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachDisplay(oData: js.Any, fnFunction: js.Any): Targets = js.native
  def attachDisplay(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Targets = js.native
  /**
    * Destroys the targets instance and all created targets. Does not destroy the views instance passed to
    * the constructor. It has to be destroyed separately.
    * @returns this for chaining.
    */
  def destroy(): Targets = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'display' event of this
    * <code>sap.ui.core.routing.Targets</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachDisplay(fnFunction: js.Any, oListener: js.Any): Targets = js.native
  /**
    * Creates a view and puts it in an aggregation of the specified control.
    * @param vTargets the key of the target as specified in the {@link #constructor}. To display multiple
    * targets you may also pass an array of keys.
    * @param vData an object that will be passed to the display event in the data property. If the target
    * has parents, the data will also be passed to them.
    * @returns this pointer for chaining
    */
  def display(vTargets: String): Targets = js.native
  def display(vTargets: String, vData: js.Any): Targets = js.native
  def display(vTargets: js.Array[String]): Targets = js.native
  def display(vTargets: js.Array[String], vData: js.Any): Targets = js.native
  /**
    * Fire event created to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireDisplay(mArguments: js.Any): Targets = js.native
  /**
    * Returns a target by its name (if you pass myTarget: { view: "myView" }) in the config myTarget is
    * the name.
    * @param vName the name of a single target or the name of multiple targets
    * @returns The target with the coresponding name or undefined. If an array way passed as name this
    * will return an array with all found targets. Non existing targets will not be returned but will log
    * an error.
    */
  def getTarget(vName: String): Target | js.Any | js.Array[Target] = js.native
  def getTarget(vName: js.Array[String]): Target | js.Any | js.Array[Target] = js.native
  /**
    * Returns the views instance passed to the constructor
    * @returns the views instance
    */
  def getViews(): Views = js.native
}

