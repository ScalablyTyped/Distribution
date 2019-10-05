package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
@js.native
class BasicReportAggregate protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var aggregateFunction: AggregateFunctionEnum = js.native
  val applicablePerColumn: IList[Boolean] = js.native
  var caption: Text = js.native
  val containerAsBasicReport: BasicReport = js.native
  @JSName("model")
  var model_BasicReportAggregate: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
@js.native
object BasicReportAggregate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicReportAggregate = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: BasicReport): BasicReportAggregate = js.native
}

