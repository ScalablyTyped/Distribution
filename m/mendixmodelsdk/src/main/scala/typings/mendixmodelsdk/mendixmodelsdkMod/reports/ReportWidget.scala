package typings.mendixmodelsdk.mendixmodelsdkMod.reports

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "reports.ReportWidget")
@js.native
abstract class ReportWidget protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.ReportWidget {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "reports.ReportWidget")
@js.native
object ReportWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
}

