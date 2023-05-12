package typings.openui5

import typings.openui5.anon.CanOverflow
import typings.openui5.anon.Def
import typings.openui5.anon.Execute
import typings.openui5.anon.Key
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiFlVariantsVariantManagementMod {
  
  @JSImport("sap/ui/fl/variants/VariantManagement", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `VariantManagement`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:f1430c0337534d469da3a56307ff76af Key User Adaptation: Enable Your App}
    */
  open class default () extends VariantManagement {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: VariantManagementSettings) = this()
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
    mSettings: VariantManagementSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: VariantManagementSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/fl/variants/VariantManagement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.fl.variants.VariantManagement with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, VariantManagement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, VariantManagement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.fl.variants.VariantManagement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait VariantManagement
    extends typings.openui5.sapUiCoreControlMod.default
       with IShrinkable
       with IOverflowToolbarContent
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    def addFor(
      /**
      * The control to add; if empty, nothing is inserted
      */
    vFor: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds a control to the association {@link #for for}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFor(/**
      * The control to add; if empty, nothing is inserted
      */
    vFor: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when users presses the cancel button inside Save As dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when users presses the cancel button inside Save As dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
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
    def attachCancel(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:initialized initialized} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when the model and context are set.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInitialized(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInitialized(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:initialized initialized} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when the model and context are set.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInitialized(
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
    def attachInitialized(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:manage manage} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when users apply changes to variants in the Manage Views dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachManage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:manage manage} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when users apply changes to variants in the Manage Views dialog.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManage(
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
    def attachManage(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:save save} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when the Save View dialog or the Save As dialog is closed with the
      * save button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSave(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSave(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:save save} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when the Save View dialog or the Save As dialog is closed with the
      * save button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSave(
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
    def attachSave(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when a new variant is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.fl.variants.VariantManagement` itself.
      *
      * This event is fired when a new variant is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
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
    def attachSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.fl.variants.VariantManagement`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:initialized initialized} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachInitialized(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachInitialized(
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
      * Detaches event handler `fnFunction` from the {@link #event:manage manage} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachManage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachManage(
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
      * Detaches event handler `fnFunction` from the {@link #event:save save} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSave(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSave(
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.fl.variants.VariantManagement`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
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
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:initialized initialized} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireInitialized(): this.type = js.native
    def fireInitialized(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:manage manage} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireManage(): this.type = js.native
    def fireManage(/**
      * Parameters to pass along with the event
      */
    mParameters: Def): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:save save} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSave(): this.type = js.native
    def fireSave(/**
      * Parameters to pass along with the event
      */
    mParameters: Execute): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Key): this.type = js.native
    
    /**
      * Gets the currently selected variant key.
      *
      * @returns Key of the currently selected variant. In case the model is not yet set `null` will be returned.
      */
    def getCurrentVariantKey(): String | Null = js.native
    
    /**
      * Gets current value of property {@link #getDisplayTextForExecuteOnSelectionForStandardVariant displayTextForExecuteOnSelectionForStandardVariant}.
      *
      * Defines the Apply Automatically text for the standard variant in the Manage Views dialog if the application
      * controls this behavior.  **Note:** the usage of this property is restricted to `sap.fe` components
      * only.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `displayTextForExecuteOnSelectionForStandardVariant`
      */
    def getDisplayTextForExecuteOnSelectionForStandardVariant(): String = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Indicated if the buttons on the 'My Views' are visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getExecuteOnSelectionForStandardDefault executeOnSelectionForStandardDefault}.
      *
      * Determines the behavior for Apply Automatically if the standard variant is marked as the default variant.
      *
      * Default value is `false`.
      *
      * @returns Value of property `executeOnSelectionForStandardDefault`
      */
    def getExecuteOnSelectionForStandardDefault(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getFor
      * for}.
      */
    def getFor(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.104
      *
      * Gets current value of property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `headerLevel`
      */
    def getHeaderLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getInErrorState inErrorState}.
      *
      * Indicates that the control is in error state. If set to `true`, an error message will be displayed whenever
      * the variant is opened.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inErrorState`
      */
    def getInErrorState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getManualVariantKey manualVariantKey}.
      *
      * If set to `true`, the key for a vendor variant will be added manually.
      *   **Note:** This flag is only used internally.
      *
      * Default value is `false`.
      *
      * @returns Value of property `manualVariantKey`
      */
    def getManualVariantKey(): Boolean = js.native
    
    /**
      * @SINCE 1.109
      *
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getModelName modelName}.
      *
      * The name of the model containing the data.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `modelName`
      */
    def getModelName(): String = js.native
    
    /**
      * Determines if the current variant is modified.
      *
      * @returns If the current variant is modified `true`, otherwise `false`
      */
    def getModified(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Required by the {@link sap.m.IOverflowToolbarContent} interface. Registers invalidations event which
      * is fired when width of the control is changed.
      *
      * @returns Configuration information for the `sap.m.IOverflowToolbarContent` interface.
      */
    def getOverflowToolbarConfig(): CanOverflow = js.native
    
    /**
      * Gets current value of property {@link #getResetOnContextChange resetOnContextChange}.
      *
      * When set to `false`, doesn't reset the `VariantManagement` control to the default variant, when its binding
      * context is changed.  **Note:** The `VariantManagement` control does not react in any way to this property.
      * It is used internally by the flexibility layer.
      *
      * Default value is `true`.
      *
      * @returns Value of property `resetOnContextChange`
      */
    def getResetOnContextChange(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSetAsDefault showSetAsDefault}.
      *
      * Indicated if the defaulting functionality is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSetAsDefault`
      */
    def getShowSetAsDefault(): Boolean = js.native
    
    /**
      * @SINCE 1.109
      *
      * Gets current value of property {@link #getTitleStyle titleStyle}.
      *
      * Defines the style of the title. For more information, see {@link sap.m.Title#setTitleStyle}.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleStyle`
      */
    def getTitleStyle(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUpdateVariantInURL updateVariantInURL}.
      *
      * Determines the intention of setting the current variant based on passed information.  **Note:** The
      * `VariantManagement` control does not react in any way to this property. It is used internally by the
      * flexibility layer.
      *
      * Default value is `false`.
      *
      * @returns Value of property `updateVariantInURL`
      */
    def getUpdateVariantInURL(): Boolean = js.native
    
    /**
      * Retrieves all variants.
      *
      * @returns All variants. In case the model is not yet set, an empty array will be returned.
      */
    def getVariants(): js.Array[Any] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getFor for}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFor(): js.Array[ID] = js.native
    
    /**
      * Removes an for from the association named {@link #getFor for}.
      *
      * @returns The removed for or `null`
      */
    def removeFor(/**
      * The for to be removed or its index or ID
      */
    vFor: int): ID | Null = js.native
    def removeFor(
      /**
      * The for to be removed or its index or ID
      */
    vFor: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeFor(/**
      * The for to be removed or its index or ID
      */
    vFor: ID): ID | Null = js.native
    
    /**
      * Sets the new selected variant.
      */
    def setCurrentVariantKey(/**
      * Key of the variant that should be selected.
      */
    sKey: String): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayTextForExecuteOnSelectionForStandardVariant displayTextForExecuteOnSelectionForStandardVariant}.
      *
      * Defines the Apply Automatically text for the standard variant in the Manage Views dialog if the application
      * controls this behavior.  **Note:** the usage of this property is restricted to `sap.fe` components
      * only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayTextForExecuteOnSelectionForStandardVariant(): this.type = js.native
    def setDisplayTextForExecuteOnSelectionForStandardVariant(
      /**
      * New value for property `displayTextForExecuteOnSelectionForStandardVariant`
      */
    sDisplayTextForExecuteOnSelectionForStandardVariant: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Indicated if the buttons on the 'My Views' are visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExecuteOnSelectionForStandardDefault executeOnSelectionForStandardDefault}.
      *
      * Determines the behavior for Apply Automatically if the standard variant is marked as the default variant.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExecuteOnSelectionForStandardDefault(): this.type = js.native
    def setExecuteOnSelectionForStandardDefault(
      /**
      * New value for property `executeOnSelectionForStandardDefault`
      */
    bExecuteOnSelectionForStandardDefault: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.104
      *
      * Sets a new value for property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderLevel(): this.type = js.native
    def setHeaderLevel(
      /**
      * New value for property `headerLevel`
      */
    sHeaderLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setHeaderLevel(/**
      * New value for property `headerLevel`
      */
    sHeaderLevel: TitleLevel): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInErrorState inErrorState}.
      *
      * Indicates that the control is in error state. If set to `true`, an error message will be displayed whenever
      * the variant is opened.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInErrorState(): this.type = js.native
    def setInErrorState(/**
      * New value for property `inErrorState`
      */
    bInErrorState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getManualVariantKey manualVariantKey}.
      *
      * If set to `true`, the key for a vendor variant will be added manually.
      *   **Note:** This flag is only used internally.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setManualVariantKey(): this.type = js.native
    def setManualVariantKey(/**
      * New value for property `manualVariantKey`
      */
    bManualVariantKey: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.109
      *
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getModelName modelName}.
      *
      * The name of the model containing the data.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModelName(): this.type = js.native
    def setModelName(/**
      * New value for property `modelName`
      */
    sModelName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResetOnContextChange resetOnContextChange}.
      *
      * When set to `false`, doesn't reset the `VariantManagement` control to the default variant, when its binding
      * context is changed.  **Note:** The `VariantManagement` control does not react in any way to this property.
      * It is used internally by the flexibility layer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResetOnContextChange(): this.type = js.native
    def setResetOnContextChange(/**
      * New value for property `resetOnContextChange`
      */
    bResetOnContextChange: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSetAsDefault showSetAsDefault}.
      *
      * Indicated if the defaulting functionality is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSetAsDefault(): this.type = js.native
    def setShowSetAsDefault(/**
      * New value for property `showSetAsDefault`
      */
    bShowSetAsDefault: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.109
      *
      * Sets a new value for property {@link #getTitleStyle titleStyle}.
      *
      * Defines the style of the title. For more information, see {@link sap.m.Title#setTitleStyle}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleStyle(): this.type = js.native
    def setTitleStyle(
      /**
      * New value for property `titleStyle`
      */
    sTitleStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleStyle(/**
      * New value for property `titleStyle`
      */
    sTitleStyle: TitleLevel): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpdateVariantInURL updateVariantInURL}.
      *
      * Determines the intention of setting the current variant based on passed information.  **Note:** The
      * `VariantManagement` control does not react in any way to this property. It is used internally by the
      * flexibility layer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpdateVariantInURL(): this.type = js.native
    def setUpdateVariantInURL(/**
      * New value for property `updateVariantInURL`
      */
    bUpdateVariantInURL: Boolean): this.type = js.native
  }
  
  trait VariantManagementSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event is fired when users presses the cancel button inside Save As dialog.
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the Apply Automatically text for the standard variant in the Manage Views dialog if the application
      * controls this behavior.  **Note:** the usage of this property is restricted to `sap.fe` components
      * only.
      */
    var displayTextForExecuteOnSelectionForStandardVariant: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicated if the buttons on the 'My Views' are visible.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the behavior for Apply Automatically if the standard variant is marked as the default variant.
      */
    var executeOnSelectionForStandardDefault: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the ids of the controls for which the variant management is responsible.
      */
    var `for`: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.104
      *
      * Semantic level of the header. For more information, see {@link sap.m.Title#setLevel}.
      */
    var headerLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Indicates that the control is in error state. If set to `true`, an error message will be displayed whenever
      * the variant is opened.
      */
    var inErrorState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the model and context are set.
      */
    var initialized: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when users apply changes to variants in the Manage Views dialog.
      */
    var manage: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to `true`, the key for a vendor variant will be added manually.
      *   **Note:** This flag is only used internally.
      */
    var manualVariantKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.109
      *
      * Sets the maximum width of the control.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The name of the model containing the data.
      */
    var modelName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * When set to `false`, doesn't reset the `VariantManagement` control to the default variant, when its binding
      * context is changed.  **Note:** The `VariantManagement` control does not react in any way to this property.
      * It is used internally by the flexibility layer.
      */
    var resetOnContextChange: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the Save View dialog or the Save As dialog is closed with the
      * save button.
      */
    var save: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when a new variant is selected.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Indicated if the defaulting functionality is enabled.
      */
    var showSetAsDefault: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.109
      *
      * Defines the style of the title. For more information, see {@link sap.m.Title#setTitleStyle}.
      */
    var titleStyle: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the intention of setting the current variant based on passed information.  **Note:** The
      * `VariantManagement` control does not react in any way to this property. It is used internally by the
      * flexibility layer.
      */
    var updateVariantInURL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object VariantManagementSettings {
    
    inline def apply(): VariantManagementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariantManagementSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariantManagementSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDisplayTextForExecuteOnSelectionForStandardVariant(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayTextForExecuteOnSelectionForStandardVariant", value.asInstanceOf[js.Any])
      
      inline def setDisplayTextForExecuteOnSelectionForStandardVariantUndefined: Self = StObject.set(x, "displayTextForExecuteOnSelectionForStandardVariant", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setExecuteOnSelectionForStandardDefault(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "executeOnSelectionForStandardDefault", value.asInstanceOf[js.Any])
      
      inline def setExecuteOnSelectionForStandardDefaultUndefined: Self = StObject.set(x, "executeOnSelectionForStandardDefault", js.undefined)
      
      inline def setFor(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setForVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "for", js.Array(value*))
      
      inline def setHeaderLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerLevel", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevelUndefined: Self = StObject.set(x, "headerLevel", js.undefined)
      
      inline def setInErrorState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inErrorState", value.asInstanceOf[js.Any])
      
      inline def setInErrorStateUndefined: Self = StObject.set(x, "inErrorState", js.undefined)
      
      inline def setInitialized(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setManage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "manage", js.Any.fromFunction1(value))
      
      inline def setManageUndefined: Self = StObject.set(x, "manage", js.undefined)
      
      inline def setManualVariantKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "manualVariantKey", value.asInstanceOf[js.Any])
      
      inline def setManualVariantKeyUndefined: Self = StObject.set(x, "manualVariantKey", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setModelName(value: String | PropertyBindingInfo): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
      
      inline def setResetOnContextChange(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resetOnContextChange", value.asInstanceOf[js.Any])
      
      inline def setResetOnContextChangeUndefined: Self = StObject.set(x, "resetOnContextChange", js.undefined)
      
      inline def setSave(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowSetAsDefault(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSetAsDefault", value.asInstanceOf[js.Any])
      
      inline def setShowSetAsDefaultUndefined: Self = StObject.set(x, "showSetAsDefault", js.undefined)
      
      inline def setTitleStyle(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setUpdateVariantInURL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "updateVariantInURL", value.asInstanceOf[js.Any])
      
      inline def setUpdateVariantInURLUndefined: Self = StObject.set(x, "updateVariantInURL", js.undefined)
    }
  }
}
