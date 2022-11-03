package typings.openui5

import typings.openui5.anon.AllSelected
import typings.openui5.anon.Term
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.FacetFilterListDataType
import typings.openui5.sapMListMod.ListSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFacetFilterListMod {
  
  @JSImport("sap/m/FacetFilterList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FacetFilterList`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:395392f30f2a4c4d80d110d5f923da77 Facet Filter List}
    */
  open class default () extends FacetFilterList {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FacetFilterListSettings) = this()
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
    mSettings: FacetFilterListSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FacetFilterListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FacetFilterList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FacetFilterList with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.List.extend}.
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
    oClassInfo: ClassInfo[T, FacetFilterList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FacetFilterList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FacetFilterList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FacetFilterList
    extends typings.openui5.sapMListMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listClose listClose} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Triggered after the list of items is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachListClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listClose listClose} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Triggered after the list of items is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListClose(
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
    def attachListClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listOpen listOpen} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Fired before the filter list is opened.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `listOpen` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `listOpen` event handler function.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachListOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:listOpen listOpen} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Fired before the filter list is opened.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `listOpen` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `listOpen` event handler function.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachListOpen(
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
    def attachListOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Triggered after the Search button is pressed or by pressing Enter in search input field.
      *
      * The default filtering behavior of the control can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. Preventing the default behavior is useful in cases when
      * items aggregation could be taking long time fetching from the OData model. As a result, no list items
      * are loaded initially. If the default filtering behavior is prevented then filtering behavior has to be
      * defined at application level inside the `search` event handler function.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.76
      *
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilterList` itself.
      *
      * Triggered after the Search button is pressed or by pressing Enter in search input field.
      *
      * The default filtering behavior of the control can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. Preventing the default behavior is useful in cases when
      * items aggregation could be taking long time fetching from the OData model. As a result, no list items
      * are loaded initially. If the default filtering behavior is prevented then filtering behavior has to be
      * defined at application level inside the `search` event handler function.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:listClose listClose} event of this `sap.m.FacetFilterList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachListClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachListClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:listOpen listOpen} event of this `sap.m.FacetFilterList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachListOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachListOpen(
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
      * @SINCE 1.76
      *
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.m.FacetFilterList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSearch(
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
      * Fires event {@link #event:listClose listClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireListClose(): this.type = js.native
    def fireListClose(/**
      * Parameters to pass along with the event
      */
    mParameters: AllSelected): this.type = js.native
    
    /**
      * Fires event {@link #event:listOpen listOpen} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireListOpen(): Boolean = js.native
    def fireListOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): Boolean = js.native
    
    /**
      * @SINCE 1.76
      *
      * Fires event {@link #event:search search} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSearch(): Boolean = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: Term): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getActive active}.
      *
      * Indicates that the list is displayed as a button when the FacetFilter type is set to `Simple`.
      *
      * **Note:** Set the `showPersonalization` property of the `FacetFilter` to `true` when this property is
      * set to `false`. This is needed, as the non-active lists are not displayed, and without a personalization
      * button they can't be selected by the user.
      *
      * Default value is `true`.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAllCount allCount}.
      *
      * Determines the number of objects that match this item in the target data set when all filter items are
      * selected.
      *
      * @returns Value of property `allCount`
      */
    def getAllCount(): int = js.native
    
    /**
      * Gets current value of property {@link #getDataType dataType}.
      *
      * FacetFilterList data type. Only String data type will provide search function.
      *
      * Default value is `String`.
      *
      * @returns Value of property `dataType`
      */
    def getDataType(): FacetFilterListDataType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterListDataType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnableCaseInsensitiveSearch enableCaseInsensitiveSearch}.
      *
      * If set to `true`, enables case-insensitive search for OData.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableCaseInsensitiveSearch`
      */
    def getEnableCaseInsensitiveSearch(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Unique identifier for this filter list.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * @deprecated (since 1.20.0) - replaced by `setMode` method. `FacetFilterList` overrides the `setMode`
      * method to restrict the possible modes to `MultiSelect` and `SingleSelectMaster`. All other modes are
      * ignored and will not be set.
      *
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * Specifies whether multiple or single selection is used.
      *
      * Default value is `true`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * @SINCE 1.22.1
      *
      * Gets current value of property {@link #getRetainListSequence retainListSequence}.
      *
      * Retains the list sequence if it is inactive and made active again.
      *
      * Default value is `false`.
      *
      * @returns Value of property `retainListSequence`
      */
    def getRetainListSequence(): Boolean = js.native
    
    /**
      * @SINCE 1.20.3
      *
      * Returns the keys of the selected elements as an associative array. An empty object is returned if no
      * items are selected.
      *
      * @returns Object with the selected keys
      */
    def getSelectedKeys(): Record[String, String | Null] = js.native
    
    /**
      * Gets current value of property {@link #getSequence sequence}.
      *
      * Sequence that determines the order in which FacetFilterList is shown on the FacetFilter. Lists are rendered
      * by ascending order of sequence.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `sequence`
      */
    def getSequence(): int = js.native
    
    /**
      * @SINCE 1.20.4
      *
      * Gets current value of property {@link #getShowRemoveFacetIcon showRemoveFacetIcon}.
      *
      * Specifies whether remove icon for facet is visible or hidden.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showRemoveFacetIcon`
      */
    def getShowRemoveFacetIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the facet. The facet title is displayed on the facet button when the FacetFilter
      * type is set to `Simple`. It is also displayed as a list item in the facet page of the dialog.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getWordWrap wordWrap}.
      *
      * If set to `true`, the item text wraps when it is too long.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wordWrap`
      */
    def getWordWrap(): Boolean = js.native
    
    /**
      * @SINCE 1.20.4
      *
      * Removes the specified key from the selected keys cache and deselects the item.
      */
    def removeSelectedKey(
      /**
      * The key of the selected item to be removed from the cache. If `null` then the text parameter will be
      * used as the key.
      */
    sKey: String,
      /**
      * The text of the selected item to be removed from the cache. If the key parameter is `null` then text
      * will be used as the key.
      */
    sText: String
    ): Unit = js.native
    
    /**
      * @SINCE 1.20.4
      *
      * Removes all selected keys from the selected keys cache and deselects all items.
      */
    def removeSelectedKeys(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getActive active}.
      *
      * Indicates that the list is displayed as a button when the FacetFilter type is set to `Simple`.
      *
      * **Note:** Set the `showPersonalization` property of the `FacetFilter` to `true` when this property is
      * set to `false`. This is needed, as the non-active lists are not displayed, and without a personalization
      * button they can't be selected by the user.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAllCount allCount}.
      *
      * Determines the number of objects that match this item in the target data set when all filter items are
      * selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllCount(): this.type = js.native
    def setAllCount(/**
      * New value for property `allCount`
      */
    iAllCount: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDataType dataType}.
      *
      * FacetFilterList data type. Only String data type will provide search function.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `String`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataType(): this.type = js.native
    def setDataType(
      /**
      * New value for property `dataType`
      */
    sDataType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterListDataType * / any */ String
    ): this.type = js.native
    def setDataType(/**
      * New value for property `dataType`
      */
    sDataType: FacetFilterListDataType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableCaseInsensitiveSearch enableCaseInsensitiveSearch}.
      *
      * If set to `true`, enables case-insensitive search for OData.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableCaseInsensitiveSearch(): this.type = js.native
    def setEnableCaseInsensitiveSearch(
      /**
      * New value for property `enableCaseInsensitiveSearch`
      */
    bEnableCaseInsensitiveSearch: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Unique identifier for this filter list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(): this.type = js.native
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - replaced by `setMode` method. `FacetFilterList` overrides the `setMode`
      * method to restrict the possible modes to `MultiSelect` and `SingleSelectMaster`. All other modes are
      * ignored and will not be set.
      *
      * Sets a new value for property {@link #getMultiSelect multiSelect}.
      *
      * Specifies whether multiple or single selection is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelect(): this.type = js.native
    def setMultiSelect(/**
      * New value for property `multiSelect`
      */
    bMultiSelect: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.22.1
      *
      * Sets a new value for property {@link #getRetainListSequence retainListSequence}.
      *
      * Retains the list sequence if it is inactive and made active again.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRetainListSequence(): this.type = js.native
    def setRetainListSequence(/**
      * New value for property `retainListSequence`
      */
    bRetainListSequence: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.20.3
      *
      * Used to pre-select FacetFilterItems, such as when restoring FacetFilterList selections from a variant.
      * Keys are cached separately from the actual FacetFilterItems so that they remain even when the physical
      * items are removed by filtering or sorting. If oKeys is `undefined`, `null`, or {} (empty object) then
      * all items will be deselected. After this method completes, only those items with matching keys will be
      * selected. All other items in the list will be deselected.
      */
    def setSelectedKeys(
      /**
      * Associative array indicating which FacetFilterItems should be selected in the list. Each property must
      * be set to the value of a FacetFilterItem.key property. Each property value should be set to the FacetFilterItem.text
      * property value. The text value is used to display the FacetFilterItem text when the FacetFilterList button
      * or FacetFilter summary bar is displayed. If no property value is set then the property key is used for
      * the text.
      */
    oKeys: Record[String, String | Null]
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getSequence sequence}.
      *
      * Sequence that determines the order in which FacetFilterList is shown on the FacetFilter. Lists are rendered
      * by ascending order of sequence.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSequence(): this.type = js.native
    def setSequence(/**
      * New value for property `sequence`
      */
    iSequence: int): this.type = js.native
    
    /**
      * @SINCE 1.20.4
      *
      * Sets a new value for property {@link #getShowRemoveFacetIcon showRemoveFacetIcon}.
      *
      * Specifies whether remove icon for facet is visible or hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRemoveFacetIcon(): this.type = js.native
    def setShowRemoveFacetIcon(/**
      * New value for property `showRemoveFacetIcon`
      */
    bShowRemoveFacetIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the facet. The facet title is displayed on the facet button when the FacetFilter
      * type is set to `Simple`. It is also displayed as a list item in the facet page of the dialog.
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
      * Sets a new value for property {@link #getWordWrap wordWrap}.
      *
      * If set to `true`, the item text wraps when it is too long.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWordWrap(): this.type = js.native
    def setWordWrap(/**
      * New value for property `wordWrap`
      */
    bWordWrap: Boolean): this.type = js.native
  }
  
  trait FacetFilterListSettings
    extends StObject
       with ListSettings {
    
    /**
      * Indicates that the list is displayed as a button when the FacetFilter type is set to `Simple`.
      *
      * **Note:** Set the `showPersonalization` property of the `FacetFilter` to `true` when this property is
      * set to `false`. This is needed, as the non-active lists are not displayed, and without a personalization
      * button they can't be selected by the user.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the number of objects that match this item in the target data set when all filter items are
      * selected.
      */
    var allCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * FacetFilterList data type. Only String data type will provide search function.
      */
    var dataType: js.UndefOr[
        FacetFilterListDataType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterListDataType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If set to `true`, enables case-insensitive search for OData.
      */
    var enableCaseInsensitiveSearch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Unique identifier for this filter list.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Triggered after the list of items is closed.
      */
    var listClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired before the filter list is opened.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `listOpen` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `listOpen` event handler function.
      */
    var listOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.20.0) - replaced by `setMode` method. `FacetFilterList` overrides the `setMode`
      * method to restrict the possible modes to `MultiSelect` and `SingleSelectMaster`. All other modes are
      * ignored and will not be set.
      *
      * Specifies whether multiple or single selection is used.
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.22.1
      *
      * Retains the list sequence if it is inactive and made active again.
      */
    var retainListSequence: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Triggered after the Search button is pressed or by pressing Enter in search input field.
      *
      * The default filtering behavior of the control can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. Preventing the default behavior is useful in cases when
      * items aggregation could be taking long time fetching from the OData model. As a result, no list items
      * are loaded initially. If the default filtering behavior is prevented then filtering behavior has to be
      * defined at application level inside the `search` event handler function.
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sequence that determines the order in which FacetFilterList is shown on the FacetFilter. Lists are rendered
      * by ascending order of sequence.
      */
    var sequence: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.20.4
      *
      * Specifies whether remove icon for facet is visible or hidden.
      */
    var showRemoveFacetIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the title of the facet. The facet title is displayed on the facet button when the FacetFilter
      * type is set to `Simple`. It is also displayed as a list item in the facet page of the dialog.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If set to `true`, the item text wraps when it is too long.
      */
    var wordWrap: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FacetFilterListSettings {
    
    inline def apply(): FacetFilterListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFilterListSettings]
    }
    
    extension [Self <: FacetFilterListSettings](x: Self) {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAllCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allCount", value.asInstanceOf[js.Any])
      
      inline def setAllCountUndefined: Self = StObject.set(x, "allCount", js.undefined)
      
      inline def setDataType(
        value: FacetFilterListDataType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterListDataType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setEnableCaseInsensitiveSearch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCaseInsensitiveSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableCaseInsensitiveSearchUndefined: Self = StObject.set(x, "enableCaseInsensitiveSearch", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setListClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "listClose", js.Any.fromFunction1(value))
      
      inline def setListCloseUndefined: Self = StObject.set(x, "listClose", js.undefined)
      
      inline def setListOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "listOpen", js.Any.fromFunction1(value))
      
      inline def setListOpenUndefined: Self = StObject.set(x, "listOpen", js.undefined)
      
      inline def setMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setRetainListSequence(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "retainListSequence", value.asInstanceOf[js.Any])
      
      inline def setRetainListSequenceUndefined: Self = StObject.set(x, "retainListSequence", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSequence(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setShowRemoveFacetIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRemoveFacetIcon", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveFacetIconUndefined: Self = StObject.set(x, "showRemoveFacetIcon", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWordWrap(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
}
