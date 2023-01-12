package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMVariantItemMod {
  
  @JSImport("sap/m/VariantItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.VariantItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends VariantItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: VariantItemSettings) = this()
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
    mSettings: VariantItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: VariantItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/VariantItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.VariantItem with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, VariantItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, VariantItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.VariantItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait VariantItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Gets current value of property {@link #getAuthor author}.
      *
      * Contains the author information of the item.
      *
      * @returns Value of property `author`
      */
    def getAuthor(): String = js.native
    
    /**
      * Gets current value of property {@link #getChangeable changeable}.
      *
      * Indicates if the item is changeable.
      *
      * Default value is `false`.
      *
      * @returns Value of property `changeable`
      */
    def getChangeable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getContexts contexts}.
      *
      * Contains the contexts information of the item.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `contexts`
      */
    def getContexts(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getExecuteOnSelect executeOnSelect}.
      *
      * Indicates if the item is marked as apply automatically.
      *
      * Default value is `false`.
      *
      * @returns Value of property `executeOnSelect`
      */
    def getExecuteOnSelect(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFavorite favorite}.
      *
      * Indicates if the item is marked as favorite.
      *
      * Default value is `true`.
      *
      * @returns Value of property `favorite`
      */
    def getFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOriginalContexts originalContexts}.
      *
      * Contains the initial value of the property `contexts`. Is used for cancel operations.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `originalContexts`
      */
    def getOriginalContexts(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getOriginalExecuteOnSelect originalExecuteOnSelect}.
      *
      * Contains the initial value of the property `executeOnSelect`. Is used for cancel operations.
      *
      * Default value is `false`.
      *
      * @returns Value of property `originalExecuteOnSelect`
      */
    def getOriginalExecuteOnSelect(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOriginalFavorite originalFavorite}.
      *
      * Contains the initial value of the property `favorite`. Is used for cancel operations.
      *
      * Default value is `true`.
      *
      * @returns Value of property `originalFavorite`
      */
    def getOriginalFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getOriginalTitle originalTitle}.
      *
      * Contains the initial value of the property `title`. Is used for cancel operations.
      *
      * @returns Value of property `originalTitle`
      */
    def getOriginalTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getRemove remove}.
      *
      * Indicates if the item is removable.
      *
      * Default value is `false`.
      *
      * @returns Value of property `remove`
      */
    def getRemove(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getRename rename}.
      *
      * Indicates if the item is renamable.
      *
      * Default value is `true`.
      *
      * @returns Value of property `rename`
      */
    def getRename(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSharing sharing}.
      *
      * Contains the information is the item is public or private.
      *
      * Default value is `"private"`.
      *
      * @returns Value of property `sharing`
      */
    def getSharing(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Contains the title if the item.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Indicates if the item is visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getAuthor author}.
      *
      * Contains the author information of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAuthor(): this.type = js.native
    def setAuthor(/**
      * New value for property `author`
      */
    sAuthor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getChangeable changeable}.
      *
      * Indicates if the item is changeable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setChangeable(): this.type = js.native
    def setChangeable(/**
      * New value for property `changeable`
      */
    bChangeable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContexts contexts}.
      *
      * Contains the contexts information of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContexts(): this.type = js.native
    def setContexts(/**
      * New value for property `contexts`
      */
    oContexts: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExecuteOnSelect executeOnSelect}.
      *
      * Indicates if the item is marked as apply automatically.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExecuteOnSelect(): this.type = js.native
    def setExecuteOnSelect(/**
      * New value for property `executeOnSelect`
      */
    bExecuteOnSelect: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFavorite favorite}.
      *
      * Indicates if the item is marked as favorite.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavorite(): this.type = js.native
    def setFavorite(/**
      * New value for property `favorite`
      */
    bFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOriginalContexts originalContexts}.
      *
      * Contains the initial value of the property `contexts`. Is used for cancel operations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOriginalContexts(): this.type = js.native
    def setOriginalContexts(/**
      * New value for property `originalContexts`
      */
    oOriginalContexts: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOriginalExecuteOnSelect originalExecuteOnSelect}.
      *
      * Contains the initial value of the property `executeOnSelect`. Is used for cancel operations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOriginalExecuteOnSelect(): this.type = js.native
    def setOriginalExecuteOnSelect(/**
      * New value for property `originalExecuteOnSelect`
      */
    bOriginalExecuteOnSelect: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOriginalFavorite originalFavorite}.
      *
      * Contains the initial value of the property `favorite`. Is used for cancel operations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOriginalFavorite(): this.type = js.native
    def setOriginalFavorite(/**
      * New value for property `originalFavorite`
      */
    bOriginalFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOriginalTitle originalTitle}.
      *
      * Contains the initial value of the property `title`. Is used for cancel operations.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOriginalTitle(): this.type = js.native
    def setOriginalTitle(/**
      * New value for property `originalTitle`
      */
    sOriginalTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRemove remove}.
      *
      * Indicates if the item is removable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRemove(): this.type = js.native
    def setRemove(/**
      * New value for property `remove`
      */
    bRemove: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRename rename}.
      *
      * Indicates if the item is renamable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRename(): this.type = js.native
    def setRename(/**
      * New value for property `rename`
      */
    bRename: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSharing sharing}.
      *
      * Contains the information is the item is public or private.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"private"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSharing(): this.type = js.native
    def setSharing(/**
      * New value for property `sharing`
      */
    sSharing: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Contains the title if the item.
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
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Indicates if the item is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait VariantItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * Contains the author information of the item.
      */
    var author: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the item is changeable.
      */
    var changeable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the contexts information of the item.
      */
    var contexts: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the item is marked as apply automatically.
      */
    var executeOnSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the item is marked as favorite.
      */
    var favorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the initial value of the property `contexts`. Is used for cancel operations.
      */
    var originalContexts: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the initial value of the property `executeOnSelect`. Is used for cancel operations.
      */
    var originalExecuteOnSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the initial value of the property `favorite`. Is used for cancel operations.
      */
    var originalFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the initial value of the property `title`. Is used for cancel operations.
      */
    var originalTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the item is removable.
      */
    var remove: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the item is renamable.
      */
    var rename: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains the information is the item is public or private.
      */
    var sharing: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Contains the title if the item.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the item is visible.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object VariantItemSettings {
    
    inline def apply(): VariantItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariantItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariantItemSettings] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String | PropertyBindingInfo): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setChangeable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "changeable", value.asInstanceOf[js.Any])
      
      inline def setChangeableUndefined: Self = StObject.set(x, "changeable", js.undefined)
      
      inline def setContexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setExecuteOnSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "executeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setExecuteOnSelectUndefined: Self = StObject.set(x, "executeOnSelect", js.undefined)
      
      inline def setFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
      
      inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
      
      inline def setOriginalContexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "originalContexts", value.asInstanceOf[js.Any])
      
      inline def setOriginalContextsUndefined: Self = StObject.set(x, "originalContexts", js.undefined)
      
      inline def setOriginalExecuteOnSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "originalExecuteOnSelect", value.asInstanceOf[js.Any])
      
      inline def setOriginalExecuteOnSelectUndefined: Self = StObject.set(x, "originalExecuteOnSelect", js.undefined)
      
      inline def setOriginalFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "originalFavorite", value.asInstanceOf[js.Any])
      
      inline def setOriginalFavoriteUndefined: Self = StObject.set(x, "originalFavorite", js.undefined)
      
      inline def setOriginalTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "originalTitle", value.asInstanceOf[js.Any])
      
      inline def setOriginalTitleUndefined: Self = StObject.set(x, "originalTitle", js.undefined)
      
      inline def setRemove(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRename(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setSharing(value: String | PropertyBindingInfo): Self = StObject.set(x, "sharing", value.asInstanceOf[js.Any])
      
      inline def setSharingUndefined: Self = StObject.set(x, "sharing", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
