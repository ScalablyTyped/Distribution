package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMAvatarShapeMod.AvatarShape
import typings.openui5.sapMAvatarSizeMod.AvatarSize
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFeedInputMod {
  
  @JSImport("sap/m/FeedInput", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FeedInput.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FeedInput {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FeedInputSettings) = this()
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
    mSettings: FeedInputSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FeedInputSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FeedInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FeedInput with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, FeedInput]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FeedInput],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FeedInput.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FeedInput
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:post post} event of this `sap.m.FeedInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedInput` itself.
      *
      * The Post event is triggered when the user has entered a value and pressed the post button. After firing
      * this event, the value is reset.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPost(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPost(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:post post} event of this `sap.m.FeedInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedInput` itself.
      *
      * The Post event is triggered when the user has entered a value and pressed the post button. After firing
      * this event, the value is reset.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPost(
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
    def attachPost(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FeedInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:post post} event of this `sap.m.FeedInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPost(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPost(
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
      * Fires event {@link #event:post post} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePost(): this.type = js.native
    def firePost(/**
      * Parameters to pass along with the event
      */
    mParameters: Value): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAriaLabelForPicture ariaLabelForPicture}.
      *
      * Text for Picture which will be read by screenreader. If a new ariaLabelForPicture is set, any previously
      * set ariaLabelForPicture is deactivated. Deprecated as of version 1.88. This will not have any effect
      * in code now.
      *
      * @returns Value of property `ariaLabelForPicture`
      */
    def getAriaLabelForPicture(): String = js.native
    
    /**
      * @SINCE 1.28
      *
      * Gets current value of property {@link #getButtonTooltip buttonTooltip}.
      *
      * Sets a new tooltip for Submit button. The tooltip can either be a simple string (which in most cases
      * will be rendered as the title attribute of this element) or an instance of sap.ui.core.TooltipBase. If
      * a new tooltip is set, any previously set tooltip is deactivated. The default value is set language dependent.
      *
      * Default value is `"Submit"`.
      *
      * @returns Value of property `buttonTooltip`
      */
    def getButtonTooltip(): typings.openui5.sapUiCoreTooltipBaseMod.default = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Set this flag to "false" to disable both text input and post button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGrowing growing}.
      *
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content.
      *
      * Default value is `false`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGrowingMaxLines growingMaxLines}.
      *
      * Defines the maximum number of lines that the control can grow. Value is set to 0 by default, which means
      * an unlimited numbers of rows. **Note:** Minimum value to set is equal to the `rows` property value, maximum
      * value is 15.
      *
      * Default value is `0`.
      *
      * @returns Value of property `growingMaxLines`
      */
    def getGrowingMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon to be displayed as a graphical element within the feed input. This can be an image or an icon from
      * the icon font.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * Some mobile devices support higher resolution images while others do not. Therefore, you should provide
      * image resources for all relevant densities. If the property is set to "true", one or more requests are
      * sent to the server to try and get the perfect density version of an image. If an image of a certain density
      * is not available, the image control falls back to the default image, which should be provided.
      *
      * If you do not have higher resolution images, you should set the property to "false" to avoid unnecessary
      * round-trips.
      *
      * Please be aware that this property is relevant only for images and not for icons.
      *
      * Deprecated as of version 1.88. Image is replaced by avatar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * @SINCE 1.88
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
      * @SINCE 1.88
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
      * @SINCE 1.88
      *
      * Gets current value of property {@link #getIconSize iconSize}.
      *
      * Defines the size of the icon.
      *
      * Default value is `M`.
      *
      * @returns Value of property `iconSize`
      */
    def getIconSize(): AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * The maximum length (the maximum number of characters) for the feed's input value. By default this is
      * not limited.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * The placeholder text shown in the input area as long as the user has not entered any text value.
      *
      * Default value is `"Post something here"`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets current value of property {@link #getRows rows}.
      *
      * Defines the number of visible text lines for the control. **Note:** Minimum value is 2, maximum value
      * is 15.
      *
      * Default value is `2`.
      *
      * @returns Value of property `rows`
      */
    def getRows(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowExceededText showExceededText}.
      *
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false`, the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true`, the characters exceeding the `maxLength` value are selected on paste and
      * the counter below the input field displays their number.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showExceededText`
      */
    def getShowExceededText(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowIcon showIcon}.
      *
      * If set to "true" (default), icons will be displayed. In case no icon is provided the standard placeholder
      * will be displayed. if set to "false" icons are hidden
      *
      * Default value is `true`.
      *
      * @returns Value of property `showIcon`
      */
    def getShowIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The text value of the feed input. As long as the user has not entered any text the post button is disabled
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Sets a new value for property {@link #getAriaLabelForPicture ariaLabelForPicture}.
      *
      * Text for Picture which will be read by screenreader. If a new ariaLabelForPicture is set, any previously
      * set ariaLabelForPicture is deactivated. Deprecated as of version 1.88. This will not have any effect
      * in code now.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabelForPicture(): this.type = js.native
    def setAriaLabelForPicture(/**
      * New value for property `ariaLabelForPicture`
      */
    sAriaLabelForPicture: String): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Sets a new value for property {@link #getButtonTooltip buttonTooltip}.
      *
      * Sets a new tooltip for Submit button. The tooltip can either be a simple string (which in most cases
      * will be rendered as the title attribute of this element) or an instance of sap.ui.core.TooltipBase. If
      * a new tooltip is set, any previously set tooltip is deactivated. The default value is set language dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Submit"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setButtonTooltip(): this.type = js.native
    def setButtonTooltip(
      /**
      * New value for property `buttonTooltip`
      */
    sButtonTooltip: typings.openui5.sapUiCoreTooltipBaseMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Set this flag to "false" to disable both text input and post button.
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
      * Sets a new value for property {@link #getGrowing growing}.
      *
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowing(): this.type = js.native
    def setGrowing(/**
      * New value for property `growing`
      */
    bGrowing: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowingMaxLines growingMaxLines}.
      *
      * Defines the maximum number of lines that the control can grow. Value is set to 0 by default, which means
      * an unlimited numbers of rows. **Note:** Minimum value to set is equal to the `rows` property value, maximum
      * value is 15.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingMaxLines(): this.type = js.native
    def setGrowingMaxLines(/**
      * New value for property `growingMaxLines`
      */
    iGrowingMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon to be displayed as a graphical element within the feed input. This can be an image or an icon from
      * the icon font.
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
      * Some mobile devices support higher resolution images while others do not. Therefore, you should provide
      * image resources for all relevant densities. If the property is set to "true", one or more requests are
      * sent to the server to try and get the perfect density version of an image. If an image of a certain density
      * is not available, the image control falls back to the default image, which should be provided.
      *
      * If you do not have higher resolution images, you should set the property to "false" to avoid unnecessary
      * round-trips.
      *
      * Please be aware that this property is relevant only for images and not for icons.
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
      * @SINCE 1.88
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
      * @SINCE 1.88
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
      * @SINCE 1.88
      *
      * Sets a new value for property {@link #getIconSize iconSize}.
      *
      * Defines the size of the icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `M`.
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
      * Sets a new value for property {@link #getMaxLength maxLength}.
      *
      * The maximum length (the maximum number of characters) for the feed's input value. By default this is
      * not limited.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLength(): this.type = js.native
    def setMaxLength(/**
      * New value for property `maxLength`
      */
    iMaxLength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * The placeholder text shown in the input area as long as the user has not entered any text value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Post something here"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRows rows}.
      *
      * Defines the number of visible text lines for the control. **Note:** Minimum value is 2, maximum value
      * is 15.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRows(): this.type = js.native
    def setRows(/**
      * New value for property `rows`
      */
    iRows: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowExceededText showExceededText}.
      *
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false`, the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true`, the characters exceeding the `maxLength` value are selected on paste and
      * the counter below the input field displays their number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowExceededText(): this.type = js.native
    def setShowExceededText(/**
      * New value for property `showExceededText`
      */
    bShowExceededText: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIcon showIcon}.
      *
      * If set to "true" (default), icons will be displayed. In case no icon is provided the standard placeholder
      * will be displayed. if set to "false" icons are hidden
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
      * Sets a new value for property {@link #getValue value}.
      *
      * The text value of the feed input. As long as the user has not entered any text the post button is disabled
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
  }
  
  trait FeedInputSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Text for Picture which will be read by screenreader. If a new ariaLabelForPicture is set, any previously
      * set ariaLabelForPicture is deactivated. Deprecated as of version 1.88. This will not have any effect
      * in code now.
      */
    var ariaLabelForPicture: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28
      *
      * Sets a new tooltip for Submit button. The tooltip can either be a simple string (which in most cases
      * will be rendered as the title attribute of this element) or an instance of sap.ui.core.TooltipBase. If
      * a new tooltip is set, any previously set tooltip is deactivated. The default value is set language dependent.
      */
    var buttonTooltip: js.UndefOr[
        typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Set this flag to "false" to disable both text input and post button.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates the ability of the control to automatically grow and shrink dynamically with its content.
      */
    var growing: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the maximum number of lines that the control can grow. Value is set to 0 by default, which means
      * an unlimited numbers of rows. **Note:** Minimum value to set is equal to the `rows` property value, maximum
      * value is 15.
      */
    var growingMaxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Icon to be displayed as a graphical element within the feed input. This can be an image or an icon from
      * the icon font.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Some mobile devices support higher resolution images while others do not. Therefore, you should provide
      * image resources for all relevant densities. If the property is set to "true", one or more requests are
      * sent to the server to try and get the perfect density version of an image. If an image of a certain density
      * is not available, the image control falls back to the default image, which should be provided.
      *
      * If you do not have higher resolution images, you should set the property to "false" to avoid unnecessary
      * round-trips.
      *
      * Please be aware that this property is relevant only for images and not for icons.
      *
      * Deprecated as of version 1.88. Image is replaced by avatar.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.88
      *
      * Defines the shape of the icon.
      */
    var iconDisplayShape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.88
      *
      * Defines the initials of the icon.
      */
    var iconInitials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.88
      *
      * Defines the size of the icon.
      */
    var iconSize: js.UndefOr[
        AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The maximum length (the maximum number of characters) for the feed's input value. By default this is
      * not limited.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The placeholder text shown in the input area as long as the user has not entered any text value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The Post event is triggered when the user has entered a value and pressed the post button. After firing
      * this event, the value is reset.
      */
    var post: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the number of visible text lines for the control. **Note:** Minimum value is 2, maximum value
      * is 15.
      */
    var rows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines whether the characters, exceeding the maximum allowed character count, are visible in the
      * input field.
      *
      * If set to `false`, the user is not allowed to enter more characters than what is set in the `maxLength`
      * property. If set to `true`, the characters exceeding the `maxLength` value are selected on paste and
      * the counter below the input field displays their number.
      */
    var showExceededText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to "true" (default), icons will be displayed. In case no icon is provided the standard placeholder
      * will be displayed. if set to "false" icons are hidden
      */
    var showIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The text value of the feed input. As long as the user has not entered any text the post button is disabled
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FeedInputSettings {
    
    inline def apply(): FeedInputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedInputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedInputSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelForPicture(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabelForPicture", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForPictureUndefined: Self = StObject.set(x, "ariaLabelForPicture", js.undefined)
      
      inline def setButtonTooltip(
        value: typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttonTooltip", value.asInstanceOf[js.Any])
      
      inline def setButtonTooltipUndefined: Self = StObject.set(x, "buttonTooltip", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGrowing(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growingMaxLines", value.asInstanceOf[js.Any])
      
      inline def setGrowingMaxLinesUndefined: Self = StObject.set(x, "growingMaxLines", js.undefined)
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconDisplayShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconDisplayShape", value.asInstanceOf[js.Any])
      
      inline def setIconDisplayShapeUndefined: Self = StObject.set(x, "iconDisplayShape", js.undefined)
      
      inline def setIconInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconInitials", value.asInstanceOf[js.Any])
      
      inline def setIconInitialsUndefined: Self = StObject.set(x, "iconInitials", js.undefined)
      
      inline def setIconSize(
        value: AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaxLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPost(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setShowExceededText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showExceededText", value.asInstanceOf[js.Any])
      
      inline def setShowExceededTextUndefined: Self = StObject.set(x, "showExceededText", js.undefined)
      
      inline def setShowIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
