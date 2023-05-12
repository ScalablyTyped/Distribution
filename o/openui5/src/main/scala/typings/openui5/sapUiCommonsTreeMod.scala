package typings.openui5

import typings.openui5.anon.Node
import typings.openui5.anon.NodeContexts
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.TreeSelectionMode
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTreeMod {
  
  @JSImport("sap/ui/commons/Tree", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Tree.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Tree {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TreeSettings) = this()
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
    mSettings: TreeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TreeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Tree with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Tree]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tree],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Tree.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Tree
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some node to the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addNode(
      /**
      * The node to add; if empty, nothing is inserted
      */
    oNode: typings.openui5.sapUiCommonsTreeNodeMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Tree` itself.
      *
      * Event is fired when a tree node is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Tree` itself.
      *
      * Event is fired when a tree node is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.commons.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Tree` itself.
      *
      * fired when the selection of the tree has been changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.commons.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Tree` itself.
      *
      * fired when the selection of the tree has been changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getNodes nodes} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindNodes(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Collapses all nodes in the tree.
      */
    def collapseAll(): Unit = js.native
    
    /**
      * Destroys all the nodes in the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNodes(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.commons.Tree`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.commons.Tree`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Expands all nodes in the tree.
      */
    def expandAll(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSelect(): Boolean = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Node): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: NodeContexts): this.type = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Tree height
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Minimal width for the Tree. Can be useful when, for example, the width is specified in percentage, to
      * avoid the tree to become too narrow when container is resize
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.19
      *
      * Returns the node with the given context, or null if no such node currently exists.
      *
      * @returns The found tree node
      */
    def getNodeByContext(
      /**
      * The context of the node to be retrieved
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): typings.openui5.sapUiCommonsTreeNodeMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNodes nodes}.
      *
      * First level nodes
      */
    def getNodes(): js.Array[typings.openui5.sapUiCommonsTreeNodeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the Tree.
      *
      * Default value is `Legacy`.
      *
      * @returns Value of property `selectionMode`
      */
    def getSelectionMode(): TreeSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeSelectionMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * Tree Header is display. If false, the tree will be in a transparent mode
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHeaderIcons showHeaderIcons}.
      *
      * Show Header icons (e.g. Expand/Collapse all). Only consider if showHeader is true
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeaderIcons`
      */
    def getShowHeaderIcons(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHorizontalScrollbar showHorizontalScrollbar}.
      *
      * Display horizontal scrollbar. If false, the overflow content will be hidden
      *
      * Default value is `false`.
      *
      * @returns Value of property `showHorizontalScrollbar`
      */
    def getShowHorizontalScrollbar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Tree title
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Tree width
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.TreeNode` in the aggregation {@link #getNodes nodes}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfNode(
      /**
      * The node whose index is looked for
      */
    oNode: typings.openui5.sapUiCommonsTreeNodeMod.default
    ): int = js.native
    
    /**
      * Inserts a node into the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertNode(
      /**
      * The node to insert; if empty, nothing is inserted
      */
    oNode: typings.openui5.sapUiCommonsTreeNodeMod.default,
      /**
      * The `0`-based index the node should be inserted at; for a negative value of `iIndex`, the node is inserted
      * at position 0; for a value greater than the current size of the aggregation, the node is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getNodes nodes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllNodes(): js.Array[typings.openui5.sapUiCommonsTreeNodeMod.default] = js.native
    
    def removeNode(/**
      * The node to remove or its index or id
      */
    vNode: String): typings.openui5.sapUiCommonsTreeNodeMod.default | Null = js.native
    /**
      * Removes a node from the aggregation {@link #getNodes nodes}.
      *
      * @returns The removed node or `null`
      */
    def removeNode(/**
      * The node to remove or its index or id
      */
    vNode: int): typings.openui5.sapUiCommonsTreeNodeMod.default | Null = js.native
    def removeNode(
      /**
      * The node to remove or its index or id
      */
    vNode: typings.openui5.sapUiCommonsTreeNodeMod.default
    ): typings.openui5.sapUiCommonsTreeNodeMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Tree height
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Minimal width for the Tree. Can be useful when, for example, the width is specified in percentage, to
      * avoid the tree to become too narrow when container is resize
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    sMinWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the Tree.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Legacy`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionMode(): this.type = js.native
    def setSelectionMode(
      /**
      * New value for property `selectionMode`
      */
    sSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeSelectionMode * / any */ String
    ): this.type = js.native
    def setSelectionMode(/**
      * New value for property `selectionMode`
      */
    sSelectionMode: TreeSelectionMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * Tree Header is display. If false, the tree will be in a transparent mode
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeaderIcons showHeaderIcons}.
      *
      * Show Header icons (e.g. Expand/Collapse all). Only consider if showHeader is true
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeaderIcons(): this.type = js.native
    def setShowHeaderIcons(/**
      * New value for property `showHeaderIcons`
      */
    bShowHeaderIcons: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHorizontalScrollbar showHorizontalScrollbar}.
      *
      * Display horizontal scrollbar. If false, the overflow content will be hidden
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHorizontalScrollbar(): this.type = js.native
    def setShowHorizontalScrollbar(/**
      * New value for property `showHorizontalScrollbar`
      */
    bShowHorizontalScrollbar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Tree title
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Tree width
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getNodes nodes} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindNodes(): this.type = js.native
  }
  
  trait TreeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Tree height
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Minimal width for the Tree. Can be useful when, for example, the width is specified in percentage, to
      * avoid the tree to become too narrow when container is resize
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * First level nodes
      */
    var nodes: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsTreeNodeMod.default] | typings.openui5.sapUiCommonsTreeNodeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when a tree node is selected.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * fired when the selection of the tree has been changed
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Selection mode of the Tree.
      */
    var selectionMode: js.UndefOr[
        TreeSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeSelectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Tree Header is display. If false, the tree will be in a transparent mode
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Show Header icons (e.g. Expand/Collapse all). Only consider if showHeader is true
      */
    var showHeaderIcons: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Display horizontal scrollbar. If false, the overflow content will be hidden
      */
    var showHorizontalScrollbar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Tree title
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Tree width
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TreeSettings {
    
    inline def apply(): TreeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeSettings] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setNodes(
        value: js.Array[typings.openui5.sapUiCommonsTreeNodeMod.default] | typings.openui5.sapUiCommonsTreeNodeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: typings.openui5.sapUiCommonsTreeNodeMod.default*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSelectionMode(
        value: TreeSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TreeSelectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderIcons(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeaderIcons", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderIconsUndefined: Self = StObject.set(x, "showHeaderIcons", js.undefined)
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowHorizontalScrollbar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHorizontalScrollbar", value.asInstanceOf[js.Any])
      
      inline def setShowHorizontalScrollbarUndefined: Self = StObject.set(x, "showHorizontalScrollbar", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
