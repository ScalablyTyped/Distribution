package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreListItemMod.ListItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpContentFixedListItemMod {
  
  @JSImport("sap/ui/mdc/valuehelp/content/FixedListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FixedListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FixedListItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FixedListItemSettings) = this()
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
    mSettings: FixedListItemSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FixedListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/content/FixedListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.content.FixedListItem with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.ListItem.extend}.
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
    oClassInfo: ClassInfo[T, FixedListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FixedListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.content.FixedListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FixedListItem
    extends typings.openui5.sapUiCoreListItemMod.default {
    
    /**
      * Gets current value of property {@link #getGroupKey groupKey}.
      *
      * Key of the group for what the items are grouped
      *
      * @returns Value of property `groupKey`
      */
    def getGroupKey(): Any = js.native
    
    /**
      * Gets current value of property {@link #getGroupText groupText}.
      *
      * Text of the group for what the items are grouped
      *
      * @returns Value of property `groupText`
      */
    def getGroupText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getGroupKey groupKey}.
      *
      * Key of the group for what the items are grouped
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupKey(): this.type = js.native
    def setGroupKey(/**
      * New value for property `groupKey`
      */
    oGroupKey: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupText groupText}.
      *
      * Text of the group for what the items are grouped
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupText(): this.type = js.native
    def setGroupText(/**
      * New value for property `groupText`
      */
    sGroupText: String): this.type = js.native
  }
  
  trait FixedListItemSettings
    extends StObject
       with ListItemSettings {
    
    /**
      * Key of the group for what the items are grouped
      */
    var groupKey: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Text of the group for what the items are grouped
      */
    var groupText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FixedListItemSettings {
    
    inline def apply(): FixedListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedListItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedListItemSettings] (val x: Self) extends AnyVal {
      
      inline def setGroupKey(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
      
      inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
      
      inline def setGroupText(value: String | PropertyBindingInfo): Self = StObject.set(x, "groupText", value.asInstanceOf[js.Any])
      
      inline def setGroupTextUndefined: Self = StObject.set(x, "groupText", js.undefined)
    }
  }
}
