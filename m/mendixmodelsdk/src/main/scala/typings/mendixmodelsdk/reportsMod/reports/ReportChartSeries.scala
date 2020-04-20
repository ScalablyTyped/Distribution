package typings.mendixmodelsdk.reportsMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries")
@js.native
class ReportChartSeries protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportChartSeries: IModel = js.native
  def caption: Text = js.native
  def caption(newValue: Text): js.Any = js.native
  def containerAsReportChart: ReportChart = js.native
  def dataSetColumn: String = js.native
  def dataSetColumn(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries")
@js.native
object ReportChartSeries extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportChartSeries = js.native
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * The new ReportChartSeries will be automatically stored in the 'seriess' property
    * of the parent ReportChart element passed as argument.
    */
  def createIn(container: ReportChart): ReportChartSeries = js.native
}

