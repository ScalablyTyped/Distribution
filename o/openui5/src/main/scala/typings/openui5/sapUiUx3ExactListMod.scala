package typings.openui5

import typings.openui5.anon.AllAttributes
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ExactListMod {
  
  @JSImport("sap/ui/ux3/ExactList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExactList.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExactList {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExactListSettings) = this()
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
    mSettings: ExactListSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExactListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ExactList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ExactList with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ExactList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExactList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ExactList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ExactList
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some subList to the aggregation {@link #getSubLists subLists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubList(/**
      * The subList to add; if empty, nothing is inserted
      */
    oSubList: ExactList): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:attributeSelected attributeSelected} event of
      * this `sap.ui.ux3.ExactList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactList` itself.
      *
      * Event which is fired when an attribute is selected/unselected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAttributeSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAttributeSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:attributeSelected attributeSelected} event of
      * this `sap.ui.ux3.ExactList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactList` itself.
      *
      * Event which is fired when an attribute is selected/unselected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAttributeSelected(
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
    def attachAttributeSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the subLists in the aggregation {@link #getSubLists subLists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubLists(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:attributeSelected attributeSelected} event
      * of this `sap.ui.ux3.ExactList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAttributeSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAttributeSelected(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:attributeSelected attributeSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAttributeSelected(): this.type = js.native
    def fireAttributeSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: AllAttributes): this.type = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getData data}, or `null`.
      */
    def getData(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowClose showClose}.
      *
      * Defines whether the close icon shall be displayed in the header.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClose`
      */
    def getShowClose(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubLists subLists}.
      *
      * The sub-ExactLists of this list. This aggregation must not be maintained from outside. The control automatically
      * takes care to fill this aggregation according to the given ExactAttribute.
      */
    def getSubLists(): js.Array[ExactList] = js.native
    
    /**
      * Gets current value of property {@link #getTopHeight topHeight}.
      *
      * The height in px if this list is the top of the list hierarchy.
      *
      * Default value is `290`.
      *
      * @returns Value of property `topHeight`
      */
    def getTopHeight(): int = js.native
    
    /**
      * Gets current value of property {@link #getTopTitle topTitle}.
      *
      * The title of this list is the top of the list hierarchy.
      *
      * @returns Value of property `topTitle`
      */
    def getTopTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ExactList` in the aggregation {@link #getSubLists subLists}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSubList(/**
      * The subList whose index is looked for
      */
    oSubList: ExactList): int = js.native
    
    /**
      * Inserts a subList into the aggregation {@link #getSubLists subLists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSubList(
      /**
      * The subList to insert; if empty, nothing is inserted
      */
    oSubList: ExactList,
      /**
      * The `0`-based index the subList should be inserted at; for a negative value of `iIndex`, the subList
      * is inserted at position 0; for a value greater than the current size of the aggregation, the subList
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSubLists subLists}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubLists(): js.Array[ExactList] = js.native
    
    def removeSubList(/**
      * The subList to remove or its index or id
      */
    vSubList: String): ExactList | Null = js.native
    /**
      * Removes a subList from the aggregation {@link #getSubLists subLists}.
      *
      * @returns The removed subList or `null`
      */
    def removeSubList(/**
      * The subList to remove or its index or id
      */
    vSubList: int): ExactList | Null = js.native
    def removeSubList(/**
      * The subList to remove or its index or id
      */
    vSubList: ExactList): ExactList | Null = js.native
    
    /**
      * Sets the associated {@link #getData data}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setData(
      /**
      * ID of an element which becomes the new target of this data association; alternatively, an element instance
      * may be given
      */
    oData: ID
    ): this.type = js.native
    def setData(
      /**
      * ID of an element which becomes the new target of this data association; alternatively, an element instance
      * may be given
      */
    oData: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowClose showClose}.
      *
      * Defines whether the close icon shall be displayed in the header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClose(): this.type = js.native
    def setShowClose(/**
      * New value for property `showClose`
      */
    bShowClose: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTopHeight topHeight}.
      *
      * The height in px if this list is the top of the list hierarchy.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `290`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTopHeight(): this.type = js.native
    def setTopHeight(/**
      * New value for property `topHeight`
      */
    iTopHeight: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTopTitle topTitle}.
      *
      * The title of this list is the top of the list hierarchy.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTopTitle(): this.type = js.native
    def setTopTitle(/**
      * New value for property `topTitle`
      */
    sTopTitle: String): this.type = js.native
  }
  
  trait ExactListSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event which is fired when an attribute is selected/unselected
      */
    var attributeSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The associated ExactAttribute
      */
    var data: js.UndefOr[typings.openui5.sapUiUx3ExactAttributeMod.default | String] = js.undefined
    
    /**
      * Defines whether the close icon shall be displayed in the header.
      */
    var showClose: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The sub-ExactLists of this list. This aggregation must not be maintained from outside. The control automatically
      * takes care to fill this aggregation according to the given ExactAttribute.
      */
    var subLists: js.UndefOr[
        js.Array[ExactList] | ExactList | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height in px if this list is the top of the list hierarchy.
      */
    var topHeight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The title of this list is the top of the list hierarchy.
      */
    var topTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ExactListSettings {
    
    inline def apply(): ExactListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExactListSettings] (val x: Self) extends AnyVal {
      
      inline def setAttributeSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "attributeSelected", js.Any.fromFunction1(value))
      
      inline def setAttributeSelectedUndefined: Self = StObject.set(x, "attributeSelected", js.undefined)
      
      inline def setData(value: typings.openui5.sapUiUx3ExactAttributeMod.default | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setShowClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setSubLists(
        value: js.Array[ExactList] | ExactList | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "subLists", value.asInstanceOf[js.Any])
      
      inline def setSubListsUndefined: Self = StObject.set(x, "subLists", js.undefined)
      
      inline def setSubListsVarargs(value: ExactList*): Self = StObject.set(x, "subLists", js.Array(value*))
      
      inline def setTopHeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "topHeight", value.asInstanceOf[js.Any])
      
      inline def setTopHeightUndefined: Self = StObject.set(x, "topHeight", js.undefined)
      
      inline def setTopTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "topTitle", value.asInstanceOf[js.Any])
      
      inline def setTopTitleUndefined: Self = StObject.set(x, "topTitle", js.undefined)
    }
  }
}
