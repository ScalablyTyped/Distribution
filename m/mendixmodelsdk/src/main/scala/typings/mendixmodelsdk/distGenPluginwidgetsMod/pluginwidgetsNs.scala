package typings.mendixmodelsdk.distGenPluginwidgetsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.Expression
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.Image
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionallyVisibleWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DateFormat
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Header
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
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SortDirection
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.VerticalFlow
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WebLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WidgetValidation
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ActionValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.AttributeValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.BooleanValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.BooleanWidgetVariableValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.CompositeValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.DateTimeFormat
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.DecimalNumberFormat
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.DerivedUniqueIdValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.DynamicTextValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.EnumValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ImageValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.IntegerNumberFormat
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.IntegerWidgetVariableValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ListValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.MicroflowObjectListValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.NativeClassValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.NestedWidgetValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.NumberFormat
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.NumericValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ObjectListSortItem
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.OfflineObjectListValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.PluginWidget
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.PluginWidgetProperty
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.PrimitiveValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.PropertyValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StaticTextValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StringArrayWidgetVariableValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StringValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StringWidgetVariableValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.StyleValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.TemplatedWidgetValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.TextValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ValidationEventValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.WebDynamicImageValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.WebIconValue
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.WidgetVariableValue
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pluginwidgets", "pluginwidgets")
@js.native
object pluginwidgetsNs extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.6.0: introduced
    */
  @js.native
  class ActionValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.16.0: introduced
      */
    var abortOnServerValidation: Boolean = js.native
    var value: ClientAction | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.4.0: introduced
    */
  @js.native
  class AttributeValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.11.0: introduced
      */
    var dateTimeFormat: DateTimeFormat | Null = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.7.0: introduced
      */
    var numberFormat: NumberFormat | Null = js.native
    /**
      * In version 7.6.0: introduced
      */
    var readOnly: Boolean = js.native
    /**
      * In version 7.7.0: introduced
      */
    val validations: IList[WidgetValidation] = js.native
    /**
      * In version 7.11.0: introduced
      */
    var value: AttributeRef | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  class BooleanValue protected () extends PrimitiveValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class BooleanWidgetVariableValue protected () extends WidgetVariableValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var initialValue: Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  class CompositeValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val properties: IList[PluginWidgetProperty] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.11.0: introduced
    */
  @js.native
  class DateTimeFormat protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAttributeValue: AttributeValue = js.native
    @JSName("model")
    var model_DateTimeFormat: IModel = js.native
    var pattern: String = js.native
    var `type`: DateFormat = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.7.0: introduced
    */
  @js.native
  class DecimalNumberFormat protected () extends NumberFormat {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var decimalPrecision: Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.17.0: introduced
    */
  @js.native
  class DerivedUniqueIdValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  class DynamicTextValue protected () extends TextValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: ClientTemplate = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.9.0: introduced
    */
  @js.native
  class EnumValue protected () extends PrimitiveValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.6.0: introduced
    */
  @js.native
  class ExpressionValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: Expression = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.11.0: introduced
    */
  @js.native
  class ImageValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Image = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.7.0: introduced
    */
  @js.native
  class IntegerNumberFormat protected () extends NumberFormat {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class IntegerWidgetVariableValue protected () extends WidgetVariableValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var initialValue: Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class ListValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val values: IList[PropertyValue] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.14.0: introduced
    */
  @js.native
  class MicroflowObjectListValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var microflow: IMicroflow = js.native
    val microflowQualifiedName: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.11.0: introduced
    */
  @js.native
  class NativeClassValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.9.0: introduced
    */
  @js.native
  class NestedWidgetValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.11.0: deleted
      */
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val widgets: IList[PluginWidget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.7.0: introduced
    */
  @js.native
  abstract class NumberFormat protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAttributeValue: AttributeValue = js.native
    var groupDigits: Boolean = js.native
    @JSName("model")
    var model_NumberFormat: IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  class NumericValue protected () extends PrimitiveValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class ObjectListSortItem protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attributeRef: AttributeRef = js.native
    val containerAsOfflineObjectListValue: OfflineObjectListValue = js.native
    @JSName("model")
    var model_ObjectListSortItem: IModel = js.native
    var sortDirection: SortDirection = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.9.0: introduced
    */
  @js.native
  class OfflineObjectListValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
    /**
      * In version 7.17.0: deleted
      */
    var pageSize: Double = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.16.0: introduced
      */
    val sortItems: IList[ObjectListSortItem] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.0.1: introduced
    */
  @js.native
  class PluginWidget protected () extends ConditionallyVisibleWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var pluginWidgetName: String = js.native
    var pluginWidgetVersion: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.1.0: introduced
      */
    val properties: IList[PluginWidgetProperty] = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.14.0: deleted
      * In version 7.8.0: introduced
      */
    val widgets: IList[PluginWidget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.1.0: introduced
    */
  @js.native
  class PluginWidgetProperty protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCompositeValue: CompositeValue = js.native
    val containerAsPluginWidget: PluginWidget = js.native
    var key: String = js.native
    @JSName("model")
    var model_PluginWidgetProperty: IModel = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.19.0: deleted
      */
    var value: PropertyValue | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  abstract class PrimitiveValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `PluginWidgets`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.1.0: introduced
    */
  @js.native
  abstract class PropertyValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsListValue: ListValue = js.native
    val containerAsPluginWidgetProperty: PluginWidgetProperty = js.native
    val containerAsWebDynamicImageValue: WebDynamicImageValue = js.native
    @JSName("model")
    var model_PropertyValue: IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class StaticTextValue protected () extends TextValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Text = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.18.0: introduced
    */
  @js.native
  class StringArrayWidgetVariableValue protected () extends WidgetVariableValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val initialValue: IList[String] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.1.0: introduced
    */
  @js.native
  class StringValue protected () extends PrimitiveValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class StringWidgetVariableValue protected () extends WidgetVariableValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var initialValue: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class StyleValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.11.0: introduced
    */
  @js.native
  class TemplatedWidgetValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val widgets: IList[PluginWidget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  abstract class TextValue protected () extends PrimitiveValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.6.0: introduced
    */
  @js.native
  class ValidationEventValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.17.0: deleted
      */
    var sourceWidget: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class WebDynamicImageValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var images: CompositeValue = js.native
    var value: AttributeRef | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  class WebIconValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Icon | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.19.0: deleted
    * In version 7.16.0: introduced
    */
  @js.native
  abstract class WidgetVariableValue protected () extends PropertyValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var variableName: String = js.native
  }
  
  /* static members */
  @js.native
  object ActionValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ActionValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ActionValue = js.native
    /**
      * Creates and returns a new ActionValue instance in the SDK and on the server.
      * The new ActionValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): ActionValue = js.native
    /**
      * Creates and returns a new ActionValue instance in the SDK and on the server.
      * The new ActionValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): ActionValue = js.native
    /**
      * Creates and returns a new ActionValue instance in the SDK and on the server.
      * The new ActionValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): ActionValue = js.native
  }
  
  /* static members */
  @js.native
  object AttributeValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AttributeValue = js.native
    /**
      * Creates and returns a new AttributeValue instance in the SDK and on the server.
      * The new AttributeValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.4.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): AttributeValue = js.native
    /**
      * Creates and returns a new AttributeValue instance in the SDK and on the server.
      * The new AttributeValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): AttributeValue = js.native
    /**
      * Creates and returns a new AttributeValue instance in the SDK and on the server.
      * The new AttributeValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.4.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): AttributeValue = js.native
  }
  
  /* static members */
  @js.native
  object BooleanValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BooleanValue = js.native
    /**
      * Creates and returns a new BooleanValue instance in the SDK and on the server.
      * The new BooleanValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): BooleanValue = js.native
    /**
      * Creates and returns a new BooleanValue instance in the SDK and on the server.
      * The new BooleanValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): BooleanValue = js.native
    /**
      * Creates and returns a new BooleanValue instance in the SDK and on the server.
      * The new BooleanValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): BooleanValue = js.native
  }
  
  /* static members */
  @js.native
  object BooleanWidgetVariableValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanWidgetVariableValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BooleanWidgetVariableValue = js.native
    /**
      * Creates and returns a new BooleanWidgetVariableValue instance in the SDK and on the server.
      * The new BooleanWidgetVariableValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): BooleanWidgetVariableValue = js.native
    /**
      * Creates and returns a new BooleanWidgetVariableValue instance in the SDK and on the server.
      * The new BooleanWidgetVariableValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): BooleanWidgetVariableValue = js.native
  }
  
  /* static members */
  @js.native
  object CompositeValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CompositeValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CompositeValue = js.native
    /**
      * Creates and returns a new CompositeValue instance in the SDK and on the server.
      * The new CompositeValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): CompositeValue = js.native
    /**
      * Creates and returns a new CompositeValue instance in the SDK and on the server.
      * The new CompositeValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): CompositeValue = js.native
    /**
      * Creates and returns a new CompositeValue instance in the SDK and on the server.
      * The new CompositeValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): CompositeValue = js.native
    /**
      * Creates and returns a new CompositeValue instance in the SDK and on the server.
      * The new CompositeValue will be automatically stored in the 'images' property
      * of the parent WebDynamicImageValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInWebDynamicImageValueUnderImages(container: WebDynamicImageValue): CompositeValue = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeFormat extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeFormat instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DateTimeFormat = js.native
    /**
      * Creates and returns a new DateTimeFormat instance in the SDK and on the server.
      * The new DateTimeFormat will be automatically stored in the 'dateTimeFormat' property
      * of the parent AttributeValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createIn(container: AttributeValue): DateTimeFormat = js.native
  }
  
  /* static members */
  @js.native
  object DecimalNumberFormat extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalNumberFormat instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DecimalNumberFormat = js.native
    /**
      * Creates and returns a new DecimalNumberFormat instance in the SDK and on the server.
      * The new DecimalNumberFormat will be automatically stored in the 'numberFormat' property
      * of the parent AttributeValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.18.0
      */
    def createIn(container: AttributeValue): DecimalNumberFormat = js.native
  }
  
  /* static members */
  @js.native
  object DerivedUniqueIdValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DerivedUniqueIdValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DerivedUniqueIdValue = js.native
    /**
      * Creates and returns a new DerivedUniqueIdValue instance in the SDK and on the server.
      * The new DerivedUniqueIdValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): DerivedUniqueIdValue = js.native
    /**
      * Creates and returns a new DerivedUniqueIdValue instance in the SDK and on the server.
      * The new DerivedUniqueIdValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): DerivedUniqueIdValue = js.native
  }
  
  /* static members */
  @js.native
  object DynamicTextValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DynamicTextValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DynamicTextValue = js.native
    /**
      * Creates and returns a new DynamicTextValue instance in the SDK and on the server.
      * The new DynamicTextValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): DynamicTextValue = js.native
    /**
      * Creates and returns a new DynamicTextValue instance in the SDK and on the server.
      * The new DynamicTextValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): DynamicTextValue = js.native
  }
  
  /* static members */
  @js.native
  object EnumValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumValue = js.native
    /**
      * Creates and returns a new EnumValue instance in the SDK and on the server.
      * The new EnumValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): EnumValue = js.native
    /**
      * Creates and returns a new EnumValue instance in the SDK and on the server.
      * The new EnumValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): EnumValue = js.native
    /**
      * Creates and returns a new EnumValue instance in the SDK and on the server.
      * The new EnumValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): EnumValue = js.native
  }
  
  /* static members */
  @js.native
  object ExpressionValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExpressionValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExpressionValue = js.native
    /**
      * Creates and returns a new ExpressionValue instance in the SDK and on the server.
      * The new ExpressionValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): ExpressionValue = js.native
    /**
      * Creates and returns a new ExpressionValue instance in the SDK and on the server.
      * The new ExpressionValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): ExpressionValue = js.native
    /**
      * Creates and returns a new ExpressionValue instance in the SDK and on the server.
      * The new ExpressionValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): ExpressionValue = js.native
  }
  
  /* static members */
  @js.native
  object ImageValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImageValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImageValue = js.native
    /**
      * Creates and returns a new ImageValue instance in the SDK and on the server.
      * The new ImageValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): ImageValue = js.native
    /**
      * Creates and returns a new ImageValue instance in the SDK and on the server.
      * The new ImageValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): ImageValue = js.native
    /**
      * Creates and returns a new ImageValue instance in the SDK and on the server.
      * The new ImageValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): ImageValue = js.native
  }
  
  /* static members */
  @js.native
  object IntegerNumberFormat extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerNumberFormat instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegerNumberFormat = js.native
    /**
      * Creates and returns a new IntegerNumberFormat instance in the SDK and on the server.
      * The new IntegerNumberFormat will be automatically stored in the 'numberFormat' property
      * of the parent AttributeValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.18.0
      */
    def createIn(container: AttributeValue): IntegerNumberFormat = js.native
  }
  
  /* static members */
  @js.native
  object IntegerWidgetVariableValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerWidgetVariableValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegerWidgetVariableValue = js.native
    /**
      * Creates and returns a new IntegerWidgetVariableValue instance in the SDK and on the server.
      * The new IntegerWidgetVariableValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): IntegerWidgetVariableValue = js.native
    /**
      * Creates and returns a new IntegerWidgetVariableValue instance in the SDK and on the server.
      * The new IntegerWidgetVariableValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): IntegerWidgetVariableValue = js.native
  }
  
  /* static members */
  @js.native
  object ListValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ListValue = js.native
    /**
      * Creates and returns a new ListValue instance in the SDK and on the server.
      * The new ListValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): ListValue = js.native
    /**
      * Creates and returns a new ListValue instance in the SDK and on the server.
      * The new ListValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): ListValue = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowObjectListValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowObjectListValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowObjectListValue = js.native
    /**
      * Creates and returns a new MicroflowObjectListValue instance in the SDK and on the server.
      * The new MicroflowObjectListValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.14.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): MicroflowObjectListValue = js.native
    /**
      * Creates and returns a new MicroflowObjectListValue instance in the SDK and on the server.
      * The new MicroflowObjectListValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): MicroflowObjectListValue = js.native
    /**
      * Creates and returns a new MicroflowObjectListValue instance in the SDK and on the server.
      * The new MicroflowObjectListValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.14.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): MicroflowObjectListValue = js.native
  }
  
  /* static members */
  @js.native
  object NativeClassValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeClassValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NativeClassValue = js.native
    /**
      * Creates and returns a new NativeClassValue instance in the SDK and on the server.
      * The new NativeClassValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): NativeClassValue = js.native
    /**
      * Creates and returns a new NativeClassValue instance in the SDK and on the server.
      * The new NativeClassValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): NativeClassValue = js.native
    /**
      * Creates and returns a new NativeClassValue instance in the SDK and on the server.
      * The new NativeClassValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): NativeClassValue = js.native
  }
  
  /* static members */
  @js.native
  object NestedWidgetValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NestedWidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NestedWidgetValue = js.native
    /**
      * Creates and returns a new NestedWidgetValue instance in the SDK and on the server.
      * The new NestedWidgetValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): NestedWidgetValue = js.native
    /**
      * Creates and returns a new NestedWidgetValue instance in the SDK and on the server.
      * The new NestedWidgetValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): NestedWidgetValue = js.native
    /**
      * Creates and returns a new NestedWidgetValue instance in the SDK and on the server.
      * The new NestedWidgetValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): NestedWidgetValue = js.native
  }
  
  /* static members */
  @js.native
  object NumberFormat extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NumericValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NumericValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NumericValue = js.native
    /**
      * Creates and returns a new NumericValue instance in the SDK and on the server.
      * The new NumericValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): NumericValue = js.native
    /**
      * Creates and returns a new NumericValue instance in the SDK and on the server.
      * The new NumericValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): NumericValue = js.native
    /**
      * Creates and returns a new NumericValue instance in the SDK and on the server.
      * The new NumericValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): NumericValue = js.native
  }
  
  /* static members */
  @js.native
  object ObjectListSortItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ObjectListSortItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ObjectListSortItem = js.native
  }
  
  /* static members */
  @js.native
  object OfflineObjectListValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new OfflineObjectListValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): OfflineObjectListValue = js.native
    /**
      * Creates and returns a new OfflineObjectListValue instance in the SDK and on the server.
      * The new OfflineObjectListValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): OfflineObjectListValue = js.native
    /**
      * Creates and returns a new OfflineObjectListValue instance in the SDK and on the server.
      * The new OfflineObjectListValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): OfflineObjectListValue = js.native
    /**
      * Creates and returns a new OfflineObjectListValue instance in the SDK and on the server.
      * The new OfflineObjectListValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): OfflineObjectListValue = js.native
  }
  
  /* static members */
  @js.native
  object PluginWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent NestedWidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInNestedWidgetValueUnderWidgets(container: NestedWidgetValue): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent PluginWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 to 7.13.0
      */
    def createInPluginWidgetUnderWidgets(container: PluginWidget): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent TemplatedWidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createInTemplatedWidgetValueUnderWidgets(container: TemplatedWidgetValue): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.1 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): PluginWidget = js.native
    /**
      * Creates and returns a new PluginWidget instance in the SDK and on the server.
      * The new PluginWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): PluginWidget = js.native
  }
  
  /* static members */
  @js.native
  object PluginWidgetProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PluginWidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PluginWidgetProperty = js.native
    /**
      * Creates and returns a new PluginWidgetProperty instance in the SDK and on the server.
      * The new PluginWidgetProperty will be automatically stored in the 'properties' property
      * of the parent PluginWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.19.0 and higher
      */
    def createIn(container: PluginWidget): PluginWidgetProperty = js.native
    /**
      * Creates and returns a new PluginWidgetProperty instance in the SDK and on the server.
      * The new PluginWidgetProperty will be automatically stored in the 'properties' property
      * of the parent CompositeValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.18.0
      */
    def createInCompositeValueUnderProperties(container: CompositeValue): PluginWidgetProperty = js.native
    /**
      * Creates and returns a new PluginWidgetProperty instance in the SDK and on the server.
      * The new PluginWidgetProperty will be automatically stored in the 'properties' property
      * of the parent PluginWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 and higher
      */
    def createInPluginWidgetUnderProperties(container: PluginWidget): PluginWidgetProperty = js.native
  }
  
  /* static members */
  @js.native
  object PrimitiveValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PropertyValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StaticTextValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StaticTextValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StaticTextValue = js.native
    /**
      * Creates and returns a new StaticTextValue instance in the SDK and on the server.
      * The new StaticTextValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): StaticTextValue = js.native
    /**
      * Creates and returns a new StaticTextValue instance in the SDK and on the server.
      * The new StaticTextValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): StaticTextValue = js.native
  }
  
  /* static members */
  @js.native
  object StringArrayWidgetVariableValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringArrayWidgetVariableValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringArrayWidgetVariableValue = js.native
    /**
      * Creates and returns a new StringArrayWidgetVariableValue instance in the SDK and on the server.
      * The new StringArrayWidgetVariableValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): StringArrayWidgetVariableValue = js.native
    /**
      * Creates and returns a new StringArrayWidgetVariableValue instance in the SDK and on the server.
      * The new StringArrayWidgetVariableValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): StringArrayWidgetVariableValue = js.native
  }
  
  /* static members */
  @js.native
  object StringValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringValue = js.native
    /**
      * Creates and returns a new StringValue instance in the SDK and on the server.
      * The new StringValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): StringValue = js.native
    /**
      * Creates and returns a new StringValue instance in the SDK and on the server.
      * The new StringValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): StringValue = js.native
    /**
      * Creates and returns a new StringValue instance in the SDK and on the server.
      * The new StringValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): StringValue = js.native
  }
  
  /* static members */
  @js.native
  object StringWidgetVariableValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringWidgetVariableValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringWidgetVariableValue = js.native
    /**
      * Creates and returns a new StringWidgetVariableValue instance in the SDK and on the server.
      * The new StringWidgetVariableValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): StringWidgetVariableValue = js.native
    /**
      * Creates and returns a new StringWidgetVariableValue instance in the SDK and on the server.
      * The new StringWidgetVariableValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): StringWidgetVariableValue = js.native
  }
  
  /* static members */
  @js.native
  object StyleValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StyleValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StyleValue = js.native
    /**
      * Creates and returns a new StyleValue instance in the SDK and on the server.
      * The new StyleValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): StyleValue = js.native
    /**
      * Creates and returns a new StyleValue instance in the SDK and on the server.
      * The new StyleValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): StyleValue = js.native
  }
  
  /* static members */
  @js.native
  object TemplatedWidgetValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplatedWidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TemplatedWidgetValue = js.native
    /**
      * Creates and returns a new TemplatedWidgetValue instance in the SDK and on the server.
      * The new TemplatedWidgetValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): TemplatedWidgetValue = js.native
    /**
      * Creates and returns a new TemplatedWidgetValue instance in the SDK and on the server.
      * The new TemplatedWidgetValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): TemplatedWidgetValue = js.native
    /**
      * Creates and returns a new TemplatedWidgetValue instance in the SDK and on the server.
      * The new TemplatedWidgetValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.11.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): TemplatedWidgetValue = js.native
  }
  
  /* static members */
  @js.native
  object TextValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValidationEventValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ValidationEventValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ValidationEventValue = js.native
    /**
      * Creates and returns a new ValidationEventValue instance in the SDK and on the server.
      * The new ValidationEventValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.15.0
      */
    def createIn(container: PluginWidgetProperty): ValidationEventValue = js.native
    /**
      * Creates and returns a new ValidationEventValue instance in the SDK and on the server.
      * The new ValidationEventValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): ValidationEventValue = js.native
    /**
      * Creates and returns a new ValidationEventValue instance in the SDK and on the server.
      * The new ValidationEventValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): ValidationEventValue = js.native
  }
  
  /* static members */
  @js.native
  object WebDynamicImageValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebDynamicImageValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WebDynamicImageValue = js.native
    /**
      * Creates and returns a new WebDynamicImageValue instance in the SDK and on the server.
      * The new WebDynamicImageValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): WebDynamicImageValue = js.native
    /**
      * Creates and returns a new WebDynamicImageValue instance in the SDK and on the server.
      * The new WebDynamicImageValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): WebDynamicImageValue = js.native
  }
  
  /* static members */
  @js.native
  object WebIconValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebIconValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WebIconValue = js.native
    /**
      * Creates and returns a new WebIconValue instance in the SDK and on the server.
      * The new WebIconValue will be automatically stored in the 'values' property
      * of the parent ListValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInListValueUnderValues(container: ListValue): WebIconValue = js.native
    /**
      * Creates and returns a new WebIconValue instance in the SDK and on the server.
      * The new WebIconValue will be automatically stored in the 'value' property
      * of the parent PluginWidgetProperty element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 to 7.18.0
      */
    def createInPluginWidgetPropertyUnderValue(container: PluginWidgetProperty): WebIconValue = js.native
  }
  
  /* static members */
  @js.native
  object WidgetVariableValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

