package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSet
import typings.mendixmodelsdk.distGenPagesMod.pages.Widget
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
@js.native
abstract class ReportWidget protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var dataSet: IDataSet | Null = js.native
  val dataSetQualifiedName: String | Null = js.native
  /**
    * In version 6.10.0: introduced
    */
  var generateOnLoad: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
@js.native
object ReportWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

