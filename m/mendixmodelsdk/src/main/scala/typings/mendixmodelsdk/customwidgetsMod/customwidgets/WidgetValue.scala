package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.pagesMod.pages.ClientAction
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.pagesMod.pages.DataSource
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.pagesMod.pages.Icon
import typings.mendixmodelsdk.pagesMod.pages.PageVariable
import typings.mendixmodelsdk.pagesMod.pages.Widget
import typings.mendixmodelsdk.textsMod.texts.Text
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
  def attributeRef(): js.Any = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("attributeRef")
  def attributeRef_Union(): AttributeRef | Null = js.native
  def containerAsWidgetProperty(): WidgetProperty = js.native
  def dataSource(): js.Any = js.native
  def dataSource(newValue: DataSource): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  @JSName("dataSource")
  def dataSource_Union(): DataSource | Null = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  def entityRef(): js.Any = js.native
  def entityRef(newValue: EntityRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("entityRef")
  def entityRef_Union(): EntityRef | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.0.0: introduced
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  def icon(): js.Any = js.native
  def icon(newValue: Icon): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("icon")
  def icon_Union(): Icon | Null = js.native
  def image(): js.Any = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName(): String | Null = js.native
  @JSName("image")
  def image_Union(): IImage | Null = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Union(): IMicroflow | Null = js.native
  def nanoflow(): js.Any = js.native
  def nanoflow(newValue: INanoflow): js.Any = js.native
  def nanoflowQualifiedName(): String | Null = js.native
  /**
    * In version 7.13.0: introduced
    */
  @JSName("nanoflow")
  def nanoflow_Union(): INanoflow | Null = js.native
  def objects(): IList[WidgetObject] = js.native
  def page(): js.Any = js.native
  def page(newValue: IPage): js.Any = js.native
  def pageQualifiedName(): String | Null = js.native
  @JSName("page")
  def page_Union(): IPage | Null = js.native
  def primitiveValue(): String = js.native
  def primitiveValue(newValue: String): js.Any = js.native
  def sourceVariable(): js.Any = js.native
  def sourceVariable(newValue: PageVariable): js.Any = js.native
  /**
    * In version 8.8.0: introduced
    */
  @JSName("sourceVariable")
  def sourceVariable_Union(): PageVariable | Null = js.native
  def textTemplate(): js.Any = js.native
  def textTemplate(newValue: ClientTemplate): js.Any = js.native
  /**
    * In version 7.23.0: introduced
    */
  @JSName("textTemplate")
  def textTemplate_Union(): ClientTemplate | Null = js.native
  def translatableValue(): js.Any = js.native
  def translatableValue(newValue: Text): js.Any = js.native
  @JSName("translatableValue")
  def translatableValue_Union(): Text | Null = js.native
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

