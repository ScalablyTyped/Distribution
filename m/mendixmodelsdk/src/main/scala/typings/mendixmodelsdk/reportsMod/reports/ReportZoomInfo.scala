package typings.mendixmodelsdk.reportsMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
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
  @JSName("model")
  var model_FReportZoomInfo: IModel = js.native
  def containerAsBasicReport: BasicReport = js.native
  def mappings: IList[ReportZoomMapping] = js.native
  def targetPage: IPage | Null = js.native
  def targetPageQualifiedName: String | Null = js.native
  def targetPage_=(newValue: IPage | Null): Unit = js.native
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

