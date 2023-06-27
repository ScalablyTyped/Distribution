package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ExactMod {
  
  @JSImport("sap/ui/ux3/Exact", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Exact.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Exact {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExactSettings) = this()
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
    mSettings: ExactSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExactSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Exact", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Exact with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Exact]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Exact],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Exact.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Exact
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(
      /**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:refineSearch refineSearch} event of this `sap.ui.ux3.Exact`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Exact` itself.
      *
      * Event which is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRefineSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit]
    ): this.type = js.native
    def attachRefineSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Exact` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:refineSearch refineSearch} event of this `sap.ui.ux3.Exact`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Exact` itself.
      *
      * Event which is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRefineSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit]
    ): this.type = js.native
    def attachRefineSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Exact` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Exact`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Exact` itself.
      *
      * Event is fired when the search button is clicked
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Exact` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Exact`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Exact` itself.
      *
      * Event is fired when the search button is clicked
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Exact` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * Destroys the settingsMenu in the aggregation {@link #getSettingsMenu settingsMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySettingsMenu(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:refineSearch refineSearch} event of this `sap.ui.ux3.Exact`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRefineSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit]
    ): this.type = js.native
    def detachRefineSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactRefineSearchEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.ux3.Exact`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit]
    ): this.type = js.native
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ExactSearchEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:refineSearch refineSearch} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRefineSearch(): this.type = js.native
    def fireRefineSearch(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Exact$RefineSearchEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: Exact$SearchEventParameters): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * The attributes which shall be available to refine the search
      */
    def getAttributes(): js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] = js.native
    
    /**
      * Returns the ExactArea representing the result section. Arbitrary content can be added here.
      */
    def getResultArea(): typings.openui5.sapUiUx3ExactAreaMod.default = js.native
    
    /**
      * Gets current value of property {@link #getResultText resultText}.
      *
      * A title text which is displayed above the result section
      *
      * @returns Value of property `resultText`
      */
    def getResultText(): String = js.native
    
    /**
      * Returns the SearchField control which is used by the Exact control.
      */
    def getSearchField(): typings.openui5.sapUiCommonsSearchFieldMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSettingsMenu settingsMenu}.
      *
      * Defines the 'Settings' button in the browse section tool bar
      */
    def getSettingsMenu(): typings.openui5.sapUiCommonsMenuMod.default = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ExactAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(
      /**
      * The attribute whose index is looked for
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): int = js.native
    
    /**
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    /**
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    def removeAttribute(
      /**
      * The attribute to remove or its index or id
      */
    vAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getResultText resultText}.
      *
      * A title text which is displayed above the result section
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResultText(): this.type = js.native
    def setResultText(/**
      * New value for property `resultText`
      */
    sResultText: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSettingsMenu settingsMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSettingsMenu(/**
      * The settingsMenu to set
      */
    oSettingsMenu: typings.openui5.sapUiCommonsMenuMod.default): this.type = js.native
  }
  
  trait Exact$RefineSearchEventParameters extends StObject {
    
    /**
      * Array of all selected ExcatAttribute.
      */
    var allSelectedAttributes: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The attribute which was selected or unselected recently
      */
    var changedAttribute: js.UndefOr[typings.openui5.sapUiUx3ExactAttributeMod.default] = js.undefined
    
    /**
      * The query string which was entered in the search field
      */
    var query: js.UndefOr[String] = js.undefined
  }
  object Exact$RefineSearchEventParameters {
    
    inline def apply(): Exact$RefineSearchEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exact$RefineSearchEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exact$RefineSearchEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAllSelectedAttributes(value: js.Object): Self = StObject.set(x, "allSelectedAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllSelectedAttributesUndefined: Self = StObject.set(x, "allSelectedAttributes", js.undefined)
      
      inline def setChangedAttribute(value: typings.openui5.sapUiUx3ExactAttributeMod.default): Self = StObject.set(x, "changedAttribute", value.asInstanceOf[js.Any])
      
      inline def setChangedAttributeUndefined: Self = StObject.set(x, "changedAttribute", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Exact$SearchEventParameters extends StObject {
    
    /**
      * The query string which was entered in the search field.
      */
    var query: js.UndefOr[String] = js.undefined
  }
  object Exact$SearchEventParameters {
    
    inline def apply(): Exact$SearchEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exact$SearchEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exact$SearchEventParameters] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type ExactRefineSearchEvent = typings.openui5.sapUiBaseEventMod.default[Exact$RefineSearchEventParameters]
  
  type ExactRefineSearchEventParameters = Exact$RefineSearchEventParameters
  
  type ExactSearchEvent = typings.openui5.sapUiBaseEventMod.default[Exact$SearchEventParameters]
  
  type ExactSearchEventParameters = Exact$SearchEventParameters
  
  trait ExactSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The attributes which shall be available to refine the search
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] | typings.openui5.sapUiUx3ExactAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event which is fired when an attribute is selected or unselected.
      */
    var refineSearch: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Exact$RefineSearchEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A title text which is displayed above the result section
      */
    var resultText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the search button is clicked
      */
    var search: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Exact$SearchEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the 'Settings' button in the browse section tool bar
      */
    var settingsMenu: js.UndefOr[typings.openui5.sapUiCommonsMenuMod.default] = js.undefined
  }
  object ExactSettings {
    
    inline def apply(): ExactSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExactSettings] (val x: Self) extends AnyVal {
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] | typings.openui5.sapUiUx3ExactAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapUiUx3ExactAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setRefineSearch(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Exact$RefineSearchEventParameters] => Unit
      ): Self = StObject.set(x, "refineSearch", js.Any.fromFunction1(value))
      
      inline def setRefineSearchUndefined: Self = StObject.set(x, "refineSearch", js.undefined)
      
      inline def setResultText(value: String | PropertyBindingInfo): Self = StObject.set(x, "resultText", value.asInstanceOf[js.Any])
      
      inline def setResultTextUndefined: Self = StObject.set(x, "resultText", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Exact$SearchEventParameters] => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSettingsMenu(value: typings.openui5.sapUiCommonsMenuMod.default): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
      
      inline def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
    }
  }
}
