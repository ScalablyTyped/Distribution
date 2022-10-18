package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Toolbar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormFormMod {
  
  @JSImport("sap/ui/layout/form/Form", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.Form.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Form {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FormSettings) = this()
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
    mSettings: FormSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FormSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/Form", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.Form with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Form]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Form],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.Form.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Form
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.28.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some formContainer to the aggregation {@link #getFormContainers formContainers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFormContainer(
      /**
      * The formContainer to add; if empty, nothing is inserted
      */
    oFormContainer: typings.openui5.sapUiLayoutFormFormContainerMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the formContainers in the aggregation {@link #getFormContainers formContainers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFormContainers(): this.type = js.native
    
    /**
      * Destroys the layout in the aggregation {@link #getLayout layout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayout(): this.type = js.native
    
    /**
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.20.0
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      *
      * Default value is `false`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFormContainers formContainers}.
      *
      * Containers with the content of the form. A `FormContainer` represents a group inside the `Form`.
      */
    def getFormContainers(): js.Array[typings.openui5.sapUiLayoutFormFormContainerMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getLayout layout}.
      *
      * Layout of the `Form`. The assigned `Layout` renders the `Form`. We recommend using the {@link sap.ui.layout.form.ColumnLayout
      * ColumnLayout} for rendering a `Form`, as its responsiveness allows the available space to be used in
      * the best way possible.
      */
    def getLayout(): typings.openui5.sapUiLayoutFormFormLayoutMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getTitle title}.
      *
      * Title of the `Form`. Can either be a `Title` element or a string. If a `Title` element it used, the style
      * of the title can be set.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored.
      *
      * **Note:** If the title is provided as a string, the title is rendered with a theme-dependent default
      * level. As the `Form` control cannot know the structure of the page, this might not fit the page structure.
      * In this case provide the title using a `Title` element and set its {@link sap.ui.core.Title#setLevel
      * level} to the needed value.
      */
    def getTitle(): typings.openui5.sapUiCoreTitleMod.default | String = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Toolbar of the `Form`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      * Use the right title level to meet the visual requirements. This might be theme-dependent.
      */
    def getToolbar(): Toolbar = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the `Form`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.layout.form.FormContainer` in the aggregation {@link #getFormContainers
      * formContainers}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFormContainer(
      /**
      * The formContainer whose index is looked for
      */
    oFormContainer: typings.openui5.sapUiLayoutFormFormContainerMod.default
    ): int = js.native
    
    /**
      * Inserts a formContainer into the aggregation {@link #getFormContainers formContainers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFormContainer(
      /**
      * The formContainer to insert; if empty, nothing is inserted
      */
    oFormContainer: typings.openui5.sapUiLayoutFormFormContainerMod.default,
      /**
      * The `0`-based index the formContainer should be inserted at; for a negative value of `iIndex`, the formContainer
      * is inserted at position 0; for a value greater than the current size of the aggregation, the formContainer
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFormContainers formContainers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFormContainers(): js.Array[typings.openui5.sapUiLayoutFormFormContainerMod.default] = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeFormContainer(/**
      * The formContainer to remove or its index or id
      */
    vFormContainer: String): typings.openui5.sapUiLayoutFormFormContainerMod.default | Null = js.native
    /**
      * Removes a formContainer from the aggregation {@link #getFormContainers formContainers}.
      *
      * @returns The removed formContainer or `null`
      */
    def removeFormContainer(/**
      * The formContainer to remove or its index or id
      */
    vFormContainer: int): typings.openui5.sapUiLayoutFormFormContainerMod.default | Null = js.native
    def removeFormContainer(
      /**
      * The formContainer to remove or its index or id
      */
    vFormContainer: typings.openui5.sapUiLayoutFormFormContainerMod.default
    ): typings.openui5.sapUiLayoutFormFormContainerMod.default | Null = js.native
    
    /**
      * @SINCE 1.20.0
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayout layout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(/**
      * The layout to set
      */
    oLayout: typings.openui5.sapUiLayoutFormFormLayoutMod.default): this.type = js.native
    
    def setTitle(/**
      * The title to set
      */
    vTitle: String): this.type = js.native
    /**
      * Sets the aggregated {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * The title to set
      */
    vTitle: typings.openui5.sapUiCoreTitleMod.default): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Sets the aggregated {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbar(/**
      * The toolbar to set
      */
    oToolbar: Toolbar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the `Form`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait FormSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.28.0
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.20.0
      *
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Containers with the content of the form. A `FormContainer` represents a group inside the `Form`.
      */
    var formContainers: js.UndefOr[
        js.Array[typings.openui5.sapUiLayoutFormFormContainerMod.default] | typings.openui5.sapUiLayoutFormFormContainerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Layout of the `Form`. The assigned `Layout` renders the `Form`. We recommend using the {@link sap.ui.layout.form.ColumnLayout
      * ColumnLayout} for rendering a `Form`, as its responsiveness allows the available space to be used in
      * the best way possible.
      */
    var layout: js.UndefOr[typings.openui5.sapUiLayoutFormFormLayoutMod.default] = js.undefined
    
    /**
      * Title of the `Form`. Can either be a `Title` element or a string. If a `Title` element it used, the style
      * of the title can be set.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored.
      *
      * **Note:** If the title is provided as a string, the title is rendered with a theme-dependent default
      * level. As the `Form` control cannot know the structure of the page, this might not fit the page structure.
      * In this case provide the title using a `Title` element and set its {@link sap.ui.core.Title#setLevel
      * level} to the needed value.
      */
    var title: js.UndefOr[String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * Toolbar of the `Form`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      * Use the right title level to meet the visual requirements. This might be theme-dependent.
      */
    var toolbar: js.UndefOr[Toolbar] = js.undefined
    
    /**
      * Width of the `Form`.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FormSettings {
    
    inline def apply(): FormSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSettings]
    }
    
    extension [Self <: FormSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setFormContainers(
        value: js.Array[typings.openui5.sapUiLayoutFormFormContainerMod.default] | typings.openui5.sapUiLayoutFormFormContainerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "formContainers", value.asInstanceOf[js.Any])
      
      inline def setFormContainersUndefined: Self = StObject.set(x, "formContainers", js.undefined)
      
      inline def setFormContainersVarargs(value: typings.openui5.sapUiLayoutFormFormContainerMod.default*): Self = StObject.set(x, "formContainers", js.Array(value*))
      
      inline def setLayout(value: typings.openui5.sapUiLayoutFormFormLayoutMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setTitle(value: String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
