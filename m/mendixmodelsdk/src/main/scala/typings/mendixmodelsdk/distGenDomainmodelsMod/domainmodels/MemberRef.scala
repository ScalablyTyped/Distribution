package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SortItem
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.distGenPagesMod.pages.GridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.distGenPagesMod.pages.MemberWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.distGenPagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.distGenPagesMod.pages.StaticOrDynamicString
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
abstract class MemberRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsAttributeWidget: AttributeWidget = js.native
  val containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  val containerAsDataGridColumn: DataGridColumn = js.native
  val containerAsDocumentTemplatesGridSortItem: GridSortItem = js.native
  val containerAsGridColumn: GridColumn = js.native
  val containerAsListViewSearch: ListViewSearch = js.native
  val containerAsMemberWidget: MemberWidget = js.native
  val containerAsPagesGridSortItem: typings.mendixmodelsdk.distGenPagesMod.pages.GridSortItem = js.native
  val containerAsRangeSearchField: RangeSearchField = js.native
  val containerAsSingleSearchField: SingleSearchField = js.native
  val containerAsSortItem: SortItem = js.native
  val containerAsStaticOrDynamicString: StaticOrDynamicString = js.native
  val containerAsVariableRefExpression: VariableRefExpression = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  var entityRef: IndirectEntityRef | Null = js.native
  @JSName("model")
  var model_MemberRef: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

