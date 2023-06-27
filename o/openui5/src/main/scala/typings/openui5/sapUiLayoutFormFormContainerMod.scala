package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Toolbar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormFormContainerMod {
  
  @JSImport("sap/ui/layout/form/FormContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.FormContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FormContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FormContainerSettings) = this()
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
    mSettings: FormContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FormContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/FormContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.FormContainer with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, FormContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FormContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.FormContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FormContainer
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.74.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the editable state of the `FormContainer`.
      *
      * This must only be called from the `Form`.
      *
      * Labels inside of a `Form` must be invalidated if `editable` changed on `Form`.
      */
    def _setEditable(/**
      * Editable state of the `Form`
      */
    bEditable: Boolean): Unit = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.36.0
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
      * Adds some formElement to the aggregation {@link #getFormElements formElements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFormElement(
      /**
      * The formElement to add; if empty, nothing is inserted
      */
    oFormElement: typings.openui5.sapUiLayoutFormFormElementMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the formElements in the aggregation {@link #getFormElements formElements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFormElements(): this.type = js.native
    
    /**
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * @since 1.36.0
      *
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * @since 1.36.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getExpandable expandable}.
      *
      * Defines if the `FormContainer` is expandable.
      *
      * **Note:** The expander icon will only be shown if a `title` is set for the `FormContainer`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `expandable`
      */
    def getExpandable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Container is expanded.
      *
      * **Note:** This property only works if `expandable` is set to `true`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFormElements formElements}.
      *
      * The `FormElements` contain the content (labels and fields) of the `FormContainers`.
      */
    def getFormElements(): js.Array[typings.openui5.sapUiLayoutFormFormElementMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getTitle title}.
      *
      * Title of the `FormContainer`. Can either be a `Title` element or a string. If a `Title` element is used,
      * the style of the title can be set.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored.
      *
      * **Note:** If the title is provided as a string, the title is rendered with a theme-dependent default
      * level. As the `Form` control cannot know the structure of the page, this might not fit the page structure.
      * In this case provide the title using a `Title` element and set its {@link sap.ui.core.Title#setLevel level }
      * to the needed value.
      */
    def getTitle(): typings.openui5.sapUiCoreTitleMod.default | String = js.native
    
    /**
      * @since 1.36.0
      *
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Toolbar of the `FormContainer`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      * Use the right title level to meet the visual requirements. This might be theme-dependent.
      */
    def getToolbar(): Toolbar = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * If set to `false`, the `FormContainer` is not rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.layout.form.FormElement` in the aggregation {@link #getFormElements formElements}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFormElement(
      /**
      * The formElement whose index is looked for
      */
    oFormElement: typings.openui5.sapUiLayoutFormFormElementMod.default
    ): int = js.native
    
    /**
      * Inserts a formElement into the aggregation {@link #getFormElements formElements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFormElement(
      /**
      * The formElement to insert; if empty, nothing is inserted
      */
    oFormElement: typings.openui5.sapUiLayoutFormFormElementMod.default,
      /**
      * The `0`-based index the formElement should be inserted at; for a negative value of `iIndex`, the formElement
      * is inserted at position 0; for a value greater than the current size of the aggregation, the formElement
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Determines if the `FormContainer` is visible or not. Per default it just returns the value of the `visible`
      * property. But this might be overwritten by inherited elements.
      *
      * For rendering by `FormLayouts` this function has to be used instead of `getVisible`.
      *
      * @returns If true, the `FormContainer` is visible, otherwise not
      */
    def isVisible(): Boolean = js.native
    
    /**
      * @since 1.36.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFormElements formElements}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFormElements(): js.Array[typings.openui5.sapUiLayoutFormFormElementMod.default] = js.native
    
    /**
      * @since 1.36.0
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
    
    def removeFormElement(/**
      * The formElement to remove or its index or id
      */
    vFormElement: String): typings.openui5.sapUiLayoutFormFormElementMod.default | Null = js.native
    /**
      * Removes a formElement from the aggregation {@link #getFormElements formElements}.
      *
      * @returns The removed formElement or `null`
      */
    def removeFormElement(/**
      * The formElement to remove or its index or id
      */
    vFormElement: int): typings.openui5.sapUiLayoutFormFormElementMod.default | Null = js.native
    def removeFormElement(
      /**
      * The formElement to remove or its index or id
      */
    vFormElement: typings.openui5.sapUiLayoutFormFormElementMod.default
    ): typings.openui5.sapUiLayoutFormFormElementMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getExpandable expandable}.
      *
      * Defines if the `FormContainer` is expandable.
      *
      * **Note:** The expander icon will only be shown if a `title` is set for the `FormContainer`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandable(): this.type = js.native
    def setExpandable(/**
      * New value for property `expandable`
      */
    bExpandable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExpanded expanded}.
      *
      * Container is expanded.
      *
      * **Note:** This property only works if `expandable` is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpanded(): this.type = js.native
    def setExpanded(/**
      * New value for property `expanded`
      */
    bExpanded: Boolean): this.type = js.native
    
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
      * @since 1.36.0
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
      * Sets a new value for property {@link #getVisible visible}.
      *
      * If set to `false`, the `FormContainer` is not rendered.
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
  
  trait FormContainerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.36.0
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute `aria-labelledby`).
      *
      * **Note:** This attribute is only rendered if the `FormContainer` has it's own DOM representation in the
      * used `FormLayout`.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Defines if the `FormContainer` is expandable.
      *
      * **Note:** The expander icon will only be shown if a `title` is set for the `FormContainer`.
      */
    var expandable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Container is expanded.
      *
      * **Note:** This property only works if `expandable` is set to `true`.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The `FormElements` contain the content (labels and fields) of the `FormContainers`.
      */
    var formElements: js.UndefOr[
        js.Array[typings.openui5.sapUiLayoutFormFormElementMod.default] | typings.openui5.sapUiLayoutFormFormElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Title of the `FormContainer`. Can either be a `Title` element or a string. If a `Title` element is used,
      * the style of the title can be set.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored.
      *
      * **Note:** If the title is provided as a string, the title is rendered with a theme-dependent default
      * level. As the `Form` control cannot know the structure of the page, this might not fit the page structure.
      * In this case provide the title using a `Title` element and set its {@link sap.ui.core.Title#setLevel level }
      * to the needed value.
      */
    var title: js.UndefOr[String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.36.0
      *
      * Toolbar of the `FormContainer`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      * Use the right title level to meet the visual requirements. This might be theme-dependent.
      */
    var toolbar: js.UndefOr[Toolbar] = js.undefined
    
    /**
      * If set to `false`, the `FormContainer` is not rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FormContainerSettings {
    
    inline def apply(): FormContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setExpandable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFormElements(
        value: js.Array[typings.openui5.sapUiLayoutFormFormElementMod.default] | typings.openui5.sapUiLayoutFormFormElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "formElements", value.asInstanceOf[js.Any])
      
      inline def setFormElementsUndefined: Self = StObject.set(x, "formElements", js.undefined)
      
      inline def setFormElementsVarargs(value: typings.openui5.sapUiLayoutFormFormElementMod.default*): Self = StObject.set(x, "formElements", js.Array(value*))
      
      inline def setTitle(value: String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
