package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField")
@js.native
class ReportDateRangeField protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportDateRangeField: IModel = js.native
  def caption(): Text = js.native
  def caption(newValue: Text): js.Any = js.native
  def containerAsReportDateRangeSelector(): ReportDateRangeSelector = js.native
  def `type`(): DateRangeFieldEnum = js.native
  def `type`(newValue: DateRangeFieldEnum): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField")
@js.native
object ReportDateRangeField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportDateRangeField = js.native
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * The new ReportDateRangeField will be automatically stored in the 'fields' property
    * of the parent ReportDateRangeSelector element passed as argument.
    */
  def createIn(container: ReportDateRangeSelector): ReportDateRangeField = js.native
}

