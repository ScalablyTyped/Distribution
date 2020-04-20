package typings.mendixmodelsdk.reportsMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.Widget
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
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
  def parameter(): js.Any = js.native
  def parameter(newValue: IDataSetParameter): js.Any = js.native
  /**
    * In version 6.10.0: deleted
    */
  def parameterName: String = js.native
  def parameterName(newValue: String): js.Any = js.native
  def parameterQualifiedName: String | Null = js.native
  /**
    * In version 6.10.0: introduced
    */
  @JSName("parameter")
  def parameter_Union: IDataSetParameter | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter")
@js.native
object ReportParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

