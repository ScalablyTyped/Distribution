package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreCommandExecutionMod {
  
  @JSImport("sap/ui/core/CommandExecution", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new CommandExecution.
    *
    * The CommandExecution registers a shortcut when it is added to the dependent aggregation of a control.
    * The shortcut information is retrieved from the owner components manifest (`/sap.ui5/commands/<command>`).
    *
    * You can use a CommandExecution instead of an event handler in XMLViews by using `cmd:` plus the command
    * name.
    *
    * Example for `sap.m.Button`:
    *
    *
    * ```javascript
    *
    * <Button press="cmd:MyCommand" />
    * ```
    *
    *
    * When the press event is fired, the CommandExecution will be triggered and the `execute` event is fired.
    *
    * When using commands, the component will create a model named `$cmd`. The model data provides the enabled
    * and visible state of all CommandExecutions. With that, action-triggering controls (e.g. a button) can
    * be bound to the enable/visible property of the CommandExecution to centrally control their state.
    *
    * **Note: The usage of the `$cmd` model is restricted to `sap.suite.ui.generic`**
    *
    * When binding a button's enabled state to this model, it follows the enabled state of the CommandExecution.
    * The binding path must be relative like `myCommand/enabled`:
    *
    *
    * ```javascript
    *
    * <Button press="cmd:MyCommand" enabled="$cmd>MyCommand/enabled" />
    * ```
    *
    *
    * A CommandExecution can have three states:
    * 	 - the CommandExecution is visible and enabled. If the configured shortcut is executed, the configured
    * 			event handler of this CommandExecution is called
    * 	 - the CommandExecution is visible but not enabled. If the configured shortcut is executed, neither
    * 			the configured event handler of this CommandExecution nor any event handler configured on CommandExecutions
    * 			in the ancestor chain is called
    * 	 - the CommandExecution is not visible. If the configured shortcut is executed, the configured event
    * 			handler of this CommandExecution is not called, but the event is propagated to its parent, which can
    * 			then handle the event by a configured CommandExecution or propagate the event to its parent, until no
    * 			parent exits anymore and the browser can handle the executed shortcut
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CommandExecution
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/CommandExecution", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.CommandExecution with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, CommandExecution]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CommandExecution],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.CommandExecution.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CommandExecution
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:execute execute} event of this `sap.ui.core.CommandExecution`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.CommandExecution` itself.
      *
      * Execute will be fired when the CommandExecution will be triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExecute(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachExecute(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.CommandExecution` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:execute execute} event of this `sap.ui.core.CommandExecution`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.CommandExecution` itself.
      *
      * Execute will be fired when the CommandExecution will be triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExecute(
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
    def attachExecute(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.CommandExecution` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:execute execute} event of this `sap.ui.core.CommandExecution`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachExecute(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachExecute(
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
      * Fires event {@link #event:execute execute} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireExecute(): this.type = js.native
    def fireExecute(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCommand command}.
      *
      * The command's name, that has to be defined in the manifest. This property can only be applied initially.
      *
      * @returns Value of property `command`
      */
    def getCommand(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Whether the CommandExecution is enabled or not. By default, it is enabled. If the CommandExecution is
      * disabled, the CommandExecution processes the event, but the event handler for it will not be called.
      * Therefore, also no event handler configured on CommandExecutions on ancestors is called.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Whether the CommandExecution is visible, or not. By default, it is visible. If not visible, the CommandExecution
      * won't process the event, and the event handler for it will not be called, regardless of the enabled state.
      * Therefore, the configured event handler on the next CommandExecution in the ancestor chain or, if no
      * ancestor in the ancestor chain has any CommandExecutions configured for this shortcut, the event handler
      * of the browser is called.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Sets whether the `CommandExecution` is enabled, or not. If set to false, the `CommandExecution` will
      * still register the shortcut. This will block any configured CommandExecutions on any ancestors for that
      * shortcut.
      *
      * @returns The CommandExecution
      */
    def setEnabled(/**
      * Whether the CommandExecution is enabled, or not.
      */
    bValue: Boolean): typings.openui5.sapUiCoreElementMod.default = js.native
    
    /**
      * Sets whether the `CommandExecution` is visible, or not. If set to false, the `CommandExecution` will
      * unregister the shortcut. If not visible, the CommandExecution will not be triggered even if it is enabled.
      *
      * @returns The CommandExecution
      */
    def setVisible(/**
      * Whether the CommandExecution is visible, or not.
      */
    bValue: Boolean): typings.openui5.sapUiCoreElementMod.default = js.native
    
    /**
      * Fires the execute event and triggers the attached handler. If the CommandExecution is disabled, the handler
      * will not be triggered.
      */
    def trigger(): Unit = js.native
  }
  
  trait CommandExecutionSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The command's name, that has to be defined in the manifest. This property can only be applied initially.
      */
    var command: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Whether the CommandExecution is enabled or not. By default, it is enabled. If the CommandExecution is
      * disabled, the CommandExecution processes the event, but the event handler for it will not be called.
      * Therefore, also no event handler configured on CommandExecutions on ancestors is called.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Execute will be fired when the CommandExecution will be triggered.
      */
    var execute: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Whether the CommandExecution is visible, or not. By default, it is visible. If not visible, the CommandExecution
      * won't process the event, and the event handler for it will not be called, regardless of the enabled state.
      * Therefore, the configured event handler on the next CommandExecution in the ancestor chain or, if no
      * ancestor in the ancestor chain has any CommandExecutions configured for this shortcut, the event handler
      * of the browser is called.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CommandExecutionSettings {
    
    inline def apply(): CommandExecutionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandExecutionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandExecutionSettings] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String | PropertyBindingInfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExecute(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
