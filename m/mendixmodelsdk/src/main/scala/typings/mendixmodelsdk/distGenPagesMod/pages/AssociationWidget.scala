package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget")
@js.native
abstract class AssociationWidget protected () extends MemberWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAssociationWidget: IModel = js.native
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction(): ClientAction = js.native
  def onChangeAction(newValue: ClientAction): js.Any = js.native
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings(): MicroflowSettings = js.native
  def onChangeMicroflowSettings(newValue: MicroflowSettings): js.Any = js.native
  def selectPageSettings(): PageSettings = js.native
  def selectPageSettings(newValue: PageSettings): js.Any = js.native
  def selectorSource(): SelectorSource = js.native
  def selectorSource(newValue: SelectorSource): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget")
@js.native
object AssociationWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

