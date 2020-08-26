package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DropZone")
@js.native
abstract class DropZone protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDropZone: IModel = js.native
  def containerAsDataView: DataView = js.native
  def containerAsDocumentTemplate: DocumentTemplate = js.native
  def containerAsTableRow: TableRow = js.native
  def containerAsTemplateGrid: TemplateGrid = js.native
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DropZone")
@js.native
object DropZone extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

