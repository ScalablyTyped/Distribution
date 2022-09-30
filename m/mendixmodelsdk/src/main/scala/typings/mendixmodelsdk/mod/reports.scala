package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reports {
  
  @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum")
  @js.native
  open class AggregateFunctionEnum protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.AggregateFunctionEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AggregateFunctionEnum {
    
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Average")
    @js.native
    def Average: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    inline def Average_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Average")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Count")
    @js.native
    def Count: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    inline def Count_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Count")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Maximum")
    @js.native
    def Maximum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    inline def Maximum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Minimum")
    @js.native
    def Minimum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    inline def Minimum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AggregateFunctionEnum.Sum")
    @js.native
    def Sum: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum = js.native
    inline def Sum_=(x: typings.mendixmodelsdk.reportsMod.reports.AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sum")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.AspectRatio")
  @js.native
  open class AspectRatio protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.AspectRatio {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AspectRatio {
    
    @JSImport("mendixmodelsdk", "reports.AspectRatio")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.FourToThree")
    @js.native
    def FourToThree: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def FourToThree_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourToThree")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.NineToSixteen")
    @js.native
    def NineToSixteen: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def NineToSixteen_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NineToSixteen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.OneToOne")
    @js.native
    def OneToOne: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def OneToOne_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneToOne")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.SixteenToNine")
    @js.native
    def SixteenToNine: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def SixteenToNine_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SixteenToNine")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.ThreeToFour")
    @js.native
    def ThreeToFour: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def ThreeToFour_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToFour")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.ThreeToTwo")
    @js.native
    def ThreeToTwo: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def ThreeToTwo_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToTwo")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.AspectRatio.TwoToThree")
    @js.native
    def TwoToThree: typings.mendixmodelsdk.reportsMod.reports.AspectRatio = js.native
    inline def TwoToThree_=(x: typings.mendixmodelsdk.reportsMod.reports.AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoToThree")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-grid relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.BasicReport")
  @js.native
  open class BasicReport protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.BasicReport {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReport {
    
    @JSImport("mendixmodelsdk", "reports.BasicReport")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReport]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReport.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
  @js.native
  open class BasicReportAggregate protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.BasicReportAggregate {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportAggregate {
    
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate]
    
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportAggregate.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.BasicReportColumn")
  @js.native
  open class BasicReportColumn protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.BasicReportColumn {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicReportColumn {
    
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn]
    
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * The new BasicReportColumn will be automatically stored in the 'columns' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.BasicReportColumn]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.BasicReportColumn.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ChartType")
  @js.native
  open class ChartType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ChartType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ChartType {
    
    @JSImport("mendixmodelsdk", "reports.ChartType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.Area")
    @js.native
    def Area: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    inline def Area_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Area")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.HorizontalBars")
    @js.native
    def HorizontalBars: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    inline def HorizontalBars_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HorizontalBars")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.Lines")
    @js.native
    def Lines: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    inline def Lines_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.VerticalBars")
    @js.native
    def VerticalBars: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ChartType.VerticalBars3D")
    @js.native
    def VerticalBars3D: typings.mendixmodelsdk.reportsMod.reports.ChartType = js.native
    inline def VerticalBars3D_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars3D")(x.asInstanceOf[js.Any])
    
    inline def VerticalBars_=(x: typings.mendixmodelsdk.reportsMod.reports.ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ColumnFormat")
  @js.native
  open class ColumnFormat protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ColumnFormat {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ColumnFormat {
    
    @JSImport("mendixmodelsdk", "reports.ColumnFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.Default")
    @js.native
    def Default: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    inline def Default_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.MonthName")
    @js.native
    def MonthName: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    inline def MonthName_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ColumnFormat.WeekdayName")
    @js.native
    def WeekdayName: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat = js.native
    inline def WeekdayName_=(x: typings.mendixmodelsdk.reportsMod.reports.ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekdayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum")
  @js.native
  open class DateRangeFieldEnum protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.DateRangeFieldEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateRangeFieldEnum {
    
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Month")
    @js.native
    def Month: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    inline def Month_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Period")
    @js.native
    def Period: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    inline def Period_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Quarter")
    @js.native
    def Quarter: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    inline def Quarter_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Week")
    @js.native
    def Week: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    inline def Week_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.DateRangeFieldEnum.Year")
    @js.native
    def Year: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum = js.native
    inline def Year_=(x: typings.mendixmodelsdk.reportsMod.reports.DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-button relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportButton")
  @js.native
  open class ReportButton protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportButton {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportButton {
    
    @JSImport("mendixmodelsdk", "reports.ReportButton")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportButton]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportButton.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-chart relevant document}
    *
    * In version 9.0.1: deleted
    */
  @JSImport("mendixmodelsdk", "reports.ReportChart")
  @js.native
  open class ReportChart protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportChart {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChart {
    
    @JSImport("mendixmodelsdk", "reports.ReportChart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 to 9.0.0
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 to 9.0.0
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 9.0.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 to 9.0.0
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 to 9.0.0
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChart]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChart.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.1: deleted
    */
  @JSImport("mendixmodelsdk", "reports.ReportChartSeries")
  @js.native
  open class ReportChartSeries protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportChartSeries {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportChartSeries {
    
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries]
    
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * The new ReportChartSeries will be automatically stored in the 'seriess' property
      * of the parent ReportChart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.0
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportChart): typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportChartSeries]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportChartSeries.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
  @js.native
  open class ReportDateRangeField protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportDateRangeField {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeField {
    
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField]
    
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * The new ReportDateRangeField will be automatically stored in the 'fields' property
      * of the parent ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeField]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeField.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-date-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector")
  @js.native
  open class ReportDateRangeSelector protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportDateRangeSelector {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDateRangeSelector {
    
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDateRangeSelector.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/report-parameter relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportDropDown")
  @js.native
  open class ReportDropDown protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportDropDown {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportDropDown {
    
    @JSImport("mendixmodelsdk", "reports.ReportDropDown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.reportsMod.reports.ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportDropDown]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportDropDown.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide6/report-pane relevant section in reference guide}
    *
    * In version 6.10.0: deleted
    */
  @JSImport("mendixmodelsdk", "reports.ReportPane")
  @js.native
  open class ReportPane protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportPane {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportPane {
    
    @JSImport("mendixmodelsdk", "reports.ReportPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 6.9.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.reportsMod.reports.ReportPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.reportsMod.reports.ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportPane]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportPane.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportParameter")
  @js.native
  abstract class ReportParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportParameter {
    
    @JSImport("mendixmodelsdk", "reports.ReportParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide/report-widgets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "reports.ReportWidget")
  @js.native
  abstract class ReportWidget protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportWidget {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportWidget {
    
    @JSImport("mendixmodelsdk", "reports.ReportWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportWidget.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
  @js.native
  open class ReportZoomInfo protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportZoomInfo {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomInfo {
    
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo]
    
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
      * of the parent BasicReport element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomInfo.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
  @js.native
  open class ReportZoomMapping protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.reports.ReportZoomMapping {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ReportZoomMapping {
    
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping]
    
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * The new ReportZoomMapping will be automatically stored in the 'mappings' property
      * of the parent ReportZoomInfo element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.reportsMod.reports.ReportZoomInfo): typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.reportsMod.reports.ReportZoomMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "reports.ReportZoomMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.reportsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.reportsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
