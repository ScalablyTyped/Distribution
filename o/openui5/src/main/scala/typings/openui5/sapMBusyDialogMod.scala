package typings.openui5

import typings.openui5.anon.CancelPressed
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.TitleAlignment
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBusyDialogMod {
  
  @JSImport("sap/m/BusyDialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BusyDialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/busydialog Busy Dialog}
    */
  open class default () extends BusyDialog {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: BusyDialogSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new control.
      */
    mSettings: BusyDialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: BusyDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/BusyDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.BusyDialog with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, BusyDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BusyDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.BusyDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BusyDialog
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.BusyDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.BusyDialog` itself.
      *
      * Fires when the busy dialog is closed. Note: the BusyDialog will not be closed by the InstanceManager.closeAllDialogs
      * method
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.BusyDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.BusyDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.BusyDialog` itself.
      *
      * Fires when the busy dialog is closed. Note: the BusyDialog will not be closed by the InstanceManager.closeAllDialogs
      * method
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
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
    def attachClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.BusyDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the BusyDialog.
      *
      * @returns The modified BusyDialog.
      */
    def close(): this.type = js.native
    def close(
      /**
      * Indicates if the BusyDialog is closed from a user interaction.
      */
    isClosedFromUserInteraction: Boolean
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.m.BusyDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
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
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: CancelPressed): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getCancelButtonText cancelButtonText}.
      *
      * The text of the cancel button. The default text is "Cancel" (translated to the respective language).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `cancelButtonText`
      */
    def getCancelButtonText(): String = js.native
    
    /**
      * Gets current value of property {@link #getCustomIcon customIcon}.
      *
      * Icon, used from the BusyIndicator. This icon is invisible in iOS platform and it is density aware. You
      * can use the density convention (@2, @1.5, etc.) to provide higher resolution image for higher density
      * screens.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `customIcon`
      */
    def getCustomIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconDensityAware customIconDensityAware}.
      *
      * If this is set to `false`, the source image will be loaded directly without attempting to fetch the density
      * perfect image for high density devices. By default, this is set to `true` but then one or more requests
      * are sent trying to get the density perfect version of the image.
      *
      * If bandwidth is the key for the application, set this value to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `customIconDensityAware`
      */
    def getCustomIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconHeight customIconHeight}.
      *
      * Height of the provided icon with default value "44px".
      *
      * Default value is `"44px"`.
      *
      * @returns Value of property `customIconHeight`
      */
    def getCustomIconHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconRotationSpeed customIconRotationSpeed}.
      *
      * Defines the rotation speed of the given image. If GIF file is used, the speed has to be set to 0. The
      * value is in milliseconds.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `customIconRotationSpeed`
      */
    def getCustomIconRotationSpeed(): int = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconWidth customIconWidth}.
      *
      * Width of the provided icon with default value "44px".
      *
      * Default value is `"44px"`.
      *
      * @returns Value of property `customIconWidth`
      */
    def getCustomIconWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getShowCancelButton showCancelButton}.
      *
      * Indicates if the cancel button will be rendered inside the busy dialog. The default value is set to `false`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCancelButton`
      */
    def getShowCancelButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Optional text displayed inside the dialog.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Sets the title of the BusyDialog. The default value is an empty string.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) = js.native
    
    /**
      * Opens the BusyDialog.
      *
      * @returns BusyDialog reference for chaining.
      */
    def open(): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
      * Shows the text for the cancel button.
      *
      * @returns The modified BusyDialog.
      */
    def setCancelButtonText(/**
      * Text for the cancel button.
      */
    sText: String): this.type = js.native
    
    /**
      * Sets custom icon.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setCustomIcon(/**
      * Icon to use as a busy animation.
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets the density of the custom icon.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setCustomIconDensityAware(
      /**
      * Determines if the source image will be loaded directly without attempting to fetch the density for high
      * density devices.
      */
    bIsDensityAware: Boolean
    ): this.type = js.native
    
    /**
      * Sets the height of the custom icon.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setCustomIconHeight(/**
      * Height of the provided icon in CSSSize.
      */
    sHeight: String): this.type = js.native
    
    /**
      * Sets the rotation speed of the custom icon.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setCustomIconRotationSpeed(/**
      * Defines the rotation speed of the given image.
      */
    iSpeed: int): this.type = js.native
    
    /**
      * Sets the width of the custom icon.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setCustomIconWidth(/**
      * Width of the provided icon in CSSSize.
      */
    sWidth: String): this.type = js.native
    
    /**
      * Shows the cancel button.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setShowCancelButton(/**
      * Determines if the Cancel button is shown.
      */
    bIsCancelButtonShown: Boolean): this.type = js.native
    
    /**
      * Sets the text for the BusyDialog.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setText(/**
      * The text for the BusyDialog.
      */
    sText: String): this.type = js.native
    
    /**
      * Sets the title for the BusyDialog.
      *
      * @returns BusyDialog reference for chaining.
      */
    def setTitle(/**
      * The title for the BusyDialog.
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: TitleAlignment): this.type = js.native
  }
  
  trait BusyDialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * The text of the cancel button. The default text is "Cancel" (translated to the respective language).
      */
    var cancelButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fires when the busy dialog is closed. Note: the BusyDialog will not be closed by the InstanceManager.closeAllDialogs
      * method
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Icon, used from the BusyIndicator. This icon is invisible in iOS platform and it is density aware. You
      * can use the density convention (@2, @1.5, etc.) to provide higher resolution image for higher density
      * screens.
      */
    var customIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If this is set to `false`, the source image will be loaded directly without attempting to fetch the density
      * perfect image for high density devices. By default, this is set to `true` but then one or more requests
      * are sent trying to get the density perfect version of the image.
      *
      * If bandwidth is the key for the application, set this value to `false`.
      */
    var customIconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Height of the provided icon with default value "44px".
      */
    var customIconHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the rotation speed of the given image. If GIF file is used, the speed has to be set to 0. The
      * value is in milliseconds.
      */
    var customIconRotationSpeed: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Width of the provided icon with default value "44px".
      */
    var customIconWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the cancel button will be rendered inside the busy dialog. The default value is set to `false`.
      */
    var showCancelButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional text displayed inside the dialog.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the title of the BusyDialog. The default value is an empty string.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Specifies the Title alignment (theme specific). If set to `TitleAlignment.Auto`, the Title will be aligned
      * as it is set in the theme (if not set, the default value is `center`); Other possible values are `TitleAlignment.Start`
      * (left or right depending on LTR/RTL), and `TitleAlignment.Center` (centered)
      */
    var titleAlignment: js.UndefOr[
        TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object BusyDialogSettings {
    
    inline def apply(): BusyDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusyDialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BusyDialogSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCancelButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCustomIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setCustomIconDensityAwareUndefined: Self = StObject.set(x, "customIconDensityAware", js.undefined)
      
      inline def setCustomIconHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconHeight", value.asInstanceOf[js.Any])
      
      inline def setCustomIconHeightUndefined: Self = StObject.set(x, "customIconHeight", js.undefined)
      
      inline def setCustomIconRotationSpeed(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconRotationSpeed", value.asInstanceOf[js.Any])
      
      inline def setCustomIconRotationSpeedUndefined: Self = StObject.set(x, "customIconRotationSpeed", js.undefined)
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      inline def setCustomIconWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconWidth", value.asInstanceOf[js.Any])
      
      inline def setCustomIconWidthUndefined: Self = StObject.set(x, "customIconWidth", js.undefined)
      
      inline def setShowCancelButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
      
      inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: TitleAlignment | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleAlignment * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
