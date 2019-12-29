package typings.mendixmodelsdk.mendixmodelsdkMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.BasicReportColumn")
@js.native
class BasicReportColumn protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.BasicReportColumn {
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
@JSImport("mendixmodelsdk", "reports.BasicReportColumn")
@js.native
object BasicReportColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reports.BasicReportColumn = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * The new BasicReportColumn will be automatically stored in the 'columns' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reports.BasicReport): typings.mendixmodelsdk.distGenReportsMod.reports.BasicReportColumn = js.native
}

