package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticLabel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Title
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AssociationDeleteBehavior
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerations.EnumerationValue
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.Microflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.TextTemplate
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidgetWithPlaceholder
import typings.mendixmodelsdk.distGenPagesMod.pages.Button
import typings.mendixmodelsdk.distGenPagesMod.pages.CallNanoflowClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.ConfirmationInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.ControlBarButton
import typings.mendixmodelsdk.distGenPagesMod.pages.DataView
import typings.mendixmodelsdk.distGenPagesMod.pages.DropDown
import typings.mendixmodelsdk.distGenPagesMod.pages.DropDownButtonItem
import typings.mendixmodelsdk.distGenPagesMod.pages.GridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.InputWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.Label
import typings.mendixmodelsdk.distGenPagesMod.pages.LoginTextBox
import typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailDetailRegion
import typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowSettings
import typings.mendixmodelsdk.distGenPagesMod.pages.Page
import typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings
import typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSelector
import typings.mendixmodelsdk.distGenPagesMod.pages.SearchField
import typings.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pages.TextArea
import typings.mendixmodelsdk.distGenPagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.Project
import typings.mendixmodelsdk.distGenProjectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.distGenReportsMod.reports.BasicReportAggregate
import typings.mendixmodelsdk.distGenReportsMod.reports.BasicReportColumn
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportButton
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportChart
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportChartSeries
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeField
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeSelector
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/texts", JSImport.Namespace)
@js.native
object distGenTextsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object texts extends js.Object {
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
      @JSName("model")
      var model_FSystemText: IModel = js.native
      def containerAsSystemTextCollection(): SystemTextCollection = js.native
      def key(): String = js.native
      def key(newValue: String): js.Any = js.native
      def text(): Text = js.native
      def text(newValue: Text): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument because Already inherited
    - typings.mendixmodelsdk.distGenTextsMod.texts.ISystemTextCollection because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class SystemTextCollection protected () extends ProjectDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      @JSName("model")
      var model_FSystemTextCollection: IModel = js.native
      @JSName("containerAsProject")
      def containerAsProject_MSystemTextCollection(): Project = js.native
      def systemTexts(): IList[SystemText] = js.native
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
      @JSName("model")
      var model_FText: IModel = js.native
      def containerAsAssociationDeleteBehavior(): AssociationDeleteBehavior = js.native
      def containerAsAttributeWidget(): AttributeWidget = js.native
      def containerAsAttributeWidgetWithPlaceholder(): AttributeWidgetWithPlaceholder = js.native
      def containerAsBasicReportAggregate(): BasicReportAggregate = js.native
      def containerAsBasicReportColumn(): BasicReportColumn = js.native
      def containerAsBottomBarItem(): BottomBarItem = js.native
      def containerAsButton(): Button = js.native
      def containerAsCallNanoflowClientAction(): CallNanoflowClientAction = js.native
      def containerAsClientTemplate(): ClientTemplate = js.native
      def containerAsConfirmationInfo(): ConfirmationInfo = js.native
      def containerAsControlBarButton(): ControlBarButton = js.native
      def containerAsDataGridColumn(): DataGridColumn = js.native
      def containerAsDataView(): DataView = js.native
      def containerAsDropDown(): DropDown = js.native
      def containerAsDropDownButtonItem(): DropDownButtonItem = js.native
      def containerAsEnumerationValue(): EnumerationValue = js.native
      def containerAsGridColumn(): GridColumn = js.native
      def containerAsInputWidget(): InputWidget = js.native
      def containerAsLabel(): Label = js.native
      def containerAsLoginTextBox(): LoginTextBox = js.native
      def containerAsMasterDetailDetailRegion(): MasterDetailDetailRegion = js.native
      def containerAsMenuItem(): MenuItem = js.native
      def containerAsMicroflow(): Microflow = js.native
      def containerAsMicroflowSettings(): MicroflowSettings = js.native
      def containerAsPage(): Page = js.native
      def containerAsPageSettings(): PageSettings = js.native
      def containerAsReferenceSelector(): ReferenceSelector = js.native
      def containerAsReportButton(): ReportButton = js.native
      def containerAsReportChart(): ReportChart = js.native
      def containerAsReportChartSeries(): ReportChartSeries = js.native
      def containerAsReportDateRangeField(): ReportDateRangeField = js.native
      def containerAsReportDateRangeSelector(): ReportDateRangeSelector = js.native
      def containerAsSearchField(): SearchField = js.native
      def containerAsStaticLabel(): StaticLabel = js.native
      def containerAsSystemText(): SystemText = js.native
      def containerAsTabPage(): TabPage = js.native
      def containerAsTextArea(): TextArea = js.native
      def containerAsTextTemplate(): TextTemplate = js.native
      def containerAsTitle(): Title = js.native
      def containerAsValidationRule(): ValidationRule = js.native
      def containerAsWidgetValidation(): WidgetValidation = js.native
      def containerAsWidgetValue(): WidgetValue = js.native
      def translations(): IList[Translation] = js.native
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
      @JSName("model")
      var model_FTranslation: IModel = js.native
      def containerAsText(): Text = js.native
      def languageCode(): String = js.native
      def languageCode(newValue: String): js.Any = js.native
      def text(): String = js.native
      def text(newValue: String): js.Any = js.native
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
        * The new Text will be automatically stored in the 'fallback' property
        * of the parent pages.ClientTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.3.0 and higher
        */
      def createInClientTemplateUnderFallback(container: ClientTemplate): Text = js.native
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
  
}

