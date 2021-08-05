package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetail")
@js.native
class MasterDetail protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.MasterDetail {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MasterDetail {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetail")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  inline def createInBuildingBlockUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.BuildingBlock): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Layout): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInListViewUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInMasterDetailRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.MasterDetailRegion): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: typings.mendixmodelsdk.pagesMod.pages.SplitPane): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /**
    * Creates and returns a new MasterDetail instance in the SDK and on the server.
    * The new MasterDetail will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.VerticalFlow): typings.mendixmodelsdk.pagesMod.pages.MasterDetail = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.MasterDetail]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetail.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetail.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
