package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.ToastPlacement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainToastMod {
  
  @JSImport("sap/ui/webc/main/Toast", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Toast`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Toast {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToastSettings) = this()
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
    mSettings: ToastSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToastSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Toast with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Toast]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Toast],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Toast.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Toast
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Gets current value of property {@link #getDuration duration}.
      *
      * Defines the duration in milliseconds for which component remains on the screen before it's automatically
      * closed.
      *
      *  **Note:** The minimum supported value is `500` ms and even if a lower value is set, the duration would
      * remain `500` ms.
      *
      * Default value is `3000`.
      *
      * @returns Value of property `duration`
      */
    def getDuration(): int = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getPlacement placement}.
      *
      * Defines the placement of the component.
      *
      *  Available options are:
      * 	 - `TopStart`
      * 	 - `TopCenter`
      * 	 - `TopEnd`
      * 	 - `MiddleStart`
      * 	 - `MiddleCenter`
      * 	 - `MiddleEnd`
      * 	 - `BottomStart`
      * 	 - `BottomCenter`
      * 	 - `BottomEnd`
      *
      * Default value is `BottomCenter`.
      *
      * @returns Value of property `placement`
      */
    def getPlacement(): ToastPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToastPlacement * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getDuration duration}.
      *
      * Defines the duration in milliseconds for which component remains on the screen before it's automatically
      * closed.
      *
      *  **Note:** The minimum supported value is `500` ms and even if a lower value is set, the duration would
      * remain `500` ms.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDuration(): this.type = js.native
    def setDuration(/**
      * New value for property `duration`
      */
    iDuration: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlacement placement}.
      *
      * Defines the placement of the component.
      *
      *  Available options are:
      * 	 - `TopStart`
      * 	 - `TopCenter`
      * 	 - `TopEnd`
      * 	 - `MiddleStart`
      * 	 - `MiddleCenter`
      * 	 - `MiddleEnd`
      * 	 - `BottomStart`
      * 	 - `BottomCenter`
      * 	 - `BottomEnd`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `BottomCenter`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlacement(): this.type = js.native
    def setPlacement(
      /**
      * New value for property `placement`
      */
    sPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToastPlacement * / any */ String
    ): this.type = js.native
    def setPlacement(/**
      * New value for property `placement`
      */
    sPlacement: ToastPlacement): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the content of the control
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Shows the component.
      */
    def show(): Unit = js.native
  }
  
  trait ToastSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the duration in milliseconds for which component remains on the screen before it's automatically
      * closed.
      *
      *  **Note:** The minimum supported value is `500` ms and even if a lower value is set, the duration would
      * remain `500` ms.
      */
    var duration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the placement of the component.
      *
      *  Available options are:
      * 	 - `TopStart`
      * 	 - `TopCenter`
      * 	 - `TopEnd`
      * 	 - `MiddleStart`
      * 	 - `MiddleCenter`
      * 	 - `MiddleEnd`
      * 	 - `BottomStart`
      * 	 - `BottomCenter`
      * 	 - `BottomEnd`
      */
    var placement: js.UndefOr[
        ToastPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToastPlacement * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToastSettings {
    
    inline def apply(): ToastSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastSettings]
    }
    
    extension [Self <: ToastSettings](x: Self) {
      
      inline def setDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPlacement(
        value: ToastPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToastPlacement * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
