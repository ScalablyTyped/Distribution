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
  var aggregateCaption: Text = js.native
  var aggregateFunction: AggregateFunction = js.native
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
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
  var caption: Text = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  val containerAsColumnGrid: ColumnGrid = js.native
  var editable: Boolean = js.native
  var formattingInfo: FormattingInfo = js.native
  @JSName("model")
  var model_GridColumn: IModel = js.native
  var name: String = js.native
  var showTooltip: Boolean = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  var width: Double = js.native
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

