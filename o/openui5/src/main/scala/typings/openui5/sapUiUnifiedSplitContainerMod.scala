package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.Orientation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedSplitContainerMod {
  
  @JSImport("sap/ui/unified/SplitContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SplitContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SplitContainer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SplitContainerSettings) = this()
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
    mSettings: SplitContainerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SplitContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/SplitContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.SplitContainer with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SplitContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SplitContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.SplitContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SplitContainer
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
      * Adds some secondaryContent to the aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSecondaryContent(
      /**
      * The secondaryContent to add; if empty, nothing is inserted
      */
    oSecondaryContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the secondaryContent in the aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySecondaryContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content to appear in the main area.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.22.0
      *
      * Gets current value of property {@link #getOrientation orientation}.
      *
      * Whether to show the secondary content on the left ("Horizontal", default) or on the top ("Vertical").
      *
      * Default value is `Horizontal`.
      *
      * @returns Value of property `orientation`
      */
    def getOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * The content to appear in the secondary area.
      */
    def getSecondaryContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSecondaryContentSize secondaryContentSize}.
      *
      * The width if the secondary content. The height is always 100%.
      *
      * Default value is `'250px'`.
      *
      * @returns Value of property `secondaryContentSize`
      */
    def getSecondaryContentSize(): CSSSize = js.native
    
    /**
      * @deprecated (since 1.22) - Only available for backwards compatibility.
      *
      * Gets current value of property {@link #getSecondaryContentWidth secondaryContentWidth}.
      *
      * Do not use. Use secondaryContentSize instead.
      *
      * Default value is `'250px'`.
      *
      * @returns Value of property `secondaryContentWidth`
      */
    def getSecondaryContentWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getShowSecondaryContent showSecondaryContent}.
      *
      * Shows / Hides the secondary area.
      *
      * @returns Value of property `showSecondaryContent`
      */
    def getShowSecondaryContent(): Boolean = js.native
    
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getSecondaryContent secondaryContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSecondaryContent(
      /**
      * The secondaryContent whose index is looked for
      */
    oSecondaryContent: typings.openui5.sapUiCoreControlMod.default
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
      * Inserts a secondaryContent into the aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSecondaryContent(
      /**
      * The secondaryContent to insert; if empty, nothing is inserted
      */
    oSecondaryContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the secondaryContent should be inserted at; for a negative value of `iIndex`, the
      * secondaryContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the secondaryContent is inserted at the last position
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
    
    /**
      * Removes all the controls from the aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSecondaryContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    def removeSecondaryContent(/**
      * The secondaryContent to remove or its index or id
      */
    vSecondaryContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a secondaryContent from the aggregation {@link #getSecondaryContent secondaryContent}.
      *
      * @returns The removed secondaryContent or `null`
      */
    def removeSecondaryContent(/**
      * The secondaryContent to remove or its index or id
      */
    vSecondaryContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeSecondaryContent(
      /**
      * The secondaryContent to remove or its index or id
      */
    vSecondaryContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @since 1.22.0
      *
      * Sets a new value for property {@link #getOrientation orientation}.
      *
      * Whether to show the secondary content on the left ("Horizontal", default) or on the top ("Vertical").
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Horizontal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOrientation(): this.type = js.native
    def setOrientation(
      /**
      * New value for property `orientation`
      */
    sOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String
    ): this.type = js.native
    def setOrientation(/**
      * New value for property `orientation`
      */
    sOrientation: Orientation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondaryContentSize secondaryContentSize}.
      *
      * The width if the secondary content. The height is always 100%.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'250px'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryContentSize(): this.type = js.native
    def setSecondaryContentSize(/**
      * New value for property `secondaryContentSize`
      */
    sSecondaryContentSize: CSSSize): this.type = js.native
    
    /**
      * @deprecated (since 1.22) - Only available for backwards compatibility.
      *
      * Sets a new value for property {@link #getSecondaryContentWidth secondaryContentWidth}.
      *
      * Do not use. Use secondaryContentSize instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'250px'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryContentWidth(): this.type = js.native
    def setSecondaryContentWidth(/**
      * New value for property `secondaryContentWidth`
      */
    sSecondaryContentWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSecondaryContent showSecondaryContent}.
      *
      * Shows / Hides the secondary area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSecondaryContent(): this.type = js.native
    def setShowSecondaryContent(/**
      * New value for property `showSecondaryContent`
      */
    bShowSecondaryContent: Boolean): this.type = js.native
  }
  
  trait SplitContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The content to appear in the main area.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.22.0
      *
      * Whether to show the secondary content on the left ("Horizontal", default) or on the top ("Vertical").
      */
    var orientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content to appear in the secondary area.
      */
    var secondaryContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width if the secondary content. The height is always 100%.
      */
    var secondaryContentSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.22) - Only available for backwards compatibility.
      *
      * Do not use. Use secondaryContentSize instead.
      */
    var secondaryContentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows / Hides the secondary area.
      */
    var showSecondaryContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SplitContainerSettings {
    
    inline def apply(): SplitContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSecondaryContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "secondaryContent", value.asInstanceOf[js.Any])
      
      inline def setSecondaryContentSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondaryContentSize", value.asInstanceOf[js.Any])
      
      inline def setSecondaryContentSizeUndefined: Self = StObject.set(x, "secondaryContentSize", js.undefined)
      
      inline def setSecondaryContentUndefined: Self = StObject.set(x, "secondaryContent", js.undefined)
      
      inline def setSecondaryContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "secondaryContent", js.Array(value*))
      
      inline def setSecondaryContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondaryContentWidth", value.asInstanceOf[js.Any])
      
      inline def setSecondaryContentWidthUndefined: Self = StObject.set(x, "secondaryContentWidth", js.undefined)
      
      inline def setShowSecondaryContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSecondaryContent", value.asInstanceOf[js.Any])
      
      inline def setShowSecondaryContentUndefined: Self = StObject.set(x, "showSecondaryContent", js.undefined)
    }
  }
}
