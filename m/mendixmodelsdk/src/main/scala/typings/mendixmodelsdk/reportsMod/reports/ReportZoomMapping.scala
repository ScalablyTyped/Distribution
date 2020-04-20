package typings.mendixmodelsdk.reportsMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
@js.native
class ReportZoomMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportZoomMapping: IModel = js.native
  def containerAsReportZoomInfo: ReportZoomInfo = js.native
  def sourceReportColumnName: String = js.native
  def sourceReportColumnName(newValue: String): js.Any = js.native
  def targetParameterName: String = js.native
  def targetParameterName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
@js.native
object ReportZoomMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportZoomMapping = js.native
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * The new ReportZoomMapping will be automatically stored in the 'mappings' property
    * of the parent ReportZoomInfo element passed as argument.
    */
  def createIn(container: ReportZoomInfo): ReportZoomMapping = js.native
}

