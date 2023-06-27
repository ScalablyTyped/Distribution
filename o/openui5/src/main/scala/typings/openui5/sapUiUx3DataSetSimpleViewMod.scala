package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.DataSetView
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3DataSetSimpleViewMod {
  
  @JSImport("sap/ui/ux3/DataSetSimpleView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DataSetSimpleView.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DataSetSimpleView {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DataSetSimpleViewSettings) = this()
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
    mSettings: DataSetSimpleViewSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DataSetSimpleViewSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_ux3_DataSetView: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/DataSetSimpleView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.DataSetSimpleView with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, DataSetSimpleView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DataSetSimpleView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.DataSetSimpleView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DataSetSimpleView
    extends typings.openui5.sapUiCoreControlMod.default
       with DataSetView {
    
    /**
      * Destroys the template in the aggregation {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTemplate(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * View finalization: Called when leaving the view
      */
    def exitView(aItems: js.Array[typings.openui5.sapUiUx3DataSetItemMod.default]): Unit = js.native
    
    /**
      * Gets current value of property {@link #getFloating floating}.
      *
      * When true the DatSet items are floating containers. When set to false The Items are rendered in a 1 column
      * Layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `floating`
      */
    def getFloating(): Boolean = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getHeight height}.
      *
      * If the pagination feature is used without specifying a scroll area, a height for the dataset must be
      * defined.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon source for this view
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconHovered iconHovered}.
      *
      * icon: hovered state
      *
      * @returns Value of property `iconHovered`
      */
    def getIconHovered(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconSelected iconSelected}.
      *
      * icon: selected state
      *
      * @returns Value of property `iconSelected`
      */
    def getIconSelected(): URI = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getInitialItemCount initialItemCount}.
      *
      * If this value is greater zero only this amount of items is loaded in the first place. New items are loaded
      * automatically when the user scrolls down. The number of items which are reloaded can be defined with
      * the property "reloadItemCount"
      *
      * Default value is `0`.
      *
      * @returns Value of property `initialItemCount`
      */
    def getInitialItemCount(): int = js.native
    
    /**
      * @since 1.9.2
      *
      * Gets current value of property {@link #getItemMinWidth itemMinWidth}.
      *
      * When itemMinWidth>0 and the property floating is true the given minimum width in pixels is set to DatSet
      * items. A minimum width must be given when the property responsive is set.
      *
      * Default value is `0`.
      *
      * @returns Value of property `itemMinWidth`
      */
    def getItemMinWidth(): int = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Name of the View
      *
      * Default value is `"Name of this View"`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getReloadItemCount reloadItemCount}.
      *
      * This number defines the item count which is reloaded on scroll if initialItemCount is enabled.
      *
      * Default value is `0`.
      *
      * @returns Value of property `reloadItemCount`
      */
    def getReloadItemCount(): int = js.native
    
    /**
      * @since 1.9.2
      *
      * Gets current value of property {@link #getResponsive responsive}.
      *
      * When true and the property floating is true the DatSet items are floating containers filling the whole
      * space of a row.
      *
      * Default value is `false`.
      *
      * @returns Value of property `responsive`
      */
    def getResponsive(): Boolean = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getScrollArea scrollArea}.
      *
      * ID of the DOM Element or jQuery reference to the dom which holds the scrollbar for the dataset
      *
      * @returns Value of property `scrollArea`
      */
    def getScrollArea(): Any = js.native
    
    /**
      * Gets content of aggregation {@link #getTemplate template}.
      *
      * template
      */
    def getTemplate(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Eventhandler for the selection of an Item
      */
    def handleSelection(/**
      * SelectionChanged event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * View Initialization: Called when selecting the view
      */
    def initView(/**
      * Array of DataSetItems added to the parent DataSet
      */
    aItems: js.Array[Any]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Check if Item `oItem` is selected
      */
    def isItemSelected(/**
      * DataSetItem instance
      */
    oItem: typings.openui5.sapUiUx3DataSetItemMod.default): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getFloating floating}.
      *
      * When true the DatSet items are floating containers. When set to false The Items are rendered in a 1 column
      * Layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFloating(): this.type = js.native
    def setFloating(/**
      * New value for property `floating`
      */
    bFloating: Boolean): this.type = js.native
    
    /**
      * @since 1.13.0
      *
      * Sets a new value for property {@link #getHeight height}.
      *
      * If the pagination feature is used without specifying a scroll area, a height for the dataset must be
      * defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon source for this view
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconHovered iconHovered}.
      *
      * icon: hovered state
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconHovered(): this.type = js.native
    def setIconHovered(/**
      * New value for property `iconHovered`
      */
    sIconHovered: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconSelected iconSelected}.
      *
      * icon: selected state
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconSelected(): this.type = js.native
    def setIconSelected(/**
      * New value for property `iconSelected`
      */
    sIconSelected: URI): this.type = js.native
    
    /**
      * @since 1.13.0
      *
      * Sets a new value for property {@link #getInitialItemCount initialItemCount}.
      *
      * If this value is greater zero only this amount of items is loaded in the first place. New items are loaded
      * automatically when the user scrolls down. The number of items which are reloaded can be defined with
      * the property "reloadItemCount"
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialItemCount(): this.type = js.native
    def setInitialItemCount(/**
      * New value for property `initialItemCount`
      */
    iInitialItemCount: int): this.type = js.native
    
    /**
      * @since 1.9.2
      *
      * Sets a new value for property {@link #getItemMinWidth itemMinWidth}.
      *
      * When itemMinWidth>0 and the property floating is true the given minimum width in pixels is set to DatSet
      * items. A minimum width must be given when the property responsive is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemMinWidth(): this.type = js.native
    def setItemMinWidth(/**
      * New value for property `itemMinWidth`
      */
    iItemMinWidth: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Name of the View
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Name of this View"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * @since 1.13.0
      *
      * Sets a new value for property {@link #getReloadItemCount reloadItemCount}.
      *
      * This number defines the item count which is reloaded on scroll if initialItemCount is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReloadItemCount(): this.type = js.native
    def setReloadItemCount(/**
      * New value for property `reloadItemCount`
      */
    iReloadItemCount: int): this.type = js.native
    
    /**
      * @since 1.9.2
      *
      * Sets a new value for property {@link #getResponsive responsive}.
      *
      * When true and the property floating is true the DatSet items are floating containers filling the whole
      * space of a row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResponsive(): this.type = js.native
    def setResponsive(/**
      * New value for property `responsive`
      */
    bResponsive: Boolean): this.type = js.native
    
    def setScrollArea(aScrollArea: js.Array[Any], bSupress: Boolean): Unit = js.native
    
    /**
      * Sets the aggregated {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTemplate(/**
      * The template to set
      */
    oTemplate: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * View update: Called when pagination adds items
      */
    def updateView(
      /**
      * Array of DataSetItems added to the parent DataSet
      */
    aDiff: js.Array[typings.openui5.sapUiUx3DataSetItemMod.default]
    ): Unit = js.native
  }
  
  trait DataSetSimpleViewSettings
    extends StObject
       with ControlSettings {
    
    /**
      * When true the DatSet items are floating containers. When set to false The Items are rendered in a 1 column
      * Layout.
      */
    var floating: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * If the pagination feature is used without specifying a scroll area, a height for the dataset must be
      * defined.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Icon source for this view
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * icon: hovered state
      */
    var iconHovered: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * icon: selected state
      */
    var iconSelected: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * If this value is greater zero only this amount of items is loaded in the first place. New items are loaded
      * automatically when the user scrolls down. The number of items which are reloaded can be defined with
      * the property "reloadItemCount"
      */
    var initialItemCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.9.2
      *
      * When itemMinWidth>0 and the property floating is true the given minimum width in pixels is set to DatSet
      * items. A minimum width must be given when the property responsive is set.
      */
    var itemMinWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Name of the View
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * This number defines the item count which is reloaded on scroll if initialItemCount is enabled.
      */
    var reloadItemCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.9.2
      *
      * When true and the property floating is true the DatSet items are floating containers filling the whole
      * space of a row.
      */
    var responsive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * ID of the DOM Element or jQuery reference to the dom which holds the scrollbar for the dataset
      */
    var scrollArea: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * template
      */
    var template: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object DataSetSimpleViewSettings {
    
    inline def apply(): DataSetSimpleViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSetSimpleViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetSimpleViewSettings] (val x: Self) extends AnyVal {
      
      inline def setFloating(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconHovered(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHovered", value.asInstanceOf[js.Any])
      
      inline def setIconHoveredUndefined: Self = StObject.set(x, "iconHovered", js.undefined)
      
      inline def setIconSelected(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconSelected", value.asInstanceOf[js.Any])
      
      inline def setIconSelectedUndefined: Self = StObject.set(x, "iconSelected", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitialItemCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "initialItemCount", value.asInstanceOf[js.Any])
      
      inline def setInitialItemCountUndefined: Self = StObject.set(x, "initialItemCount", js.undefined)
      
      inline def setItemMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemMinWidth", value.asInstanceOf[js.Any])
      
      inline def setItemMinWidthUndefined: Self = StObject.set(x, "itemMinWidth", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReloadItemCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "reloadItemCount", value.asInstanceOf[js.Any])
      
      inline def setReloadItemCountUndefined: Self = StObject.set(x, "reloadItemCount", js.undefined)
      
      inline def setResponsive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setScrollArea(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollArea", value.asInstanceOf[js.Any])
      
      inline def setScrollAreaUndefined: Self = StObject.set(x, "scrollArea", js.undefined)
      
      inline def setTemplate(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
