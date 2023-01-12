package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMaskInputRuleMod {
  
  @JSImport("sap/m/MaskInputRule", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MaskInputRule.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MaskInputRule {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MaskInputRuleSettings) = this()
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
    mSettings: MaskInputRuleSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MaskInputRuleSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MaskInputRule", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MaskInputRule with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MaskInputRule]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MaskInputRule],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MaskInputRule.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MaskInputRule
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getMaskFormatSymbol maskFormatSymbol}.
      *
      * Defines the symbol used in the mask format which will accept a certain range of characters.
      *
      * Default value is `"*"`.
      *
      * @returns Value of property `maskFormatSymbol`
      */
    def getMaskFormatSymbol(): String = js.native
    
    /**
      * Gets current value of property {@link #getRegex regex}.
      *
      * Defines the allowed characters as a regular expression.
      *
      * Default value is `"[a-zA-Z0-9]"`.
      *
      * @returns Value of property `regex`
      */
    def getRegex(): String = js.native
    
    /**
      * Sets a new value for property {@link #getMaskFormatSymbol maskFormatSymbol}.
      *
      * Defines the symbol used in the mask format which will accept a certain range of characters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"*"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaskFormatSymbol(): this.type = js.native
    def setMaskFormatSymbol(/**
      * New value for property `maskFormatSymbol`
      */
    sMaskFormatSymbol: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRegex regex}.
      *
      * Defines the allowed characters as a regular expression.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"[a-zA-Z0-9]"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRegex(): this.type = js.native
    def setRegex(/**
      * New value for property `regex`
      */
    sRegex: String): this.type = js.native
  }
  
  trait MaskInputRuleSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Defines the symbol used in the mask format which will accept a certain range of characters.
      */
    var maskFormatSymbol: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the allowed characters as a regular expression.
      */
    var regex: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object MaskInputRuleSettings {
    
    inline def apply(): MaskInputRuleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskInputRuleSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskInputRuleSettings] (val x: Self) extends AnyVal {
      
      inline def setMaskFormatSymbol(value: String | PropertyBindingInfo): Self = StObject.set(x, "maskFormatSymbol", value.asInstanceOf[js.Any])
      
      inline def setMaskFormatSymbolUndefined: Self = StObject.set(x, "maskFormatSymbol", js.undefined)
      
      inline def setRegex(value: String | PropertyBindingInfo): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
}
