package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTreeNodeMod {
  
  @JSImport("sap/ui/commons/TreeNode", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TreeNode.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TreeNode {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TreeNodeSettings) = this()
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
    mSettings: TreeNodeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TreeNodeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/TreeNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.TreeNode with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, TreeNode]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeNode],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.TreeNode.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TreeNode
    extends typings.openui5.sapUiCoreElementMod.default {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some node to the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addNode(/**
      * The node to add; if empty, nothing is inserted
      */
    oNode: TreeNode): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selected selected} event of this `sap.ui.commons.TreeNode`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TreeNode` itself.
      *
      * Node is selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TreeNode` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selected selected} event of this `sap.ui.commons.TreeNode`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TreeNode` itself.
      *
      * Node is selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TreeNode` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.ui.commons.TreeNode`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TreeNode` itself.
      *
      * Node state has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit]
    ): this.type = js.native
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TreeNode` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.ui.commons.TreeNode`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TreeNode` itself.
      *
      * Node state has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit]
    ): this.type = js.native
    def attachToggleOpenState(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TreeNode` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Collapses the node.
      */
    def collapse(
      /**
      * Propagates collapse to node's children
      */
    bCollapseChildren: Boolean,
      /**
      * Disables the collapse finished handler
      */
    bDisableCollapseFinishedHandler: Boolean
    ): Unit = js.native
    
    /**
      * Destroys all the nodes in the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNodes(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selected selected} event of this `sap.ui.commons.TreeNode`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:toggleOpenState toggleOpenState} event of
      * this `sap.ui.commons.TreeNode`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit]
    ): this.type = js.native
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TreeNodeToggleOpenStateEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Expands the node.
      */
    def expand(
      /**
      * Propagates expand to node's children
      */
    bExpandChildren: Boolean,
      /**
      * Disables the expand finished handler
      */
    bDisableExpandFinishedHandler: Boolean
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selected selected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelected(): this.type = js.native
    def fireSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:toggleOpenState toggleOpenState} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleOpenState(): this.type = js.native
    def fireToggleOpenState(
      /**
      * Parameters to pass along with the event
      */
    mParameters: TreeNode$ToggleOpenStateEventParameters
    ): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Node is expanded
      *
      * Default value is `true`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHasExpander hasExpander}.
      *
      * Should the node has an expander.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hasExpander`
      */
    def getHasExpander(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon to display in front of the node
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIsSelected isSelected}.
      *
      * Node is selected
      *
      * Default value is `false`.
      *
      * @returns Value of property `isSelected`
      */
    def getIsSelected(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getNodes nodes}.
      *
      * Subnodes for the current node
      */
    def getNodes(): js.Array[TreeNode] = js.native
    
    /**
      * Gets current value of property {@link #getSelectable selectable}.
      *
      * The node is selectable. If true, clicking on the node text triggers "selected" event
      *
      * Default value is `true`.
      *
      * @returns Value of property `selectable`
      */
    def getSelectable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Node text
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.TreeNode` in the aggregation {@link #getNodes nodes}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfNode(/**
      * The node whose index is looked for
      */
    oNode: TreeNode): int = js.native
    
    /**
      * Inserts a node into the aggregation {@link #getNodes nodes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertNode(
      /**
      * The node to insert; if empty, nothing is inserted
      */
    oNode: TreeNode,
      /**
      * The `0`-based index the node should be inserted at; for a negative value of `iIndex`, the node is inserted
      * at position 0; for a value greater than the current size of the aggregation, the node is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getNodes nodes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllNodes(): js.Array[TreeNode] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeNode(/**
      * The node to remove or its index or id
      */
    vNode: String): TreeNode | Null = js.native
    /**
      * Removes a node from the aggregation {@link #getNodes nodes}.
      *
      * @returns The removed node or `null`
      */
    def removeNode(/**
      * The node to remove or its index or id
      */
    vNode: int): TreeNode | Null = js.native
    def removeNode(/**
      * The node to remove or its index or id
      */
    vNode: TreeNode): TreeNode | Null = js.native
    
    /**
      * Select the node, and if any, deselects the previously selected node
      */
    def select(bSuppressEvent: Boolean): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getExpanded expanded}.
      *
      * Node is expanded
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpanded(): this.type = js.native
    def setExpanded(/**
      * New value for property `expanded`
      */
    bExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHasExpander hasExpander}.
      *
      * Should the node has an expander.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHasExpander(): this.type = js.native
    def setHasExpander(/**
      * New value for property `hasExpander`
      */
    bHasExpander: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon to display in front of the node
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
      * Redefinition of Setter for property `isSelected` for validation purpose
      *
      * Default value is empty/`undefined`
      *
      * @returns `this` to allow method chaining
      */
    def setIsSelected(/**
      * new value for property `isSelected`
      */
    bIsSelected: Boolean): this.type = js.native
    
    /**
      * Redefinition of Setter for property `selectable` for validation purpose.
      *
      * Default value is `true`
      *
      * @returns `this` to allow method chaining
      */
    def setSelectable(/**
      * new value for property `selectable`
      */
    bSelectable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Node text
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait TreeNode$SelectedEventParameters extends StObject
  
  trait TreeNode$ToggleOpenStateEventParameters extends StObject {
    
    /**
      * Node has been opened if true
      */
    var opened: js.UndefOr[Boolean] = js.undefined
  }
  object TreeNode$ToggleOpenStateEventParameters {
    
    inline def apply(): TreeNode$ToggleOpenStateEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNode$ToggleOpenStateEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNode$ToggleOpenStateEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    }
  }
  
  type TreeNodeSelectedEvent = typings.openui5.sapUiBaseEventMod.default[TreeNode$SelectedEventParameters]
  
  type TreeNodeSelectedEventParameters = TreeNode$SelectedEventParameters
  
  trait TreeNodeSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Node is expanded
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Should the node has an expander.
      */
    var hasExpander: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Icon to display in front of the node
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Node is selected
      */
    var isSelected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Subnodes for the current node
      */
    var nodes: js.UndefOr[
        js.Array[TreeNode] | TreeNode | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The node is selectable. If true, clicking on the node text triggers "selected" event
      */
    var selectable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Node is selected
      */
    var selected: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Node text
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Node state has changed.
      */
    var toggleOpenState: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TreeNode$ToggleOpenStateEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object TreeNodeSettings {
    
    inline def apply(): TreeNodeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNodeSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasExpander(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hasExpander", value.asInstanceOf[js.Any])
      
      inline def setHasExpanderUndefined: Self = StObject.set(x, "hasExpander", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setNodes(
        value: js.Array[TreeNode] | TreeNode | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: TreeNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setSelectable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "selected", js.Any.fromFunction1(value))
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setToggleOpenState(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TreeNode$ToggleOpenStateEventParameters] => Unit
      ): Self = StObject.set(x, "toggleOpenState", js.Any.fromFunction1(value))
      
      inline def setToggleOpenStateUndefined: Self = StObject.set(x, "toggleOpenState", js.undefined)
    }
  }
  
  type TreeNodeToggleOpenStateEvent = typings.openui5.sapUiBaseEventMod.default[TreeNode$ToggleOpenStateEventParameters]
  
  type TreeNodeToggleOpenStateEventParameters = TreeNode$ToggleOpenStateEventParameters
}
