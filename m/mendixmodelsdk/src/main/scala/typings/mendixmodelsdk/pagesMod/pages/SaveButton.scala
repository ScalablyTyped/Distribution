package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide6/save-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton")
@js.native
class SaveButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.7.0: introduced
    */
  def closePage: Boolean = js.native
  def closePage_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 6.6.0: introduced
    */
  def syncAutomatically: Boolean = js.native
  def syncAutomatically_=(newValue: Boolean): Unit = js.native
}
object SaveButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidget(container: DataView): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidget(container: DataView): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidget(container: DivContainer): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidget(container: GroupBox): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidget(container: Header): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidget(container: Header): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInLayoutUnderWidget(container: Layout): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidget(container: ListView): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @scala.inline
  def createInReportPaneUnderParameterWidget(container: ReportPane): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @scala.inline
  def createInReportPaneUnderReportWidget(container: ReportPane): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidget(container: Snippet): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidget(container: TabPage): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidget(container: TableCell): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @scala.inline
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SaveButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[SaveButton]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
