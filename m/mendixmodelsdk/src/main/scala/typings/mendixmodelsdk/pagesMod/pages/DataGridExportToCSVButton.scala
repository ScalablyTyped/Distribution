package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/export-to-csv-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton")
@js.native
class DataGridExportToCSVButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataGridExportToCSVButton: IModel = js.native
  def decimalSeparator: String = js.native
  def decimalSeparator(newValue: String): js.Any = js.native
  def delimiter: String = js.native
  def delimiter(newValue: String): js.Any = js.native
  def generateExcelHint: Boolean = js.native
  def generateExcelHint(newValue: Boolean): js.Any = js.native
  def groupSeparator: String = js.native
  def groupSeparator(newValue: String): js.Any = js.native
  def maxNumberOfRows: Double = js.native
  def maxNumberOfRows(newValue: Double): js.Any = js.native
  def useGridDateFormat: Boolean = js.native
  def useGridDateFormat(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton")
@js.native
object DataGridExportToCSVButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataGridExportToCSVButton = js.native
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * The new DataGridExportToCSVButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): DataGridExportToCSVButton = js.native
}

