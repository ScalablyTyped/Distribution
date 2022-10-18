package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticLabel
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Title
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationDeleteBehavior
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ValidationRule
import typings.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.Microflow
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidgetWithPlaceholder
import typings.mendixmodelsdk.srcGenPagesMod.pages.Button
import typings.mendixmodelsdk.srcGenPagesMod.pages.CallNanoflowClientAction
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typings.mendixmodelsdk.srcGenPagesMod.pages.DropDown
import typings.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.GridColumn
import typings.mendixmodelsdk.srcGenPagesMod.pages.InputWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.Label
import typings.mendixmodelsdk.srcGenPagesMod.pages.LoginTextBox
import typings.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailDetailRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.Page
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageSettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSelector
import typings.mendixmodelsdk.srcGenPagesMod.pages.SearchField
import typings.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.TextArea
import typings.mendixmodelsdk.srcGenPagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Project
import typings.mendixmodelsdk.srcGenProjectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.srcGenReportsMod.reports.BasicReportAggregate
import typings.mendixmodelsdk.srcGenReportsMod.reports.BasicReportColumn
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportButton
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportChart
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportChartSeries
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportDateRangeField
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportDateRangeSelector
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenTextsMod {
  
  @JSImport("mendixmodelsdk/src/gen/texts", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object texts {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
      */
    @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemText")
    @js.native
    open class SystemText protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsSystemTextCollection: SystemTextCollection = js.native
      
      def key: String = js.native
      def key_=(newValue: String): Unit = js.native
      
      def text: Text = js.native
      def text_=(newValue: Text): Unit = js.native
    }
    object SystemText {
      
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemText")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new SystemText instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SystemText]
      
      /**
        * Creates and returns a new SystemText instance in the SDK and on the server.
        * The new SystemText will be automatically stored in the 'systemTexts' property
        * of the parent SystemTextCollection element passed as argument.
        */
      /* static member */
      inline def createIn(container: SystemTextCollection): SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SystemText]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemText.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemText.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IProjectDocument because Already inherited
    - typings.mendixmodelsdk.srcGenTextsMod.texts.ISystemTextCollection because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemTextCollection")
    @js.native
    open class SystemTextCollection protected () extends ProjectDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      
      @JSName("containerAsProject")
      def containerAsProject_MSystemTextCollection: Project = js.native
      
      def systemTexts: IList[SystemText] = js.native
    }
    object SystemTextCollection {
      
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemTextCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SystemTextCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IProject in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IProject): SystemTextCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SystemTextCollection]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemTextCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.SystemTextCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/translatable-texts relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/texts", "texts.Text")
    @js.native
    open class Text protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsAssociationDeleteBehavior: AssociationDeleteBehavior = js.native
      
      def containerAsAttributeWidget: AttributeWidget = js.native
      
      def containerAsAttributeWidgetWithPlaceholder: AttributeWidgetWithPlaceholder = js.native
      
      def containerAsBasicReportAggregate: BasicReportAggregate = js.native
      
      def containerAsBasicReportColumn: BasicReportColumn = js.native
      
      def containerAsBottomBarItem: BottomBarItem = js.native
      
      def containerAsButton: Button = js.native
      
      def containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
      
      def containerAsClientTemplate: ClientTemplate = js.native
      
      def containerAsConfirmationInfo: ConfirmationInfo = js.native
      
      def containerAsControlBarButton: ControlBarButton = js.native
      
      def containerAsDataGridColumn: DataGridColumn = js.native
      
      def containerAsDataView: DataView = js.native
      
      def containerAsDropDown: DropDown = js.native
      
      def containerAsDropDownButtonItem: DropDownButtonItem = js.native
      
      def containerAsEnumerationValue: EnumerationValue = js.native
      
      def containerAsGridColumn: GridColumn = js.native
      
      def containerAsInputWidget: InputWidget = js.native
      
      def containerAsLabel: Label = js.native
      
      def containerAsLoginTextBox: LoginTextBox = js.native
      
      def containerAsMasterDetailDetailRegion: MasterDetailDetailRegion = js.native
      
      def containerAsMenuItem: MenuItem = js.native
      
      def containerAsMicroflow: Microflow = js.native
      
      def containerAsMicroflowSettings: MicroflowSettings = js.native
      
      def containerAsNavigationProfile: NavigationProfile = js.native
      
      def containerAsPage: Page = js.native
      
      def containerAsPageSettings: PageSettings = js.native
      
      def containerAsReferenceSelector: ReferenceSelector = js.native
      
      def containerAsReportButton: ReportButton = js.native
      
      def containerAsReportChart: ReportChart = js.native
      
      def containerAsReportChartSeries: ReportChartSeries = js.native
      
      def containerAsReportDateRangeField: ReportDateRangeField = js.native
      
      def containerAsReportDateRangeSelector: ReportDateRangeSelector = js.native
      
      def containerAsSearchField: SearchField = js.native
      
      def containerAsStaticLabel: StaticLabel = js.native
      
      def containerAsSystemText: SystemText = js.native
      
      def containerAsTabPage: TabPage = js.native
      
      def containerAsTextArea: TextArea = js.native
      
      def containerAsTextTemplate: TextTemplate = js.native
      
      def containerAsTitle: Title = js.native
      
      def containerAsValidationRule: ValidationRule = js.native
      
      def containerAsWidgetValidation: WidgetValidation = js.native
      
      def containerAsWidgetValue: WidgetValue = js.native
      
      def translations: IList[Translation] = js.native
    }
    object Text {
      
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Text")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'childErrorMessage' property
        * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
        */
      /* static member */
      inline def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderChildErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'parentErrorMessage' property
        * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
        */
      /* static member */
      inline def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderParentErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'requiredMessage' property
        * of the parent pages.AttributeWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.5.0
        */
      /* static member */
      inline def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'placeholder' property
        * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
        */
      /* static member */
      inline def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetWithPlaceholderUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent reports.BasicReportAggregate element passed as argument.
        */
      /* static member */
      inline def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportAggregateUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent reports.BasicReportColumn element passed as argument.
        */
      /* static member */
      inline def createInBasicReportColumnUnderCaption(container: BasicReportColumn): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent nativepages.BottomBarItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInBottomBarItemUnderCaption(container: BottomBarItem): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'tooltip' property
        * of the parent pages.Button element passed as argument.
        */
      /* static member */
      inline def createInButtonUnderTooltip(container: Button): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'progressMessage' property
        * of the parent pages.CallNanoflowClientAction element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.8.0 and higher
        */
      /* static member */
      inline def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'fallback' property
        * of the parent pages.ClientTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.3.0 and higher
        */
      /* static member */
      inline def createInClientTemplateUnderFallback(container: ClientTemplate): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderFallback")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'template' property
        * of the parent pages.ClientTemplate element passed as argument.
        */
      /* static member */
      inline def createInClientTemplateUnderTemplate(container: ClientTemplate): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'cancelButtonCaption' property
        * of the parent pages.ConfirmationInfo element passed as argument.
        */
      /* static member */
      inline def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderCancelButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'proceedButtonCaption' property
        * of the parent pages.ConfirmationInfo element passed as argument.
        */
      /* static member */
      inline def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderProceedButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'question' property
        * of the parent pages.ConfirmationInfo element passed as argument.
        */
      /* static member */
      inline def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderQuestion")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'tooltip' property
        * of the parent pages.ControlBarButton element passed as argument.
        */
      /* static member */
      inline def createInControlBarButtonUnderTooltip(container: ControlBarButton): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent documenttemplates.DataGridColumn element passed as argument.
        */
      /* static member */
      inline def createInDataGridColumnUnderCaption(container: DataGridColumn): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'noEntityMessage' property
        * of the parent pages.DataView element passed as argument.
        */
      /* static member */
      inline def createInDataViewUnderNoEntityMessage(container: DataView): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderNoEntityMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent pages.DropDownButtonItem element passed as argument.
        */
      /* static member */
      inline def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownButtonItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'emptyOptionCaption' property
        * of the parent pages.DropDown element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.2.0 and higher
        */
      /* static member */
      inline def createInDropDownUnderEmptyOptionCaption(container: DropDown): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent enumerations.EnumerationValue element passed as argument.
        */
      /* static member */
      inline def createInEnumerationValueUnderCaption(container: EnumerationValue): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEnumerationValueUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'aggregateCaption' property
        * of the parent pages.GridColumn element passed as argument.
        */
      /* static member */
      inline def createInGridColumnUnderAggregateCaption(container: GridColumn): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAggregateCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent pages.GridColumn element passed as argument.
        */
      /* static member */
      inline def createInGridColumnUnderCaption(container: GridColumn): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'label' property
        * of the parent pages.InputWidget element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.17.0
        */
      /* static member */
      inline def createInInputWidgetUnderLabel(container: InputWidget): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent pages.Label element passed as argument.
        */
      /* static member */
      inline def createInLabelUnderCaption(container: Label): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'label' property
        * of the parent pages.LoginTextBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.0.2 and higher
        */
      /* static member */
      inline def createInLoginTextBoxUnderLabel(container: LoginTextBox): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'placeholder' property
        * of the parent pages.LoginTextBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.0.2 and higher
        */
      /* static member */
      inline def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'title' property
        * of the parent pages.MasterDetailDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailDetailRegionUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'alternativeText' property
        * of the parent menus.MenuItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.12.0 and higher
        */
      /* static member */
      inline def createInMenuItemUnderAlternativeText(container: MenuItem): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent menus.MenuItem element passed as argument.
        */
      /* static member */
      inline def createInMenuItemUnderCaption(container: MenuItem): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'progressMessage' property
        * of the parent pages.MicroflowSettings element passed as argument.
        */
      /* static member */
      inline def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
        * of the parent microflows.Microflow element passed as argument.
        */
      /* static member */
      inline def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderConcurrencyErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'appTitle' property
        * of the parent navigation.NavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.12.0 and higher
        */
      /* static member */
      inline def createInNavigationProfileUnderAppTitle(container: NavigationProfile): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderAppTitle")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'formTitle' property
        * of the parent pages.PageSettings element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 8.11.0
        */
      /* static member */
      inline def createInPageSettingsUnderFormTitle(container: PageSettings): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageSettingsUnderFormTitle")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'title' property
        * of the parent pages.Page element passed as argument.
        */
      /* static member */
      inline def createInPageUnderTitle(container: Page): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'emptyOptionCaption' property
        * of the parent pages.ReferenceSelector element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.2.0 and higher
        */
      /* static member */
      inline def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'requiredMessage' property
        * of the parent pages.ReferenceSelector element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.5.0
        */
      /* static member */
      inline def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent reports.ReportButton element passed as argument.
        */
      /* static member */
      inline def createInReportButtonUnderCaption(container: ReportButton): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent reports.ReportChartSeries element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.0
        */
      /* static member */
      inline def createInReportChartSeriesUnderCaption(container: ReportChartSeries): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartSeriesUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'xAxisCaption' property
        * of the parent reports.ReportChart element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.0
        */
      /* static member */
      inline def createInReportChartUnderXAxisCaption(container: ReportChart): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderXAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'yAxisCaption' property
        * of the parent reports.ReportChart element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.0
        */
      /* static member */
      inline def createInReportChartUnderYAxisCaption(container: ReportChart): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderYAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent reports.ReportDateRangeField element passed as argument.
        */
      /* static member */
      inline def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'fromCaption' property
        * of the parent reports.ReportDateRangeSelector element passed as argument.
        */
      /* static member */
      inline def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderFromCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'toCaption' property
        * of the parent reports.ReportDateRangeSelector element passed as argument.
        */
      /* static member */
      inline def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderToCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent pages.SearchField element passed as argument.
        */
      /* static member */
      inline def createInSearchFieldUnderCaption(container: SearchField): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'placeholder' property
        * of the parent pages.SearchField element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 and higher
        */
      /* static member */
      inline def createInSearchFieldUnderPlaceholder(container: SearchField): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent documenttemplates.StaticLabel element passed as argument.
        */
      /* static member */
      inline def createInStaticLabelUnderCaption(container: StaticLabel): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'text' property
        * of the parent SystemText element passed as argument.
        */
      /* static member */
      inline def createInSystemTextUnderText(container: SystemText): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSystemTextUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent pages.TabPage element passed as argument.
        */
      /* static member */
      inline def createInTabPageUnderCaption(container: TabPage): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'counterMessage' property
        * of the parent pages.TextArea element passed as argument.
        */
      /* static member */
      inline def createInTextAreaUnderCounterMessage(container: TextArea): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderCounterMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'textTooLongMessage' property
        * of the parent pages.TextArea element passed as argument.
        */
      /* static member */
      inline def createInTextAreaUnderTextTooLongMessage(container: TextArea): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderTextTooLongMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'text' property
        * of the parent microflows.TextTemplate element passed as argument.
        */
      /* static member */
      inline def createInTextTemplateUnderText(container: TextTemplate): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextTemplateUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'caption' property
        * of the parent documenttemplates.Title element passed as argument.
        */
      /* static member */
      inline def createInTitleUnderCaption(container: Title): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'errorMessage' property
        * of the parent domainmodels.ValidationRule element passed as argument.
        */
      /* static member */
      inline def createInValidationRuleUnderErrorMessage(container: ValidationRule): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValidationRuleUnderErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'message' property
        * of the parent pages.WidgetValidation element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInWidgetValidationUnderMessage(container: WidgetValidation): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderMessage")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /**
        * Creates and returns a new Text instance in the SDK and on the server.
        * The new Text will be automatically stored in the 'translatableValue' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        */
      /* static member */
      inline def createInWidgetValueUnderTranslatableValue(container: WidgetValue): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderTranslatableValue")(container.asInstanceOf[js.Any]).asInstanceOf[Text]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Text.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Text.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/texts", "texts.Translation")
    @js.native
    open class Translation protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsText: Text = js.native
      
      def languageCode: String = js.native
      def languageCode_=(newValue: String): Unit = js.native
      
      def text: String = js.native
      def text_=(newValue: String): Unit = js.native
    }
    object Translation {
      
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Translation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Translation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Translation]
      
      /**
        * Creates and returns a new Translation instance in the SDK and on the server.
        * The new Translation will be automatically stored in the 'translations' property
        * of the parent Text element passed as argument.
        */
      /* static member */
      inline def createIn(container: Text): Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Translation]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Translation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/texts", "texts.Translation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
      */
    @js.native
    trait ISystemTextCollection
      extends StObject
         with IProjectDocument
  }
}
