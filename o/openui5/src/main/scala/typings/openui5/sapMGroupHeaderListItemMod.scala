package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMGroupHeaderListItemMod {
  
  @JSImport("sap/m/GroupHeaderListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GroupHeaderListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GroupHeaderListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GroupHeaderListItemSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: GroupHeaderListItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GroupHeaderListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/GroupHeaderListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.GroupHeaderListItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, GroupHeaderListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GroupHeaderListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.GroupHeaderListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GroupHeaderListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * Gets current value of property {@link #getCount count}.
      *
      * Defines the count of items in the group, but it could also be an amount which represents the sum of all
      * amounts in the group. **Note:** Will not be displayed if not set.
      *
      * @returns Value of property `count`
      */
    def getCount(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the group header.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Defines the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `titleTextDirection`
      */
    def getTitleTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.13.2
      * @deprecated (since 1.40.10)
      *
      * Gets current value of property {@link #getUpperCase upperCase}.
      *
      * Allows to uppercase the group title.
      *
      * Default value is `false`.
      *
      * @returns Value of property `upperCase`
      */
    def getUpperCase(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getCount count}.
      *
      * Defines the count of items in the group, but it could also be an amount which represents the sum of all
      * amounts in the group. **Note:** Will not be displayed if not set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCount(): this.type = js.native
    def setCount(/**
      * New value for property `count`
      */
    sCount: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the group header.
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
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Defines the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleTextDirection(): this.type = js.native
    def setTitleTextDirection(
      /**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTitleTextDirection(/**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: TextDirection): this.type = js.native
    
    /**
      * @SINCE 1.13.2
      * @deprecated (since 1.40.10)
      *
      * Sets a new value for property {@link #getUpperCase upperCase}.
      *
      * Allows to uppercase the group title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpperCase(): this.type = js.native
    def setUpperCase(/**
      * New value for property `upperCase`
      */
    bUpperCase: Boolean): this.type = js.native
  }
  
  trait GroupHeaderListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Defines the count of items in the group, but it could also be an amount which represents the sum of all
      * amounts in the group. **Note:** Will not be displayed if not set.
      */
    var count: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the title of the group header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Defines the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      */
    var titleTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.13.2
      * @deprecated (since 1.40.10)
      *
      * Allows to uppercase the group title.
      */
    var upperCase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GroupHeaderListItemSettings {
    
    inline def apply(): GroupHeaderListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupHeaderListItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupHeaderListItemSettings] (val x: Self) extends AnyVal {
      
      inline def setCount(value: String | PropertyBindingInfo): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleTextDirection", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirectionUndefined: Self = StObject.set(x, "titleTextDirection", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUpperCase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    }
  }
}
