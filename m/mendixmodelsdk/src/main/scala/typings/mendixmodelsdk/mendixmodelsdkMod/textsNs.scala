package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Title
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.ValidationRule
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.EnumerationValue
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItem
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Microflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TextTemplate
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.BottomBarItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.AttributeWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.AttributeWidgetWithPlaceholder
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Button
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.CallNanoflowClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConfirmationInfo
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ControlBarButton
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DropDown
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DropDownButtonItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridColumn
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.InputWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Label
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LoginTextBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.MasterDetailDetailRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.MicroflowSettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Page
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.PageSettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ReferenceSelector
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SearchField
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TextArea
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WidgetValidation
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportAggregate
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportColumn
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChartSeries
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeField
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "texts")
@js.native
object textsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @js.native
  class SystemText protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.textsNs.SystemText {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  @js.native
  class SystemTextCollection protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.textsNs.SystemTextCollection {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.textsNs.Text {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class Translation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.textsNs.Translation {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object SystemText extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemText = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemTextCollection): typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemText = js.native
  }
  
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemTextCollection = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: Button): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: DataView): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: GridColumn): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: InputWidget): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: Label): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: MenuItem): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      */
    def createInPageSettingsUnderFormTitle(container: PageSettings): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: Page): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: ReportButton): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: ReportChart): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: ReportChart): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: SearchField): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: SearchField): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: StaticLabel): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemText): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: TabPage): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: TextArea): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: TextTemplate): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: Title): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typings.mendixmodelsdk.distGenTextsMod.textsNs.Text = js.native
  }
  
  /* static members */
  @js.native
  object Translation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenTextsMod.textsNs.Translation = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenTextsMod.textsNs.Text): typings.mendixmodelsdk.distGenTextsMod.textsNs.Translation = js.native
  }
  
}

