package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionMode
import typings.openui5.sapUxapObjectPageSectionBaseMod.ObjectPageSectionBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageSubSectionMod {
  
  @JSImport("sap/uxap/ObjectPageSubSection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageSubSection`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageSubSection {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSubSectionSettings) = this()
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
    mSettings: ObjectPageSubSectionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageSubSectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageSubSection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageSubSection with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.uxap.ObjectPageSectionBase.extend}.
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
    oClassInfo: ClassInfo[T, ObjectPageSubSection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageSubSection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageSubSection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageSubSection
    extends typings.openui5.sapUxapObjectPageSectionBaseMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some block to the aggregation {@link #getBlocks blocks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addBlock(
      /**
      * The block to add; if empty, nothing is inserted
      */
    oBlock: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some moreBlock to the aggregation {@link #getMoreBlocks moreBlocks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMoreBlock(
      /**
      * The moreBlock to add; if empty, nothing is inserted
      */
    oMoreBlock: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the blocks in the aggregation {@link #getBlocks blocks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBlocks(): this.type = js.native
    
    /**
      * Destroys all the moreBlocks in the aggregation {@link #getMoreBlocks moreBlocks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMoreBlocks(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Actions available for this subsection.
      *
      * Although this aggregation accepts type `sap.ui.core.Control`, it is strongly recommended to use only
      * simple controls, such as buttons, so that the layout of the app is preserved.
      *
      * **Note:** Keep in mind that the controls set in the `actions` aggregation of `ObjectPageSubSection` do
      * NOT have overflow behavior. If the available space is not enough, the controls will be displayed on more
      * lines.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getBlocks blocks}.
      *
      * Controls to be displayed in the subsection
      *
      * **Note:** The SAP Fiori Design guidelines require that the `ObjectPageHeader`'s content and the `ObjectPage`'s
      * subsection content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel},
      * {@link sap.m.Table} and {@link sap.m.List} in the subsection content area of `ObjectPage`, if the content
      * is not already aligned, you need to adjust their left text offset to achieve the vertical alignment.
      * To do this, apply the `sapUxAPObjectPageSubSectionAlignContent` CSS class to them and set their `width`
      * property to `auto` (if not set by default).
      *
      * Don't use the `sapUxAPObjectPageSubSectionAlignContent` CSS class in the following cases:
      * 	 - In combination with `ResponsiveLayout`, because `ResponsiveLayout` applies custom paddings. To align
      * 			items with `sapUxAPObjectPageSubSectionAlignContent`, use `ColumnLayout`.
      * 	 - If there are multiple controls in the same `ObjectPageSubSection`, because the CSS class interferes
      * 			with their alignment.  Example:
      *
      *
      * ```javascript
      *
      * ` <Form class="sapUxAPObjectPageSubSectionAlignContent" width="auto"></Form> `
      * ```
      */
    def getBlocks(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * A mode property that will be passed to the controls in the blocks and moreBlocks aggregations. Only relevant
      * if these aggregations use Object page blocks.
      *
      * Default value is `Collapsed`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ObjectPageSubSectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionMode * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getMoreBlocks moreBlocks}.
      *
      * Additional controls to display when the Show more / See all / (...) button is pressed
      */
    def getMoreBlocks(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getShowTitle showTitle}.
      *
      * Determines whether to display the `SubSection` title or not.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title even if this property is set to `false`. To hide the title of a subsection
      * which is the only one (or the only one visible), you need to set the `showTitle` properties to `false`
      * for both the section and its subsection.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showTitle`
      */
    def getShowTitle(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitleUppercase titleUppercase}.
      *
      * Determines whether the Subsection title is displayed in upper case.
      *
      * Default value is `false`.
      *
      * @returns Value of property `titleUppercase`
      */
    def getTitleUppercase(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getBlocks blocks}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBlock(
      /**
      * The block whose index is looked for
      */
    oBlock: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMoreBlocks moreBlocks}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMoreBlock(
      /**
      * The moreBlock whose index is looked for
      */
    oMoreBlock: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Adds an `sap.uxap.BlockBase` instance to the `blocks` aggregation.
      *
      * **Note:** The `insertBlock` method is not supported by design. If used, it works as an `addBlock`, adding
      * a single block to the end of the `blocks` aggregation.
      *
      * @returns The `sap.uxap.ObjectPageSubSection` instance
      */
    def insertBlock(
      /**
      * The `sap.uxap.BlockBase` instance
      */
    oObject: typings.openui5.sapUxapBlockBaseMod.default,
      /**
      * The insertion index
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Adds an `sap.uxap.BlockBase` instance to the `moreBlocks` aggregation.
      *
      * **Note:** The `insertMoreBlock` method is not supported by design. If used, it works as an `addMoreBlock`,
      * adding a single block to the end of the `moreBlocks` aggregation.
      *
      * @returns The `sap.uxap.ObjectPageSubSection` instance
      */
    def insertMoreBlock(
      /**
      * The `sap.uxap.BlockBase` instance
      */
    oObject: typings.openui5.sapUxapBlockBaseMod.default,
      /**
      * The insertion index
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getBlocks blocks}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllBlocks(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMoreBlocks moreBlocks}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMoreBlocks(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeBlock(/**
      * The block to remove or its index or id
      */
    vBlock: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a block from the aggregation {@link #getBlocks blocks}.
      *
      * @returns The removed block or `null`
      */
    def removeBlock(/**
      * The block to remove or its index or id
      */
    vBlock: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeBlock(
      /**
      * The block to remove or its index or id
      */
    vBlock: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeMoreBlock(/**
      * The moreBlock to remove or its index or id
      */
    vMoreBlock: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a moreBlock from the aggregation {@link #getMoreBlocks moreBlocks}.
      *
      * @returns The removed moreBlock or `null`
      */
    def removeMoreBlock(/**
      * The moreBlock to remove or its index or id
      */
    vMoreBlock: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMoreBlock(
      /**
      * The moreBlock to remove or its index or id
      */
    vMoreBlock: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * A mode property that will be passed to the controls in the blocks and moreBlocks aggregations. Only relevant
      * if these aggregations use Object page blocks.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Collapsed`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ObjectPageSubSectionMode): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getShowTitle showTitle}.
      *
      * Determines whether to display the `SubSection` title or not.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title even if this property is set to `false`. To hide the title of a subsection
      * which is the only one (or the only one visible), you need to set the `showTitle` properties to `false`
      * for both the section and its subsection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTitle(): this.type = js.native
    def setShowTitle(/**
      * New value for property `showTitle`
      */
    bShowTitle: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleUppercase titleUppercase}.
      *
      * Determines whether the Subsection title is displayed in upper case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleUppercase(): this.type = js.native
    def setTitleUppercase(/**
      * New value for property `titleUppercase`
      */
    bTitleUppercase: Boolean): this.type = js.native
  }
  
  trait ObjectPageSubSectionSettings
    extends StObject
       with ObjectPageSectionBaseSettings {
    
    /**
      * Actions available for this subsection.
      *
      * Although this aggregation accepts type `sap.ui.core.Control`, it is strongly recommended to use only
      * simple controls, such as buttons, so that the layout of the app is preserved.
      *
      * **Note:** Keep in mind that the controls set in the `actions` aggregation of `ObjectPageSubSection` do
      * NOT have overflow behavior. If the available space is not enough, the controls will be displayed on more
      * lines.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Controls to be displayed in the subsection
      *
      * **Note:** The SAP Fiori Design guidelines require that the `ObjectPageHeader`'s content and the `ObjectPage`'s
      * subsection content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel},
      * {@link sap.m.Table} and {@link sap.m.List} in the subsection content area of `ObjectPage`, if the content
      * is not already aligned, you need to adjust their left text offset to achieve the vertical alignment.
      * To do this, apply the `sapUxAPObjectPageSubSectionAlignContent` CSS class to them and set their `width`
      * property to `auto` (if not set by default).
      *
      * Don't use the `sapUxAPObjectPageSubSectionAlignContent` CSS class in the following cases:
      * 	 - In combination with `ResponsiveLayout`, because `ResponsiveLayout` applies custom paddings. To align
      * 			items with `sapUxAPObjectPageSubSectionAlignContent`, use `ColumnLayout`.
      * 	 - If there are multiple controls in the same `ObjectPageSubSection`, because the CSS class interferes
      * 			with their alignment.  Example:
      *
      *
      * ```javascript
      *
      * ` <Form class="sapUxAPObjectPageSubSectionAlignContent" width="auto"></Form> `
      * ```
      */
    var blocks: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A mode property that will be passed to the controls in the blocks and moreBlocks aggregations. Only relevant
      * if these aggregations use Object page blocks.
      */
    var mode: js.UndefOr[
        ObjectPageSubSectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Additional controls to display when the Show more / See all / (...) button is pressed
      */
    var moreBlocks: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Determines whether to display the `SubSection` title or not.
      *
      * **Note:** If a subsection is the only one (or the only one visible) within a section, its title is displayed
      * instead of the section title even if this property is set to `false`. To hide the title of a subsection
      * which is the only one (or the only one visible), you need to set the `showTitle` properties to `false`
      * for both the section and its subsection.
      */
    var showTitle: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Subsection title is displayed in upper case.
      */
    var titleUppercase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ObjectPageSubSectionSettings {
    
    inline def apply(): ObjectPageSubSectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageSubSectionSettings]
    }
    
    extension [Self <: ObjectPageSubSectionSettings](x: Self) {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBlocks(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setBlocksVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setMode(
        value: ObjectPageSubSectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMoreBlocks(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "moreBlocks", value.asInstanceOf[js.Any])
      
      inline def setMoreBlocksUndefined: Self = StObject.set(x, "moreBlocks", js.undefined)
      
      inline def setMoreBlocksVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "moreBlocks", js.Array(value*))
      
      inline def setShowTitle(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      inline def setTitleUppercase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleUppercase", value.asInstanceOf[js.Any])
      
      inline def setTitleUppercaseUndefined: Self = StObject.set(x, "titleUppercase", js.undefined)
    }
  }
}
