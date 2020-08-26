package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/table-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Table")
@js.native
class Table protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTable: IModel = js.native
  def cellPadding: Double = js.native
  def cellPadding_=(newValue: Double): Unit = js.native
  def cellSpacing: Double = js.native
  def cellSpacing_=(newValue: Double): Unit = js.native
  def columnWeights: IList[Double] = js.native
  def rows: IList[TableRow] = js.native
  def style: Style = js.native
  def style_=(newValue: Style): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Table")
@js.native
object Table extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Table instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Table = js.native
  /**
    * Creates and returns a new Table instance in the SDK and on the server.
    * The new Table will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): Table = js.native
  /**
    * Creates and returns a new Table instance in the SDK and on the server.
    * The new Table will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): Table = js.native
}

