package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridColumn")
@js.native
class DataGridColumn protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataGridColumn: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath(): String = js.native
  def attributePath(newValue: String): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef(): AttributeRef | Null = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  @JSName("attributeRef")
  def attributeRef_Any(): js.Any = js.native
  def caption(): Text = js.native
  def caption(newValue: Text): js.Any = js.native
  def containerAsDataGrid(): DataGrid = js.native
  def evenRowsCell(): DataGridCell | Null = js.native
  def evenRowsCell(newValue: DataGridCell): js.Any = js.native
  @JSName("evenRowsCell")
  def evenRowsCell_Any(): js.Any = js.native
  def formattingInfo(): FormattingInfo = js.native
  def formattingInfo(newValue: FormattingInfo): js.Any = js.native
  def oddRowsCell(): DataGridCell = js.native
  def oddRowsCell(newValue: DataGridCell): js.Any = js.native
  def style(): Style = js.native
  def style(newValue: Style): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridColumn")
@js.native
object DataGridColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataGridColumn = js.native
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * The new DataGridColumn will be automatically stored in the 'columns' property
    * of the parent DataGrid element passed as argument.
    */
  def createIn(container: DataGrid): DataGridColumn = js.native
}

