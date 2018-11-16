package typings
package openui5Lib.sapNs.uiNs.coreNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing.Target")
@js.native
class Target protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
             * Provides a convenient way for placing views into the correct containers of your application.<br/>The
             * main benefit of Targets is lazy loading: you do not have to create the views until you really need
             * them.<br/><b>Don't call this constructor directly</b>, use {@link sap.ui.core.routing.Targets}
             * instead, it will create instances of a Target.<br/>If you are using the mobile library, please use
             * the {@link sap.m.routing.Targets} constructor, please read the documentation there.<br/>
             * @param oOptions all of the parameters defined in {@link sap.m.routing.Targets#constructor} are
             * accepted here, except for children you need to specify the parent.
             * @param oViews All views required by this target will get created by the views instance using {@link
             * sap.ui.core.routing.Views#getView}
             * @param oParent the parent of this target. Will also get displayed, if you display this target. In
             * the config you have the fill the children property {@link sap.m.routing.Targets#constructor}
            */
  def this(oOptions: js.Any, oViews: Views) = this()
  /**
             * Provides a convenient way for placing views into the correct containers of your application.<br/>The
             * main benefit of Targets is lazy loading: you do not have to create the views until you really need
             * them.<br/><b>Don't call this constructor directly</b>, use {@link sap.ui.core.routing.Targets}
             * instead, it will create instances of a Target.<br/>If you are using the mobile library, please use
             * the {@link sap.m.routing.Targets} constructor, please read the documentation there.<br/>
             * @param oOptions all of the parameters defined in {@link sap.m.routing.Targets#constructor} are
             * accepted here, except for children you need to specify the parent.
             * @param oViews All views required by this target will get created by the views instance using {@link
             * sap.ui.core.routing.Views#getView}
             * @param oParent the parent of this target. Will also get displayed, if you display this target. In
             * the config you have the fill the children property {@link sap.m.routing.Targets#constructor}
            */
  def this(oOptions: js.Any, oViews: Views, oParent: Target) = this()
  /**
             * Attach event-handler <code>fnFunction</code> to the 'display' event of this
             * <code>sap.ui.core.routing.Target</code>.<br/>
             * @param oData The object, that should be passed along with the event-object when firing the event.
             * @param fnFunction The function to call, when the event occurs. This function will be called on
             * theoListener-instance (if present) or in a 'static way'.
             * @param oListener Object on which to call the given function.
             * @returns <code>this</code> to allow method chaining
            */
  def attachDisplay(oData: js.Any, fnFunction: js.Any): Target = js.native
  /**
             * Attach event-handler <code>fnFunction</code> to the 'display' event of this
             * <code>sap.ui.core.routing.Target</code>.<br/>
             * @param oData The object, that should be passed along with the event-object when firing the event.
             * @param fnFunction The function to call, when the event occurs. This function will be called on
             * theoListener-instance (if present) or in a 'static way'.
             * @param oListener Object on which to call the given function.
             * @returns <code>this</code> to allow method chaining
            */
  def attachDisplay(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Target = js.native
  /**
             * Destroys the target, will be called by {@link sap.m.routing.Targets} don't call this directly.
             * @returns this for chaining.
            */
  def destroy(): Target = js.native
  /**
             * Detach event-handler <code>fnFunction</code> from the 'display' event of this
             * <code>sap.ui.core.routing.Target</code>.<br/>The passed function and listener object must match the
             * ones previously used for event registration.
             * @param fnFunction The function to call, when the event occurs.
             * @param oListener Object on which the given function had to be called.
             * @returns <code>this</code> to allow method chaining
            */
  def detachDisplay(fnFunction: js.Any, oListener: js.Any): Target = js.native
  /**
             * Creates a view and puts it in an aggregation of a control that has been defined in the {@link
             * sap.ui.core.routing.Target#constructor}.
             * @param vData an object that will be passed to the display event in the data property. If the target
             * has parents, the data will also be passed to them.
             * @returns resolves with {name: *, view: *, control: *} if the target can be successfully displayed
             * otherwise it resolves with {name: *, error: *}
            */
  def display(vData: js.Any): jqueryLib.JQueryPromise[_] = js.native
  /**
             * Fire event created to attached listeners.
             * @param mArguments the arguments to pass along with the event.
             * @returns <code>this</code> to allow method chaining
            */
  def fireDisplay(mArguments: js.Any): Target = js.native
}

