package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.openui5.sapUiWebcMainLibraryMod.ITreeItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTreeItemMod {
  
  @JSImport("sap/ui/webc/main/TreeItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TreeItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TreeItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TreeItemSettings) = this()
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
    mSettings: TreeItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_ITreeItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/TreeItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.TreeItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, TreeItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.TreeItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait TreeItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ITreeItem {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: ITreeItem): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalText additionalText}.
      *
      * Defines the `additionalText`, displayed in the end of the tree item.
      *
      * @returns Value of property `additionalText`
      */
    def getAdditionalText(): String = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalTextState additionalTextState}.
      *
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `additionalTextState`
      */
    def getAdditionalTextState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Defines whether the tree node is expanded or collapsed. Only has visual effect for tree nodes with children.
      *
      * Default value is `false`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHasChildren hasChildren}.
      *
      * Defines whether the tree node has children, even if currently no other tree nodes are slotted inside.
      *
      *  Note: This property is useful for showing big tree structures where not all nodes are initially
      * loaded due to performance reasons. Set this to `true` for nodes you intend to load lazily, when the user
      * clicks the expand button. It is not necessary to set this property otherwise. If a tree item has children,
      * the expand button will be displayed anyway.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hasChildren`
      */
    def getHasChildren(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * If set, an icon will be displayed before the text, representing the tree item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getIndeterminate indeterminate}.
      *
      * Defines whether the selection of a tree node is displayed as partially selected.
      *
      *  **Note:** The indeterminate state can be set only programatically and can’t be achieved by user interaction,
      * meaning that the resulting visual state depends on the values of the `indeterminate` and `selected` properties:
      *
      * 	 If a tree node has both `selected` and `indeterminate` set to `true`, it is displayed as partially
      * selected.  If a tree node has `selected` set to `true` and `indeterminate` set to `false`, it is
      * displayed as selected.  If a tree node has `selected` set to `false`, it is displayed as not selected
      * regardless of the value of the `indeterminate` property.
      *  **Note:** This property takes effect only when the `sap.ui.webc.main.Tree` is in `MultiSelect` mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `indeterminate`
      */
    def getIndeterminate(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of this component.
      */
    def getItems(): js.Array[ITreeItem] = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines whether the tree node is selected by the user. Only has effect if the `sap.ui.webc.main.Tree`
      * is in one of the following modes: in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd` and `MultiSelect`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the tree item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ITreeItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ITreeItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: ITreeItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[ITreeItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): ITreeItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ITreeItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ITreeItem): ITreeItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalText additionalText}.
      *
      * Defines the `additionalText`, displayed in the end of the tree item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalText(/**
      * New value for property `additionalText`
      */
    sAdditionalText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalTextState additionalTextState}.
      *
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTextState(): this.type = js.native
    def setAdditionalTextState(
      /**
      * New value for property `additionalTextState`
      */
    sAdditionalTextState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setAdditionalTextState(/**
      * New value for property `additionalTextState`
      */
    sAdditionalTextState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExpanded expanded}.
      *
      * Defines whether the tree node is expanded or collapsed. Only has visual effect for tree nodes with children.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpanded(): this.type = js.native
    def setExpanded(/**
      * New value for property `expanded`
      */
    bExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHasChildren hasChildren}.
      *
      * Defines whether the tree node has children, even if currently no other tree nodes are slotted inside.
      *
      *  Note: This property is useful for showing big tree structures where not all nodes are initially
      * loaded due to performance reasons. Set this to `true` for nodes you intend to load lazily, when the user
      * clicks the expand button. It is not necessary to set this property otherwise. If a tree item has children,
      * the expand button will be displayed anyway.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHasChildren(): this.type = js.native
    def setHasChildren(/**
      * New value for property `hasChildren`
      */
    bHasChildren: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * If set, an icon will be displayed before the text, representing the tree item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndeterminate indeterminate}.
      *
      * Defines whether the selection of a tree node is displayed as partially selected.
      *
      *  **Note:** The indeterminate state can be set only programatically and can’t be achieved by user interaction,
      * meaning that the resulting visual state depends on the values of the `indeterminate` and `selected` properties:
      *
      * 	 If a tree node has both `selected` and `indeterminate` set to `true`, it is displayed as partially
      * selected.  If a tree node has `selected` set to `true` and `indeterminate` set to `false`, it is
      * displayed as selected.  If a tree node has `selected` set to `false`, it is displayed as not selected
      * regardless of the value of the `indeterminate` property.
      *  **Note:** This property takes effect only when the `sap.ui.webc.main.Tree` is in `MultiSelect` mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndeterminate(): this.type = js.native
    def setIndeterminate(/**
      * New value for property `indeterminate`
      */
    bIndeterminate: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines whether the tree node is selected by the user. Only has effect if the `sap.ui.webc.main.Tree`
      * is in one of the following modes: in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd` and `MultiSelect`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the tree item.
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
      * Call this method to manually switch the `expanded` state of a tree item.
      */
    def toggle(): Unit = js.native
  }
  
  trait TreeItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the `additionalText`, displayed in the end of the tree item.
      */
    var additionalText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      */
    var additionalTextState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines whether the tree node is expanded or collapsed. Only has visual effect for tree nodes with children.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the tree node has children, even if currently no other tree nodes are slotted inside.
      *
      *  Note: This property is useful for showing big tree structures where not all nodes are initially
      * loaded due to performance reasons. Set this to `true` for nodes you intend to load lazily, when the user
      * clicks the expand button. It is not necessary to set this property otherwise. If a tree item has children,
      * the expand button will be displayed anyway.
      */
    var hasChildren: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, an icon will be displayed before the text, representing the tree item.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the selection of a tree node is displayed as partially selected.
      *
      *  **Note:** The indeterminate state can be set only programatically and can’t be achieved by user interaction,
      * meaning that the resulting visual state depends on the values of the `indeterminate` and `selected` properties:
      *
      * 	 If a tree node has both `selected` and `indeterminate` set to `true`, it is displayed as partially
      * selected.  If a tree node has `selected` set to `true` and `indeterminate` set to `false`, it is
      * displayed as selected.  If a tree node has `selected` set to `false`, it is displayed as not selected
      * regardless of the value of the `indeterminate` property.
      *  **Note:** This property takes effect only when the `sap.ui.webc.main.Tree` is in `MultiSelect` mode.
      */
    var indeterminate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the items of this component.
      */
    var items: js.UndefOr[
        js.Array[ITreeItem] | ITreeItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the tree node is selected by the user. Only has effect if the `sap.ui.webc.main.Tree`
      * is in one of the following modes: in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd` and `MultiSelect`.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the tree item.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TreeItemSettings {
    
    inline def apply(): TreeItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeItemSettings]
    }
    
    extension [Self <: TreeItemSettings](x: Self) {
      
      inline def setAdditionalText(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "additionalTextState", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextStateUndefined: Self = StObject.set(x, "additionalTextState", js.undefined)
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasChildren(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndeterminate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setItems(
        value: js.Array[ITreeItem] | ITreeItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ITreeItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
