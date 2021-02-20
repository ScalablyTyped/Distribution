package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.ValidationRule
import typings.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.microflowsMod.microflows.Microflow
import typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.pagesMod.pages.AttributeWidgetWithPlaceholder
import typings.mendixmodelsdk.pagesMod.pages.Button
import typings.mendixmodelsdk.pagesMod.pages.CallNanoflowClientAction
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.pagesMod.pages.ConfirmationInfo
import typings.mendixmodelsdk.pagesMod.pages.ControlBarButton
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DropDown
import typings.mendixmodelsdk.pagesMod.pages.DropDownButtonItem
import typings.mendixmodelsdk.pagesMod.pages.GridColumn
import typings.mendixmodelsdk.pagesMod.pages.InputWidget
import typings.mendixmodelsdk.pagesMod.pages.Label
import typings.mendixmodelsdk.pagesMod.pages.LoginTextBox
import typings.mendixmodelsdk.pagesMod.pages.MasterDetailDetailRegion
import typings.mendixmodelsdk.pagesMod.pages.MicroflowSettings
import typings.mendixmodelsdk.pagesMod.pages.Page
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import typings.mendixmodelsdk.pagesMod.pages.ReferenceSelector
import typings.mendixmodelsdk.pagesMod.pages.SearchField
import typings.mendixmodelsdk.pagesMod.pages.TabPage
import typings.mendixmodelsdk.pagesMod.pages.TextArea
import typings.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate
import typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn
import typings.mendixmodelsdk.reportsMod.reports.ReportButton
import typings.mendixmodelsdk.reportsMod.reports.ReportChart
import typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries
import typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField
import typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texts {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @JSImport("mendixmodelsdk", "texts.SystemText")
  @js.native
  class SystemText protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.texts.SystemText {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object SystemText {
    
    @JSImport("mendixmodelsdk", "texts.SystemText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.SystemText = js.native
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.textsMod.texts.SystemTextCollection): typings.mendixmodelsdk.textsMod.texts.SystemText = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "texts.SystemTextCollection")
  @js.native
  class SystemTextCollection protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.texts.SystemTextCollection {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object SystemTextCollection {
    
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection.createIn")
    @js.native
    def createIn(container: IProject): typings.mendixmodelsdk.textsMod.texts.SystemTextCollection = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/translatable-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "texts.Text")
  @js.native
  class Text protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.texts.Text {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Text {
    
    @JSImport("mendixmodelsdk", "texts.Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInAssociationDeleteBehaviorUnderChildErrorMessage")
    @js.native
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInAssociationDeleteBehaviorUnderParentErrorMessage")
    @js.native
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInAttributeWidgetUnderRequiredMessage")
    @js.native
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInAttributeWidgetWithPlaceholderUnderPlaceholder")
    @js.native
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInBasicReportAggregateUnderCaption")
    @js.native
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInBasicReportColumnUnderCaption")
    @js.native
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInBottomBarItemUnderCaption")
    @js.native
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInButtonUnderTooltip")
    @js.native
    def createInButtonUnderTooltip(container: Button): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInCallNanoflowClientActionUnderProgressMessage")
    @js.native
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInClientTemplateUnderFallback")
    @js.native
    def createInClientTemplateUnderFallback(container: ClientTemplate): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInClientTemplateUnderTemplate")
    @js.native
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInConfirmationInfoUnderCancelButtonCaption")
    @js.native
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInConfirmationInfoUnderProceedButtonCaption")
    @js.native
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInConfirmationInfoUnderQuestion")
    @js.native
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInControlBarButtonUnderTooltip")
    @js.native
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInDataGridColumnUnderCaption")
    @js.native
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInDataViewUnderNoEntityMessage")
    @js.native
    def createInDataViewUnderNoEntityMessage(container: DataView): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInDropDownButtonItemUnderCaption")
    @js.native
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInDropDownUnderEmptyOptionCaption")
    @js.native
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInEnumerationValueUnderCaption")
    @js.native
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInGridColumnUnderAggregateCaption")
    @js.native
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInGridColumnUnderCaption")
    @js.native
    def createInGridColumnUnderCaption(container: GridColumn): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInInputWidgetUnderLabel")
    @js.native
    def createInInputWidgetUnderLabel(container: InputWidget): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInLabelUnderCaption")
    @js.native
    def createInLabelUnderCaption(container: Label): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInLoginTextBoxUnderLabel")
    @js.native
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInLoginTextBoxUnderPlaceholder")
    @js.native
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInMasterDetailDetailRegionUnderTitle")
    @js.native
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'alternativeText' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInMenuItemUnderAlternativeText")
    @js.native
    def createInMenuItemUnderAlternativeText(container: MenuItem): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInMenuItemUnderCaption")
    @js.native
    def createInMenuItemUnderCaption(container: MenuItem): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInMicroflowSettingsUnderProgressMessage")
    @js.native
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInMicroflowUnderConcurrencyErrorMessage")
    @js.native
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'appTitle' property
      * of the parent navigation.NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInNavigationProfileUnderAppTitle")
    @js.native
    def createInNavigationProfileUnderAppTitle(container: NavigationProfile): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInPageSettingsUnderFormTitle")
    @js.native
    def createInPageSettingsUnderFormTitle(container: PageSettings): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInPageUnderTitle")
    @js.native
    def createInPageUnderTitle(container: Page): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReferenceSelectorUnderEmptyOptionCaption")
    @js.native
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReferenceSelectorUnderRequiredMessage")
    @js.native
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportButtonUnderCaption")
    @js.native
    def createInReportButtonUnderCaption(container: ReportButton): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportChartSeriesUnderCaption")
    @js.native
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportChartUnderXAxisCaption")
    @js.native
    def createInReportChartUnderXAxisCaption(container: ReportChart): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportChartUnderYAxisCaption")
    @js.native
    def createInReportChartUnderYAxisCaption(container: ReportChart): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportDateRangeFieldUnderCaption")
    @js.native
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportDateRangeSelectorUnderFromCaption")
    @js.native
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInReportDateRangeSelectorUnderToCaption")
    @js.native
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInSearchFieldUnderCaption")
    @js.native
    def createInSearchFieldUnderCaption(container: SearchField): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInSearchFieldUnderPlaceholder")
    @js.native
    def createInSearchFieldUnderPlaceholder(container: SearchField): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInStaticLabelUnderCaption")
    @js.native
    def createInStaticLabelUnderCaption(container: StaticLabel): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInSystemTextUnderText")
    @js.native
    def createInSystemTextUnderText(container: typings.mendixmodelsdk.textsMod.texts.SystemText): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInTabPageUnderCaption")
    @js.native
    def createInTabPageUnderCaption(container: TabPage): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInTextAreaUnderCounterMessage")
    @js.native
    def createInTextAreaUnderCounterMessage(container: TextArea): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInTextAreaUnderTextTooLongMessage")
    @js.native
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInTextTemplateUnderText")
    @js.native
    def createInTextTemplateUnderText(container: TextTemplate): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInTitleUnderCaption")
    @js.native
    def createInTitleUnderCaption(container: Title): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInValidationRuleUnderErrorMessage")
    @js.native
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInWidgetValidationUnderMessage")
    @js.native
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.createInWidgetValueUnderTranslatableValue")
    @js.native
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typings.mendixmodelsdk.textsMod.texts.Text = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "texts.Translation")
  @js.native
  class Translation protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.texts.Translation {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Translation {
    
    @JSImport("mendixmodelsdk", "texts.Translation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.Translation = js.native
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.textsMod.texts.Text): typings.mendixmodelsdk.textsMod.texts.Translation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
