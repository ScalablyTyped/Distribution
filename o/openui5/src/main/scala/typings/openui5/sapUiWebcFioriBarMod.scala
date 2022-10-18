package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcFioriLibraryMod.BarDesign
import typings.openui5.sapUiWebcFioriLibraryMod.IBar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriBarMod {
  
  @JSImport("sap/ui/webc/fiori/Bar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Bar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Bar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BarSettings) = this()
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
    mSettings: BarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BarSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IBar: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/Bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.Bar with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Bar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Bar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.Bar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Bar
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IBar {
    
    /**
      * Adds some endContent to the aggregation {@link #getEndContent endContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addEndContent(
      /**
      * The endContent to add; if empty, nothing is inserted
      */
    oEndContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some middleContent to the aggregation {@link #getMiddleContent middleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMiddleContent(
      /**
      * The middleContent to add; if empty, nothing is inserted
      */
    oMiddleContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some startContent to the aggregation {@link #getStartContent startContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStartContent(
      /**
      * The startContent to add; if empty, nothing is inserted
      */
    oStartContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the endContent in the aggregation {@link #getEndContent endContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndContent(): this.type = js.native
    
    /**
      * Destroys all the middleContent in the aggregation {@link #getMiddleContent middleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMiddleContent(): this.type = js.native
    
    /**
      * Destroys all the startContent in the aggregation {@link #getStartContent startContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStartContent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the component's design.
      *
      *
      *
      *  **Note:** Available options are:
      * 	 - `Header`
      * 	 - `Subheader`
      * 	 - `Footer`
      * 	 - `FloatingFooter`
      *
      * Default value is `Header`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getEndContent endContent}.
      *
      * Defines the content at the end of the bar
      */
    def getEndContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getMiddleContent middleContent}.
      *
      * Defines the content in the middle of the bar
      */
    def getMiddleContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getStartContent startContent}.
      *
      * Defines the content at the start of the bar
      */
    def getStartContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getEndContent endContent}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfEndContent(
      /**
      * The endContent whose index is looked for
      */
    oEndContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMiddleContent middleContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMiddleContent(
      /**
      * The middleContent whose index is looked for
      */
    oMiddleContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getStartContent startContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStartContent(
      /**
      * The startContent whose index is looked for
      */
    oStartContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a endContent into the aggregation {@link #getEndContent endContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertEndContent(
      /**
      * The endContent to insert; if empty, nothing is inserted
      */
    oEndContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the endContent should be inserted at; for a negative value of `iIndex`, the endContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the endContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a middleContent into the aggregation {@link #getMiddleContent middleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMiddleContent(
      /**
      * The middleContent to insert; if empty, nothing is inserted
      */
    oMiddleContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the middleContent should be inserted at; for a negative value of `iIndex`, the middleContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the middleContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a startContent into the aggregation {@link #getStartContent startContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertStartContent(
      /**
      * The startContent to insert; if empty, nothing is inserted
      */
    oStartContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the startContent should be inserted at; for a negative value of `iIndex`, the startContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the startContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getEndContent endContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllEndContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMiddleContent middleContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMiddleContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getStartContent startContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllStartContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeEndContent(/**
      * The endContent to remove or its index or id
      */
    vEndContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a endContent from the aggregation {@link #getEndContent endContent}.
      *
      * @returns The removed endContent or `null`
      */
    def removeEndContent(/**
      * The endContent to remove or its index or id
      */
    vEndContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeEndContent(
      /**
      * The endContent to remove or its index or id
      */
    vEndContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeMiddleContent(/**
      * The middleContent to remove or its index or id
      */
    vMiddleContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a middleContent from the aggregation {@link #getMiddleContent middleContent}.
      *
      * @returns The removed middleContent or `null`
      */
    def removeMiddleContent(/**
      * The middleContent to remove or its index or id
      */
    vMiddleContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMiddleContent(
      /**
      * The middleContent to remove or its index or id
      */
    vMiddleContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeStartContent(/**
      * The startContent to remove or its index or id
      */
    vStartContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a startContent from the aggregation {@link #getStartContent startContent}.
      *
      * @returns The removed startContent or `null`
      */
    def removeStartContent(/**
      * The startContent to remove or its index or id
      */
    vStartContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeStartContent(
      /**
      * The startContent to remove or its index or id
      */
    vStartContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the component's design.
      *
      *
      *
      *  **Note:** Available options are:
      * 	 - `Header`
      * 	 - `Subheader`
      * 	 - `Footer`
      * 	 - `FloatingFooter`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Header`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: BarDesign): this.type = js.native
    
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
  
  trait BarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the component's design.
      *
      *
      *
      *  **Note:** Available options are:
      * 	 - `Header`
      * 	 - `Subheader`
      * 	 - `Footer`
      * 	 - `FloatingFooter`
      */
    var design: js.UndefOr[
        BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the content at the end of the bar
      */
    var endContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content in the middle of the bar
      */
    var middleContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content at the start of the bar
      */
    var startContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BarSettings {
    
    inline def apply(): BarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarSettings]
    }
    
    extension [Self <: BarSettings](x: Self) {
      
      inline def setDesign(
        value: BarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BarDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEndContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "endContent", value.asInstanceOf[js.Any])
      
      inline def setEndContentUndefined: Self = StObject.set(x, "endContent", js.undefined)
      
      inline def setEndContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "endContent", js.Array(value*))
      
      inline def setMiddleContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "middleContent", value.asInstanceOf[js.Any])
      
      inline def setMiddleContentUndefined: Self = StObject.set(x, "middleContent", js.undefined)
      
      inline def setMiddleContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "middleContent", js.Array(value*))
      
      inline def setStartContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "startContent", value.asInstanceOf[js.Any])
      
      inline def setStartContentUndefined: Self = StObject.set(x, "startContent", js.undefined)
      
      inline def setStartContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "startContent", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
