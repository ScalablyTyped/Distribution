package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessageItemMod {
  
  @JSImport("sap/m/MessageItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MessageItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageItemSettings) = this()
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
    mSettings: MessageItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MessageItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MessageItem with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, MessageItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MessageItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessageItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Destroys the link in the aggregation {@link #getLink link}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLink(): this.type = js.native
    
    /**
      * @since 1.58
      *
      * Gets current value of property {@link #getActiveTitle activeTitle}.
      *
      * Defines whether the title of the item will be interactive.
      *
      * Default value is `false`.
      *
      * @returns Value of property `activeTitle`
      */
    def getActiveTitle(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCounter counter}.
      *
      * Defines the number of messages for a given message.
      *
      * @returns Value of property `counter`
      */
    def getCounter(): int = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Specifies detailed description of the message
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getGroupName groupName}.
      *
      * Name of a message group the current item belongs to.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `groupName`
      */
    def getGroupName(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getLink link}.
      *
      * Adds an sap.m.Link control which will be displayed at the end of the description of a message.
      */
    def getLink(): typings.openui5.sapMLinkMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLongtextUrl longtextUrl}.
      *
      * Specifies long text description location URL
      *
      * @returns Value of property `longtextUrl`
      */
    def getLongtextUrl(): URI = js.native
    
    /**
      * Gets current value of property {@link #getMarkupDescription markupDescription}.
      *
      * Specifies if description should be interpreted as markup
      *
      * Default value is `false`.
      *
      * @returns Value of property `markupDescription`
      */
    def getMarkupDescription(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSubtitle subtitle}.
      *
      * Specifies the subtitle of the message **Note:** This is only visible when the `title` property is not
      * empty.
      *
      * @returns Value of property `subtitle`
      */
    def getSubtitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Specifies the title of the message
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Specifies the type of the message
      *
      * Default value is `Error`.
      *
      * @returns Value of property `type`
      */
    def getType(): MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) = js.native
    
    /**
      * @since 1.58
      *
      * Sets a new value for property {@link #getActiveTitle activeTitle}.
      *
      * Defines whether the title of the item will be interactive.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveTitle(): this.type = js.native
    def setActiveTitle(/**
      * New value for property `activeTitle`
      */
    bActiveTitle: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCounter counter}.
      *
      * Defines the number of messages for a given message.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCounter(): this.type = js.native
    def setCounter(/**
      * New value for property `counter`
      */
    iCounter: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Specifies detailed description of the message
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupName groupName}.
      *
      * Name of a message group the current item belongs to.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupName(): this.type = js.native
    def setGroupName(/**
      * New value for property `groupName`
      */
    sGroupName: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLink link}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLink(/**
      * The link to set
      */
    oLink: typings.openui5.sapMLinkMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLongtextUrl longtextUrl}.
      *
      * Specifies long text description location URL
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLongtextUrl(): this.type = js.native
    def setLongtextUrl(/**
      * New value for property `longtextUrl`
      */
    sLongtextUrl: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMarkupDescription markupDescription}.
      *
      * Specifies if description should be interpreted as markup
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMarkupDescription(): this.type = js.native
    def setMarkupDescription(/**
      * New value for property `markupDescription`
      */
    bMarkupDescription: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitle subtitle}.
      *
      * Specifies the subtitle of the message **Note:** This is only visible when the `title` property is not
      * empty.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitle(): this.type = js.native
    def setSubtitle(/**
      * New value for property `subtitle`
      */
    sSubtitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Specifies the title of the message
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    def setType(
      /**
      * Type of Message
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): this.type = js.native
    /**
      * Sets type of the MessageItem. **Note:** if you set the type to None it will be handled and rendered as
      * Information.
      *
      * @returns The MessageItem
      */
    def setType(/**
      * Type of Message
      */
    sType: MessageType): this.type = js.native
  }
  
  trait MessageItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * @since 1.58
      *
      * Defines whether the title of the item will be interactive.
      */
    var activeTitle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the number of messages for a given message.
      */
    var counter: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies detailed description of the message
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Name of a message group the current item belongs to.
      */
    var groupName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Adds an sap.m.Link control which will be displayed at the end of the description of a message.
      */
    var link: js.UndefOr[typings.openui5.sapMLinkMod.default] = js.undefined
    
    /**
      * Specifies long text description location URL
      */
    var longtextUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies if description should be interpreted as markup
      */
    var markupDescription: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the subtitle of the message **Note:** This is only visible when the `title` property is not
      * empty.
      */
    var subtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the title of the message
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the type of the message
      */
    var `type`: js.UndefOr[
        MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object MessageItemSettings {
    
    inline def apply(): MessageItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageItemSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveTitle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeTitle", value.asInstanceOf[js.Any])
      
      inline def setActiveTitleUndefined: Self = StObject.set(x, "activeTitle", js.undefined)
      
      inline def setCounter(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGroupName(value: String | PropertyBindingInfo): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      inline def setLink(value: typings.openui5.sapMLinkMod.default): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLongtextUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "longtextUrl", value.asInstanceOf[js.Any])
      
      inline def setLongtextUrlUndefined: Self = StObject.set(x, "longtextUrl", js.undefined)
      
      inline def setMarkupDescription(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markupDescription", value.asInstanceOf[js.Any])
      
      inline def setMarkupDescriptionUndefined: Self = StObject.set(x, "markupDescription", js.undefined)
      
      inline def setSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(
        value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
