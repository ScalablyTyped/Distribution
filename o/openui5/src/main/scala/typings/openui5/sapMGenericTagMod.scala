package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.GenericTagDesign
import typings.openui5.sapMLibraryMod.GenericTagValueState
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapMLibraryMod.OverflowToolbarConfig
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMGenericTagMod {
  
  @JSImport("sap/m/GenericTag", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.GenericTag`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GenericTag {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GenericTagSettings) = this()
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
    mSettings: GenericTagSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GenericTagSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
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
    
    @JSImport("sap/m/GenericTag", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.GenericTag with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, GenericTag]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GenericTag],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.GenericTag.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GenericTag
    extends typings.openui5.sapUiCoreControlMod.default
       with IOverflowToolbarContent
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.97.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.GenericTag`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.GenericTag` itself.
      *
      * Fired when the user clicks/taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.GenericTag` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.GenericTag`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.GenericTag` itself.
      *
      * Fired when the user clicks/taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.GenericTag` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the value in the aggregation {@link #getValue value}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyValue(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.GenericTag`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @since 1.97.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Determines the visual mode of the control.
      *
      * Default value is `Full`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): GenericTagDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagDesign * / any */ String) = js.native
    
    /**
      * Sets the behavior of the `GenericTag` inside an `OverflowToolbar` configuration. Required by the {@link sap.m.IOverflowToolbarContent }
      * interface.
      *
      * @returns Configuration information for the `sap.m.IOverflowToolbarContent` interface.
      */
    def getOverflowToolbarConfig(): OverflowToolbarConfig = js.native
    
    /**
      * Gets current value of property {@link #getStatus status}.
      *
      * Determines the control status that is represented in different colors, including the color bar and the
      * color and type of the displayed icon.
      *
      * Default value is `None`.
      *
      * @returns Value of property `status`
      */
    def getStatus(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text rendered by the control. It's a value-descriptive text rendered on one line.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getValue value}.
      *
      * Numeric value rendered by the control.
      */
    def getValue(): typings.openui5.sapMObjectNumberMod.default = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Determines the state of the control.
      *
      * **Note:** When the error state is set, a warning type of icon is displayed that overrides the control
      * set through the `value` aggregation.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): GenericTagValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagValueState * / any */ String) = js.native
    
    /**
      * @since 1.97.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.97.0
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Determines the visual mode of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Full`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: GenericTagDesign): this.type = js.native
    
    def setStatus(
      /**
      * New value for property `status`.
      */
    sStatus: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    /**
      * Sets the `status` property.
      *
      * Default value is `None`.
      *
      * @returns `this` to allow method chaining.
      */
    def setStatus(/**
      * New value for property `status`.
      */
    sStatus: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text rendered by the control. It's a value-descriptive text rendered on one line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getValue value}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(/**
      * The value to set
      */
    oValue: typings.openui5.sapMObjectNumberMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Determines the state of the control.
      *
      * **Note:** When the error state is set, a warning type of icon is displayed that overrides the control
      * set through the `value` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: GenericTagValueState): this.type = js.native
  }
  
  trait GenericTag$PressEventParameters extends StObject
  
  type GenericTagPressEvent = typings.openui5.sapUiBaseEventMod.default[GenericTag$PressEventParameters]
  
  type GenericTagPressEventParameters = GenericTag$PressEventParameters
  
  trait GenericTagSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.97.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledBy).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Determines the visual mode of the control.
      */
    var design: js.UndefOr[
        GenericTagDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the user clicks/taps on the control.
      */
    var press: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Determines the control status that is represented in different colors, including the color bar and the
      * color and type of the displayed icon.
      */
    var status: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text rendered by the control. It's a value-descriptive text rendered on one line.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Numeric value rendered by the control.
      */
    var value: js.UndefOr[typings.openui5.sapMObjectNumberMod.default] = js.undefined
    
    /**
      * Determines the state of the control.
      *
      * **Note:** When the error state is set, a warning type of icon is displayed that overrides the control
      * set through the `value` aggregation.
      */
    var valueState: js.UndefOr[
        GenericTagValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object GenericTagSettings {
    
    inline def apply(): GenericTagSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericTagSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericTagSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setDesign(
        value: GenericTagDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setStatus(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: typings.openui5.sapMObjectNumberMod.default): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: GenericTagValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTagValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
