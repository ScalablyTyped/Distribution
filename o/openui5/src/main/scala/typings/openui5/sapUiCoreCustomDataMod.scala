package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreCustomDataMod {
  
  @JSImport("sap/ui/core/CustomData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CustomData` element.
    */
  open class default () extends CustomData {
    def this(/**
      * initial settings for the new element
      */
    mSettings: CustomDataSettings) = this()
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
      * initial settings for the new element
      */
    mSettings: CustomDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new element
      */
    mSettings: CustomDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/CustomData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of `CustomData` with name `sClassName` and enriches it with the information contained
      * in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend
      * Element.extend}.
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
      * Constructor function for the metadata object; if not given, it defaults to `sap.ui.core.ElementMetadata`
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
    oClassInfo: ClassInfo[T, CustomData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CustomData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to `sap.ui.core.ElementMetadata`
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class `sap.ui.core.CustomData`.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CustomData
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * The key of the data in this CustomData object. When the data is just stored, it can be any string, but
      * when it is to be written to HTML (`writeToDom == true`) then it must also be a valid HTML attribute name.
      * It must conform to the {@link sap.ui.core.ID} type and may contain no colon. To avoid collisions, it
      * also may not start with "sap-ui". When written to HTML, the key is prefixed with "data-". If any restriction
      * is violated, a warning will be logged and nothing will be written to the DOM.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The data stored in this CustomData object. When the data is just stored, it can be any JS type, but when
      * it is to be written to HTML (`writeToDom == true`) then it must be a string. If this restriction is violated,
      * a warning will be logged and nothing will be written to the DOM.
      *
      * @returns Value of property `value`
      */
    def getValue(): Any = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Gets current value of property {@link #getWriteToDom writeToDom}.
      *
      * If set to "true" and the value is of type "string" and the key conforms to the documented restrictions,
      * this custom data is written to the HTML root element of the control as a "data-*" attribute. If the key
      * is "abc" and the value is "cde", the HTML will look as follows:
      *
      *
      * ```javascript
      *
      *   <SomeTag ... data-abc="cde" ... >
      * ```
      *
      *
      * Thus the application can provide stable attributes by data binding which can be used for styling or identification
      * purposes.
      *
      * **ATTENTION:** use carefully to not create huge attributes or a large number of them.
      *
      * Default value is `false`.
      *
      * @returns Value of property `writeToDom`
      */
    def getWriteToDom(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * The key of the data in this CustomData object. When the data is just stored, it can be any string, but
      * when it is to be written to HTML (`writeToDom == true`) then it must also be a valid HTML attribute name.
      * It must conform to the {@link sap.ui.core.ID} type and may contain no colon. To avoid collisions, it
      * also may not start with "sap-ui". When written to HTML, the key is prefixed with "data-". If any restriction
      * is violated, a warning will be logged and nothing will be written to the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(): this.type = js.native
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * The data stored in this CustomData object. When the data is just stored, it can be any JS type, but when
      * it is to be written to HTML (`writeToDom == true`) then it must be a string. If this restriction is violated,
      * a warning will be logged and nothing will be written to the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    oValue: Any): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Sets a new value for property {@link #getWriteToDom writeToDom}.
      *
      * If set to "true" and the value is of type "string" and the key conforms to the documented restrictions,
      * this custom data is written to the HTML root element of the control as a "data-*" attribute. If the key
      * is "abc" and the value is "cde", the HTML will look as follows:
      *
      *
      * ```javascript
      *
      *   <SomeTag ... data-abc="cde" ... >
      * ```
      *
      *
      * Thus the application can provide stable attributes by data binding which can be used for styling or identification
      * purposes.
      *
      * **ATTENTION:** use carefully to not create huge attributes or a large number of them.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWriteToDom(): this.type = js.native
    def setWriteToDom(/**
      * New value for property `writeToDom`
      */
    bWriteToDom: Boolean): this.type = js.native
  }
  
  trait CustomDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The key of the data in this CustomData object. When the data is just stored, it can be any string, but
      * when it is to be written to HTML (`writeToDom == true`) then it must also be a valid HTML attribute name.
      * It must conform to the {@link sap.ui.core.ID} type and may contain no colon. To avoid collisions, it
      * also may not start with "sap-ui". When written to HTML, the key is prefixed with "data-". If any restriction
      * is violated, a warning will be logged and nothing will be written to the DOM.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The data stored in this CustomData object. When the data is just stored, it can be any JS type, but when
      * it is to be written to HTML (`writeToDom == true`) then it must be a string. If this restriction is violated,
      * a warning will be logged and nothing will be written to the DOM.
      */
    var value: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.9.0
      *
      * If set to "true" and the value is of type "string" and the key conforms to the documented restrictions,
      * this custom data is written to the HTML root element of the control as a "data-*" attribute. If the key
      * is "abc" and the value is "cde", the HTML will look as follows:
      *
      *
      * ```javascript
      *
      *   <SomeTag ... data-abc="cde" ... >
      * ```
      *
      *
      * Thus the application can provide stable attributes by data binding which can be used for styling or identification
      * purposes.
      *
      * **ATTENTION:** use carefully to not create huge attributes or a large number of them.
      */
    var writeToDom: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CustomDataSettings {
    
    inline def apply(): CustomDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomDataSettings]
    }
    
    extension [Self <: CustomDataSettings](x: Self) {
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWriteToDom(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "writeToDom", value.asInstanceOf[js.Any])
      
      inline def setWriteToDomUndefined: Self = StObject.set(x, "writeToDom", js.undefined)
    }
  }
}
