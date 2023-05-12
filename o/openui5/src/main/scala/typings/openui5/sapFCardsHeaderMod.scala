package typings.openui5

import typings.openui5.anon.Level
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFCardsBaseHeaderMod.BaseHeaderSettings
import typings.openui5.sapFLibraryMod.cards.IHeader
import typings.openui5.sapMAvatarColorMod.AvatarColor
import typings.openui5.sapMAvatarShapeMod.AvatarShape
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardsHeaderMod {
  
  @JSImport("sap/f/cards/Header", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Header`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Header {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: HeaderSettings) = this()
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
    mSettings: HeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: HeaderSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_cards_IHeader: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/cards/Header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.cards.Header with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.f.cards.BaseHeader.extend}.
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
    oClassInfo: ClassInfo[T, Header]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Header],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.cards.Header.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Header
    extends typings.openui5.sapFCardsBaseHeaderMod.default
       with IHeader {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.cards.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.cards.Header` itself.
      *
      * Fires when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.f.cards.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.f.cards.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.cards.Header` itself.
      *
      * Fires when the user presses the control.
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
      * Context object to call the event handler with. Defaults to this `sap.f.cards.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.f.cards.Header`.
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
      * This method is a hook for the RenderManager that gets called during the rendering of child Controls.
      * It allows to add, remove and update existing accessibility attributes (ARIA) of those controls.
      */
    def enhanceAccessibilityState(
      /**
      * The Control that gets rendered by the RenderManager
      */
    oElement: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The mapping of "aria-" prefixed attributes
      */
    mAriaProps: Level
    ): Unit = js.native
    
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
      * @EXPERIMENTAL (since 1.81) - this feature is experimental and the API may change.
      *
      * Gets current value of property {@link #getIconAlt iconAlt}.
      *
      * Defines an alt text for the avatar or icon.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconAlt`
      */
    def getIconAlt(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Gets current value of property {@link #getIconBackgroundColor iconBackgroundColor}.
      *
      * Defines a background color for the avatar or icon.
      *
      * Default value is `Transparent`.
      *
      * @returns Value of property `iconBackgroundColor`
      */
    def getIconBackgroundColor(): AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) = js.native
    
    /**
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
      * Gets current value of property {@link #getIconSrc iconSrc}.
      *
      * Defines the icon source.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `iconSrc`
      */
    def getIconSrc(): URI = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Gets current value of property {@link #getIconVisible iconVisible}.
      *
      * Defines whether the card icon is visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconVisible`
      */
    def getIconVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStatusText statusText}.
      *
      * Defines the status text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `statusText`
      */
    def getStatusText(): String = js.native
    
    /**
      * Gets current value of property {@link #getSubtitle subtitle}.
      *
      * Defines the subtitle.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitle`
      */
    def getSubtitle(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Gets current value of property {@link #getSubtitleMaxLines subtitleMaxLines}.
      *
      * Limits the number of lines for the subtitle.
      *
      * Default value is `2`.
      *
      * @returns Value of property `subtitleMaxLines`
      */
    def getSubtitleMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Gets current value of property {@link #getTitleMaxLines titleMaxLines}.
      *
      * Limits the number of lines for the title.
      *
      * Default value is `3`.
      *
      * @returns Value of property `titleMaxLines`
      */
    def getTitleMaxLines(): int = js.native
    
    /**
      * @EXPERIMENTAL (since 1.81) - this feature is experimental and the API may change.
      *
      * Sets a new value for property {@link #getIconAlt iconAlt}.
      *
      * Defines an alt text for the avatar or icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconAlt(): this.type = js.native
    def setIconAlt(/**
      * New value for property `iconAlt`
      */
    sIconAlt: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Sets a new value for property {@link #getIconBackgroundColor iconBackgroundColor}.
      *
      * Defines a background color for the avatar or icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Transparent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconBackgroundColor(): this.type = js.native
    def setIconBackgroundColor(
      /**
      * New value for property `iconBackgroundColor`
      */
    sIconBackgroundColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String
    ): this.type = js.native
    def setIconBackgroundColor(/**
      * New value for property `iconBackgroundColor`
      */
    sIconBackgroundColor: AvatarColor): this.type = js.native
    
    /**
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
      * Sets a new value for property {@link #getIconSrc iconSrc}.
      *
      * Defines the icon source.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSrc(): this.type = js.native
    def setIconSrc(/**
      * New value for property `iconSrc`
      */
    sIconSrc: URI): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Sets a new value for property {@link #getIconVisible iconVisible}.
      *
      * Defines whether the card icon is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconVisible(): this.type = js.native
    def setIconVisible(/**
      * New value for property `iconVisible`
      */
    bIconVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStatusText statusText}.
      *
      * Defines the status text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStatusText(): this.type = js.native
    def setStatusText(/**
      * New value for property `statusText`
      */
    sStatusText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitle subtitle}.
      *
      * Defines the subtitle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitle(): this.type = js.native
    def setSubtitle(/**
      * New value for property `subtitle`
      */
    sSubtitle: String): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Sets a new value for property {@link #getSubtitleMaxLines subtitleMaxLines}.
      *
      * Limits the number of lines for the subtitle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleMaxLines(): this.type = js.native
    def setSubtitleMaxLines(/**
      * New value for property `subtitleMaxLines`
      */
    iSubtitleMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title.
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
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Sets a new value for property {@link #getTitleMaxLines titleMaxLines}.
      *
      * Limits the number of lines for the title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleMaxLines(): this.type = js.native
    def setTitleMaxLines(/**
      * New value for property `titleMaxLines`
      */
    iTitleMaxLines: int): this.type = js.native
  }
  
  trait HeaderSettings
    extends StObject
       with BaseHeaderSettings {
    
    /**
      * @EXPERIMENTAL (since 1.81) - this feature is experimental and the API may change.
      *
      * Defines an alt text for the avatar or icon.
      */
    var iconAlt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Defines a background color for the avatar or icon.
      */
    var iconBackgroundColor: js.UndefOr[
        AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the shape of the icon.
      */
    var iconDisplayShape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the initials of the icon.
      */
    var iconInitials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the icon source.
      */
    var iconSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.83) - this feature is experimental and the API may change.
      *
      * Defines whether the card icon is visible.
      */
    var iconVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the user presses the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the status text.
      */
    var statusText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the subtitle.
      */
    var subtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Limits the number of lines for the subtitle.
      */
    var subtitleMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.101)
      *
      * Limits the number of lines for the title.
      */
    var titleMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object HeaderSettings {
    
    inline def apply(): HeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setIconAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconAlt", value.asInstanceOf[js.Any])
      
      inline def setIconAltUndefined: Self = StObject.set(x, "iconAlt", js.undefined)
      
      inline def setIconBackgroundColor(
        value: AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setIconBackgroundColorUndefined: Self = StObject.set(x, "iconBackgroundColor", js.undefined)
      
      inline def setIconDisplayShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconDisplayShape", value.asInstanceOf[js.Any])
      
      inline def setIconDisplayShapeUndefined: Self = StObject.set(x, "iconDisplayShape", js.undefined)
      
      inline def setIconInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconInitials", value.asInstanceOf[js.Any])
      
      inline def setIconInitialsUndefined: Self = StObject.set(x, "iconInitials", js.undefined)
      
      inline def setIconSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
      
      inline def setIconSrcUndefined: Self = StObject.set(x, "iconSrc", js.undefined)
      
      inline def setIconVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconVisible", value.asInstanceOf[js.Any])
      
      inline def setIconVisibleUndefined: Self = StObject.set(x, "iconVisible", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setStatusText(value: String | PropertyBindingInfo): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "subtitleMaxLines", value.asInstanceOf[js.Any])
      
      inline def setSubtitleMaxLinesUndefined: Self = StObject.set(x, "subtitleMaxLines", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleMaxLines", value.asInstanceOf[js.Any])
      
      inline def setTitleMaxLinesUndefined: Self = StObject.set(x, "titleMaxLines", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
