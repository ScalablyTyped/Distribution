package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.Label
import typings.openui5.sapUiLayoutFormFormElementMod.FormElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormSemanticFormElementMod {
  
  @JSImport("sap/ui/layout/form/SemanticFormElement", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.SemanticFormElement.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SemanticFormElement {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SemanticFormElementSettings) = this()
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
    mSettings: SemanticFormElementSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SemanticFormElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/SemanticFormElement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.SemanticFormElement with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.form.FormElement.extend}.
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
    oClassInfo: ClassInfo[T, SemanticFormElement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SemanticFormElement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.SemanticFormElement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SemanticFormElement
    extends typings.openui5.sapUiLayoutFormFormElementMod.default {
    
    /**
      * Adds some fieldLabel to the aggregation {@link #getFieldLabels fieldLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFieldLabel(/**
      * The fieldLabel to add; if empty, nothing is inserted
      */
    oFieldLabel: Label): this.type = js.native
    
    /**
      * Destroys all the fieldLabels in the aggregation {@link #getFieldLabels fieldLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFieldLabels(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDelimiter delimiter}.
      *
      * Delimiter symbol to separate the fields.
      *
      * Default value is `"/"`.
      *
      * @returns Value of property `delimiter`
      */
    def getDelimiter(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getFieldLabels fieldLabels}.
      *
      * Labels of the individual fields. Can either be a `Label` control or a string.
      *
      * If a `Label` control is used, the properties of the `Label` can be set.
      *
      * These labels are not rendered directly. If the `Label` property of `SemanticFormElement` is not set,
      * the texts of the labels are concatenated into the `Label` property of `SemanticFormElement`. Otherwise
      * the set `Label` is shown.
      *
      * **Note:** If this aggregation is used, a label is assigned to every single field of `SemanticFormElement`.
      * The order of the labels and the fields must be the same.
      */
    def getFieldLabels(): js.Array[Label] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Label` in the aggregation {@link #getFieldLabels fieldLabels}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFieldLabel(/**
      * The fieldLabel whose index is looked for
      */
    oFieldLabel: Label): int = js.native
    
    /**
      * Inserts a fieldLabel into the aggregation {@link #getFieldLabels fieldLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFieldLabel(
      /**
      * The fieldLabel to insert; if empty, nothing is inserted
      */
    oFieldLabel: Label,
      /**
      * The `0`-based index the fieldLabel should be inserted at; for a negative value of `iIndex`, the fieldLabel
      * is inserted at position 0; for a value greater than the current size of the aggregation, the fieldLabel
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFieldLabels fieldLabels}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFieldLabels(): js.Array[Label] = js.native
    
    def removeFieldLabel(/**
      * The fieldLabel to remove or its index or id
      */
    vFieldLabel: String): Label | Null = js.native
    /**
      * Removes a fieldLabel from the aggregation {@link #getFieldLabels fieldLabels}.
      *
      * @returns The removed fieldLabel or `null`
      */
    def removeFieldLabel(/**
      * The fieldLabel to remove or its index or id
      */
    vFieldLabel: int): Label | Null = js.native
    def removeFieldLabel(/**
      * The fieldLabel to remove or its index or id
      */
    vFieldLabel: Label): Label | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDelimiter delimiter}.
      *
      * Delimiter symbol to separate the fields.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"/"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelimiter(): this.type = js.native
    def setDelimiter(/**
      * New value for property `delimiter`
      */
    sDelimiter: String): this.type = js.native
  }
  
  trait SemanticFormElementSettings
    extends StObject
       with FormElementSettings {
    
    /**
      * Delimiter symbol to separate the fields.
      */
    var delimiter: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Labels of the individual fields. Can either be a `Label` control or a string.
      *
      * If a `Label` control is used, the properties of the `Label` can be set.
      *
      * These labels are not rendered directly. If the `Label` property of `SemanticFormElement` is not set,
      * the texts of the labels are concatenated into the `Label` property of `SemanticFormElement`. Otherwise
      * the set `Label` is shown.
      *
      * **Note:** If this aggregation is used, a label is assigned to every single field of `SemanticFormElement`.
      * The order of the labels and the fields must be the same.
      */
    var fieldLabels: js.UndefOr[
        js.Array[Label] | Label | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SemanticFormElementSettings {
    
    inline def apply(): SemanticFormElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticFormElementSettings]
    }
    
    extension [Self <: SemanticFormElementSettings](x: Self) {
      
      inline def setDelimiter(value: String | PropertyBindingInfo): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setFieldLabels(
        value: js.Array[Label] | Label | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fieldLabels", value.asInstanceOf[js.Any])
      
      inline def setFieldLabelsUndefined: Self = StObject.set(x, "fieldLabels", js.undefined)
      
      inline def setFieldLabelsVarargs(value: Label*): Self = StObject.set(x, "fieldLabels", js.Array(value*))
    }
  }
}
