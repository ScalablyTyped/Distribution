package typings.mendixmodelsdk.mendixmodelsdkMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
@js.native
class ReportZoomMapping protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.ReportZoomMapping {
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
@JSImport("mendixmodelsdk", "reports.ReportZoomMapping")
@js.native
object ReportZoomMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reports.ReportZoomMapping = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * The new ReportZoomMapping will be automatically stored in the 'mappings' property
    * of the parent ReportZoomInfo element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reports.ReportZoomInfo): typings.mendixmodelsdk.distGenReportsMod.reports.ReportZoomMapping = js.native
}

