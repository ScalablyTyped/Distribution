package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
@js.native
class ReportDateRangeField protected ()
  extends typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeField {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
@js.native
object ReportDateRangeField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeField = js.native
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * The new ReportDateRangeField will be automatically stored in the 'fields' property
    * of the parent ReportDateRangeSelector element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeSelector): typings.mendixmodelsdk.distGenReportsMod.reports.ReportDateRangeField = js.native
}

