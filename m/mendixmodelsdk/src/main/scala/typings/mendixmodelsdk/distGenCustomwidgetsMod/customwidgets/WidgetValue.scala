package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.DataSource
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distGenPagesMod.pages.Icon
import typings.mendixmodelsdk.distGenPagesMod.pages.Widget
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
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
  @JSName("model")
  var model_FWidgetValue: IModel = js.native
  /**
    * In version 7.19.0: introduced
    */
  def action(): ClientAction = js.native
  def action(newValue: ClientAction): js.Any = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath(): String = js.native
  def attributePath(newValue: String): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef(): AttributeRef | Null = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  @JSName("attributeRef")
  def attributeRef_Any(): js.Any = js.native
  def containerAsWidgetProperty(): WidgetProperty = js.native
  /**
    * In version 8.3.0: introduced
    */
  def dataSource(): DataSource | Null = js.native
  def dataSource(newValue: DataSource): js.Any = js.native
  @JSName("dataSource")
  def dataSource_Any(): js.Any = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  def entityRef(): EntityRef | Null = js.native
  def entityRef(newValue: EntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Any(): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.0.0: introduced
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def icon(): Icon | Null = js.native
  def icon(newValue: Icon): js.Any = js.native
  @JSName("icon")
  def icon_Any(): js.Any = js.native
  def image(): IImage | Null = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName(): String | Null = js.native
  @JSName("image")
  def image_Any(): js.Any = js.native
  def microflow(): IMicroflow | Null = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Any(): js.Any = js.native
  /**
    * In version 7.13.0: introduced
    */
  def nanoflow(): INanoflow | Null = js.native
  def nanoflow(newValue: INanoflow): js.Any = js.native
  def nanoflowQualifiedName(): String | Null = js.native
  @JSName("nanoflow")
  def nanoflow_Any(): js.Any = js.native
  def objects(): IList[WidgetObject] = js.native
  def page(): IPage | Null = js.native
  def page(newValue: IPage): js.Any = js.native
  def pageQualifiedName(): String | Null = js.native
  @JSName("page")
  def page_Any(): js.Any = js.native
  def primitiveValue(): String = js.native
  def primitiveValue(newValue: String): js.Any = js.native
  /**
    * In version 7.23.0: introduced
    */
  def textTemplate(): ClientTemplate | Null = js.native
  def textTemplate(newValue: ClientTemplate): js.Any = js.native
  @JSName("textTemplate")
  def textTemplate_Any(): js.Any = js.native
  def translatableValue(): Text | Null = js.native
  def translatableValue(newValue: Text): js.Any = js.native
  @JSName("translatableValue")
  def translatableValue_Any(): js.Any = js.native
  def `type`(): WidgetValueType = js.native
  def `type`(newValue: WidgetValueType): js.Any = js.native
  /**
    * In version 8.2.0: introduced
    */
  def widgets(): IList[Widget] = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint(): String = js.native
  def xPathConstraint(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
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

