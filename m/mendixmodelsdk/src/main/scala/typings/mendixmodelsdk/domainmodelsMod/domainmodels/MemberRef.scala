package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.SortItem
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typings.mendixmodelsdk.pagesMod.pages.GridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typings.mendixmodelsdk.pagesMod.pages.MemberWidget
import typings.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typings.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typings.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
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
  def containerAsPagesGridSortItem(): typings.mendixmodelsdk.pagesMod.pages.GridSortItem = js.native
  def containerAsRangeSearchField(): RangeSearchField = js.native
  def containerAsSingleSearchField(): SingleSearchField = js.native
  def containerAsSortItem(): SortItem = js.native
  def containerAsStaticOrDynamicString(): StaticOrDynamicString = js.native
  def containerAsVariableRefExpression(): VariableRefExpression = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  def entityRef(): js.Any = js.native
  def entityRef(newValue: IndirectEntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Union(): IndirectEntityRef | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

