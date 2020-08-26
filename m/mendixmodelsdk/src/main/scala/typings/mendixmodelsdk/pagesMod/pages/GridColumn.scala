package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
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
  def aggregateCaption: Text = js.native
  def aggregateCaption_=(newValue: Text): Unit = js.native
  def aggregateFunction: AggregateFunction = js.native
  def aggregateFunction_=(newValue: AggregateFunction): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  def containerAsColumnGrid: ColumnGrid = js.native
  def editable: Boolean = js.native
  def editable_=(newValue: Boolean): Unit = js.native
  def formattingInfo: FormattingInfo = js.native
  def formattingInfo_=(newValue: FormattingInfo): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def showTooltip: Boolean = js.native
  def showTooltip_=(newValue: Boolean): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
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

