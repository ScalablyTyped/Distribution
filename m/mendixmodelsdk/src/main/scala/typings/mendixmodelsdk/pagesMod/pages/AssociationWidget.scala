package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
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
  def onChangeAction: ClientAction = js.native
  def onChangeAction_=(newValue: ClientAction): Unit = js.native
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings: MicroflowSettings = js.native
  def onChangeMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  def selectPageSettings: PageSettings = js.native
  def selectPageSettings_=(newValue: PageSettings): Unit = js.native
  def selectorSource: SelectorSource = js.native
  def selectorSource_=(newValue: SelectorSource): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AssociationWidget")
@js.native
object AssociationWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

