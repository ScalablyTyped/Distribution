package typings.mendixmodelsdk.distGenTextsMod

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
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StaticTextValue
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Project
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ProjectDocument
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportAggregate
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportColumn
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChartSeries
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeField
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector
import typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemText
import typings.mendixmodelsdk.distGenTextsMod.textsNs.SystemTextCollection
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Translation
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/texts", "texts")
@js.native
object textsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  @js.native
  trait ISystemTextCollection extends IProjectDocument
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @js.native
  class SystemText protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsSystemTextCollection: SystemTextCollection = js.native
    var key: String = js.native
    @JSName("model")
    var model_SystemText: IModel = js.native
    var text: Text = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenTextsMod.textsNs.ISystemTextCollection because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class SystemTextCollection protected () extends ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    @JSName("containerAsProject")
    val containerAsProject_SystemTextCollection: Project = js.native
    val systemTexts: IList[SystemText] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAssociationDeleteBehavior: AssociationDeleteBehavior = js.native
    val containerAsAttributeWidget: AttributeWidget = js.native
    val containerAsAttributeWidgetWithPlaceholder: AttributeWidgetWithPlaceholder = js.native
    val containerAsBasicReportAggregate: BasicReportAggregate = js.native
    val containerAsBasicReportColumn: BasicReportColumn = js.native
    val containerAsBottomBarItem: BottomBarItem = js.native
    val containerAsButton: Button = js.native
    val containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
    val containerAsClientTemplate: ClientTemplate = js.native
    val containerAsConfirmationInfo: ConfirmationInfo = js.native
    val containerAsControlBarButton: ControlBarButton = js.native
    val containerAsDataGridColumn: DataGridColumn = js.native
    val containerAsDataView: DataView = js.native
    val containerAsDropDown: DropDown = js.native
    val containerAsDropDownButtonItem: DropDownButtonItem = js.native
    val containerAsEnumerationValue: EnumerationValue = js.native
    val containerAsGridColumn: GridColumn = js.native
    val containerAsInputWidget: InputWidget = js.native
    val containerAsLabel: Label = js.native
    val containerAsLoginTextBox: LoginTextBox = js.native
    val containerAsMasterDetailDetailRegion: MasterDetailDetailRegion = js.native
    val containerAsMenuItem: MenuItem = js.native
    val containerAsMicroflow: Microflow = js.native
    val containerAsMicroflowSettings: MicroflowSettings = js.native
    val containerAsPage: Page = js.native
    val containerAsPageSettings: PageSettings = js.native
    val containerAsReferenceSelector: ReferenceSelector = js.native
    val containerAsReportButton: ReportButton = js.native
    val containerAsReportChart: ReportChart = js.native
    val containerAsReportChartSeries: ReportChartSeries = js.native
    val containerAsReportDateRangeField: ReportDateRangeField = js.native
    val containerAsReportDateRangeSelector: ReportDateRangeSelector = js.native
    val containerAsSearchField: SearchField = js.native
    val containerAsStaticLabel: StaticLabel = js.native
    val containerAsStaticTextValue: StaticTextValue = js.native
    val containerAsSystemText: SystemText = js.native
    val containerAsTabPage: TabPage = js.native
    val containerAsTextArea: TextArea = js.native
    val containerAsTextTemplate: TextTemplate = js.native
    val containerAsTitle: Title = js.native
    val containerAsValidationRule: ValidationRule = js.native
    val containerAsWidgetValidation: WidgetValidation = js.native
    val containerAsWidgetValue: WidgetValue = js.native
    @JSName("model")
    var model_Text: IModel = js.native
    val translations: IList[Translation] = js.native
  }
  
  @js.native
  class Translation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsText: Text = js.native
    var languageCode: String = js.native
    @JSName("model")
    var model_Translation: IModel = js.native
    var text: String = js.native
  }
  
  /* static members */
  @js.native
  object SystemText extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SystemText = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: SystemTextCollection): SystemText = js.native
  }
  
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): SystemTextCollection = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: BottomBarItem): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: Button): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: ClientTemplate): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: DataGridColumn): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: DataView): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: EnumerationValue): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: GridColumn): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: GridColumn): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: InputWidget): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: Label): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: MenuItem): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      */
    def createInPageSettingsUnderFormTitle(container: PageSettings): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: Page): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: ReportButton): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: ReportChart): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: ReportChart): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: SearchField): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: SearchField): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: StaticLabel): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'value' property
      * of the parent pluginwidgets.StaticTextValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInStaticTextValueUnderValue(container: StaticTextValue): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: SystemText): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: TabPage): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: TextArea): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: TextTemplate): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: Title): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: WidgetValidation): Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): Text = js.native
  }
  
  /* static members */
  @js.native
  object Translation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Translation = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: Text): Translation = js.native
  }
  
}

