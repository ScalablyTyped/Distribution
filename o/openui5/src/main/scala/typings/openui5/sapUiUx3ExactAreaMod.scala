package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ExactAreaMod {
  
  @JSImport("sap/ui/ux3/ExactArea", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExactArea.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExactArea {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExactAreaSettings) = this()
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
    mSettings: ExactAreaSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExactAreaSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ExactArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ExactArea with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ExactArea]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExactArea],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ExactArea.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ExactArea
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
      * Adds some toolbarItem to the aggregation {@link #getToolbarItems toolbarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToolbarItem(/**
      * The toolbarItem to add; if empty, nothing is inserted
      */
    oToolbarItem: ToolbarItem): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the toolbarItems in the aggregation {@link #getToolbarItems toolbarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbarItems(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Arbitrary child controls of the content area
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getToolbarItems toolbarItems}.
      *
      * Tool bar items which shall be shown in the tool bar.
      */
    def getToolbarItems(): js.Array[ToolbarItem] = js.native
    
    /**
      * Gets current value of property {@link #getToolbarVisible toolbarVisible}.
      *
      * Specifies whether the tool bar shall be visible
      *
      * Default value is `true`.
      *
      * @returns Value of property `toolbarVisible`
      */
    def getToolbarVisible(): Boolean = js.native
    
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
      * Checks for the provided `sap.ui.commons.ToolbarItem` in the aggregation {@link #getToolbarItems toolbarItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToolbarItem(/**
      * The toolbarItem whose index is looked for
      */
    oToolbarItem: ToolbarItem): int = js.native
    
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
      * Inserts a toolbarItem into the aggregation {@link #getToolbarItems toolbarItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToolbarItem(
      /**
      * The toolbarItem to insert; if empty, nothing is inserted
      */
    oToolbarItem: ToolbarItem,
      /**
      * The `0`-based index the toolbarItem should be inserted at; for a negative value of `iIndex`, the toolbarItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the toolbarItem
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
      * Removes all the controls from the aggregation {@link #getToolbarItems toolbarItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllToolbarItems(): js.Array[ToolbarItem] = js.native
    
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
    
    def removeToolbarItem(/**
      * The toolbarItem to remove or its index or id
      */
    vToolbarItem: String): ToolbarItem | Null = js.native
    /**
      * Removes a toolbarItem from the aggregation {@link #getToolbarItems toolbarItems}.
      *
      * @returns The removed toolbarItem or `null`
      */
    def removeToolbarItem(/**
      * The toolbarItem to remove or its index or id
      */
    vToolbarItem: int): ToolbarItem | Null = js.native
    def removeToolbarItem(/**
      * The toolbarItem to remove or its index or id
      */
    vToolbarItem: ToolbarItem): ToolbarItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getToolbarVisible toolbarVisible}.
      *
      * Specifies whether the tool bar shall be visible
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbarVisible(): this.type = js.native
    def setToolbarVisible(/**
      * New value for property `toolbarVisible`
      */
    bToolbarVisible: Boolean): this.type = js.native
  }
  
  trait ExactAreaSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Arbitrary child controls of the content area
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Tool bar items which shall be shown in the tool bar.
      */
    var toolbarItems: js.UndefOr[
        js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the tool bar shall be visible
      */
    var toolbarVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ExactAreaSettings {
    
    inline def apply(): ExactAreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactAreaSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExactAreaSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setToolbarItems(
        value: js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "toolbarItems", value.asInstanceOf[js.Any])
      
      inline def setToolbarItemsUndefined: Self = StObject.set(x, "toolbarItems", js.undefined)
      
      inline def setToolbarItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "toolbarItems", js.Array(value*))
      
      inline def setToolbarVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toolbarVisible", value.asInstanceOf[js.Any])
      
      inline def setToolbarVisibleUndefined: Self = StObject.set(x, "toolbarVisible", js.undefined)
    }
  }
}
