package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.ITableColumn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTableColumnMod {
  
  @JSImport("sap/ui/webc/main/TableColumn", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TableColumn`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TableColumn {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TableColumnSettings) = this()
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
    mSettings: TableColumnSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TableColumnSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_ITableColumn: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/TableColumn", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.TableColumn with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, TableColumn]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TableColumn],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.TableColumn.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait TableColumn
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ITableColumn {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the column header.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDemandPopin demandPopin}.
      *
      * According to your `minWidth` settings, the component can be hidden in different screen sizes.
      *
      *  Setting this property to `true`, shows this column as pop-in instead of hiding it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `demandPopin`
      */
    def getDemandPopin(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum table width required to display this column. By default it is always displayed.
      *
      *  The responsive behavior of the `sap.ui.webc.main.Table` is determined by this property. As an example,
      * by setting `minWidth` property to `400` sets the minimum width to 400 pixels, and shows this column on
      * tablet (and desktop) but hides it on mobile.
      *  For further responsive design options, see `demandPopin` property.
      *
      * Default value is `...see text or source`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): int = js.native
    
    /**
      * Gets current value of property {@link #getPopinText popinText}.
      *
      * The text for the column when it pops in.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `popinText`
      */
    def getPopinText(): String = js.native
    
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
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDemandPopin demandPopin}.
      *
      * According to your `minWidth` settings, the component can be hidden in different screen sizes.
      *
      *  Setting this property to `true`, shows this column as pop-in instead of hiding it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDemandPopin(): this.type = js.native
    def setDemandPopin(/**
      * New value for property `demandPopin`
      */
    bDemandPopin: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum table width required to display this column. By default it is always displayed.
      *
      *  The responsive behavior of the `sap.ui.webc.main.Table` is determined by this property. As an example,
      * by setting `minWidth` property to `400` sets the minimum width to 400 pixels, and shows this column on
      * tablet (and desktop) but hides it on mobile.
      *  For further responsive design options, see `demandPopin` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    iMinWidth: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPopinText popinText}.
      *
      * The text for the column when it pops in.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopinText(): this.type = js.native
    def setPopinText(/**
      * New value for property `popinText`
      */
    sPopinText: String): this.type = js.native
  }
  
  trait TableColumnSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the content of the column header.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * According to your `minWidth` settings, the component can be hidden in different screen sizes.
      *
      *  Setting this property to `true`, shows this column as pop-in instead of hiding it.
      */
    var demandPopin: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the minimum table width required to display this column. By default it is always displayed.
      *
      *  The responsive behavior of the `sap.ui.webc.main.Table` is determined by this property. As an example,
      * by setting `minWidth` property to `400` sets the minimum width to 400 pixels, and shows this column on
      * tablet (and desktop) but hides it on mobile.
      *  For further responsive design options, see `demandPopin` property.
      */
    var minWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The text for the column when it pops in.
      */
    var popinText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TableColumnSettings {
    
    inline def apply(): TableColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumnSettings]
    }
    
    extension [Self <: TableColumnSettings](x: Self) {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDemandPopin(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "demandPopin", value.asInstanceOf[js.Any])
      
      inline def setDemandPopinUndefined: Self = StObject.set(x, "demandPopin", js.undefined)
      
      inline def setMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPopinText(value: String | PropertyBindingInfo): Self = StObject.set(x, "popinText", value.asInstanceOf[js.Any])
      
      inline def setPopinTextUndefined: Self = StObject.set(x, "popinText", js.undefined)
    }
  }
}
