package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiMdcValuehelpBaseContentMod.ContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpContentConditionsMod {
  
  @JSImport("sap/ui/mdc/valuehelp/content/Conditions", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Conditions` content.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Conditions {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ConditionsSettings) = this()
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
    mSettings: ConditionsSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ConditionsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/content/Conditions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.content.Conditions with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, Conditions]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Conditions],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.content.Conditions.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Conditions
    extends typings.openui5.sapUiMdcValuehelpBaseContentMod.default {
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * ID of the element which is the current target of the association {@link #getFieldHelp fieldHelp}, or
      * `null`.
      */
    def getFieldHelp(): ID = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Label shown on condition panel.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getValueHelp valueHelp}, or
      * `null`.
      */
    def getValueHelp(): ID = js.native
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * Sets the associated {@link #getFieldHelp fieldHelp}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldHelp(
      /**
      * ID of an element which becomes the new target of this fieldHelp association; alternatively, an element
      * instance may be given
      */
    oFieldHelp: ID
    ): this.type = js.native
    def setFieldHelp(
      /**
      * ID of an element which becomes the new target of this fieldHelp association; alternatively, an element
      * instance may be given
      */
    oFieldHelp: typings.openui5.sapUiMdcValueHelpMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Label shown on condition panel.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Sets the associated {@link #getValueHelp valueHelp}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueHelp(
      /**
      * ID of an element which becomes the new target of this valueHelp association; alternatively, an element
      * instance may be given
      */
    oValueHelp: ID
    ): this.type = js.native
    def setValueHelp(
      /**
      * ID of an element which becomes the new target of this valueHelp association; alternatively, an element
      * instance may be given
      */
    oValueHelp: typings.openui5.sapUiMdcValueHelpMod.default
    ): this.type = js.native
  }
  
  trait ConditionsSettings
    extends StObject
       with ContentSettings {
    
    /**
      * @deprecated (since 1.114.0) - replaced by {@link #setValueHelp valueHelp} association
      *
      * Optional `FieldHelp`.
      *
      * This is an association that allows the usage of one `FieldHelp` instance for the value fields for the
      * `Conditions`. **Note:** The value fields on the conditions UI are created by the used `DefineConditionPanel`.
      * They cannot be accessed from outside. The fields are single-value input, and the display is always set
      * to `FieldDisplay.Value`. Only a `ValueHelp>/code> with a TypeAhead` and a single-selection `MTable`
      * can be used. **Note:** For `Boolean`, `Date`, or `Time` types, no `FieldHelp` should be added, but a
      * default `FieldHelp` used instead.
      */
    var fieldHelp: js.UndefOr[typings.openui5.sapUiMdcValueHelpMod.default | String] = js.undefined
    
    /**
      * Label shown on condition panel.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Optional `ValueHelp`.
      *
      * This is an association that allows the usage of one `ValueHelp` instance for the value fields for the
      * `Conditions`.
      *
      * **Note:** The value fields on the conditions UI are created by the used `DefineConditionPanel`. They
      * cannot be accessed from outside. The fields are single-value input, and the display is always set to
      * `FieldDisplay.Value`. Only a `ValueHelp>/code> with a TypeAhead` and a single-selection `MTable`
      * can be used.
      *
      * **Note:** For `Boolean`, `Date`, or `Time` types, no `ValueHelp` should be added, but a default `ValueHelp`
      * used instead.
      */
    var valueHelp: js.UndefOr[typings.openui5.sapUiMdcValueHelpMod.default | String] = js.undefined
  }
  object ConditionsSettings {
    
    inline def apply(): ConditionsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionsSettings] (val x: Self) extends AnyVal {
      
      inline def setFieldHelp(value: typings.openui5.sapUiMdcValueHelpMod.default | String): Self = StObject.set(x, "fieldHelp", value.asInstanceOf[js.Any])
      
      inline def setFieldHelpUndefined: Self = StObject.set(x, "fieldHelp", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValueHelp(value: typings.openui5.sapUiMdcValueHelpMod.default | String): Self = StObject.set(x, "valueHelp", value.asInstanceOf[js.Any])
      
      inline def setValueHelpUndefined: Self = StObject.set(x, "valueHelp", js.undefined)
    }
  }
}
