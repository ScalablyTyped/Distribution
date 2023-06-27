package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.Label
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormFormElementMod {
  
  @JSImport("sap/ui/layout/form/FormElement", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.FormElement.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FormElement {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FormElementSettings) = this()
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
    mSettings: FormElementSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FormElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/FormElement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.FormElement with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FormElement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormElement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.FormElement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FormElement
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.74.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the editable state of the `FormElement`.
      *
      * This must only be called from the `Form` and it's `FormContainers`.
      *
      * Labels inside of a `Form` must be invalidated if `editable` changed on `Form`.
      */
    def _setEditable(/**
      * Editable state of the `Form`
      */
    bEditable: Boolean): Unit = js.native
    
    /**
      * Adds some field to the aggregation {@link #getFields fields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addField(
      /**
      * The field to add; if empty, nothing is inserted
      */
    oField: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the fields in the aggregation {@link #getFields fields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFields(): this.type = js.native
    
    /**
      * Destroys the label in the aggregation {@link #getLabel label}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLabel(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getFields fields}.
      *
      * Form controls that belong together to be displayed in one row of a `Form`.
      *
      * **Warning:** Do not put any layout or other container controls in here. This could damage the visual
      * layout, keyboard support and screen-reader support. Only form controls are allowed. Views are also not
      * supported. Allowed controls implement the interface `sap.ui.core.IFormContent`.
      */
    def getFields(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getLabel label}.
      *
      * Label of the fields. Can either be a `Label` control or a string. If a `Label` control is used, the properties
      * of the `Label` can be set. If no assignment between `Label` and the fields is set via (`labelFor` property
      * of the `Label`), it will be done automatically by the `FormElement`. In this case the `Label` is assigned
      * to the fields of the `FormElement`.
      */
    def getLabel(): Label | String = js.native
    
    /**
      * Returns the `Label` of the `FormElement`, even if the `Label` is assigned as string. The `FormLayout`
      * needs the information of the label to render the `Form`.
      *
      * @returns `Label` control used to render the label
      */
    def getLabelControl(): Label = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * If set to `false`, the `FormElement` is not rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFields fields}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfField(
      /**
      * The field whose index is looked for
      */
    oField: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a field into the aggregation {@link #getFields fields}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertField(
      /**
      * The field to insert; if empty, nothing is inserted
      */
    oField: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the field should be inserted at; for a negative value of `iIndex`, the field is inserted
      * at position 0; for a value greater than the current size of the aggregation, the field is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Labels inside of a Form must be invalidated if "editable" changed on Form
      */
    def invalidateLabel(): Unit = js.native
    
    /**
      * Determines if the `FormElement` is visible or not. Per default it just returns the value of the `visible`
      * property. But this might be overwritten by inherited elements.
      *
      * For rendering by `FormLayouts` this function has to be used instead of `getVisible`.
      *
      * @returns If true, the `FormElement` is visible, otherwise not
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFields fields}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFields(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeField(/**
      * The field to remove or its index or id
      */
    vField: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a field from the aggregation {@link #getFields fields}.
      *
      * @returns The removed field or `null`
      */
    def removeField(/**
      * The field to remove or its index or id
      */
    vField: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeField(
      /**
      * The field to remove or its index or id
      */
    vField: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def setLabel(/**
      * The label to set
      */
    vLabel: String): this.type = js.native
    /**
      * Sets the aggregated {@link #getLabel label}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * The label to set
      */
    vLabel: Label): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * If set to `false`, the `FormElement` is not rendered.
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
  
  trait FormElementSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Form controls that belong together to be displayed in one row of a `Form`.
      *
      * **Warning:** Do not put any layout or other container controls in here. This could damage the visual
      * layout, keyboard support and screen-reader support. Only form controls are allowed. Views are also not
      * supported. Allowed controls implement the interface `sap.ui.core.IFormContent`.
      */
    var fields: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Label of the fields. Can either be a `Label` control or a string. If a `Label` control is used, the properties
      * of the `Label` can be set. If no assignment between `Label` and the fields is set via (`labelFor` property
      * of the `Label`), it will be done automatically by the `FormElement`. In this case the `Label` is assigned
      * to the fields of the `FormElement`.
      */
    var label: js.UndefOr[String | Label | PropertyBindingInfo] = js.undefined
    
    /**
      * If set to `false`, the `FormElement` is not rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FormElementSettings {
    
    inline def apply(): FormElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormElementSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormElementSettings] (val x: Self) extends AnyVal {
      
      inline def setFields(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setLabel(value: String | Label | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
