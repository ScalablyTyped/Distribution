package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcValuehelpBaseContentMod.ContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpBaseListContentMod {
  
  @JSImport("sap/ui/mdc/valuehelp/base/ListContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ListContent`.
    *
    * This is the basis for different value help list contents. It cannot be used directly.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ListContent {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ListContentSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: ListContentSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ListContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/base/ListContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.base.ListContent with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.Content.extend}.
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
    oClassInfo: ClassInfo[T, ListContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ListContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.base.ListContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ListContent
    extends typings.openui5.sapUiMdcValuehelpBaseContentMod.default {
    
    /**
      * Gets current value of property {@link #getCaseSensitive caseSensitive}.
      *
      * If this property is set to `true`, the filtering for user input is always case-sensitive. Otherwise user
      * input is checked case-insensitively. If `$search` is used, this property has no effect on the `$search`
      * request.
      *
      * If the used back-end service supports a case-insensitive search, set this property to `false`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `caseSensitive`
      */
    def getCaseSensitive(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the `ListBinding` of the content
      *
      * @returns ListBinding
      */
    def getListBinding(): typings.openui5.sapUiModelListBindingMod.default = js.native
    
    /**
      * Gets current value of property {@link #getUseAsValueHelp useAsValueHelp}.
      *
      * If set, the List is also opened if the ValueHelp icon is pressed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `useAsValueHelp`
      */
    def getUseAsValueHelp(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUseFirstMatch useFirstMatch}.
      *
      * If set, `getItemForValue` returns the first item that matches the text.
      *
      * This is the case if the text of the item starts with the text entered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `useFirstMatch`
      */
    def getUseFirstMatch(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getCaseSensitive caseSensitive}.
      *
      * If this property is set to `true`, the filtering for user input is always case-sensitive. Otherwise user
      * input is checked case-insensitively. If `$search` is used, this property has no effect on the `$search`
      * request.
      *
      * If the used back-end service supports a case-insensitive search, set this property to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCaseSensitive(): this.type = js.native
    def setCaseSensitive(/**
      * New value for property `caseSensitive`
      */
    bCaseSensitive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseAsValueHelp useAsValueHelp}.
      *
      * If set, the List is also opened if the ValueHelp icon is pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseAsValueHelp(): this.type = js.native
    def setUseAsValueHelp(/**
      * New value for property `useAsValueHelp`
      */
    bUseAsValueHelp: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseFirstMatch useFirstMatch}.
      *
      * If set, `getItemForValue` returns the first item that matches the text.
      *
      * This is the case if the text of the item starts with the text entered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseFirstMatch(): this.type = js.native
    def setUseFirstMatch(/**
      * New value for property `useFirstMatch`
      */
    bUseFirstMatch: Boolean): this.type = js.native
  }
  
  trait ListContentSettings
    extends StObject
       with ContentSettings {
    
    /**
      * If this property is set to `true`, the filtering for user input is always case-sensitive. Otherwise user
      * input is checked case-insensitively. If `$search` is used, this property has no effect on the `$search`
      * request.
      *
      * If the used back-end service supports a case-insensitive search, set this property to `false`.
      */
    var caseSensitive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, the List is also opened if the ValueHelp icon is pressed.
      */
    var useAsValueHelp: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, `getItemForValue` returns the first item that matches the text.
      *
      * This is the case if the text of the item starts with the text entered.
      */
    var useFirstMatch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ListContentSettings {
    
    inline def apply(): ListContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListContentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListContentSettings] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setUseAsValueHelp(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useAsValueHelp", value.asInstanceOf[js.Any])
      
      inline def setUseAsValueHelpUndefined: Self = StObject.set(x, "useAsValueHelp", js.undefined)
      
      inline def setUseFirstMatch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useFirstMatch", value.asInstanceOf[js.Any])
      
      inline def setUseFirstMatchUndefined: Self = StObject.set(x, "useFirstMatch", js.undefined)
    }
  }
}
