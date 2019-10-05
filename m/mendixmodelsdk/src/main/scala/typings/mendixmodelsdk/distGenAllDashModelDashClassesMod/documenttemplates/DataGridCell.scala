package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell")
@js.native
class DataGridCell protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell")
@js.native
object DataGridCell extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell = js.native
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderEvenRowsCell(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell = js.native
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderOddRowsCell(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell = js.native
}

