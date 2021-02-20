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
import scala.scalajs.js.`|`
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
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.create")
  @js.native
  def create(model: IModel): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): SaveButton = js.native
  
  /**
    * Creates and returns a new SaveButton instance in the SDK and on the server.
    * The new SaveButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SaveButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): SaveButton = js.native
  
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
