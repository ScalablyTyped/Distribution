package typings.openui5

import typings.openui5.anon.MetaKey
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.EmptyIndicatorMode
import typings.openui5.sapMLibraryMod.LinkAccessibleRole
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IAccessKeySupport
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.openui5.sapUiCoreLibraryMod.ITitleContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMLinkMod {
  
  @JSImport("sap/m/Link", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Link`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/link/ Link}
    */
  open class default () extends Link {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LinkSettings) = this()
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
    mSettings: LinkSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LinkSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IAccessKeySupport: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ITitleContent: Boolean = js.native
    
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
    
    @JSImport("sap/m/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Link with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Link]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Link],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Link.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Link
    extends typings.openui5.sapUiCoreControlMod.default
       with IShrinkable
       with IFormContent
       with ITitleContent
       with IAccessKeySupport
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
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
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Link`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Link` itself.
      *
      * Event is fired when the user triggers the link control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Link` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Link`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Link` itself.
      *
      * Event is fired when the user triggers the link control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Link` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.Link`.
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
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def firePress(): Boolean = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: MetaKey): Boolean = js.native
    
    /**
      * @SINCE 1.104.0
      *
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * Describes the accessibility role of the link:
      * 	 - `LinkAccessibleRole.Default` - a navigation is expected to the location given in `href` property
      *
      * 	 - `LinkAccessibleRole.Button` - there will be `role` attribute with value "Button" rendered. In this
      * 			scenario the `href` property value shouldn't be set as navigation isn't expected to occur.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): LinkAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkAccessibleRole * / any */ String) = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.86.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered according to
      * the selected value.
      *
      * NOTE: Use this property only when a link is related to a popover/popup. The value needs to be equal to
      * the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
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
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getEmphasized emphasized}.
      *
      * Emphasized links look visually more important than regular links.
      *
      * Default value is `false`.
      *
      * @returns Value of property `emphasized`
      */
    def getEmphasized(): Boolean = js.native
    
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
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the link can be triggered by the user.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHref href}.
      *
      * Defines the link target URI. Supports standard hyperlink behavior. **Note:** Don't set `href` property
      * if an action should be triggered by the link. Instead set `accessibleRole` property to `LinkAccessibleRole.Button`
      * and register a `press` event handler.
      *
      * @returns Value of property `href`
      */
    def getHref(): URI = js.native
    
    /**
      * @SINCE 1.84
      *
      * Gets current value of property {@link #getRel rel}.
      *
      * Specifies the value of the HTML `rel` attribute.
      *
      * **Note:** A default value of `noopener noreferrer` is set only to links that have a cross-origin URL
      * and a specified `target` with value other than `_self`.
      *
      * @returns Value of property `rel`
      */
    def getRel(): String = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getSubtle subtle}.
      *
      * Subtle links look more like standard text than like links. They should only be used to help with visual
      * hierarchy between large data lists of important and less important links. Subtle links should not be
      * used in any other use case.
      *
      * Default value is `false`.
      *
      * @returns Value of property `subtle`
      */
    def getSubtle(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Specifies a target where the linked content will open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered. This property is only used when the `href` property
      * is set.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the displayed link text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Determines the horizontal alignment of the text.
      *
      * Default value is `Initial`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * This property specifies the element's text directionality with enumerated options. By default, the control
      * inherits text direction from the parent DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.54.0
      *
      * Gets current value of property {@link #getValidateUrl validateUrl}.
      *
      * Defines whether the link target URI should be validated.
      *
      * If validation fails, the value of the `href` property will still be set, but will not be applied to the
      * DOM.
      *
      * **Note:** Additional URLs are allowed through {@link module:sap/base/security/URLListValidator URLListValidator}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `validateUrl`
      */
    def getValidateUrl(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the link (CSS-size such as % or px). When it is set, this is the exact size.
      * When left blank, the text defines the size.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Determines whether the link text is allowed to wrap when there is no sufficient space.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
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
      * @SINCE 1.104.0
      *
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * Describes the accessibility role of the link:
      * 	 - `LinkAccessibleRole.Default` - a navigation is expected to the location given in `href` property
      *
      * 	 - `LinkAccessibleRole.Button` - there will be `role` attribute with value "Button" rendered. In this
      * 			scenario the `href` property value shouldn't be set as navigation isn't expected to occur.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(
      /**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkAccessibleRole * / any */ String
    ): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: LinkAccessibleRole): this.type = js.native
    
    /**
      * @SINCE 1.86.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered according to
      * the selected value.
      *
      * NOTE: Use this property only when a link is related to a popover/popup. The value needs to be equal to
      * the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
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
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getEmphasized emphasized}.
      *
      * Emphasized links look visually more important than regular links.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmphasized(): this.type = js.native
    def setEmphasized(/**
      * New value for property `emphasized`
      */
    bEmphasized: Boolean): this.type = js.native
    
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
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Determines whether the link can be triggered by the user.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHref href}.
      *
      * Defines the link target URI. Supports standard hyperlink behavior. **Note:** Don't set `href` property
      * if an action should be triggered by the link. Instead set `accessibleRole` property to `LinkAccessibleRole.Button`
      * and register a `press` event handler.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(): this.type = js.native
    def setHref(/**
      * New value for property `href`
      */
    sHref: URI): this.type = js.native
    
    /**
      * @SINCE 1.84
      *
      * Sets a new value for property {@link #getRel rel}.
      *
      * Specifies the value of the HTML `rel` attribute.
      *
      * **Note:** A default value of `noopener noreferrer` is set only to links that have a cross-origin URL
      * and a specified `target` with value other than `_self`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRel(): this.type = js.native
    def setRel(/**
      * New value for property `rel`
      */
    sRel: String): this.type = js.native
    
    /**
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getSubtle subtle}.
      *
      * Subtle links look more like standard text than like links. They should only be used to help with visual
      * hierarchy between large data lists of important and less important links. Subtle links should not be
      * used in any other use case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtle(): this.type = js.native
    def setSubtle(/**
      * New value for property `subtle`
      */
    bSubtle: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Specifies a target where the linked content will open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered. This property is only used when the `href` property
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the displayed link text.
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
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Determines the horizontal alignment of the text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Initial`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * This property specifies the element's text directionality with enumerated options. By default, the control
      * inherits text direction from the parent DOM.
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
      * @SINCE 1.54.0
      *
      * Sets a new value for property {@link #getValidateUrl validateUrl}.
      *
      * Defines whether the link target URI should be validated.
      *
      * If validation fails, the value of the `href` property will still be set, but will not be applied to the
      * DOM.
      *
      * **Note:** Additional URLs are allowed through {@link module:sap/base/security/URLListValidator URLListValidator}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidateUrl(): this.type = js.native
    def setValidateUrl(/**
      * New value for property `validateUrl`
      */
    bValidateUrl: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the width of the link (CSS-size such as % or px). When it is set, this is the exact size.
      * When left blank, the text defines the size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Determines whether the link text is allowed to wrap when there is no sufficient space.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
  }
  
  trait LinkSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.104.0
      *
      * Describes the accessibility role of the link:
      * 	 - `LinkAccessibleRole.Default` - a navigation is expected to the location given in `href` property
      *
      * 	 - `LinkAccessibleRole.Button` - there will be `role` attribute with value "Button" rendered. In this
      * 			scenario the `href` property value shouldn't be set as navigation isn't expected to occur.
      */
    var accessibleRole: js.UndefOr[
        LinkAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkAccessibleRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.86.0
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered according to
      * the selected value.
      *
      * NOTE: Use this property only when a link is related to a popover/popup. The value needs to be equal to
      * the main/root role of the popup - e.g. dialog, menu or list (examples: if you have dialog -> dialog,
      * if you have menu -> menu; if you have list -> list; if you have dialog containing a list -> dialog).
      * Do not use it, if you open a standard sap.m.Dialog, MessageBox or other type of dialogs displayed as
      * on overlay over the application.
      */
    var ariaHasPopup: js.UndefOr[
        HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Emphasized links look visually more important than regular links.
      */
    var emphasized: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.89
      *
      * Specifies if an empty indicator should be displayed when there is no text.
      */
    var emptyIndicatorMode: js.UndefOr[
        EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the link can be triggered by the user.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the link target URI. Supports standard hyperlink behavior. **Note:** Don't set `href` property
      * if an action should be triggered by the link. Instead set `accessibleRole` property to `LinkAccessibleRole.Button`
      * and register a `press` event handler.
      */
    var href: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when the user triggers the link control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.84
      *
      * Specifies the value of the HTML `rel` attribute.
      *
      * **Note:** A default value of `noopener noreferrer` is set only to links that have a cross-origin URL
      * and a specified `target` with value other than `_self`.
      */
    var rel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Subtle links look more like standard text than like links. They should only be used to help with visual
      * hierarchy between large data lists of important and less important links. Subtle links should not be
      * used in any other use case.
      */
    var subtle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies a target where the linked content will open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered. This property is only used when the `href` property
      * is set.
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the displayed link text.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Determines the horizontal alignment of the text.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * This property specifies the element's text directionality with enumerated options. By default, the control
      * inherits text direction from the parent DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.54.0
      *
      * Defines whether the link target URI should be validated.
      *
      * If validation fails, the value of the `href` property will still be set, but will not be applied to the
      * DOM.
      *
      * **Note:** Additional URLs are allowed through {@link module:sap/base/security/URLListValidator URLListValidator}.
      */
    var validateUrl: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the width of the link (CSS-size such as % or px). When it is set, this is the exact size.
      * When left blank, the text defines the size.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the link text is allowed to wrap when there is no sufficient space.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object LinkSettings {
    
    inline def apply(): LinkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleRole(
        value: LinkAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkAccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
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
      
      inline def setEmphasized(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emphasized", value.asInstanceOf[js.Any])
      
      inline def setEmphasizedUndefined: Self = StObject.set(x, "emphasized", js.undefined)
      
      inline def setEmptyIndicatorMode(
        value: EmptyIndicatorMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EmptyIndicatorMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "emptyIndicatorMode", value.asInstanceOf[js.Any])
      
      inline def setEmptyIndicatorModeUndefined: Self = StObject.set(x, "emptyIndicatorMode", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHref(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRel(value: String | PropertyBindingInfo): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setSubtle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
      
      inline def setSubtleUndefined: Self = StObject.set(x, "subtle", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValidateUrl(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validateUrl", value.asInstanceOf[js.Any])
      
      inline def setValidateUrlUndefined: Self = StObject.set(x, "validateUrl", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
