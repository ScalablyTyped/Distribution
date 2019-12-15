package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/columns relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridColumn")
@js.native
class GridColumn protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGridColumn: IModel = js.native
  def aggregateCaption(): Text = js.native
  def aggregateCaption(newValue: Text): js.Any = js.native
  def aggregateFunction(): AggregateFunction = js.native
  def aggregateFunction(newValue: AggregateFunction): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance(): Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
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
  def caption(): Text = js.native
  def caption(newValue: Text): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  def containerAsColumnGrid(): ColumnGrid = js.native
  def editable(): Boolean = js.native
  def editable(newValue: Boolean): js.Any = js.native
  def formattingInfo(): FormattingInfo = js.native
  def formattingInfo(newValue: FormattingInfo): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def showTooltip(): Boolean = js.native
  def showTooltip(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridColumn")
@js.native
object GridColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridColumn = js.native
  /**
    * Creates and returns a new GridColumn instance in the SDK and on the server.
    * The new GridColumn will be automatically stored in the 'columns' property
    * of the parent ColumnGrid element passed as argument.
    */
  def createIn(container: ColumnGrid): GridColumn = js.native
}

