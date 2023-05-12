package typings.openui5

import typings.openui5.anon.PreviousValue
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputBaseMod.InputBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMaskInputMod {
  
  @JSImport("sap/m/MaskInput", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MaskInput.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/generic-mask-input/ Mask Input}
    */
  open class default () extends MaskInput {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MaskInputSettings) = this()
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
    mSettings: MaskInputSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MaskInputSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MaskInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MaskInput with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.InputBase.extend}.
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
    oClassInfo: ClassInfo[T, MaskInput]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MaskInput],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MaskInput.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MaskInput
    extends typings.openui5.sapMInputBaseMod.default {
    
    /**
      * Adds some rule to the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRule(
      /**
      * The rule to add; if empty, nothing is inserted
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.104.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.MaskInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MaskInput` itself.
      *
      * Fired when the value of the `MaskInput` is changed by user interaction - each keystroke, delete, paste,
      * etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MaskInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.104.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.MaskInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MaskInput` itself.
      *
      * Fired when the value of the `MaskInput` is changed by user interaction - each keystroke, delete, paste,
      * etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MaskInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the rules in the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRules(): this.type = js.native
    
    /**
      * @SINCE 1.104.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.MaskInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * @SINCE 1.104.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviousValue): this.type = js.native
    
    /**
      * Gets current value of property {@link #getMask mask}.
      *
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      *
      * @returns Value of property `mask`
      */
    def getMask(): String = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholderSymbol placeholderSymbol}.
      *
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      *
      * Default value is `"_"`.
      *
      * @returns Value of property `placeholderSymbol`
      */
    def getPlaceholderSymbol(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getRules rules}.
      *
      * A list of validation rules (one rule per mask character).
      */
    def getRules(): js.Array[typings.openui5.sapMMaskInputRuleMod.default] = js.native
    
    /**
      * @SINCE 1.96
      *
      * Gets current value of property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether a clear icon is shown. Pressing the icon will clear input's value and fire the change
      * event.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearIcon`
      */
    def getShowClearIcon(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.MaskInputRule` in the aggregation {@link #getRules rules}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRule(
      /**
      * The rule whose index is looked for
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default
    ): int = js.native
    
    /**
      * Inserts a rule into the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRule(
      /**
      * The rule to insert; if empty, nothing is inserted
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default,
      /**
      * The `0`-based index the rule should be inserted at; for a negative value of `iIndex`, the rule is inserted
      * at position 0; for a value greater than the current size of the aggregation, the rule is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRules rules}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRules(): js.Array[typings.openui5.sapMMaskInputRuleMod.default] = js.native
    
    def removeRule(/**
      * The rule to remove or its index or id
      */
    vRule: String): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    /**
      * Removes a rule from the aggregation {@link #getRules rules}.
      *
      * @returns The removed rule or `null`
      */
    def removeRule(/**
      * The rule to remove or its index or id
      */
    vRule: int): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    def removeRule(
      /**
      * The rule to remove or its index or id
      */
    vRule: typings.openui5.sapMMaskInputRuleMod.default
    ): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getMask mask}.
      *
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMask(): this.type = js.native
    def setMask(/**
      * New value for property `mask`
      */
    sMask: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholderSymbol placeholderSymbol}.
      *
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholderSymbol(): this.type = js.native
    def setPlaceholderSymbol(/**
      * New value for property `placeholderSymbol`
      */
    sPlaceholderSymbol: String): this.type = js.native
    
    /**
      * @SINCE 1.96
      *
      * Sets a new value for property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether a clear icon is shown. Pressing the icon will clear input's value and fire the change
      * event.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClearIcon(): this.type = js.native
    def setShowClearIcon(/**
      * New value for property `showClearIcon`
      */
    bShowClearIcon: Boolean): this.type = js.native
  }
  
  trait MaskInputSettings
    extends StObject
       with InputBaseSettings {
    
    /**
      * @SINCE 1.104.0
      *
      * Fired when the value of the `MaskInput` is changed by user interaction - each keystroke, delete, paste,
      * etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      */
    var mask: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      */
    var placeholderSymbol: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A list of validation rules (one rule per mask character).
      */
    var rules: js.UndefOr[
        js.Array[typings.openui5.sapMMaskInputRuleMod.default] | typings.openui5.sapMMaskInputRuleMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.96
      *
      * Specifies whether a clear icon is shown. Pressing the icon will clear input's value and fire the change
      * event.
      */
    var showClearIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MaskInputSettings {
    
    inline def apply(): MaskInputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskInputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskInputSettings] (val x: Self) extends AnyVal {
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMask(value: String | PropertyBindingInfo): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setPlaceholderSymbol(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholderSymbol", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderSymbolUndefined: Self = StObject.set(x, "placeholderSymbol", js.undefined)
      
      inline def setRules(
        value: js.Array[typings.openui5.sapMMaskInputRuleMod.default] | typings.openui5.sapMMaskInputRuleMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: typings.openui5.sapMMaskInputRuleMod.default*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setShowClearIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearIcon", value.asInstanceOf[js.Any])
      
      inline def setShowClearIconUndefined: Self = StObject.set(x, "showClearIcon", js.undefined)
    }
  }
}
