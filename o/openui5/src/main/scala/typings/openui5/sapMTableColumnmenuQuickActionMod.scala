package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.table.columnmenu.Category
import typings.openui5.sapMTableColumnmenuEntryMod.EntrySettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuQuickActionMod {
  
  @JSImport("sap/m/table/columnmenu/QuickAction", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `QuickAction`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickAction {
    def this(/**
      * Initial settings for the new `QuickAction`
      */
    mSettings: QuickActionSettings) = this()
    def this(/**
      * ID for the new `QuickAction`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `QuickAction`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `QuickAction`
      */
    mSettings: QuickActionSettings
    ) = this()
    def this(
      /**
      * ID for the new `QuickAction`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `QuickAction`
      */
    mSettings: QuickActionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/QuickAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.QuickAction with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.table.columnmenu.QuickActionBase.extend}.
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
    oClassInfo: ClassInfo[T, QuickAction]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickAction],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.QuickAction.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickAction
    extends typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default {
    
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
      * Gets current value of property {@link #getCategory category}.
      *
      * Defines the category. In the menu all `QuickActions` are implicitly ordered by their category.
      *
      * Default value is `Generic`.
      *
      * @returns Value of property `category`
      */
    def getCategory(): Category | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof table.columnmenu.Category * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content that is shown for the quick action.
      *
      * **Notes:**
      * 	 - Adding additional content to the quick action or altering its layout will only take effect once the
      * 			popover has been closed and reopened again.
      * 	 - The layout of the content of `QuickAction` can be altered by providing {@link sap.ui.layout.GridData}
      * 			for each `layoutData` aggregation of each content control. In size S, content controls can take up to
      * 			12 columns, while in sizes M and bigger, content controls can take up to 8 columns of space.
      * 	 - If there are more than 2 controls inside a quick action, they will be shown underneath each other
      * 			if the `ColumnMenu` is in size S.
      * 	 - By default, the content controls of `QuickAction` will take up the same amount of space and will
      * 			have the same size.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Defines the text for the label.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
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
      * Sets a new value for property {@link #getCategory category}.
      *
      * Defines the category. In the menu all `QuickActions` are implicitly ordered by their category.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Generic`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCategory(): this.type = js.native
    def setCategory(
      /**
      * New value for property `category`
      */
    sCategory: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof table.columnmenu.Category * / any */ String
    ): this.type = js.native
    def setCategory(/**
      * New value for property `category`
      */
    sCategory: Category): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Defines the text for the label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
  }
  
  trait QuickActionSettings
    extends StObject
       with EntrySettings {
    
    /**
      * Defines the category. In the menu all `QuickActions` are implicitly ordered by their category.
      */
    var category: js.UndefOr[
        Category | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof table.columnmenu.Category * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the content that is shown for the quick action.
      *
      * **Notes:**
      * 	 - Adding additional content to the quick action or altering its layout will only take effect once the
      * 			popover has been closed and reopened again.
      * 	 - The layout of the content of `QuickAction` can be altered by providing {@link sap.ui.layout.GridData}
      * 			for each `layoutData` aggregation of each content control. In size S, content controls can take up to
      * 			12 columns, while in sizes M and bigger, content controls can take up to 8 columns of space.
      * 	 - If there are more than 2 controls inside a quick action, they will be shown underneath each other
      * 			if the `ColumnMenu` is in size S.
      * 	 - By default, the content controls of `QuickAction` will take up the same amount of space and will
      * 			have the same size.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text for the label.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object QuickActionSettings {
    
    inline def apply(): QuickActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickActionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickActionSettings] (val x: Self) extends AnyVal {
      
      inline def setCategory(
        value: Category | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof table.columnmenu.Category * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
