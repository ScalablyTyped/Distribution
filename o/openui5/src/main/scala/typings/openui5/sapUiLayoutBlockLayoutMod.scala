package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiLayoutLibraryMod.BlockBackgroundType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutBlockLayoutMod {
  
  @JSImport("sap/ui/layout/BlockLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BlockLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/block-layout/ Block Layout}
    */
  open class default () extends BlockLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutSettings) = this()
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
    mSettings: BlockLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/BlockLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.BlockLayout with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, BlockLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BlockLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.BlockLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BlockLayout
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
    oContent: typings.openui5.sapUiLayoutBlockLayoutRowMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @SINCE 1.42
      *
      * Gets current value of property {@link #getBackground background}.
      *
      * Determines the background used for the Layout
      *
      * Default value is `"Default"`.
      *
      * @returns Value of property `background`
      */
    def getBackground(): BlockBackgroundType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBackgroundType * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The Rows to be included in the content of the control
      */
    def getContent(): js.Array[typings.openui5.sapUiLayoutBlockLayoutRowMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getKeepFontSize keepFontSize}.
      *
      * Keeps the font-size of the contents as is, independent from the screen size.
      *
      * Default value is `false`.
      *
      * @returns Value of property `keepFontSize`
      */
    def getKeepFontSize(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.layout.BlockLayoutRow` in the aggregation {@link #getContent content}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiLayoutBlockLayoutRowMod.default
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
    oContent: typings.openui5.sapUiLayoutBlockLayoutRowMod.default,
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
    def removeAllContent(): js.Array[typings.openui5.sapUiLayoutBlockLayoutRowMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiLayoutBlockLayoutRowMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiLayoutBlockLayoutRowMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiLayoutBlockLayoutRowMod.default
    ): typings.openui5.sapUiLayoutBlockLayoutRowMod.default | Null = js.native
    
    /**
      * @SINCE 1.42
      *
      * Sets a new value for property {@link #getBackground background}.
      *
      * Determines the background used for the Layout
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Default"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackground(): this.type = js.native
    def setBackground(
      /**
      * New value for property `background`
      */
    sBackground: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBackgroundType * / any */ String
    ): this.type = js.native
    def setBackground(/**
      * New value for property `background`
      */
    sBackground: BlockBackgroundType): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getKeepFontSize keepFontSize}.
      *
      * Keeps the font-size of the contents as is, independent from the screen size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeepFontSize(): this.type = js.native
    def setKeepFontSize(/**
      * New value for property `keepFontSize`
      */
    bKeepFontSize: Boolean): this.type = js.native
  }
  
  trait BlockLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.42
      *
      * Determines the background used for the Layout
      */
    var background: js.UndefOr[
        BlockBackgroundType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBackgroundType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The Rows to be included in the content of the control
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiLayoutBlockLayoutRowMod.default] | typings.openui5.sapUiLayoutBlockLayoutRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Keeps the font-size of the contents as is, independent from the screen size.
      */
    var keepFontSize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BlockLayoutSettings {
    
    inline def apply(): BlockLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockLayoutSettings]
    }
    
    extension [Self <: BlockLayoutSettings](x: Self) {
      
      inline def setBackground(
        value: BlockBackgroundType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockBackgroundType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiLayoutBlockLayoutRowMod.default] | typings.openui5.sapUiLayoutBlockLayoutRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiLayoutBlockLayoutRowMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setKeepFontSize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "keepFontSize", value.asInstanceOf[js.Any])
      
      inline def setKeepFontSizeUndefined: Self = StObject.set(x, "keepFontSize", js.undefined)
    }
  }
}
