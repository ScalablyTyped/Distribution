package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
@js.native
class ReportZoomInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsBasicReport: BasicReport = js.native
  val mappings: IList[ReportZoomMapping] = js.native
  @JSName("model")
  var model_ReportZoomInfo: IModel = js.native
  var targetPage: IPage | Null = js.native
  val targetPageQualifiedName: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
@js.native
object ReportZoomInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportZoomInfo = js.native
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: BasicReport): ReportZoomInfo = js.native
}

