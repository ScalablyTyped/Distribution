package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectStatusMod {
  
  @JSImport("sap/m/ObjectStatus", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectStatus.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-display-elements/#-object-status Object
    * Status}
    */
  open class default () extends ObjectStatus {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectStatusSettings) = this()
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
    mSettings: ObjectStatusSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectStatusSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectStatus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectStatus with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ObjectStatus]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectStatus],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectStatus.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectStatus
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectStatus`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectStatus` itself.
      *
      * Fires when the user clicks/taps on active text.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectStatus` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectStatus`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectStatus` itself.
      *
      * Fires when the user clicks/taps on active text.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectStatus` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.ObjectStatus`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * @SINCE 1.54
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getActive active}.
      *
      * Indicates if the `ObjectStatus` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to also set the `text` or `icon` property.
      *
      * Default value is `false`.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.89
      *
      * Gets current value of property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * Default value is `Off`.
      *
      * @returns Value of property `emptyIndicatorMode`
      */
    def getEmptyIndicatorMode(): EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon URI. This may be either an icon font or image path.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * @SINCE 1.66
      *
      * Gets current value of property {@link #getInverted inverted}.
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inverted`
      */
    def getInverted(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * Defines the text value state. The allowed values are from the enum type `sap.ui.core.ValueState`. Since
      * version 1.66 the `state` property also accepts values from enum type `sap.ui.core.IndicationColor`.
      *
      * Default value is `ValueState.None`.
      *
      * @returns Value of property `state`
      */
    def getState(): String = js.native
    
    /**
      * @SINCE 1.110
      *
      * Gets current value of property {@link #getStateAnnouncementText stateAnnouncementText}.
      *
      * Еnables overriding of the default state announcement.
      *
      * @returns Value of property `stateAnnouncementText`
      */
    def getStateAnnouncementText(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the ObjectStatus text.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Determines the direction of the text, not including the title. Available options for the text direction
      * are LTR (left-to-right) and RTL (right-to-left). By default the control inherits the text direction from
      * its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the ObjectStatus title.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getActive active}.
      *
      * Indicates if the `ObjectStatus` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to also set the `text` or `icon` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.89
      *
      * Sets a new value for property {@link #getEmptyIndicatorMode emptyIndicatorMode}.
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Off`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptyIndicatorMode(): this.type = js.native
    def setEmptyIndicatorMode(
      /**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String
    ): this.type = js.native
    def setEmptyIndicatorMode(/**
      * New value for property `emptyIndicatorMode`
      */
    sEmptyIndicatorMode: EmptyIndicatorMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon URI. This may be either an icon font or image path.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.66
      *
      * Sets a new value for property {@link #getInverted inverted}.
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInverted(): this.type = js.native
    def setInverted(/**
      * New value for property `inverted`
      */
    bInverted: Boolean): this.type = js.native
    
    /**
      * Sets value for the `state` property. The default value is `ValueState.None`.
      *
      * @returns this to allow method chaining
      */
    def setState(
      /**
      * New value for property state. It should be valid value of enumeration `sap.ui.core.ValueState` or `sap.ui.core.IndicationColor`
      */
    sValue: String
    ): this.type = js.native
    
    /**
      * @SINCE 1.110
      *
      * Sets a new value for property {@link #getStateAnnouncementText stateAnnouncementText}.
      *
      * Еnables overriding of the default state announcement.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStateAnnouncementText(/**
      * New value for property `stateAnnouncementText`
      */
    sStateAnnouncementText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the ObjectStatus text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Determines the direction of the text, not including the title. Available options for the text direction
      * are LTR (left-to-right) and RTL (right-to-left). By default the control inherits the text direction from
      * its parent control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the ObjectStatus title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait ObjectStatusSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.54
      *
      * Indicates if the `ObjectStatus` text and icon can be clicked/tapped by the user.
      *
      * **Note:** If you set this property to `true`, you have to also set the `text` or `icon` property.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / IDs, which describe this control (see WAI-ARIA attribute aria-describedby).
      *
      * **Note:** The additional description will take effect only if `active` property is set to `true`.
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.89
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Icon URI. This may be either an icon font or image path.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is key for the application, set this value to false.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.66
      *
      * Determines whether the background color reflects the set `state` instead of the control's text.
      */
    var inverted: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Fires when the user clicks/taps on active text.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the text value state. The allowed values are from the enum type `sap.ui.core.ValueState`. Since
      * version 1.66 the `state` property also accepts values from enum type `sap.ui.core.IndicationColor`.
      */
    var state: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.110
      *
      * Еnables overriding of the default state announcement.
      */
    var stateAnnouncementText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the ObjectStatus text.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the direction of the text, not including the title. Available options for the text direction
      * are LTR (left-to-right) and RTL (right-to-left). By default the control inherits the text direction from
      * its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the ObjectStatus title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ObjectStatusSettings {
    
    inline def apply(): ObjectStatusSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectStatusSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectStatusSettings] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInverted(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setState(value: String | PropertyBindingInfo): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAnnouncementText(value: String | PropertyBindingInfo): Self = StObject.set(x, "stateAnnouncementText", value.asInstanceOf[js.Any])
      
      inline def setStateAnnouncementTextUndefined: Self = StObject.set(x, "stateAnnouncementText", js.undefined)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
