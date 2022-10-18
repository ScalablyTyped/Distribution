package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputBaseMod.InputBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMComboBoxTextFieldMod {
  
  @JSImport("sap/m/ComboBoxTextField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.ComboBoxTextField`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ComboBoxTextField {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxTextFieldSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxTextFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxTextFieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ComboBoxTextField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ComboBoxTextField with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.InputBase.extend}.
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
    oClassInfo: ClassInfo[T, ComboBoxTextField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ComboBoxTextField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ComboBoxTextField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ComboBoxTextField
    extends typings.openui5.sapMInputBaseMod.default {
    
    /**
      * Returns the arrow icon
      *
      * Left for backward compatibility.
      */
    var getIcon: Unit = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the text field.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.38
      *
      * Gets current value of property {@link #getShowButton showButton}.
      *
      * Indicates whether the dropdown downward-facing arrow button is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showButton`
      */
    def getShowButton(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the text field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.38
      *
      * Sets a new value for property {@link #getShowButton showButton}.
      *
      * Indicates whether the dropdown downward-facing arrow button is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowButton(): this.type = js.native
    def setShowButton(/**
      * New value for property `showButton`
      */
    bShowButton: Boolean): this.type = js.native
    
    /**
      * Toggles the icon pressed style on or off.
      */
    def toggleIconPressedStyle(): Unit = js.native
    def toggleIconPressedStyle(/**
      * True if the icon pressed class should be applied.
      */
    bState: Boolean): Unit = js.native
  }
  
  trait ComboBoxTextFieldSettings
    extends StObject
       with InputBaseSettings {
    
    /**
      * Sets the maximum width of the text field.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38
      *
      * Indicates whether the dropdown downward-facing arrow button is shown.
      */
    var showButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ComboBoxTextFieldSettings {
    
    inline def apply(): ComboBoxTextFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBoxTextFieldSettings]
    }
    
    extension [Self <: ComboBoxTextFieldSettings](x: Self) {
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setShowButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
      
      inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
    }
  }
}
