package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMAvatarShapeMod.AvatarShape
import typings.openui5.sapMAvatarSizeMod.AvatarSize
import typings.openui5.sapMLibraryMod.LinkConversion
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFeedListItemMod {
  
  @JSImport("sap/m/FeedListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FeedListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FeedListItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FeedListItemSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: FeedListItemSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FeedListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FeedListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FeedListItem with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, FeedListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FeedListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FeedListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FeedListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * @since 1.52.0
      *
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapMFeedListItemActionMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconPress iconPress} event of this `sap.m.FeedListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedListItem` itself.
      *
      * Event is fired when the icon is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit]
    ): this.type = js.native
    def attachIconPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconPress iconPress} event of this `sap.m.FeedListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedListItem` itself.
      *
      * Event is fired when the icon is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit]
    ): this.type = js.native
    def attachIconPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:senderPress senderPress} event of this `sap.m.FeedListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedListItem` itself.
      *
      * Event is fired when name of the sender is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSenderPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit]
    ): this.type = js.native
    def attachSenderPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:senderPress senderPress} event of this `sap.m.FeedListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedListItem` itself.
      *
      * Event is fired when name of the sender is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSenderPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit]
    ): this.type = js.native
    def attachSenderPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.52.0
      *
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:iconPress iconPress} event of this `sap.m.FeedListItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachIconPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit]
    ): this.type = js.native
    def detachIconPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemIconPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:senderPress senderPress} event of this `sap.m.FeedListItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSenderPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit]
    ): this.type = js.native
    def detachSenderPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FeedListItemSenderPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:iconPress iconPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIconPress(): this.type = js.native
    def fireIconPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FeedListItem$IconPressEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:senderPress senderPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSenderPress(): this.type = js.native
    def fireSenderPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FeedListItem$SenderPressEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.52.0
      *
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Contains {@link sap.m.FeedListItemAction elements} that are displayed in the action sheet.
      */
    def getActions(): js.Array[typings.openui5.sapMFeedListItemActionMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getActiveIcon activeIcon}.
      *
      * Icon displayed when the list item is active.
      *
      * @returns Value of property `activeIcon`
      */
    def getActiveIcon(): URI = js.native
    
    /**
      * @since 1.46.1
      *
      * Gets current value of property {@link #getConvertLinksToAnchorTags convertLinksToAnchorTags}.
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      *
      * Default value is `None`.
      *
      * @returns Value of property `convertLinksToAnchorTags`
      */
    def getConvertLinksToAnchorTags(): LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) = js.native
    
    /**
      * @since 1.46.1
      *
      * Gets current value of property {@link #getConvertedLinksDefaultTarget convertedLinksDefaultTarget}.
      *
      * Determines the target attribute of the generated HTML anchor tags. Note: Applicable only if ConvertLinksToAnchorTags
      * property is used with a value other than sap.m.LinkConversion.None. Options are the standard values for
      * the target attribute of the HTML anchor tag: _self, _top, _blank, _parent, _search.
      *
      * Default value is `"_blank"`.
      *
      * @returns Value of property `convertedLinksDefaultTarget`
      */
    def getConvertedLinksDefaultTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the FeedListItem. This can be an image or an icon from
      * the icon font. If no icon is provided, a default person-placeholder icon is displayed. Icon is only shown
      * if showIcon = true.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconActive iconActive}.
      *
      * If true, icon is a link, which will fire 'iconPress' events. If false, icon is normal image
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconActive`
      */
    def getIconActive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to false.
      *
      * Deprecated as of version 1.88. Image is replaced by avatar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getIconDisplayShape iconDisplayShape}.
      *
      * Defines the shape of the icon.
      *
      * Default value is `Circle`.
      *
      * @returns Value of property `iconDisplayShape`
      */
    def getIconDisplayShape(): AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getIconInitials iconInitials}.
      *
      * Defines the initials of the icon.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconInitials`
      */
    def getIconInitials(): String = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getIconSize iconSize}.
      *
      * Defines the size of the icon.
      *
      * Default value is `S`.
      *
      * @returns Value of property `iconSize`
      */
    def getIconSize(): AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getInfo info}.
      *
      * The Info text.
      *
      * @returns Value of property `info`
      */
    def getInfo(): String = js.native
    
    /**
      * @since 1.60
      *
      * Gets current value of property {@link #getLessLabel lessLabel}.
      *
      * Customizable text for the "LESS" link at the end of the feed list item.
      *  Clicking the "LESS" link collapses the item, hiding the text that exceeds the allowed maximum number
      * of characters.
      *
      * @returns Value of property `lessLabel`
      */
    def getLessLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxCharacters maxCharacters}.
      *
      * The expand and collapse feature is set by default and uses 300 characters on mobile devices and 500 characters
      * on desktops as limits. Based on these values, the text of the FeedListItem is collapsed once text reaches
      * these limits. In this case, only the specified number of characters is displayed. By clicking on the
      * text link More, the entire text can be displayed. The text link Less collapses the text. The application
      * is able to set the value to its needs.
      *
      * @returns Value of property `maxCharacters`
      */
    def getMaxCharacters(): int = js.native
    
    /**
      * @since 1.60
      *
      * Gets current value of property {@link #getMoreLabel moreLabel}.
      *
      * Customizable text for the "MORE" link at the end of the feed list item.
      *  When the maximum number of characters defined by the `maxCharacters` property is exceeded and the text
      * of the feed list item is collapsed, the "MORE" link can be used to expand the feed list item and show
      * the rest of the text.
      *
      * @returns Value of property `moreLabel`
      */
    def getMoreLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getSender sender}.
      *
      * Sender of the chunk
      *
      * @returns Value of property `sender`
      */
    def getSender(): String = js.native
    
    /**
      * Gets current value of property {@link #getSenderActive senderActive}.
      *
      * If true, sender string is a link, which will fire 'senderPress' events. If false, sender is normal text.
      *
      * Default value is `true`.
      *
      * @returns Value of property `senderActive`
      */
    def getSenderActive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowIcon showIcon}.
      *
      * If set to "true" (default), icons will be displayed, if set to false icons are hidden
      *
      * Default value is `true`.
      *
      * @returns Value of property `showIcon`
      */
    def getShowIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The FeedListItem text. It supports html formatted tags as described in the documentation of sap.m.FormattedText
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTimestamp timestamp}.
      *
      * This chunks timestamp
      *
      * @returns Value of property `timestamp`
      */
    def getTimestamp(): String = js.native
    
    /**
      * @since 1.52.0
      *
      * Checks for the provided `sap.m.FeedListItemAction` in the aggregation {@link #getActions actions}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapMFeedListItemActionMod.default
    ): int = js.native
    
    /**
      * @since 1.52.0
      *
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapMFeedListItemActionMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapMFeedListItemActionMod.default | Null = js.native
    /**
      * @since 1.52.0
      *
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapMFeedListItemActionMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapMFeedListItemActionMod.default
    ): typings.openui5.sapMFeedListItemActionMod.default | Null = js.native
    
    /**
      * @since 1.52.0
      *
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapMFeedListItemActionMod.default] = js.native
    
    /**
      * Sets a new value for property {@link #getActiveIcon activeIcon}.
      *
      * Icon displayed when the list item is active.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveIcon(): this.type = js.native
    def setActiveIcon(/**
      * New value for property `activeIcon`
      */
    sActiveIcon: URI): this.type = js.native
    
    /**
      * @since 1.46.1
      *
      * Sets a new value for property {@link #getConvertLinksToAnchorTags convertLinksToAnchorTags}.
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConvertLinksToAnchorTags(): this.type = js.native
    def setConvertLinksToAnchorTags(
      /**
      * New value for property `convertLinksToAnchorTags`
      */
    sConvertLinksToAnchorTags: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String
    ): this.type = js.native
    def setConvertLinksToAnchorTags(
      /**
      * New value for property `convertLinksToAnchorTags`
      */
    sConvertLinksToAnchorTags: LinkConversion
    ): this.type = js.native
    
    /**
      * @since 1.46.1
      *
      * Sets a new value for property {@link #getConvertedLinksDefaultTarget convertedLinksDefaultTarget}.
      *
      * Determines the target attribute of the generated HTML anchor tags. Note: Applicable only if ConvertLinksToAnchorTags
      * property is used with a value other than sap.m.LinkConversion.None. Options are the standard values for
      * the target attribute of the HTML anchor tag: _self, _top, _blank, _parent, _search.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_blank"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConvertedLinksDefaultTarget(): this.type = js.native
    def setConvertedLinksDefaultTarget(
      /**
      * New value for property `convertedLinksDefaultTarget`
      */
    sConvertedLinksDefaultTarget: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon to be displayed as graphical element within the FeedListItem. This can be an image or an icon from
      * the icon font. If no icon is provided, a default person-placeholder icon is displayed. Icon is only shown
      * if showIcon = true.
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
      * Sets a new value for property {@link #getIconActive iconActive}.
      *
      * If true, icon is a link, which will fire 'iconPress' events. If false, icon is normal image
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconActive(): this.type = js.native
    def setIconActive(/**
      * New value for property `iconActive`
      */
    bIconActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to false.
      *
      * Deprecated as of version 1.88. Image is replaced by avatar.
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
      * @since 1.88
      *
      * Sets a new value for property {@link #getIconDisplayShape iconDisplayShape}.
      *
      * Defines the shape of the icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Circle`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDisplayShape(): this.type = js.native
    def setIconDisplayShape(
      /**
      * New value for property `iconDisplayShape`
      */
    sIconDisplayShape: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String
    ): this.type = js.native
    def setIconDisplayShape(/**
      * New value for property `iconDisplayShape`
      */
    sIconDisplayShape: AvatarShape): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getIconInitials iconInitials}.
      *
      * Defines the initials of the icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconInitials(): this.type = js.native
    def setIconInitials(/**
      * New value for property `iconInitials`
      */
    sIconInitials: String): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getIconSize iconSize}.
      *
      * Defines the size of the icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `S`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSize(): this.type = js.native
    def setIconSize(
      /**
      * New value for property `iconSize`
      */
    sIconSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String
    ): this.type = js.native
    def setIconSize(/**
      * New value for property `iconSize`
      */
    sIconSize: AvatarSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInfo info}.
      *
      * The Info text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfo(): this.type = js.native
    def setInfo(/**
      * New value for property `info`
      */
    sInfo: String): this.type = js.native
    
    /**
      * @since 1.60
      *
      * Sets a new value for property {@link #getLessLabel lessLabel}.
      *
      * Customizable text for the "LESS" link at the end of the feed list item.
      *  Clicking the "LESS" link collapses the item, hiding the text that exceeds the allowed maximum number
      * of characters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLessLabel(): this.type = js.native
    def setLessLabel(/**
      * New value for property `lessLabel`
      */
    sLessLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxCharacters maxCharacters}.
      *
      * The expand and collapse feature is set by default and uses 300 characters on mobile devices and 500 characters
      * on desktops as limits. Based on these values, the text of the FeedListItem is collapsed once text reaches
      * these limits. In this case, only the specified number of characters is displayed. By clicking on the
      * text link More, the entire text can be displayed. The text link Less collapses the text. The application
      * is able to set the value to its needs.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxCharacters(): this.type = js.native
    def setMaxCharacters(/**
      * New value for property `maxCharacters`
      */
    iMaxCharacters: int): this.type = js.native
    
    /**
      * @since 1.60
      *
      * Sets a new value for property {@link #getMoreLabel moreLabel}.
      *
      * Customizable text for the "MORE" link at the end of the feed list item.
      *  When the maximum number of characters defined by the `maxCharacters` property is exceeded and the text
      * of the feed list item is collapsed, the "MORE" link can be used to expand the feed list item and show
      * the rest of the text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMoreLabel(): this.type = js.native
    def setMoreLabel(/**
      * New value for property `moreLabel`
      */
    sMoreLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSender sender}.
      *
      * Sender of the chunk
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSender(): this.type = js.native
    def setSender(/**
      * New value for property `sender`
      */
    sSender: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSenderActive senderActive}.
      *
      * If true, sender string is a link, which will fire 'senderPress' events. If false, sender is normal text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSenderActive(): this.type = js.native
    def setSenderActive(/**
      * New value for property `senderActive`
      */
    bSenderActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIcon showIcon}.
      *
      * If set to "true" (default), icons will be displayed, if set to false icons are hidden
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowIcon(): this.type = js.native
    def setShowIcon(/**
      * New value for property `showIcon`
      */
    bShowIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The FeedListItem text. It supports html formatted tags as described in the documentation of sap.m.FormattedText
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
      * Sets a new value for property {@link #getTimestamp timestamp}.
      *
      * This chunks timestamp
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTimestamp(): this.type = js.native
    def setTimestamp(/**
      * New value for property `timestamp`
      */
    sTimestamp: String): this.type = js.native
  }
  
  trait FeedListItem$IconPressEventParameters extends StObject {
    
    /**
      * Dom reference of the feed item's icon to be used for positioning.
      */
    var domRef: js.UndefOr[String] = js.undefined
    
    /**
      * Function to retrieve the DOM reference for the `iconPress` event. The function returns the DOM element
      * of the icon or null
      */
    var getDomRef: js.UndefOr[js.Function] = js.undefined
  }
  object FeedListItem$IconPressEventParameters {
    
    inline def apply(): FeedListItem$IconPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedListItem$IconPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedListItem$IconPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: String): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      inline def setGetDomRef(value: js.Function): Self = StObject.set(x, "getDomRef", value.asInstanceOf[js.Any])
      
      inline def setGetDomRefUndefined: Self = StObject.set(x, "getDomRef", js.undefined)
    }
  }
  
  trait FeedListItem$SenderPressEventParameters extends StObject {
    
    /**
      * Dom reference of the feed item's sender string to be used for positioning.
      */
    var domRef: js.UndefOr[String] = js.undefined
    
    /**
      * Function to retrieve the DOM reference for the `senderPress` event. The function returns the DOM element
      * of the sender link or null
      */
    var getDomRef: js.UndefOr[js.Function] = js.undefined
  }
  object FeedListItem$SenderPressEventParameters {
    
    inline def apply(): FeedListItem$SenderPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedListItem$SenderPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedListItem$SenderPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: String): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      inline def setGetDomRef(value: js.Function): Self = StObject.set(x, "getDomRef", value.asInstanceOf[js.Any])
      
      inline def setGetDomRefUndefined: Self = StObject.set(x, "getDomRef", js.undefined)
    }
  }
  
  type FeedListItemIconPressEvent = typings.openui5.sapUiBaseEventMod.default[FeedListItem$IconPressEventParameters]
  
  type FeedListItemIconPressEventParameters = FeedListItem$IconPressEventParameters
  
  type FeedListItemSenderPressEvent = typings.openui5.sapUiBaseEventMod.default[FeedListItem$SenderPressEventParameters]
  
  type FeedListItemSenderPressEventParameters = FeedListItem$SenderPressEventParameters
  
  trait FeedListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * @since 1.52.0
      *
      * Contains {@link sap.m.FeedListItemAction elements} that are displayed in the action sheet.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapMFeedListItemActionMod.default] | typings.openui5.sapMFeedListItemActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Icon displayed when the list item is active.
      */
    var activeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.46.1
      *
      * Determines whether strings that appear to be links will be converted to HTML anchor tags, and what are
      * the criteria for recognizing them.
      */
    var convertLinksToAnchorTags: js.UndefOr[
        LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.46.1
      *
      * Determines the target attribute of the generated HTML anchor tags. Note: Applicable only if ConvertLinksToAnchorTags
      * property is used with a value other than sap.m.LinkConversion.None. Options are the standard values for
      * the target attribute of the HTML anchor tag: _self, _top, _blank, _parent, _search.
      */
    var convertedLinksDefaultTarget: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Icon to be displayed as graphical element within the FeedListItem. This can be an image or an icon from
      * the icon font. If no icon is provided, a default person-placeholder icon is displayed. Icon is only shown
      * if showIcon = true.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If true, icon is a link, which will fire 'iconPress' events. If false, icon is normal image
      */
    var iconActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to false.
      *
      * Deprecated as of version 1.88. Image is replaced by avatar.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Defines the shape of the icon.
      */
    var iconDisplayShape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Defines the initials of the icon.
      */
    var iconInitials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the icon is pressed.
      */
    var iconPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FeedListItem$IconPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Defines the size of the icon.
      */
    var iconSize: js.UndefOr[
        AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The Info text.
      */
    var info: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.60
      *
      * Customizable text for the "LESS" link at the end of the feed list item.
      *  Clicking the "LESS" link collapses the item, hiding the text that exceeds the allowed maximum number
      * of characters.
      */
    var lessLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The expand and collapse feature is set by default and uses 300 characters on mobile devices and 500 characters
      * on desktops as limits. Based on these values, the text of the FeedListItem is collapsed once text reaches
      * these limits. In this case, only the specified number of characters is displayed. By clicking on the
      * text link More, the entire text can be displayed. The text link Less collapses the text. The application
      * is able to set the value to its needs.
      */
    var maxCharacters: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.60
      *
      * Customizable text for the "MORE" link at the end of the feed list item.
      *  When the maximum number of characters defined by the `maxCharacters` property is exceeded and the text
      * of the feed list item is collapsed, the "MORE" link can be used to expand the feed list item and show
      * the rest of the text.
      */
    var moreLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sender of the chunk
      */
    var sender: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If true, sender string is a link, which will fire 'senderPress' events. If false, sender is normal text.
      */
    var senderActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when name of the sender is pressed.
      */
    var senderPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FeedListItem$SenderPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If set to "true" (default), icons will be displayed, if set to false icons are hidden
      */
    var showIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The FeedListItem text. It supports html formatted tags as described in the documentation of sap.m.FormattedText
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This chunks timestamp
      */
    var timestamp: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FeedListItemSettings {
    
    inline def apply(): FeedListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedListItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedListItemSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapMFeedListItemActionMod.default] | typings.openui5.sapMFeedListItemActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapMFeedListItemActionMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActiveIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
      
      inline def setConvertLinksToAnchorTags(
        value: LinkConversion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkConversion * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "convertLinksToAnchorTags", value.asInstanceOf[js.Any])
      
      inline def setConvertLinksToAnchorTagsUndefined: Self = StObject.set(x, "convertLinksToAnchorTags", js.undefined)
      
      inline def setConvertedLinksDefaultTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "convertedLinksDefaultTarget", value.asInstanceOf[js.Any])
      
      inline def setConvertedLinksDefaultTargetUndefined: Self = StObject.set(x, "convertedLinksDefaultTarget", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconActive", value.asInstanceOf[js.Any])
      
      inline def setIconActiveUndefined: Self = StObject.set(x, "iconActive", js.undefined)
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconDisplayShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconDisplayShape", value.asInstanceOf[js.Any])
      
      inline def setIconDisplayShapeUndefined: Self = StObject.set(x, "iconDisplayShape", js.undefined)
      
      inline def setIconInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconInitials", value.asInstanceOf[js.Any])
      
      inline def setIconInitialsUndefined: Self = StObject.set(x, "iconInitials", js.undefined)
      
      inline def setIconPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FeedListItem$IconPressEventParameters] => Unit
      ): Self = StObject.set(x, "iconPress", js.Any.fromFunction1(value))
      
      inline def setIconPressUndefined: Self = StObject.set(x, "iconPress", js.undefined)
      
      inline def setIconSize(
        value: AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInfo(value: String | PropertyBindingInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLessLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "lessLabel", value.asInstanceOf[js.Any])
      
      inline def setLessLabelUndefined: Self = StObject.set(x, "lessLabel", js.undefined)
      
      inline def setMaxCharacters(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
      
      inline def setMaxCharactersUndefined: Self = StObject.set(x, "maxCharacters", js.undefined)
      
      inline def setMoreLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "moreLabel", value.asInstanceOf[js.Any])
      
      inline def setMoreLabelUndefined: Self = StObject.set(x, "moreLabel", js.undefined)
      
      inline def setSender(value: String | PropertyBindingInfo): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "senderActive", value.asInstanceOf[js.Any])
      
      inline def setSenderActiveUndefined: Self = StObject.set(x, "senderActive", js.undefined)
      
      inline def setSenderPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FeedListItem$SenderPressEventParameters] => Unit
      ): Self = StObject.set(x, "senderPress", js.Any.fromFunction1(value))
      
      inline def setSenderPressUndefined: Self = StObject.set(x, "senderPress", js.undefined)
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      inline def setShowIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTimestamp(value: String | PropertyBindingInfo): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
