package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.AvatarColorScheme
import typings.openui5.sapUiWebcMainLibraryMod.AvatarShape
import typings.openui5.sapUiWebcMainLibraryMod.AvatarSize
import typings.openui5.sapUiWebcMainLibraryMod.IAvatar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainAvatarMod {
  
  @JSImport("sap/ui/webc/main/Avatar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Avatar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IAvatar: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Avatar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Avatar with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.main.Avatar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Avatar
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IAvatar {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Avatar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Avatar` itself.
      *
      * Fired when the user clicks the control
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Avatar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Avatar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Avatar` itself.
      *
      * Fired when the user clicks the control
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
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
    def attachClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Avatar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the image in the aggregation {@link #getImage image}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyImage(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.Avatar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClick(
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
      * Fires event {@link #event:click click} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClick(): this.type = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getColorScheme colorScheme}.
      *
      * Defines the background color of the desired image.
      *
      *  Available options are:
      * 	 - `Accent1`
      * 	 - `Accent2`
      * 	 - `Accent3`
      * 	 - `Accent4`
      * 	 - `Accent5`
      * 	 - `Accent6`
      * 	 - `Accent7`
      * 	 - `Accent8`
      * 	 - `Accent9`
      * 	 - `Accent10`
      * 	 - `Placeholder`
      *
      * Default value is `Accent6`.
      *
      * @returns Value of property `colorScheme`
      */
    def getColorScheme(): AvatarColorScheme | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColorScheme * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the name of the UI5 Icon, that will be displayed.
      *  **Note:** If `image` slot is provided, the property will be ignored.
      *  **Note:** You should import the desired icon first, then use its name as "icon".
      *
      *  import "@ui5/webcomponents-icons/dist/{icon_name}.js"
      *
      * ```javascript
      * <ui5-avatar icon="employee">```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getImage image}.
      *
      * Receives the desired `<img>` tag
      *
      * **Note:** If you experience flickering of the provided image, you can hide the component until it is
      * being defined with the following CSS:   ` ui5-avatar:not(:defined) {  visibility: hidden;
      *  }  `
      */
    def getImage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getInitials initials}.
      *
      * Defines the displayed initials.
      *  Up to two Latin letters can be displayed as initials.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `initials`
      */
    def getInitials(): String = js.native
    
    /**
      * Gets current value of property {@link #getInteractive interactive}.
      *
      * Defines if the avatar is interactive (focusable and pressable).
      *
      * Default value is `false`.
      *
      * @returns Value of property `interactive`
      */
    def getInteractive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShape shape}.
      *
      * Defines the shape of the component.
      *
      *  Available options are:
      * 	 - `Circle`
      * 	 - `Square`
      *
      * Default value is `Circle`.
      *
      * @returns Value of property `shape`
      */
    def getShape(): AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Defines predefined size of the component.
      *
      *  Available options are:
      * 	 - `XS`
      * 	 - `S`
      * 	 - `M`
      * 	 - `L`
      * 	 - `XL`
      *
      * Default value is `S`.
      *
      * @returns Value of property `size`
      */
    def getSize(): AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColorScheme colorScheme}.
      *
      * Defines the background color of the desired image.
      *
      *  Available options are:
      * 	 - `Accent1`
      * 	 - `Accent2`
      * 	 - `Accent3`
      * 	 - `Accent4`
      * 	 - `Accent5`
      * 	 - `Accent6`
      * 	 - `Accent7`
      * 	 - `Accent8`
      * 	 - `Accent9`
      * 	 - `Accent10`
      * 	 - `Placeholder`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Accent6`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColorScheme(): this.type = js.native
    def setColorScheme(
      /**
      * New value for property `colorScheme`
      */
    sColorScheme: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColorScheme * / any */ String
    ): this.type = js.native
    def setColorScheme(/**
      * New value for property `colorScheme`
      */
    sColorScheme: AvatarColorScheme): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the name of the UI5 Icon, that will be displayed.
      *  **Note:** If `image` slot is provided, the property will be ignored.
      *  **Note:** You should import the desired icon first, then use its name as "icon".
      *
      *  import "@ui5/webcomponents-icons/dist/{icon_name}.js"
      *
      * ```javascript
      * <ui5-avatar icon="employee">```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getImage image}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImage(/**
      * The image to set
      */
    oImage: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInitials initials}.
      *
      * Defines the displayed initials.
      *  Up to two Latin letters can be displayed as initials.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitials(): this.type = js.native
    def setInitials(/**
      * New value for property `initials`
      */
    sInitials: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInteractive interactive}.
      *
      * Defines if the avatar is interactive (focusable and pressable).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInteractive(): this.type = js.native
    def setInteractive(/**
      * New value for property `interactive`
      */
    bInteractive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShape shape}.
      *
      * Defines the shape of the component.
      *
      *  Available options are:
      * 	 - `Circle`
      * 	 - `Square`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Circle`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShape(): this.type = js.native
    def setShape(
      /**
      * New value for property `shape`
      */
    sShape: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String
    ): this.type = js.native
    def setShape(/**
      * New value for property `shape`
      */
    sShape: AvatarShape): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Defines predefined size of the component.
      *
      *  Available options are:
      * 	 - `XS`
      * 	 - `S`
      * 	 - `M`
      * 	 - `L`
      * 	 - `XL`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `S`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: AvatarSize): this.type = js.native
  }
  
  trait AvatarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the user clicks the control
      */
    var click: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the background color of the desired image.
      *
      *  Available options are:
      * 	 - `Accent1`
      * 	 - `Accent2`
      * 	 - `Accent3`
      * 	 - `Accent4`
      * 	 - `Accent5`
      * 	 - `Accent6`
      * 	 - `Accent7`
      * 	 - `Accent8`
      * 	 - `Accent9`
      * 	 - `Accent10`
      * 	 - `Placeholder`
      */
    var colorScheme: js.UndefOr[
        AvatarColorScheme | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColorScheme * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the name of the UI5 Icon, that will be displayed.
      *  **Note:** If `image` slot is provided, the property will be ignored.
      *  **Note:** You should import the desired icon first, then use its name as "icon".
      *
      *  import "@ui5/webcomponents-icons/dist/{icon_name}.js"
      *
      * ```javascript
      * <ui5-avatar icon="employee">```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives the desired `<img>` tag
      *
      * **Note:** If you experience flickering of the provided image, you can hide the component until it is
      * being defined with the following CSS:   ` ui5-avatar:not(:defined) {  visibility: hidden;
      *  }  `
      */
    var image: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the displayed initials.
      *  Up to two Latin letters can be displayed as initials.
      */
    var initials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines if the avatar is interactive (focusable and pressable).
      */
    var interactive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the shape of the component.
      *
      *  Available options are:
      * 	 - `Circle`
      * 	 - `Square`
      */
    var shape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines predefined size of the component.
      *
      *  Available options are:
      * 	 - `XS`
      * 	 - `S`
      * 	 - `M`
      * 	 - `L`
      * 	 - `XL`
      */
    var size: js.UndefOr[
        AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object AvatarSettings {
    
    inline def apply(): AvatarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setColorScheme(
        value: AvatarColorScheme | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColorScheme * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setInteractive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(
        value: AvatarSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
