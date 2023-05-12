package typings.openui5

import typings.openui5.anon.Item
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapTntSideNavigationMod {
  
  @JSImport("sap/tnt/SideNavigation", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SideNavigation.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/side-navigation/ Side Navigation}
    */
  open class default () extends SideNavigation {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SideNavigationSettings) = this()
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
    mSettings: SideNavigationSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SideNavigationSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/tnt/SideNavigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.tnt.SideNavigation with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, SideNavigation]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SideNavigation],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.tnt.SideNavigation.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SideNavigation
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.tnt.SideNavigation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.tnt.SideNavigation` itself.
      *
      * Fired when an item is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.tnt.SideNavigation` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.tnt.SideNavigation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.tnt.SideNavigation` itself.
      *
      * Fired when an item is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
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
    def attachItemSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.tnt.SideNavigation` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItem item} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItem(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys the fixedItem in the aggregation {@link #getFixedItem fixedItem}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFixedItem(): this.type = js.native
    
    /**
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys the item in the aggregation {@link #getItem item}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItem(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemSelect itemSelect} event of this `sap.tnt.SideNavigation`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelect(
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
      * Fires event {@link #event:itemSelect itemSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelect(): this.type = js.native
    def fireItemSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Item): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getAriaLabel ariaLabel}.
      *
      * Specifies an optional aria-label that can be used by the screen readers.
      *
      * @returns Value of property `ariaLabel`
      */
    def getAriaLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Specifies if the control is expanded.
      *
      * Default value is `true`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFixedItem fixedItem}.
      *
      * Defines the content inside the fixed part.
      */
    def getFixedItem(): typings.openui5.sapTntNavigationListMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * Defines the content inside the footer.
      */
    def getFooter(): typings.openui5.sapTntNavigationListMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getItem item}.
      *
      * Defines the content inside the flexible part.
      */
    def getItem(): typings.openui5.sapTntNavigationListMod.default = js.native
    
    /**
      * @SINCE 1.52.0
      *
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * @SINCE 1.62.0
      *
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Specifies the currently selected key.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getAriaLabel ariaLabel}.
      *
      * Specifies an optional aria-label that can be used by the screen readers.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabel(): this.type = js.native
    def setAriaLabel(/**
      * New value for property `ariaLabel`
      */
    sAriaLabel: String): this.type = js.native
    
    /**
      * Sets if the control is in expanded or collapsed mode.
      *
      * @returns this SideNavigation reference for chaining.
      */
    def setExpanded(/**
      * Indication if the SideNavigation is expanded.
      */
    isExpanded: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFixedItem fixedItem}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixedItem(/**
      * The fixedItem to set
      */
    oFixedItem: typings.openui5.sapTntNavigationListMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: typings.openui5.sapTntNavigationListMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getItem item}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItem(/**
      * The item to set
      */
    oItem: typings.openui5.sapTntNavigationListMod.default): this.type = js.native
    
    /**
      * Sets the association for selectedItem
      *
      * @returns The `selectedItem` association
      */
    def setSelectedItem(/**
      * The control to be set as selected
      */
    selectedItem: String): SideNavigation | Null = js.native
    def setSelectedItem(
      /**
      * The control to be set as selected
      */
    selectedItem: typings.openui5.sapTntNavigationListItemMod.default
    ): SideNavigation | Null = js.native
    
    /**
      * Sets the selected item based on a key.
      *
      * @returns this pointer for chaining
      */
    def setSelectedKey(/**
      * The key of the item to be selected
      */
    selectedKey: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItem item} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItem(): this.type = js.native
  }
  
  trait SideNavigationSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.98
      *
      * Specifies an optional aria-label that can be used by the screen readers.
      */
    var ariaLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies if the control is expanded.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content inside the fixed part.
      */
    var fixedItem: js.UndefOr[typings.openui5.sapTntNavigationListMod.default] = js.undefined
    
    /**
      * Defines the content inside the footer.
      */
    var footer: js.UndefOr[typings.openui5.sapTntNavigationListMod.default] = js.undefined
    
    /**
      * Defines the content inside the flexible part.
      */
    var item: js.UndefOr[typings.openui5.sapTntNavigationListMod.default] = js.undefined
    
    /**
      * Fired when an item is selected.
      */
    var itemSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.52.0
      *
      * The selected `NavigationListItem`.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapTntNavigationListItemMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.62.0
      *
      * Specifies the currently selected key.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object SideNavigationSettings {
    
    inline def apply(): SideNavigationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavigationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFixedItem(value: typings.openui5.sapTntNavigationListMod.default): Self = StObject.set(x, "fixedItem", value.asInstanceOf[js.Any])
      
      inline def setFixedItemUndefined: Self = StObject.set(x, "fixedItem", js.undefined)
      
      inline def setFooter(value: typings.openui5.sapTntNavigationListMod.default): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setItem(value: typings.openui5.sapTntNavigationListMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemSelect", js.Any.fromFunction1(value))
      
      inline def setItemSelectUndefined: Self = StObject.set(x, "itemSelect", js.undefined)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapTntNavigationListItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
