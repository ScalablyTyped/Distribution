package typings
package mendixmodelsdkLib.mendixmodelsdkMod

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
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.textsNs.SystemText {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  @js.native
  class SystemTextCollection protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.textsNs.SystemTextCollection {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.textsNs.Text {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class Translation protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.textsNs.Translation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* static members */
  @js.native
  object SystemText extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenTextsMod.textsNs.SystemText = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenTextsMod.textsNs.SystemTextCollection): mendixmodelsdkLib.distGenTextsMod.textsNs.SystemText = js.native
  }
  
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenTextsMod.textsNs.SystemTextCollection = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AssociationDeleteBehavior): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AttributeWidget): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AttributeWidgetWithPlaceholder): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportAggregate): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportColumn): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.BottomBarItem): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Button): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.CallNanoflowClientAction): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ClientTemplate): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConfirmationInfo): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConfirmationInfo): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConfirmationInfo): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ControlBarButton): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DropDownButtonItem): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DropDown): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.EnumerationValue): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridColumn): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridColumn): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.InputWidget): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Label): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LoginTextBox): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LoginTextBox): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailDetailRegion): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItem): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MicroflowSettings): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Microflow): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      */
    def createInPageSettingsUnderFormTitle(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.PageSettings): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Page): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSelector): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSelector): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChartSeries): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeField): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SearchField): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SearchField): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'value' property
      * of the parent pluginwidgets.StaticTextValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInStaticTextValueUnderValue(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.StaticTextValue): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: mendixmodelsdkLib.distGenTextsMod.textsNs.SystemText): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TextArea): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TextArea): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TextTemplate): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Title): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.ValidationRule): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue): mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
  }
  
  /* static members */
  @js.native
  object Translation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenTextsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenTextsMod.textsNs.Translation = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenTextsMod.textsNs.Text): mendixmodelsdkLib.distGenTextsMod.textsNs.Translation = js.native
  }
  
}

