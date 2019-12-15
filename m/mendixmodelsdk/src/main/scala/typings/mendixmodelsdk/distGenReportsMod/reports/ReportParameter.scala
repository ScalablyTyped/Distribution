package typings.mendixmodelsdk.distGenReportsMod.reports

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.distGenPagesMod.pages.Widget
import typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter")
@js.native
abstract class ReportParameter protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FReportParameter: IModel = js.native
  /**
    * In version 6.10.0: introduced
    */
  def parameter(): IDataSetParameter | Null = js.native
  def parameter(newValue: IDataSetParameter): js.Any = js.native
  /**
    * In version 6.10.0: deleted
    */
  def parameterName(): String = js.native
  def parameterName(newValue: String): js.Any = js.native
  def parameterQualifiedName(): String | Null = js.native
  @JSName("parameter")
  def parameter_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter")
@js.native
object ReportParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

