package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3CollectionInspectorMod {
  
  @JSImport("sap/ui/ux3/CollectionInspector", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CollectionInspector.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CollectionInspector {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CollectionInspectorSettings) = this()
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
    mSettings: CollectionInspectorSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CollectionInspectorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/CollectionInspector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.CollectionInspector with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, CollectionInspector]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CollectionInspector],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.CollectionInspector.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CollectionInspector
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some collection `oCollection` to the aggregation named `collections`.
      *
      * @returns `this` to allow method chaining
      */
    def addCollection(
      /**
      * the collection to add; if empty, nothing is inserted
      */
    oCollection: typings.openui5.sapUiUx3CollectionMod.default
    ): this.type = js.native
    
    /**
      * Adds some content `oContent` to the aggregation named `content`.
      *
      * @returns `this` to allow method chaining
      */
    def addContent(
      /**
      * the content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:collectionSelected collectionSelected} event
      * of this `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Event is fired if user selects a collection
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCollectionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCollectionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:collectionSelected collectionSelected} event
      * of this `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Event is fired if user selects a collection
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCollectionSelected(
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
    def attachCollectionSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:editCollection editCollection} event of this
      * `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Fires when the edit button is clicked
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEditCollection(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachEditCollection(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:editCollection editCollection} event of this
      * `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Fires when the edit button is clicked
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEditCollection(
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
    def attachEditCollection(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelectionChanged itemSelectionChanged} event
      * of this `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Fires when an item in a collection is selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelectionChanged itemSelectionChanged} event
      * of this `sap.ui.ux3.CollectionInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.CollectionInspector` itself.
      *
      * Fires when an item in a collection is selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelectionChanged(
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
    def attachItemSelectionChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.CollectionInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the siedebar
      */
    def closeSidebar(): Unit = js.native
    
    /**
      * Destroys the collection aggregation
      *
      * @returns this to allow method chaining
      */
    def destroyCollections(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation named `content`.
      *
      * @returns `this` to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:collectionSelected collectionSelected} event
      * of this `sap.ui.ux3.CollectionInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCollectionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCollectionSelected(
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
      * Detaches event handler `fnFunction` from the {@link #event:editCollection editCollection} event of this
      * `sap.ui.ux3.CollectionInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachEditCollection(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachEditCollection(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemSelectionChanged itemSelectionChanged}
      * event of this `sap.ui.ux3.CollectionInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelectionChanged(
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
      * Fires event {@link #event:collectionSelected collectionSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCollectionSelected(): this.type = js.native
    def fireCollectionSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:editCollection editCollection} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireEditCollection(): this.type = js.native
    def fireEditCollection(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:itemSelectionChanged itemSelectionChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelectionChanged(): this.type = js.native
    def fireItemSelectionChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCollections collections}.
      *
      * Collections which are displayed in the COllectionInspector
      */
    def getCollections(): js.Array[typings.openui5.sapUiUx3CollectionMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * All controls that are currently displayed
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Return the edit button
      */
    def getEditButton(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getFitParent fitParent}.
      *
      * If set to true, control will fit parents content area
      *
      * Default value is `true`.
      *
      * @returns Value of property `fitParent`
      */
    def getFitParent(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedCollection selectedCollection},
      * or `null`.
      */
    def getSelectedCollection(): ID = js.native
    
    /**
      * Gets current value of property {@link #getSidebarVisible sidebarVisible}.
      *
      * Defines if the list of collection items is visible on the left
      *
      * Default value is `true`.
      *
      * @returns Value of property `sidebarVisible`
      */
    def getSidebarVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.Collection` in the aggregation {@link #getCollections collections}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCollection(
      /**
      * The collection whose index is looked for
      */
    oCollection: typings.openui5.sapUiUx3CollectionMod.default
    ): int = js.native
    
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
      * Inserts a collection into the aggregation named `collections`.
      *
      * @returns `this` to allow method chaining
      */
    def insertCollection(
      /**
      * the collection to insert; if empty, nothing is inserted
      */
    oCollection: typings.openui5.sapUiUx3CollectionMod.default,
      /**
      * the `0`-based index the collection should be inserted at; for a negative value of `iIndex`, the collection
      * is inserted at position 0; for a value greater than the current size of the aggregation, the collection
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a content into the aggregation named `content`.
      *
      * @returns `this` to allow method chaining
      */
    def insertContent(
      /**
      * the content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * the `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the sidebar
      */
    def openSidebar(): Unit = js.native
    
    /**
      * Removes all the controls in the aggregation named `collections`.
      *  Additionally unregisters them from the hosting UIArea.
      *
      * @returns an array of the removed elements (might be empty)
      */
    def removeAllCollections(): js.Array[typings.openui5.sapUiUx3CollectionMod.default] = js.native
    
    /**
      * Removes all the controls in the aggregation named `content`.
      *  Additionally unregisters them from the hosting UIArea.
      *
      * @returns an array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeCollection(/**
      * the collection to remove or its index or ID
      */
    vCollection: String): typings.openui5.sapUiUx3CollectionMod.default | Null = js.native
    /**
      * Removes a collection from the aggregation named `collections`.
      *
      * @returns the removed collection or `null`
      */
    def removeCollection(/**
      * the collection to remove or its index or ID
      */
    vCollection: int): typings.openui5.sapUiUx3CollectionMod.default | Null = js.native
    def removeCollection(
      /**
      * the collection to remove or its index or ID
      */
    vCollection: typings.openui5.sapUiUx3CollectionMod.default
    ): typings.openui5.sapUiUx3CollectionMod.default | Null = js.native
    
    def removeContent(/**
      * the content to remove or its index or ID
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation named `content`.
      *
      * @returns the removed content or `null`
      */
    def removeContent(/**
      * the content to remove or its index or ID
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * the content to remove or its index or ID
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFitParent fitParent}.
      *
      * If set to true, control will fit parents content area
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFitParent(): this.type = js.native
    def setFitParent(/**
      * New value for property `fitParent`
      */
    bFitParent: Boolean): this.type = js.native
    
    /**
      * Sets the associated {@link #getSelectedCollection selectedCollection}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedCollection(
      /**
      * ID of an element which becomes the new target of this selectedCollection association; alternatively,
      * an element instance may be given
      */
    oSelectedCollection: ID
    ): this.type = js.native
    def setSelectedCollection(
      /**
      * ID of an element which becomes the new target of this selectedCollection association; alternatively,
      * an element instance may be given
      */
    oSelectedCollection: typings.openui5.sapUiUx3CollectionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSidebarVisible sidebarVisible}.
      *
      * Defines if the list of collection items is visible on the left
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidebarVisible(): this.type = js.native
    def setSidebarVisible(/**
      * New value for property `sidebarVisible`
      */
    bSidebarVisible: Boolean): this.type = js.native
  }
  
  trait CollectionInspectorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired if user selects a collection
      */
    var collectionSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Collections which are displayed in the COllectionInspector
      */
    var collections: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3CollectionMod.default] | typings.openui5.sapUiUx3CollectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * All controls that are currently displayed
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the edit button is clicked
      */
    var editCollection: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to true, control will fit parents content area
      */
    var fitParent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when an item in a collection is selected
      */
    var itemSelectionChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Collection which is currently selected
      */
    var selectedCollection: js.UndefOr[typings.openui5.sapUiUx3CollectionMod.default | String] = js.undefined
    
    /**
      * Defines if the list of collection items is visible on the left
      */
    var sidebarVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CollectionInspectorSettings {
    
    inline def apply(): CollectionInspectorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionInspectorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionInspectorSettings] (val x: Self) extends AnyVal {
      
      inline def setCollectionSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "collectionSelected", js.Any.fromFunction1(value))
      
      inline def setCollectionSelectedUndefined: Self = StObject.set(x, "collectionSelected", js.undefined)
      
      inline def setCollections(
        value: js.Array[typings.openui5.sapUiUx3CollectionMod.default] | typings.openui5.sapUiUx3CollectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      inline def setCollectionsVarargs(value: typings.openui5.sapUiUx3CollectionMod.default*): Self = StObject.set(x, "collections", js.Array(value*))
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEditCollection(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "editCollection", js.Any.fromFunction1(value))
      
      inline def setEditCollectionUndefined: Self = StObject.set(x, "editCollection", js.undefined)
      
      inline def setFitParent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fitParent", value.asInstanceOf[js.Any])
      
      inline def setFitParentUndefined: Self = StObject.set(x, "fitParent", js.undefined)
      
      inline def setItemSelectionChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setItemSelectionChangedUndefined: Self = StObject.set(x, "itemSelectionChanged", js.undefined)
      
      inline def setSelectedCollection(value: typings.openui5.sapUiUx3CollectionMod.default | String): Self = StObject.set(x, "selectedCollection", value.asInstanceOf[js.Any])
      
      inline def setSelectedCollectionUndefined: Self = StObject.set(x, "selectedCollection", js.undefined)
      
      inline def setSidebarVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidebarVisible", value.asInstanceOf[js.Any])
      
      inline def setSidebarVisibleUndefined: Self = StObject.set(x, "sidebarVisible", js.undefined)
    }
  }
}
