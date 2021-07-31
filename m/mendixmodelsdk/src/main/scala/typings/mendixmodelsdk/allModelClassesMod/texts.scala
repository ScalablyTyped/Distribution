package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.ValidationRule
import typings.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texts {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemText")
  @js.native
  class SystemText protected ()
    extends typings.mendixmodelsdk.textsMod.texts.SystemText {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object SystemText {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.SystemText]
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.textsMod.texts.SystemTextCollection): typings.mendixmodelsdk.textsMod.texts.SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.SystemText]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemText.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemText.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemTextCollection")
  @js.native
  class SystemTextCollection protected ()
    extends typings.mendixmodelsdk.textsMod.texts.SystemTextCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object SystemTextCollection {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemTextCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    @scala.inline
    def createIn(container: IProject): typings.mendixmodelsdk.textsMod.texts.SystemTextCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.SystemTextCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemTextCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.SystemTextCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/translatable-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Text")
  @js.native
  class Text protected ()
    extends typings.mendixmodelsdk.textsMod.texts.Text {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Text {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderChildErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderParentErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    @scala.inline
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetWithPlaceholderUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportAggregateUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @scala.inline
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInButtonUnderTooltip(container: Button): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    /* static member */
    @scala.inline
    def createInClientTemplateUnderFallback(container: ClientTemplate): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderFallback")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderCancelButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderProceedButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderQuestion")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInDataViewUnderNoEntityMessage(container: DataView): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderNoEntityMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownButtonItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEnumerationValueUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAggregateCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInGridColumnUnderCaption(container: GridColumn): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    /* static member */
    @scala.inline
    def createInInputWidgetUnderLabel(container: InputWidget): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInLabelUnderCaption(container: Label): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    @scala.inline
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    @scala.inline
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @scala.inline
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailDetailRegionUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'alternativeText' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMenuItemUnderAlternativeText(container: MenuItem): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInMenuItemUnderCaption(container: MenuItem): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderConcurrencyErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'appTitle' property
      * of the parent navigation.NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    @scala.inline
    def createInNavigationProfileUnderAppTitle(container: NavigationProfile): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderAppTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    /* static member */
    @scala.inline
    def createInPageSettingsUnderFormTitle(container: PageSettings): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageSettingsUnderFormTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInPageUnderTitle(container: Page): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    @scala.inline
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    @scala.inline
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportButtonUnderCaption(container: ReportButton): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartSeriesUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportChartUnderXAxisCaption(container: ReportChart): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderXAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportChartUnderYAxisCaption(container: ReportChart): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderYAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderFromCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderToCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInSearchFieldUnderCaption(container: SearchField): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    /* static member */
    @scala.inline
    def createInSearchFieldUnderPlaceholder(container: SearchField): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInStaticLabelUnderCaption(container: StaticLabel): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInSystemTextUnderText(container: typings.mendixmodelsdk.textsMod.texts.SystemText): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSystemTextUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInTabPageUnderCaption(container: TabPage): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInTextAreaUnderCounterMessage(container: TextArea): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderCounterMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderTextTooLongMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInTextTemplateUnderText(container: TextTemplate): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextTemplateUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInTitleUnderCaption(container: Title): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValidationRuleUnderErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    @scala.inline
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typings.mendixmodelsdk.textsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderTranslatableValue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Text]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Text.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Text.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Translation")
  @js.native
  class Translation protected ()
    extends typings.mendixmodelsdk.textsMod.texts.Translation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Translation {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Translation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.textsMod.texts.Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Translation]
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.textsMod.texts.Text): typings.mendixmodelsdk.textsMod.texts.Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.textsMod.texts.Translation]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Translation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts.Translation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.textsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
