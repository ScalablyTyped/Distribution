package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectionDetailsFacadeMod {
  
  @JSImport("sap/m/SelectionDetailsFacade", JSImport.Default)
  @js.native
  /**
    * Describes the public facade of the {@link sap.m.SelectionDetails} control.
    */
  open class default ()
    extends StObject
       with SelectionDetailsFacade
  
  @js.native
  trait SelectionDetailsFacade extends StObject {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some actionGroup to the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionGroup(
      /**
      * The actionGroup to add; if empty, nothing is inserted
      */
    oActionGroup: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionPress actionPress} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered when a custom action is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachActionPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionPress actionPress} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered when a custom action is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionPress(
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
    def attachActionPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered before the popover is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered before the popover is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
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
    def attachBeforeClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered before the popover is open.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered before the popover is open.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
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
    def attachBeforeOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered after a list item of {@link sap.m.SelectionDetailsItem} is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.SelectionDetails`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectionDetails` itself.
      *
      * Event is triggered after a list item of {@link sap.m.SelectionDetailsItem} is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
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
    def attachNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectionDetails` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes SelectionDetails if open.
      *
      * @returns To ensure method chaining, return the SelectionDetails.
      */
    def close(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:actionPress actionPress} event of this `sap.m.SelectionDetails`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActionPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachActionPress(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.SelectionDetails`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.SelectionDetails`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.m.SelectionDetails`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigate(
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
      * Returns `true` if the labels of the {@link sap.m.SelectionDetailsItemLine} elements are wrapped, `false`
      * otherwise.
      *
      * @returns True if the labels of the {@link sap.m.SelectionDetailsItemLine} elements are wrapped, false
      * otherwise.
      */
    def getWrapLabels(): Boolean = js.native
    
    /**
      * Returns true if the SelectionDetails is enabled, otherwise false.
      *
      * @returns True if the SelectionDetails contains items, otherwise false.
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Returns true if the SelectionDetails is open, otherwise false.
      *
      * @returns True if the SelectionDetails is open, otherwise false.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Wraps the given content in {@link sap.m.Page page}, adds it to existing {@link sap.m.NavContainer NavContainer}
      * and navigates to this newly created page. Has no effect if the SelectionDetails is closed. Lazily processes
      * dependencies for the navigation event.
      *
      * @returns To ensure method chaining, return the SelectionDetails.
      */
    def navTo(
      /**
      * The title property of the {@link sap.m.Page page} control to which the navigation should occur.
      */
    title: String,
      /**
      * The content of the control to which the navigation should occur.
      */
    content: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeActionGroup(/**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a actionGroup from the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns The removed actionGroup or `null`
      */
    def removeActionGroup(/**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeActionGroup(
      /**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActionGroups actionGroups}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActionGroups(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Enables line wrapping for the labels of the of the {@link sap.m.SelectionDetailsItemLine} elements.
      *
      * @returns To ensure method chaining, returns SelectionDetails.
      */
    def setWrapLabels(
      /**
      * True to apply wrapping to the labels of the {@link sap.m.SelectionDetailsItemLine} elements.
      */
    bWrap: Boolean
    ): this.type = js.native
  }
}
