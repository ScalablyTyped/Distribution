package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMAvatarColorMod.AvatarColor
import typings.openui5.sapMAvatarImageFitTypeMod.AvatarImageFitType
import typings.openui5.sapMAvatarShapeMod.AvatarShape
import typings.openui5.sapMAvatarSizeMod.AvatarSize
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAvatarMod {
  
  @JSImport("sap/m/Avatar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Avatar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/avatar/ Avatar}
    */
  open class default () extends Avatar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AvatarSettings) = this()
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
    mSettings: AvatarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AvatarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Avatar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Avatar with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Avatar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Avatar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Avatar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Avatar
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Avatar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Avatar` itself.
      *
      * Fired when the user selects the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Avatar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Avatar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Avatar` itself.
      *
      * Fired when the user selects the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Avatar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getDetailBox detailBox} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindDetailBox(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys the detailBox in the aggregation {@link #getDetailBox detailBox}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDetailBox(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.Avatar`.
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
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.99.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an avatar is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      *
      * Default value is `None`.
      *
      * @returns Value of property `ariaHasPopup`
      */
    def getAriaHasPopup(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Determines the background color of the control.
      *
      * Default value is `Accent6`.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getBadgeIcon badgeIcon}.
      *
      * Defines what type of icon is displayed as visual affordance. It can be predefined or custom.
      *
      * The predefined icons are recommended for:
      * 	 - Suggesting a zooming action: `sap-icon://zoom-in`
      * 	 - Suggesting an image change: `sap-icon://camera`
      * 	 - Suggesting an editing action: `sap-icon://edit`
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `badgeIcon`
      */
    def getBadgeIcon(): URI = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getBadgeTooltip badgeTooltip}.
      *
      * Defines a custom tooltip for the `badgeIcon`. If set, it overrides the available default values.
      *
      * If not set, default tooltips are used as follows:
      * 	 - Specific default tooltips are displayed for each of the predefined `badgeIcons`.
      * 	 - For any other icons, the displayed tooltip is the same as the main control tooltip.
      *
      * @returns Value of property `badgeTooltip`
      */
    def getBadgeTooltip(): String = js.native
    
    /**
      * Gets current value of property {@link #getCustomDisplaySize customDisplaySize}.
      *
      * Specifies custom display size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      *
      * Default value is `"3rem"`.
      *
      * @returns Value of property `customDisplaySize`
      */
    def getCustomDisplaySize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getCustomFontSize customFontSize}.
      *
      * Specifies custom font size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      *
      * Default value is `"1.125rem"`.
      *
      * @returns Value of property `customFontSize`
      */
    def getCustomFontSize(): CSSSize = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getDecorative decorative}.
      *
      * Defines whether the `sap.m.Avatar` is used for decorative purposes and is ignored by accessibility tools.
      *
      * **Note:** This property doesn't take effect if `sap.m.Avatar` has a `press` handler.
      *
      * Default value is `false`.
      *
      * @returns Value of property `decorative`
      */
    def getDecorative(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getDetailBox detailBox}.
      *
      * A `sap.m.LightBox` instance, that will be opened automatically when the user interacts with the `Avatar`
      * control.
      *
      * The `press` event will still be fired.
      */
    def getDetailBox(): typings.openui5.sapMLightBoxMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDisplayShape displayShape}.
      *
      * Defines the shape of the `Avatar`.
      *
      * Default value is `Circle`.
      *
      * @returns Value of property `displayShape`
      */
    def getDisplayShape(): AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDisplaySize displaySize}.
      *
      * Sets a predefined display size of the `Avatar`.
      *
      * Default value is `S`.
      *
      * @returns Value of property `displaySize`
      */
    def getDisplaySize(): AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed depending on the set `displayShape` property.
      * 	 - Accepted values are only icons from the SAP icon font.
      *
      * @returns Value of property `fallbackIcon`
      */
    def getFallbackIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getImageFitType imageFitType}.
      *
      * Specifies how an image would fit in the `Avatar`.
      *
      * Default value is `Cover`.
      *
      * @returns Value of property `imageFitType`
      */
    def getImageFitType(): AvatarImageFitType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarImageFitType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getInitials initials}.
      *
      * Defines the displayed initials. They should consist of only 1,2 or 3 latin letters.
      *
      * @returns Value of property `initials`
      */
    def getInitials(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowBorder showBorder}.
      *
      * Determines whether the control is displayed with border.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showBorder`
      */
    def getShowBorder(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * Determines the path to the desired image or icon.
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
      * @SINCE 1.99.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an avatar is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaHasPopup(): this.type = js.native
    def setAriaHasPopup(
      /**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String
    ): this.type = js.native
    def setAriaHasPopup(/**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: HasPopup): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Determines the background color of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Accent6`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(
      /**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String
    ): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: AvatarColor): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getBadgeIcon badgeIcon}.
      *
      * Defines what type of icon is displayed as visual affordance. It can be predefined or custom.
      *
      * The predefined icons are recommended for:
      * 	 - Suggesting a zooming action: `sap-icon://zoom-in`
      * 	 - Suggesting an image change: `sap-icon://camera`
      * 	 - Suggesting an editing action: `sap-icon://edit`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBadgeIcon(): this.type = js.native
    def setBadgeIcon(/**
      * New value for property `badgeIcon`
      */
    sBadgeIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getBadgeTooltip badgeTooltip}.
      *
      * Defines a custom tooltip for the `badgeIcon`. If set, it overrides the available default values.
      *
      * If not set, default tooltips are used as follows:
      * 	 - Specific default tooltips are displayed for each of the predefined `badgeIcons`.
      * 	 - For any other icons, the displayed tooltip is the same as the main control tooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBadgeTooltip(): this.type = js.native
    def setBadgeTooltip(/**
      * New value for property `badgeTooltip`
      */
    sBadgeTooltip: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomDisplaySize customDisplaySize}.
      *
      * Specifies custom display size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"3rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomDisplaySize(): this.type = js.native
    def setCustomDisplaySize(/**
      * New value for property `customDisplaySize`
      */
    sCustomDisplaySize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomFontSize customFontSize}.
      *
      * Specifies custom font size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"1.125rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomFontSize(): this.type = js.native
    def setCustomFontSize(/**
      * New value for property `customFontSize`
      */
    sCustomFontSize: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getDecorative decorative}.
      *
      * Defines whether the `sap.m.Avatar` is used for decorative purposes and is ignored by accessibility tools.
      *
      * **Note:** This property doesn't take effect if `sap.m.Avatar` has a `press` handler.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDecorative(): this.type = js.native
    def setDecorative(/**
      * New value for property `decorative`
      */
    bDecorative: Boolean): this.type = js.native
    
    /**
      * Sets the `detailBox` aggregation.
      *
      * @returns `this` for chaining
      */
    def setDetailBox(): this.type = js.native
    def setDetailBox(
      /**
      * Instance of the `LightBox` control or undefined
      */
    oLightBox: typings.openui5.sapMLightBoxMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayShape displayShape}.
      *
      * Defines the shape of the `Avatar`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Circle`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayShape(): this.type = js.native
    def setDisplayShape(
      /**
      * New value for property `displayShape`
      */
    sDisplayShape: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String
    ): this.type = js.native
    def setDisplayShape(/**
      * New value for property `displayShape`
      */
    sDisplayShape: AvatarShape): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplaySize displaySize}.
      *
      * Sets a predefined display size of the `Avatar`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `S`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplaySize(): this.type = js.native
    def setDisplaySize(
      /**
      * New value for property `displaySize`
      */
    sDisplaySize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String
    ): this.type = js.native
    def setDisplaySize(/**
      * New value for property `displaySize`
      */
    sDisplaySize: AvatarSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed depending on the set `displayShape` property.
      * 	 - Accepted values are only icons from the SAP icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFallbackIcon(): this.type = js.native
    def setFallbackIcon(/**
      * New value for property `fallbackIcon`
      */
    sFallbackIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getImageFitType imageFitType}.
      *
      * Specifies how an image would fit in the `Avatar`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Cover`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImageFitType(): this.type = js.native
    def setImageFitType(
      /**
      * New value for property `imageFitType`
      */
    sImageFitType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarImageFitType * / any */ String
    ): this.type = js.native
    def setImageFitType(/**
      * New value for property `imageFitType`
      */
    sImageFitType: AvatarImageFitType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInitials initials}.
      *
      * Defines the displayed initials. They should consist of only 1,2 or 3 latin letters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitials(): this.type = js.native
    def setInitials(/**
      * New value for property `initials`
      */
    sInitials: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowBorder showBorder}.
      *
      * Determines whether the control is displayed with border.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowBorder(): this.type = js.native
    def setShowBorder(/**
      * New value for property `showBorder`
      */
    bShowBorder: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * Determines the path to the desired image or icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSrc(): this.type = js.native
    def setSrc(/**
      * New value for property `src`
      */
    sSrc: URI): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getDetailBox detailBox} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindDetailBox(): this.type = js.native
  }
  
  trait AvatarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.99.0
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an avatar is related to a popover/popup. The value needs to be equal
      * to the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      */
    var ariaHasPopup: js.UndefOr[
        HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledBy).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Determines the background color of the control.
      */
    var backgroundColor: js.UndefOr[
        AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Defines what type of icon is displayed as visual affordance. It can be predefined or custom.
      *
      * The predefined icons are recommended for:
      * 	 - Suggesting a zooming action: `sap-icon://zoom-in`
      * 	 - Suggesting an image change: `sap-icon://camera`
      * 	 - Suggesting an editing action: `sap-icon://edit`
      */
    var badgeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Defines a custom tooltip for the `badgeIcon`. If set, it overrides the available default values.
      *
      * If not set, default tooltips are used as follows:
      * 	 - Specific default tooltips are displayed for each of the predefined `badgeIcons`.
      * 	 - For any other icons, the displayed tooltip is the same as the main control tooltip.
      */
    var badgeTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies custom display size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      */
    var customDisplaySize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies custom font size of the `Avatar`.
      *
      * **Note:** It takes effect if the `displaySize` property is set to `Custom`.
      */
    var customFontSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * Defines whether the `sap.m.Avatar` is used for decorative purposes and is ignored by accessibility tools.
      *
      * **Note:** This property doesn't take effect if `sap.m.Avatar` has a `press` handler.
      */
    var decorative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A `sap.m.LightBox` instance, that will be opened automatically when the user interacts with the `Avatar`
      * control.
      *
      * The `press` event will still be fired.
      */
    var detailBox: js.UndefOr[typings.openui5.sapMLightBoxMod.default] = js.undefined
    
    /**
      * Defines the shape of the `Avatar`.
      */
    var displayShape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets a predefined display size of the `Avatar`.
      */
    var displaySize: js.UndefOr[
        AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed depending on the set `displayShape` property.
      * 	 - Accepted values are only icons from the SAP icon font.
      */
    var fallbackIcon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies how an image would fit in the `Avatar`.
      */
    var imageFitType: js.UndefOr[
        AvatarImageFitType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarImageFitType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the displayed initials. They should consist of only 1,2 or 3 latin letters.
      */
    var initials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the user selects the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines whether the control is displayed with border.
      */
    var showBorder: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the path to the desired image or icon.
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object AvatarSettings {
    
    inline def apply(): AvatarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaHasPopup(
        value: HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBackgroundColor(
        value: AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBadgeIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "badgeIcon", value.asInstanceOf[js.Any])
      
      inline def setBadgeIconUndefined: Self = StObject.set(x, "badgeIcon", js.undefined)
      
      inline def setBadgeTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "badgeTooltip", value.asInstanceOf[js.Any])
      
      inline def setBadgeTooltipUndefined: Self = StObject.set(x, "badgeTooltip", js.undefined)
      
      inline def setCustomDisplaySize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customDisplaySize", value.asInstanceOf[js.Any])
      
      inline def setCustomDisplaySizeUndefined: Self = StObject.set(x, "customDisplaySize", js.undefined)
      
      inline def setCustomFontSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customFontSize", value.asInstanceOf[js.Any])
      
      inline def setCustomFontSizeUndefined: Self = StObject.set(x, "customFontSize", js.undefined)
      
      inline def setDecorative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
      
      inline def setDecorativeUndefined: Self = StObject.set(x, "decorative", js.undefined)
      
      inline def setDetailBox(value: typings.openui5.sapMLightBoxMod.default): Self = StObject.set(x, "detailBox", value.asInstanceOf[js.Any])
      
      inline def setDetailBoxUndefined: Self = StObject.set(x, "detailBox", js.undefined)
      
      inline def setDisplayShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displayShape", value.asInstanceOf[js.Any])
      
      inline def setDisplayShapeUndefined: Self = StObject.set(x, "displayShape", js.undefined)
      
      inline def setDisplaySize(
        value: AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
      
      inline def setDisplaySizeUndefined: Self = StObject.set(x, "displaySize", js.undefined)
      
      inline def setFallbackIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "fallbackIcon", value.asInstanceOf[js.Any])
      
      inline def setFallbackIconUndefined: Self = StObject.set(x, "fallbackIcon", js.undefined)
      
      inline def setImageFitType(
        value: AvatarImageFitType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarImageFitType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "imageFitType", value.asInstanceOf[js.Any])
      
      inline def setImageFitTypeUndefined: Self = StObject.set(x, "imageFitType", js.undefined)
      
      inline def setInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setShowBorder(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showBorder", value.asInstanceOf[js.Any])
      
      inline def setShowBorderUndefined: Self = StObject.set(x, "showBorder", js.undefined)
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
