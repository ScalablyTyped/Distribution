package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedShellLayoutMod {
  
  @JSImport("sap/ui/unified/ShellLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ShellLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ShellLayout {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ShellLayoutSettings) = this()
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
    mSettings: ShellLayoutSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ShellLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/ShellLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.ShellLayout with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ShellLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ShellLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.ShellLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ShellLayout
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
      * Adds some paneContent to the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addPaneContent(
      /**
      * The paneContent to add; if empty, nothing is inserted
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Destroys all the paneContent in the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPaneContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content to appear in the main canvas.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * The control to appear in the header area.
      */
    def getHeader(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeaderHiding headerHiding}.
      *
      * Whether the header can be hidden (manually or automatically). This feature is only available when touch
      * events are supported.
      *
      * Default value is `false`.
      *
      * @returns Value of property `headerHiding`
      */
    def getHeaderHiding(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeaderVisible headerVisible}.
      *
      * If set to false, no header (and no items, search, ...) is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerVisible`
      */
    def getHeaderVisible(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getPaneContent paneContent}.
      *
      * The content to appear in the pane area.
      */
    def getPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowPane showPane}.
      *
      * Shows / Hides the side pane.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showPane`
      */
    def getShowPane(): Boolean = js.native
    
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getPaneContent paneContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPaneContent(
      /**
      * The paneContent whose index is looked for
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default
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
      * Inserts a paneContent into the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPaneContent(
      /**
      * The paneContent to insert; if empty, nothing is inserted
      */
    oPaneContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the paneContent should be inserted at; for a negative value of `iIndex`, the paneContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the paneContent
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
    
    /**
      * Removes all the controls from the aggregation {@link #getPaneContent paneContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    def removePaneContent(/**
      * The paneContent to remove or its index or id
      */
    vPaneContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a paneContent from the aggregation {@link #getPaneContent paneContent}.
      *
      * @returns The removed paneContent or `null`
      */
    def removePaneContent(/**
      * The paneContent to remove or its index or id
      */
    vPaneContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removePaneContent(
      /**
      * The paneContent to remove or its index or id
      */
    vPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * The header to set
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderHiding headerHiding}.
      *
      * Whether the header can be hidden (manually or automatically). This feature is only available when touch
      * events are supported.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderHiding(): this.type = js.native
    def setHeaderHiding(/**
      * New value for property `headerHiding`
      */
    bHeaderHiding: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderVisible headerVisible}.
      *
      * If set to false, no header (and no items, search, ...) is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderVisible(): this.type = js.native
    def setHeaderVisible(/**
      * New value for property `headerVisible`
      */
    bHeaderVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPane showPane}.
      *
      * Shows / Hides the side pane.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPane(): this.type = js.native
    def setShowPane(/**
      * New value for property `showPane`
      */
    bShowPane: Boolean): this.type = js.native
  }
  
  trait ShellLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The content to appear in the main canvas.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The control to appear in the header area.
      */
    var header: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Whether the header can be hidden (manually or automatically). This feature is only available when touch
      * events are supported.
      */
    var headerHiding: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to false, no header (and no items, search, ...) is shown.
      */
    var headerVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content to appear in the pane area.
      */
    var paneContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows / Hides the side pane.
      */
    var showPane: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ShellLayoutSettings {
    
    inline def apply(): ShellLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setHeader(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderHiding(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerHiding", value.asInstanceOf[js.Any])
      
      inline def setHeaderHidingUndefined: Self = StObject.set(x, "headerHiding", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
      
      inline def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
      
      inline def setPaneContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "paneContent", value.asInstanceOf[js.Any])
      
      inline def setPaneContentUndefined: Self = StObject.set(x, "paneContent", js.undefined)
      
      inline def setPaneContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "paneContent", js.Array(value*))
      
      inline def setShowPane(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
      
      inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
    }
  }
}
