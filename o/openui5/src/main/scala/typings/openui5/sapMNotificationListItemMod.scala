package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMAvatarColorMod.AvatarColor
import typings.openui5.sapMNotificationListBaseMod.NotificationListBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMNotificationListItemMod {
  
  @JSImport("sap/m/NotificationListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new NotificationListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NotificationListItemSettings) = this()
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
    mSettings: NotificationListItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NotificationListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/NotificationListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.NotificationListItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.NotificationListBase.extend}.
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
    oClassInfo: ClassInfo[T, NotificationListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.NotificationListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NotificationListItem
    extends typings.openui5.sapMNotificationListBaseMod.default {
    
    /**
      * Destroys the processingMessage in the aggregation {@link #getProcessingMessage processingMessage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyProcessingMessage(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAuthorAvatarColor authorAvatarColor}.
      *
      * Determines the background color of the avatar of the author.
      *
      * **Note:** By using background colors from the predefined sets, your colors can later be customized from
      * the Theme Designer.
      *
      * Default value is `Accent6`.
      *
      * @returns Value of property `authorAvatarColor`
      */
    def getAuthorAvatarColor(): AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getAuthorInitials authorInitials}.
      *
      * Defines the displayed author initials.
      *
      * @returns Value of property `authorInitials`
      */
    def getAuthorInitials(): String = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Determines the description of the NotificationListItem.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getHideShowMoreButton hideShowMoreButton}.
      *
      * Determines if the "Show More" button should be hidden.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideShowMoreButton`
      */
    def getHideShowMoreButton(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getProcessingMessage processingMessage}.
      *
      * The sap.m.MessageStrip control that holds the information about any error that may occur when pressing
      * the notification buttons
      */
    def getProcessingMessage(): typings.openui5.sapMMessageStripMod.default = js.native
    
    /**
      * Gets current value of property {@link #getTruncate truncate}.
      *
      * Determines if the text in the title and the description of the notification are truncated to the first
      * two lines.
      *
      * Default value is `true`.
      *
      * @returns Value of property `truncate`
      */
    def getTruncate(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getAuthorAvatarColor authorAvatarColor}.
      *
      * Determines the background color of the avatar of the author.
      *
      * **Note:** By using background colors from the predefined sets, your colors can later be customized from
      * the Theme Designer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Accent6`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAuthorAvatarColor(): this.type = js.native
    def setAuthorAvatarColor(
      /**
      * New value for property `authorAvatarColor`
      */
    sAuthorAvatarColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String
    ): this.type = js.native
    def setAuthorAvatarColor(/**
      * New value for property `authorAvatarColor`
      */
    sAuthorAvatarColor: AvatarColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAuthorInitials authorInitials}.
      *
      * Defines the displayed author initials.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAuthorInitials(): this.type = js.native
    def setAuthorInitials(/**
      * New value for property `authorInitials`
      */
    sAuthorInitials: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Determines the description of the NotificationListItem.
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
      * Sets a new value for property {@link #getHideShowMoreButton hideShowMoreButton}.
      *
      * Determines if the "Show More" button should be hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideShowMoreButton(): this.type = js.native
    def setHideShowMoreButton(/**
      * New value for property `hideShowMoreButton`
      */
    bHideShowMoreButton: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getProcessingMessage processingMessage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setProcessingMessage(
      /**
      * The processingMessage to set
      */
    oProcessingMessage: typings.openui5.sapMMessageStripMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTruncate truncate}.
      *
      * Determines if the text in the title and the description of the notification are truncated to the first
      * two lines.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTruncate(): this.type = js.native
    def setTruncate(/**
      * New value for property `truncate`
      */
    bTruncate: Boolean): this.type = js.native
  }
  
  trait NotificationListItemSettings
    extends StObject
       with NotificationListBaseSettings {
    
    /**
      * Determines the background color of the avatar of the author.
      *
      * **Note:** By using background colors from the predefined sets, your colors can later be customized from
      * the Theme Designer.
      */
    var authorAvatarColor: js.UndefOr[
        AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the displayed author initials.
      */
    var authorInitials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the description of the NotificationListItem.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines if the "Show More" button should be hidden.
      */
    var hideShowMoreButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The sap.m.MessageStrip control that holds the information about any error that may occur when pressing
      * the notification buttons
      */
    var processingMessage: js.UndefOr[typings.openui5.sapMMessageStripMod.default] = js.undefined
    
    /**
      * Determines if the text in the title and the description of the notification are truncated to the first
      * two lines.
      */
    var truncate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NotificationListItemSettings {
    
    inline def apply(): NotificationListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationListItemSettings] (val x: Self) extends AnyVal {
      
      inline def setAuthorAvatarColor(
        value: AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "authorAvatarColor", value.asInstanceOf[js.Any])
      
      inline def setAuthorAvatarColorUndefined: Self = StObject.set(x, "authorAvatarColor", js.undefined)
      
      inline def setAuthorInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "authorInitials", value.asInstanceOf[js.Any])
      
      inline def setAuthorInitialsUndefined: Self = StObject.set(x, "authorInitials", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHideShowMoreButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideShowMoreButton", value.asInstanceOf[js.Any])
      
      inline def setHideShowMoreButtonUndefined: Self = StObject.set(x, "hideShowMoreButton", js.undefined)
      
      inline def setProcessingMessage(value: typings.openui5.sapMMessageStripMod.default): Self = StObject.set(x, "processingMessage", value.asInstanceOf[js.Any])
      
      inline def setProcessingMessageUndefined: Self = StObject.set(x, "processingMessage", js.undefined)
      
      inline def setTruncate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
