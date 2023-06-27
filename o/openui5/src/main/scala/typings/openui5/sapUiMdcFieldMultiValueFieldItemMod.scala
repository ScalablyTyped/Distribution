package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldMultiValueFieldItemMod {
  
  @JSImport("sap/ui/mdc/field/MultiValueFieldItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MultiValueFieldItem`.
    *
    * The `MultiValueField` control holds its values as items. The `MultiValueFieldItem` element defines these
    * items.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MultiValueFieldItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MultiValueFieldItemSettings) = this()
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
    mSettings: MultiValueFieldItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MultiValueFieldItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/MultiValueFieldItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.field.MultiValueFieldItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, MultiValueFieldItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MultiValueFieldItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.field.MultiValueFieldItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MultiValueFieldItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Description of the item.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Key of the item.
      *
      * @returns Value of property `key`
      */
    def getKey(): Any = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Description of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Key of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    oKey: Any): this.type = js.native
  }
  
  trait MultiValueFieldItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Description of the item.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Key of the item.
      */
    var key: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object MultiValueFieldItemSettings {
    
    inline def apply(): MultiValueFieldItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiValueFieldItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiValueFieldItemSettings] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setKey(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
