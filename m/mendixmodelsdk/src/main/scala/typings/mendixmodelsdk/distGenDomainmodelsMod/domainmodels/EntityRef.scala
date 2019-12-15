package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.CreateObjectClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.EntityPathSource
import typings.mendixmodelsdk.distGenPagesMod.pages.NewButton
import typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource
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
  def containerAsCreateObjectClientAction(): CreateObjectClientAction = js.native
  def containerAsEntityPathSource(): EntityPathSource = js.native
  def containerAsEntityWidget(): EntityWidget = js.native
  def containerAsMemberRef(): MemberRef = js.native
  def containerAsNewButton(): NewButton = js.native
  def containerAsReferenceSetSelector(): ReferenceSetSelector = js.native
  def containerAsSelectorXPathSource(): SelectorXPathSource = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

