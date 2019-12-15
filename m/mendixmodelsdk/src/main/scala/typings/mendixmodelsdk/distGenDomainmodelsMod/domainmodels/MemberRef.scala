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
  @JSName("model")
  var model_FMemberRef: IModel = js.native
  def containerAsAttributeWidget(): AttributeWidget = js.native
  def containerAsClientTemplateParameter(): ClientTemplateParameter = js.native
  def containerAsDataGridColumn(): DataGridColumn = js.native
  def containerAsDocumentTemplatesGridSortItem(): GridSortItem = js.native
  def containerAsGridColumn(): GridColumn = js.native
  def containerAsListViewSearch(): ListViewSearch = js.native
  def containerAsMemberWidget(): MemberWidget = js.native
  def containerAsPagesGridSortItem(): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortItem = js.native
  def containerAsRangeSearchField(): RangeSearchField = js.native
  def containerAsSingleSearchField(): SingleSearchField = js.native
  def containerAsSortItem(): SortItem = js.native
  def containerAsStaticOrDynamicString(): StaticOrDynamicString = js.native
  def containerAsVariableRefExpression(): VariableRefExpression = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  def entityRef(): IndirectEntityRef | Null = js.native
  def entityRef(newValue: IndirectEntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

