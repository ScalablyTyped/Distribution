package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMP13nBasePanelMod.BasePanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nSelectionPanelMod {
  
  @JSImport("sap/m/p13n/SelectionPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SelectionPanel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectionPanel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SelectionPanelSettings) = this()
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
    mSettings: SelectionPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SelectionPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/p13n/SelectionPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.SelectionPanel with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.p13n.BasePanel.extend}.
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
    oClassInfo: ClassInfo[T, SelectionPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectionPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.p13n.SelectionPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectionPanel
    extends typings.openui5.sapMP13nBasePanelMod.default {
    
    /**
      * Gets current value of property {@link #getActiveColumn activeColumn}.
      *
      * The second column in the panel showing the move buttons for reordering.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `activeColumn`
      */
    def getActiveColumn(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnableCount enableCount}.
      *
      * Enables a count for selected items compared to available items, for example, Currency (3/12), in addition
      * to the first column text.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableCount`
      */
    def getEnableCount(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFieldColumn fieldColumn}.
      *
      * The first column in the panel describing the selectable fields.
      *
      * Default value is `...see text or source`.
      *
      * @returns Value of property `fieldColumn`
      */
    def getFieldColumn(): String = js.native
    
    /**
      * Gets current value of property {@link #getItemFactory itemFactory}.
      *
      * An optional callback that may be used to display additional custom content in each selectable item. This
      * factory can be toggled by executing the {@link sap.m.p13n.SelectionPanel#showFactory} method.
      *
      * @returns Value of property `itemFactory`
      */
    def getItemFactory(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * / ** Shows an additional header with a search field and the Show Selected button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getActiveColumn activeColumn}.
      *
      * The second column in the panel showing the move buttons for reordering.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveColumn(): this.type = js.native
    def setActiveColumn(/**
      * New value for property `activeColumn`
      */
    sActiveColumn: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableCount enableCount}.
      *
      * Enables a count for selected items compared to available items, for example, Currency (3/12), in addition
      * to the first column text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableCount(): this.type = js.native
    def setEnableCount(/**
      * New value for property `enableCount`
      */
    bEnableCount: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFieldColumn fieldColumn}.
      *
      * The first column in the panel describing the selectable fields.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldColumn(): this.type = js.native
    def setFieldColumn(/**
      * New value for property `fieldColumn`
      */
    sFieldColumn: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getItemFactory itemFactory}.
      *
      * An optional callback that may be used to display additional custom content in each selectable item. This
      * factory can be toggled by executing the {@link sap.m.p13n.SelectionPanel#showFactory} method.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemFactory(/**
      * New value for property `itemFactory`
      */
    fnItemFactory: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * / ** Shows an additional header with a search field and the Show Selected button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
  }
  
  trait SelectionPanelSettings
    extends StObject
       with BasePanelSettings {
    
    /**
      * The second column in the panel showing the move buttons for reordering.
      */
    var activeColumn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Enables a count for selected items compared to available items, for example, Currency (3/12), in addition
      * to the first column text.
      */
    var enableCount: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The first column in the panel describing the selectable fields.
      */
    var fieldColumn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * An optional callback that may be used to display additional custom content in each selectable item. This
      * factory can be toggled by executing the {@link sap.m.p13n.SelectionPanel#showFactory} method.
      */
    var itemFactory: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * / ** Shows an additional header with a search field and the Show Selected button.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SelectionPanelSettings {
    
    inline def apply(): SelectionPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveColumn(value: String | PropertyBindingInfo): Self = StObject.set(x, "activeColumn", value.asInstanceOf[js.Any])
      
      inline def setActiveColumnUndefined: Self = StObject.set(x, "activeColumn", js.undefined)
      
      inline def setEnableCount(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCount", value.asInstanceOf[js.Any])
      
      inline def setEnableCountUndefined: Self = StObject.set(x, "enableCount", js.undefined)
      
      inline def setFieldColumn(value: String | PropertyBindingInfo): Self = StObject.set(x, "fieldColumn", value.asInstanceOf[js.Any])
      
      inline def setFieldColumnUndefined: Self = StObject.set(x, "fieldColumn", js.undefined)
      
      inline def setItemFactory(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemFactory", value.asInstanceOf[js.Any])
      
      inline def setItemFactoryUndefined: Self = StObject.set(x, "itemFactory", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    }
  }
}
