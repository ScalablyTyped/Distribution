package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/cell-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TableCell")
@js.native
class TableCell protected () extends DropZone {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTableCell: IModel = js.native
  def colSpan(): Double = js.native
  def colSpan(newValue: Double): js.Any = js.native
  def isPartOfSpan(): Boolean = js.native
  def isPartOfSpan(newValue: Boolean): js.Any = js.native
  def rowSpan(): Double = js.native
  def rowSpan(newValue: Double): js.Any = js.native
  def style(): Style = js.native
  def style(newValue: Style): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TableCell")
@js.native
object TableCell extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TableCell = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * The new TableCell will be automatically stored in the 'cells' property
    * of the parent TableRow element passed as argument.
    */
  def createIn(container: TableRow): TableCell = js.native
}

