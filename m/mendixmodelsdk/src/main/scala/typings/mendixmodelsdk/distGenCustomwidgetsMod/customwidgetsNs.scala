package typings.mendixmodelsdk.distGenCustomwidgetsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenClientMod.clientNs.SupportedPlatform
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.CustomWidget
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.CustomWidgetAttributeType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.CustomWidgetType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.IsPath
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.PathType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.SystemPropertyEnum
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetEnumerationValue
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetObject
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetObjectType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetProperty
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetPropertyType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetReturnType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetReturnTypeEnum
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetTranslation
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValueType
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValueTypeEnum
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRef
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.INanoflow
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalEditabilitySettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalVisibilitySettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.EditableEnum
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Header
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Icon
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Layout
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.MasterDetailRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NativeLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.VerticalFlow
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WebLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Widget
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets")
@js.native
object customwidgetsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
    */
  @js.native
  class CustomWidget protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 8.1.0: introduced
      */
    var conditionalEditabilitySettings: ConditionalEditabilitySettings | Null = js.native
    /**
      * In version 8.1.0: introduced
      */
    var conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
    /**
      * In version 8.1.0: introduced
      */
    var editable: EditableEnum = js.native
    /**
      * In version 8.1.0: introduced
      */
    var labelTemplate: ClientTemplate | Null = js.native
    var `object`: WidgetObject | Null = js.native
    var `type`: CustomWidgetType | Null = js.native
  }
  
  @js.native
  class CustomWidgetAttributeType () extends AbstractEnum
  
  @js.native
  class CustomWidgetType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCustomWidget: CustomWidget = js.native
    var description: String = js.native
    /**
      * In version 7.1.0: deleted
      * In version 7.0.0: introduced
      */
    var experimentalApi: Boolean = js.native
    /**
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    var labeled: Boolean = js.native
    @JSName("model")
    var model_CustomWidgetType: IModel = js.native
    var name: String = js.native
    var needsEntityContext: Boolean = js.native
    var objectType: WidgetObjectType = js.native
    var offlineCapable: Boolean = js.native
    var phoneGapEnabled: Boolean = js.native
    /**
      * In version 7.19.0: introduced
      */
    var pluginWidget: Boolean = js.native
    /**
      * In version 8.0.0: introduced
      */
    var supportedPlatform: SupportedPlatform = js.native
    var widgetId: String = js.native
  }
  
  @js.native
  class IsPath () extends AbstractEnum
  
  @js.native
  class PathType () extends AbstractEnum
  
  @js.native
  class SystemPropertyEnum () extends AbstractEnum
  
  @js.native
  class WidgetEnumerationValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    val containerAsWidgetValueType: WidgetValueType = js.native
    var key: String = js.native
    @JSName("model")
    var model_WidgetEnumerationValue: IModel = js.native
  }
  
  @js.native
  class WidgetObject protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCustomWidget: CustomWidget = js.native
    val containerAsWidgetValue: WidgetValue = js.native
    /**
      * In version 8.1.0: deleted
      * In version 7.23.0: introduced
      */
    var labelTemplate: ClientTemplate | Null = js.native
    @JSName("model")
    var model_WidgetObject: IModel = js.native
    val properties: IList[WidgetProperty] = js.native
    /**
      * In version 7.13.0: added optional
      */
    var `type`: WidgetObjectType | Null = js.native
  }
  
  @js.native
  class WidgetObjectType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCustomWidgetType: CustomWidgetType = js.native
    val containerAsWidgetValueType: WidgetValueType = js.native
    @JSName("model")
    var model_WidgetObjectType: IModel = js.native
    val propertyTypes: IList[WidgetPropertyType] = js.native
  }
  
  @js.native
  class WidgetProperty protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWidgetObject: WidgetObject = js.native
    @JSName("model")
    var model_WidgetProperty: IModel = js.native
    /**
      * In version 7.13.0: added optional
      */
    var `type`: WidgetPropertyType | Null = js.native
    /**
      * In version 7.13.0: added optional
      */
    var value: WidgetValue | Null = js.native
  }
  
  @js.native
  class WidgetPropertyType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    var category: String = js.native
    val containerAsWidgetObjectType: WidgetObjectType = js.native
    var description: String = js.native
    var isDefault: Boolean = js.native
    var key: String = js.native
    @JSName("model")
    var model_WidgetPropertyType: IModel = js.native
    /**
      * In version 7.13.0: added optional
      */
    var valueType: WidgetValueType | Null = js.native
  }
  
  @js.native
  class WidgetReturnType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWidgetValueType: WidgetValueType = js.native
    var entityProperty: String = js.native
    var isList: Boolean = js.native
    @JSName("model")
    var model_WidgetReturnType: IModel = js.native
    var `type`: WidgetReturnTypeEnum = js.native
  }
  
  @js.native
  class WidgetReturnTypeEnum () extends AbstractEnum
  
  @js.native
  class WidgetTranslation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWidgetValueType: WidgetValueType = js.native
    var languageCode: String = js.native
    @JSName("model")
    var model_WidgetTranslation: IModel = js.native
    var text: String = js.native
  }
  
  @js.native
  class WidgetValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.19.0: introduced
      */
    var action: ClientAction = js.native
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: AttributeRef | Null = js.native
    val containerAsWidgetProperty: WidgetProperty = js.native
    /**
      * The value of this property is conceptually of type paths.LegacyEntityPath.
      *
      * In version 7.11.0: deleted
      */
    var entityPath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var entityRef: EntityRef | Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 8.0.0: introduced
      */
    var expression: String = js.native
    /**
      * In version 8.0.0: introduced
      */
    var icon: Icon | Null = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_WidgetValue: IModel = js.native
    /**
      * In version 7.13.0: introduced
      */
    var nanoflow: INanoflow | Null = js.native
    val nanoflowQualifiedName: String | Null = js.native
    val objects: IList[WidgetObject] = js.native
    var page: IPage | Null = js.native
    val pageQualifiedName: String | Null = js.native
    var primitiveValue: String = js.native
    /**
      * In version 7.23.0: introduced
      */
    var textTemplate: ClientTemplate | Null = js.native
    var translatableValue: Text | Null = js.native
    var `type`: WidgetValueType = js.native
    /**
      * In version 8.2.0: introduced
      */
    val widgets: IList[Widget] = js.native
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var xPathConstraint: String = js.native
  }
  
  @js.native
  class WidgetValueType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var allowNonPersistableEntities: Boolean = js.native
    val attributeTypes: IList[CustomWidgetAttributeType] = js.native
    val containerAsWidgetPropertyType: WidgetPropertyType = js.native
    var defaultValue: String = js.native
    var entityProperty: String = js.native
    val enumerationValues: IList[WidgetEnumerationValue] = js.native
    var isList: Boolean = js.native
    var isPath: IsPath = js.native
    @JSName("model")
    var model_WidgetValueType: IModel = js.native
    var multiline: Boolean = js.native
    var objectType: WidgetObjectType | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    var onChangeProperty: String = js.native
    var parameterIsList: Boolean = js.native
    var pathType: PathType = js.native
    var required: Boolean = js.native
    var returnType: WidgetReturnType | Null = js.native
    val translations: IList[WidgetTranslation] = js.native
    var `type`: WidgetValueTypeEnum = js.native
  }
  
  @js.native
  class WidgetValueTypeEnum () extends AbstractEnum
  
  /* static members */
  @js.native
  object CustomWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): CustomWidget = js.native
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): CustomWidget = js.native
  }
  
  /* static members */
  @js.native
  object CustomWidgetAttributeType extends js.Object {
    var AutoNumber: CustomWidgetAttributeType = js.native
    var Binary: CustomWidgetAttributeType = js.native
    var Boolean: CustomWidgetAttributeType = js.native
    var Currency: CustomWidgetAttributeType = js.native
    var DateTime: CustomWidgetAttributeType = js.native
    var Decimal: CustomWidgetAttributeType = js.native
    var Enum: CustomWidgetAttributeType = js.native
    var Float: CustomWidgetAttributeType = js.native
    var HashString: CustomWidgetAttributeType = js.native
    var Integer: CustomWidgetAttributeType = js.native
    var Long: CustomWidgetAttributeType = js.native
    var String: CustomWidgetAttributeType = js.native
  }
  
  /* static members */
  @js.native
  object CustomWidgetType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CustomWidgetType = js.native
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    def createIn(container: CustomWidget): CustomWidgetType = js.native
  }
  
  /* static members */
  @js.native
  object IsPath extends js.Object {
    var No: IsPath = js.native
    var Optional: IsPath = js.native
    var Yes: IsPath = js.native
  }
  
  /* static members */
  @js.native
  object PathType extends js.Object {
    var None: PathType = js.native
    var Reference: PathType = js.native
    var ReferenceSet: PathType = js.native
  }
  
  /* static members */
  @js.native
  object SystemPropertyEnum extends js.Object {
    var Editability: SystemPropertyEnum = js.native
    var Label: SystemPropertyEnum = js.native
    var Name: SystemPropertyEnum = js.native
    var TabIndex: SystemPropertyEnum = js.native
    var Visibility: SystemPropertyEnum = js.native
  }
  
  /* static members */
  @js.native
  object WidgetEnumerationValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetEnumerationValue = js.native
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    def createIn(container: WidgetValueType): WidgetEnumerationValue = js.native
  }
  
  /* static members */
  @js.native
  object WidgetObject extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetObject = js.native
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    def createInCustomWidgetUnderObject(container: CustomWidget): WidgetObject = js.native
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderObjects(container: WidgetValue): WidgetObject = js.native
  }
  
  /* static members */
  @js.native
  object WidgetObjectType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetObjectType = js.native
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    def createInCustomWidgetTypeUnderObjectType(container: CustomWidgetType): WidgetObjectType = js.native
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    def createInWidgetValueTypeUnderObjectType(container: WidgetValueType): WidgetObjectType = js.native
  }
  
  /* static members */
  @js.native
  object WidgetProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetProperty = js.native
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    def createIn(container: WidgetObject): WidgetProperty = js.native
  }
  
  /* static members */
  @js.native
  object WidgetPropertyType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetPropertyType = js.native
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    def createIn(container: WidgetObjectType): WidgetPropertyType = js.native
  }
  
  /* static members */
  @js.native
  object WidgetReturnType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetReturnType = js.native
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    def createIn(container: WidgetValueType): WidgetReturnType = js.native
  }
  
  /* static members */
  @js.native
  object WidgetReturnTypeEnum extends js.Object {
    var Boolean: WidgetReturnTypeEnum = js.native
    var DateTime: WidgetReturnTypeEnum = js.native
    var Decimal: WidgetReturnTypeEnum = js.native
    var Float: WidgetReturnTypeEnum = js.native
    var Integer: WidgetReturnTypeEnum = js.native
    var Object: WidgetReturnTypeEnum = js.native
    var String: WidgetReturnTypeEnum = js.native
    var Void: WidgetReturnTypeEnum = js.native
  }
  
  /* static members */
  @js.native
  object WidgetTranslation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetTranslation = js.native
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    def createIn(container: WidgetValueType): WidgetTranslation = js.native
  }
  
  /* static members */
  @js.native
  object WidgetValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetValue = js.native
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    def createIn(container: WidgetProperty): WidgetValue = js.native
  }
  
  /* static members */
  @js.native
  object WidgetValueType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WidgetValueType = js.native
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    def createIn(container: WidgetPropertyType): WidgetValueType = js.native
  }
  
  /* static members */
  @js.native
  object WidgetValueTypeEnum extends js.Object {
    var Action: WidgetValueTypeEnum = js.native
    var Attribute: WidgetValueTypeEnum = js.native
    var Boolean: WidgetValueTypeEnum = js.native
    var Entity: WidgetValueTypeEnum = js.native
    var EntityConstraint: WidgetValueTypeEnum = js.native
    var Enumeration: WidgetValueTypeEnum = js.native
    var Expression: WidgetValueTypeEnum = js.native
    var Form: WidgetValueTypeEnum = js.native
    var Icon: WidgetValueTypeEnum = js.native
    var Image: WidgetValueTypeEnum = js.native
    var Integer: WidgetValueTypeEnum = js.native
    var Microflow: WidgetValueTypeEnum = js.native
    var Nanoflow: WidgetValueTypeEnum = js.native
    var Object: WidgetValueTypeEnum = js.native
    var String: WidgetValueTypeEnum = js.native
    var System: WidgetValueTypeEnum = js.native
    var TextTemplate: WidgetValueTypeEnum = js.native
    var TranslatableString: WidgetValueTypeEnum = js.native
    var Widgets: WidgetValueTypeEnum = js.native
  }
  
}

