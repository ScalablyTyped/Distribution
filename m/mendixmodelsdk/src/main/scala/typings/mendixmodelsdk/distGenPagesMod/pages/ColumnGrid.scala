package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
abstract class ColumnGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val columns: IList[GridColumn] = js.native
  var numberOfRows: Double = js.native
  var showEmptyRows: Boolean = js.native
  var tooltipPage: IPage | Null = js.native
  val tooltipPageQualifiedName: String | Null = js.native
  var widthUnit: UnitEnum = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ColumnGrid")
@js.native
object ColumnGrid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

