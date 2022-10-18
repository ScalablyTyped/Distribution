package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.BusyIndicatorSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainBusyIndicatorMod {
  
  @JSImport("sap/ui/webc/main/BusyIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BusyIndicator`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BusyIndicator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BusyIndicatorSettings) = this()
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
    mSettings: BusyIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BusyIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/BusyIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.BusyIndicator with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, BusyIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BusyIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.BusyIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait BusyIndicator
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActive active}.
      *
      * Defines if the busy indicator is visible on the screen. By default it is not.
      *
      * Default value is `false`.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Determines the content over which the component will appear.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDelay delay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will be visible on the screen.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `delay`
      */
    def getDelay(): int = js.native
    
    /**
      * Gets current value of property {@link #getDisplay display}.
      *
      * Defines whether the control will be rendered as a block or inline HTML element
      *
      * Default value is `"inline-block"`.
      *
      * @returns Value of property `display`
      */
    def getDisplay(): String = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Defines the size of the component.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `Small`
      * 	 - `Medium`
      * 	 - `Large`
      *
      * Default value is `Medium`.
      *
      * @returns Value of property `size`
      */
    def getSize(): BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines text to be displayed below the component. It can be used to inform the user of the current operation.
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getActive active}.
      *
      * Defines if the busy indicator is visible on the screen. By default it is not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDelay delay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will be visible on the screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelay(): this.type = js.native
    def setDelay(/**
      * New value for property `delay`
      */
    iDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplay display}.
      *
      * Defines whether the control will be rendered as a block or inline HTML element
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"inline-block"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplay(): this.type = js.native
    def setDisplay(/**
      * New value for property `display`
      */
    sDisplay: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Defines the size of the component.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `Small`
      * 	 - `Medium`
      * 	 - `Large`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Medium`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: BusyIndicatorSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines text to be displayed below the component. It can be used to inform the user of the current operation.
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
  }
  
  trait BusyIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines if the busy indicator is visible on the screen. By default it is not.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the content over which the component will appear.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will be visible on the screen.
      */
    var delay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines whether the control will be rendered as a block or inline HTML element
      */
    var display: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the size of the component.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `Small`
      * 	 - `Medium`
      * 	 - `Large`
      */
    var size: js.UndefOr[
        BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines text to be displayed below the component. It can be used to inform the user of the current operation.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BusyIndicatorSettings {
    
    inline def apply(): BusyIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusyIndicatorSettings]
    }
    
    extension [Self <: BusyIndicatorSettings](x: Self) {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisplay(value: String | PropertyBindingInfo): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setSize(
        value: BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
