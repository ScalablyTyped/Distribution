package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessagePageMod {
  
  @JSImport("sap/m/MessagePage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessagePage.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/message-page/ Message Page}
    */
  open class default () extends MessagePage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessagePageSettings) = this()
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
    mSettings: MessagePageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessagePageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MessagePage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MessagePage with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, MessagePage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessagePage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MessagePage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessagePage
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
      * @SINCE 1.54
      *
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.MessagePage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessagePage` itself.
      *
      * This event is fired when Nav Button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessagePage` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.28.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.MessagePage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessagePage` itself.
      *
      * This event is fired when Nav Button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
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
    def attachNavButtonPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MessagePage` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Destroys the customDescription in the aggregation {@link #getCustomDescription customDescription}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomDescription(): this.type = js.native
    
    /**
      * Destroys the customText in the aggregation {@link #getCustomText customText}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomText(): this.type = js.native
    
    /**
      * @SINCE 1.28.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.MessagePage`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavButtonPress(
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
      * @SINCE 1.28.1
      *
      * Fires event {@link #event:navButtonPress navButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavButtonPress(): this.type = js.native
    def fireNavButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * The buttons displayed under the description text.
      *
      * **Note:** Buttons added to this aggregation are both vertically and horizontally centered. Depending
      * on the available space, they may be rendered on several lines.
      */
    def getButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomDescription customDescription}.
      *
      * The (optional) custom description control of this page. Use this aggregation when the "description" (sap.m.Text)
      * control needs to be replaced with an sap.m.Link control. "description" and "textDirection" setters can
      * be used for this aggregation.
      */
    def getCustomDescription(): typings.openui5.sapMLinkMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomText customText}.
      *
      * The (optional) custom Text control of this page. Use this aggregation when the "text" (sap.m.Text) control
      * needs to be replaced with an sap.m.Link control. "text" and "textDirection" setters can be used for this
      * aggregation.
      */
    def getCustomText(): typings.openui5.sapMLinkMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Determines the detailed description that shows additional information on the MessagePage.
      *
      * Default value is `"Check the filter settings."`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFormattedText`
      */
    def getEnableFormattedText(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Determines the icon displayed on the MessagePage.
      *
      * Default value is `"sap-icon://documents"`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getIconAlt iconAlt}.
      *
      * Defines the alt attribute of the icon displayed on the `MessagePage`.
      *
      * @returns Value of property `iconAlt`
      */
    def getIconAlt(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * Determines the visibility of the MessagePage header. Can be used to hide the header of the MessagePage
      * when it's embedded in another page.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNavButton showNavButton}.
      *
      * Determines the visibility of the navigation button in MessagePage header.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNavButton`
      */
    def getShowNavButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Determines the main text displayed on the MessagePage.
      *
      * Default value is `"No matching items found."`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Determines the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title in the header of MessagePage.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @SINCE 1.54
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getButtons buttons}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(/**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapMButtonMod.default): int = js.native
    
    /**
      * @SINCE 1.54
      *
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * @SINCE 1.54
      *
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
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
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @SINCE 1.54
      *
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getCustomDescription customDescription}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomDescription(/**
      * The customDescription to set
      */
    oCustomDescription: typings.openui5.sapMLinkMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCustomText customText}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomText(/**
      * The customText to set
      */
    oCustomText: typings.openui5.sapMLinkMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Determines the detailed description that shows additional information on the MessagePage.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Check the filter settings."`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFormattedText(): this.type = js.native
    def setEnableFormattedText(/**
      * New value for property `enableFormattedText`
      */
    bEnableFormattedText: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Determines the icon displayed on the MessagePage.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"sap-icon://documents"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getIconAlt iconAlt}.
      *
      * Defines the alt attribute of the icon displayed on the `MessagePage`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconAlt(): this.type = js.native
    def setIconAlt(/**
      * New value for property `iconAlt`
      */
    sIconAlt: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * Determines the visibility of the MessagePage header. Can be used to hide the header of the MessagePage
      * when it's embedded in another page.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNavButton showNavButton}.
      *
      * Determines the visibility of the navigation button in MessagePage header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNavButton(): this.type = js.native
    def setShowNavButton(/**
      * New value for property `showNavButton`
      */
    bShowNavButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Determines the main text displayed on the MessagePage.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"No matching items found."`.
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
      * Determines the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
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
      * Determines the title in the header of MessagePage.
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
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
  }
  
  trait MessagePageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * The buttons displayed under the description text.
      *
      * **Note:** Buttons added to this aggregation are both vertically and horizontally centered. Depending
      * on the available space, they may be rendered on several lines.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The (optional) custom description control of this page. Use this aggregation when the "description" (sap.m.Text)
      * control needs to be replaced with an sap.m.Link control. "description" and "textDirection" setters can
      * be used for this aggregation.
      */
    var customDescription: js.UndefOr[typings.openui5.sapMLinkMod.default] = js.undefined
    
    /**
      * The (optional) custom Text control of this page. Use this aggregation when the "text" (sap.m.Text) control
      * needs to be replaced with an sap.m.Link control. "text" and "textDirection" setters can be used for this
      * aggregation.
      */
    var customText: js.UndefOr[typings.openui5.sapMLinkMod.default] = js.undefined
    
    /**
      * Determines the detailed description that shows additional information on the MessagePage.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines whether the value set in the `description` property is displayed as formatted text in HTML format.
      *
      * For details regarding supported HTML tags, see {@link sap.m.FormattedText}
      */
    var enableFormattedText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the icon displayed on the MessagePage.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Defines the alt attribute of the icon displayed on the `MessagePage`.
      */
    var iconAlt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.1
      *
      * This event is fired when Nav Button is pressed.
      */
    var navButtonPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the visibility of the MessagePage header. Can be used to hide the header of the MessagePage
      * when it's embedded in another page.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the visibility of the navigation button in MessagePage header.
      */
    var showNavButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the main text displayed on the MessagePage.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the element's text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the title in the header of MessagePage.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * Defines the semantic level of the title. When using `Auto`, no explicit level information is written.
      *
      * **Note:** Used for accessibility purposes only.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object MessagePageSettings {
    
    inline def apply(): MessagePageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagePageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessagePageSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCustomDescription(value: typings.openui5.sapMLinkMod.default): Self = StObject.set(x, "customDescription", value.asInstanceOf[js.Any])
      
      inline def setCustomDescriptionUndefined: Self = StObject.set(x, "customDescription", js.undefined)
      
      inline def setCustomText(value: typings.openui5.sapMLinkMod.default): Self = StObject.set(x, "customText", value.asInstanceOf[js.Any])
      
      inline def setCustomTextUndefined: Self = StObject.set(x, "customText", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnableFormattedText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFormattedText", value.asInstanceOf[js.Any])
      
      inline def setEnableFormattedTextUndefined: Self = StObject.set(x, "enableFormattedText", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconAlt", value.asInstanceOf[js.Any])
      
      inline def setIconAltUndefined: Self = StObject.set(x, "iconAlt", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNavButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navButtonPress", js.Any.fromFunction1(value))
      
      inline def setNavButtonPressUndefined: Self = StObject.set(x, "navButtonPress", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowNavButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNavButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavButtonUndefined: Self = StObject.set(x, "showNavButton", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
