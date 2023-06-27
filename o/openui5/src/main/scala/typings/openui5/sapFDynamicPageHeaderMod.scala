package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFDynamicPageHeaderMod {
  
  @JSImport("sap/f/DynamicPageHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DynamicPageHeader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DynamicPageHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DynamicPageHeaderSettings) = this()
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
    mSettings: DynamicPageHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DynamicPageHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/DynamicPageHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.DynamicPageHeader with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DynamicPageHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicPageHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.DynamicPageHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DynamicPageHeader
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * @since 1.58
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `DynamicPageHeader`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of the header.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getPinnable pinnable}.
      *
      * Determines whether the header is pinnable.
      *
      * Default value is `true`.
      *
      * @returns Value of property `pinnable`
      */
    def getPinnable(): Boolean = js.native
    
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
    
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * @since 1.58
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `DynamicPageHeader`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPinnable pinnable}.
      *
      * Determines whether the header is pinnable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPinnable(): this.type = js.native
    def setPinnable(/**
      * New value for property `pinnable`
      */
    bPinnable: Boolean): this.type = js.native
  }
  
  trait DynamicPageHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.58
      *
      * Determines the background color of the `DynamicPageHeader`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content of the header.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the header is pinnable.
      */
    var pinnable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DynamicPageHeaderSettings {
    
    inline def apply(): DynamicPageHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicPageHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPageHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setPinnable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
      
      inline def setPinnableUndefined: Self = StObject.set(x, "pinnable", js.undefined)
    }
  }
}
