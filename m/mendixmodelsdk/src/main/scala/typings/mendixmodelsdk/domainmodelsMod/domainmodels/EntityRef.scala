package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.EntityWidget
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction
import typings.mendixmodelsdk.pagesMod.pages.EntityPathSource
import typings.mendixmodelsdk.pagesMod.pages.NewButton
import typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.pagesMod.pages.SelectorXPathSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
abstract class EntityRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityRef: IModel = js.native
  def containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
  def containerAsEntityPathSource: EntityPathSource = js.native
  def containerAsEntityWidget: EntityWidget = js.native
  def containerAsMemberRef: MemberRef = js.native
  def containerAsNewButton: NewButton = js.native
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  def containerAsSelectorXPathSource: SelectorXPathSource = js.native
  def containerAsWidgetValue: WidgetValue = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

