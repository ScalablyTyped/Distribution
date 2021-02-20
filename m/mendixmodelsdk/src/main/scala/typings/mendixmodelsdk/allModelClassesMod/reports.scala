package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.GroupBox
import typings.mendixmodelsdk.pagesMod.pages.Header
import typings.mendixmodelsdk.pagesMod.pages.Layout
import typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListView
import typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.pagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.pagesMod.pages.Snippet
import typings.mendixmodelsdk.pagesMod.pages.SplitPane
import typings.mendixmodelsdk.pagesMod.pages.TabPage
import typings.mendixmodelsdk.pagesMod.pages.TableCell
import typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reports {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum")
  @js.native
  class AggregateFunctionEnum protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AggregateFunctionEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum.Average")
    @js.native
    def Average: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Average_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Average")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum.Count")
    @js.native
    def Count: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Count_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Count")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum.Maximum")
    @js.native
    def Maximum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Maximum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum.Minimum")
    @js.native
    def Minimum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Minimum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AggregateFunctionEnum.Sum")
    @js.native
    def Sum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    @scala.inline
    def Sum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sum")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio")
  @js.native
  class AspectRatio protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.AspectRatio {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AspectRatio {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.FourToThree")
    @js.native
    def FourToThree: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def FourToThree_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourToThree")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.NineToSixteen")
    @js.native
    def NineToSixteen: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def NineToSixteen_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NineToSixteen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.OneToOne")
    @js.native
    def OneToOne: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def OneToOne_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneToOne")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.SixteenToNine")
    @js.native
    def SixteenToNine: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def SixteenToNine_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SixteenToNine")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.ThreeToFour")
    @js.native
    def ThreeToFour: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def ThreeToFour_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToFour")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.ThreeToTwo")
    @js.native
    def ThreeToTwo: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def ThreeToTwo_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToTwo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.AspectRatio.TwoToThree")
    @js.native
    def TwoToThree: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    @scala.inline
    def TwoToThree_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoToThree")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-grid relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport")
  @js.native
  class BasicReport protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.BasicReport {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReport {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.BasicReport = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReport.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate")
  @js.native
  class BasicReportAggregate protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportAggregate {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn")
  @js.native
  class BasicReportColumn protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportColumn {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * The new BasicReportColumn will be automatically stored in the 'columns' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportColumn.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType")
  @js.native
  class ChartType protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ChartType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ChartType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType.Area")
    @js.native
    def Area: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def Area_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Area")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType.HorizontalBars")
    @js.native
    def HorizontalBars: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def HorizontalBars_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HorizontalBars")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType.Lines")
    @js.native
    def Lines: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def Lines_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType.VerticalBars")
    @js.native
    def VerticalBars: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ChartType.VerticalBars3D")
    @js.native
    def VerticalBars3D: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    @scala.inline
    def VerticalBars3D_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars3D")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VerticalBars_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ColumnFormat")
  @js.native
  class ColumnFormat protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ColumnFormat {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ColumnFormat {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ColumnFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ColumnFormat.Default")
    @js.native
    def Default: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def Default_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ColumnFormat.MonthName")
    @js.native
    def MonthName: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def MonthName_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ColumnFormat.WeekdayName")
    @js.native
    def WeekdayName: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    @scala.inline
    def WeekdayName_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekdayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum")
  @js.native
  class DateRangeFieldEnum protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateRangeFieldEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum.Month")
    @js.native
    def Month: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Month_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum.Period")
    @js.native
    def Period: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Period_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum.Quarter")
    @js.native
    def Quarter: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Quarter_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum.Week")
    @js.native
    def Week: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Week_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.DateRangeFieldEnum.Year")
    @js.native
    def Year: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    @scala.inline
    def Year_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-button relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton")
  @js.native
  class ReportButton protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportButton {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportButton {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportButton = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportButton.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-chart relevant document}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart")
  @js.native
  class ReportChart protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportChart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChart {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportChart = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChart.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries")
  @js.native
  class ReportChartSeries protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChartSeries {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * The new ReportChartSeries will be automatically stored in the 'seriess' property
      * of the parent ReportChart element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportChart): typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
  @js.native
  class ReportDateRangeField protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeField {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * The new ReportDateRangeField will be automatically stored in the 'fields' property
      * of the parent ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-date-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector")
  @js.native
  class ReportDateRangeSelector protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeSelector {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeSelector.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown")
  @js.native
  class ReportDropDown protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportDropDown {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDropDown {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDropDown.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide6/report-pane relevant section in reference guide}
    *
    * In version 6.10.0: deleted
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane")
  @js.native
  class ReportPane protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportPane {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportPane {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportPane = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportPane.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportParameter")
  @js.native
  abstract class ReportParameter protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportParameter {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide/report-widgets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportWidget")
  @js.native
  abstract class ReportWidget protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportWidget {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportWidget.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo")
  @js.native
  class ReportZoomInfo protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomInfo {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = js.native
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomInfo.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping")
  @js.native
  class ReportZoomMapping protected ()
    extends typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomMapping {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * The new ReportZoomMapping will be automatically stored in the 'mappings' property
      * of the parent ReportZoomInfo element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo): typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportZoomMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
