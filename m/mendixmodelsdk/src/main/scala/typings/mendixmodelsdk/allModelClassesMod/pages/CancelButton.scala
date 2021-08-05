package typings.mendixmodelsdk.allModelClassesMod.pages

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
  * See: {@link https://docs.mendix.com/refguide6/cancel-button relevant section in reference guide}
  *
  * In version 7.0.2: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelButton")
@js.native
class CancelButton protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.CancelButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object CancelButton {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.1
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInListViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /**
    * Creates and returns a new CancelButton instance in the SDK and on the server.
    * The new CancelButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.VerticalFlow): typings.mendixmodelsdk.pagesMod.pages.CancelButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.CancelButton]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.CancelButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
