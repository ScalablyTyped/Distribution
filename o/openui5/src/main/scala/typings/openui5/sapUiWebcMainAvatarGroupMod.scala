package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.AvatarGroupType
import typings.openui5.sapUiWebcMainLibraryMod.IAvatar
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainAvatarGroupMod {
  
  @JSImport("sap/ui/webc/main/AvatarGroup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `AvatarGroup`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AvatarGroup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupSettings) = this()
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
    mSettings: AvatarGroupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/AvatarGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.AvatarGroup with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, AvatarGroup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AvatarGroup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.AvatarGroup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait AvatarGroup
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IAvatar): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.AvatarGroup` itself.
      *
      * Fired when the component is activated either with a click/tap or by using the Enter or Space key.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.AvatarGroup` itself.
      *
      * Fired when the component is activated either with a click/tap or by using the Enter or Space key.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:overflow overflow} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.AvatarGroup` itself.
      *
      * Fired when the count of visible `sap.ui.webc.main.Avatar` elements in the component has changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOverflow(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachOverflow(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:overflow overflow} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.AvatarGroup` itself.
      *
      * Fired when the count of visible `sap.ui.webc.main.Avatar` elements in the component has changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOverflow(
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
    def attachOverflow(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.AvatarGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys the overflowButton in the aggregation {@link #getOverflowButton overflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyOverflowButton(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit]
    ): this.type = js.native
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AvatarGroupClickEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:overflow overflow} event of this `sap.ui.webc.main.AvatarGroup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOverflow(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachOverflow(
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:click click} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClick(): this.type = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: AvatarGroup$ClickEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:overflow overflow} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOverflow(): this.type = js.native
    def fireOverflow(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns an array containing the `AvatarColorScheme` values that correspond to the avatars in the component.
      */
    def getColorScheme(): Unit = js.native
    
    /**
      * Returns an array containing the `ui5-avatar` instances that are currently not displayed due to lack of
      * space.
      */
    def getHiddenItems(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the component. Use the `sap.ui.webc.main.Avatar` component as an item.
      *
      *  **Note:** The UX guidelines recommends using avatars with "Circle" shape. Moreover, if you use avatars
      * with "Square" shape, there will be visual inconsistency as the built-in overflow action has "Circle"
      * shape.
      */
    def getItems(): js.Array[IAvatar] = js.native
    
    /**
      * Gets content of aggregation {@link #getOverflowButton overflowButton}.
      *
      * Defines the overflow button of the component. **Note:** We recommend using the `sap.ui.webc.main.Button`
      * component.
      *
      *  **Note:** If this slot is not used, the component will display the built-in overflow button.
      */
    def getOverflowButton(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the mode of the `AvatarGroup`.
      *
      *  Available options are:
      * 	 - `Group`
      * 	 - `Individual`
      *
      * Default value is `Group`.
      *
      * @returns Value of property `type`
      */
    def getType(): AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IAvatar` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IAvatar): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IAvatar,
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
    def removeAllItems(): js.Array[IAvatar] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IAvatar | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IAvatar | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IAvatar): IAvatar | Null = js.native
    
    /**
      * Sets the aggregated {@link #getOverflowButton overflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowButton(
      /**
      * The overflowButton to set
      */
    oOverflowButton: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the mode of the `AvatarGroup`.
      *
      *  Available options are:
      * 	 - `Group`
      * 	 - `Individual`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Group`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: AvatarGroupType): this.type = js.native
  }
  
  trait AvatarGroup$ClickEventParameters extends StObject {
    
    /**
      * indicates if the overflow button is clicked
      */
    var overflowButtonClicked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The DOM ref of the clicked item.
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object AvatarGroup$ClickEventParameters {
    
    inline def apply(): AvatarGroup$ClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarGroup$ClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroup$ClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOverflowButtonClicked(value: Boolean): Self = StObject.set(x, "overflowButtonClicked", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonClickedUndefined: Self = StObject.set(x, "overflowButtonClicked", js.undefined)
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait AvatarGroup$OverflowEventParameters extends StObject
  
  type AvatarGroupClickEvent = typings.openui5.sapUiBaseEventMod.default[AvatarGroup$ClickEventParameters]
  
  type AvatarGroupClickEventParameters = AvatarGroup$ClickEventParameters
  
  type AvatarGroupOverflowEvent = typings.openui5.sapUiBaseEventMod.default[AvatarGroup$OverflowEventParameters]
  
  type AvatarGroupOverflowEventParameters = AvatarGroup$OverflowEventParameters
  
  trait AvatarGroupSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the component is activated either with a click/tap or by using the Enter or Space key.
      */
    var click: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[AvatarGroup$ClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the items of the component. Use the `sap.ui.webc.main.Avatar` component as an item.
      *
      *  **Note:** The UX guidelines recommends using avatars with "Circle" shape. Moreover, if you use avatars
      * with "Square" shape, there will be visual inconsistency as the built-in overflow action has "Circle"
      * shape.
      */
    var items: js.UndefOr[
        js.Array[IAvatar] | IAvatar | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the count of visible `sap.ui.webc.main.Avatar` elements in the component has changed
      */
    var overflow: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines the overflow button of the component. **Note:** We recommend using the `sap.ui.webc.main.Button`
      * component.
      *
      *  **Note:** If this slot is not used, the component will display the built-in overflow button.
      */
    var overflowButton: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the mode of the `AvatarGroup`.
      *
      *  Available options are:
      * 	 - `Group`
      * 	 - `Individual`
      */
    var `type`: js.UndefOr[
        AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object AvatarGroupSettings {
    
    inline def apply(): AvatarGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarGroupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupSettings] (val x: Self) extends AnyVal {
      
      inline def setClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[AvatarGroup$ClickEventParameters] => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setItems(
        value: js.Array[IAvatar] | IAvatar | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IAvatar*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOverflow(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "overflow", js.Any.fromFunction1(value))
      
      inline def setOverflowButton(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setType(
        value: AvatarGroupType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarGroupType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
