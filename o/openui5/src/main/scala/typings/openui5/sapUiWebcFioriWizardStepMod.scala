package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IWizardStep
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriWizardStepMod {
  
  @JSImport("sap/ui/webc/fiori/WizardStep", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `WizardStep`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends WizardStep {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: WizardStepSettings) = this()
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
    mSettings: WizardStepSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: WizardStepSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IWizardStep: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/WizardStep", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.WizardStep with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, WizardStep]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, WizardStep],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.WizardStep.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait WizardStep
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IWizardStep {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getBranching branching}.
      *
      * When `branching` is enabled a dashed line would be displayed after the step, meant to indicate that the
      * next step is not yet known and depends on user choice in the current step.
      *
      *
      *
      * **Note:** It is recommended to use `branching` on the last known step and later add new steps when it
      * becomes clear how the wizard flow should continue.
      *
      * Default value is `false`.
      *
      * @returns Value of property `branching`
      */
    def getBranching(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the step content.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the `icon` of the step.
      *
      *
      *
      * **Note:** The icon is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      *
      *
      * The SAP-icons font provides numerous options. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the step's `selected` state - the step that is currently active.
      *
      *
      *
      * **Note:** Step can't be `selected` and `disabled` at the same time. In this case the `selected` property
      * would take precedence.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSubtitleText subtitleText}.
      *
      * Defines the `subtitleText` of the step.
      *
      *
      *
      * **Note:** the text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitleText`
      */
    def getSubtitleText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleText titleText}.
      *
      * Defines the `titleText` of the step.
      *
      *
      *
      * **Note:** The text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleText`
      */
    def getTitleText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getBranching branching}.
      *
      * When `branching` is enabled a dashed line would be displayed after the step, meant to indicate that the
      * next step is not yet known and depends on user choice in the current step.
      *
      *
      *
      * **Note:** It is recommended to use `branching` on the last known step and later add new steps when it
      * becomes clear how the wizard flow should continue.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBranching(): this.type = js.native
    def setBranching(/**
      * New value for property `branching`
      */
    bBranching: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the `icon` of the step.
      *
      *
      *
      * **Note:** The icon is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      *
      *
      * The SAP-icons font provides numerous options. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the step's `selected` state - the step that is currently active.
      *
      *
      *
      * **Note:** Step can't be `selected` and `disabled` at the same time. In this case the `selected` property
      * would take precedence.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitleText subtitleText}.
      *
      * Defines the `subtitleText` of the step.
      *
      *
      *
      * **Note:** the text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleText(): this.type = js.native
    def setSubtitleText(/**
      * New value for property `subtitleText`
      */
    sSubtitleText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleText titleText}.
      *
      * Defines the `titleText` of the step.
      *
      *
      *
      * **Note:** The text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleText(): this.type = js.native
    def setTitleText(/**
      * New value for property `titleText`
      */
    sTitleText: String): this.type = js.native
  }
  
  trait WizardStepSettings
    extends StObject
       with ControlSettings {
    
    /**
      * When `branching` is enabled a dashed line would be displayed after the step, meant to indicate that the
      * next step is not yet known and depends on user choice in the current step.
      *
      *
      *
      * **Note:** It is recommended to use `branching` on the last known step and later add new steps when it
      * becomes clear how the wizard flow should continue.
      */
    var branching: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the step content.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `icon` of the step.
      *
      *
      *
      * **Note:** The icon is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      *
      *
      *
      * The SAP-icons font provides numerous options. See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the step's `selected` state - the step that is currently active.
      *
      *
      *
      * **Note:** Step can't be `selected` and `disabled` at the same time. In this case the `selected` property
      * would take precedence.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `subtitleText` of the step.
      *
      *
      *
      * **Note:** the text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      */
    var subtitleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the `titleText` of the step.
      *
      *
      *
      * **Note:** The text is displayed in the `sap.ui.webc.fiori.Wizard` navigation header.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object WizardStepSettings {
    
    inline def apply(): WizardStepSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardStepSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardStepSettings] (val x: Self) extends AnyVal {
      
      inline def setBranching(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "branching", value.asInstanceOf[js.Any])
      
      inline def setBranchingUndefined: Self = StObject.set(x, "branching", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSubtitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitleText", value.asInstanceOf[js.Any])
      
      inline def setSubtitleTextUndefined: Self = StObject.set(x, "subtitleText", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
