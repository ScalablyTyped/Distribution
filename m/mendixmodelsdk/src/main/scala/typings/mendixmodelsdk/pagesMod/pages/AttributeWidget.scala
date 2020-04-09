package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
abstract class AttributeWidget protected () extends MemberWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAttributeWidget: IModel = js.native
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
  /**
    * In version 7.13.0: introduced
    */
  def onEnterAction(): ClientAction = js.native
  def onEnterAction(newValue: ClientAction): js.Any = js.native
  /**
    * In version 7.13.0: deleted
    */
  def onEnterMicroflowSettings(): MicroflowSettings = js.native
  def onEnterMicroflowSettings(newValue: MicroflowSettings): js.Any = js.native
  /**
    * In version 7.13.0: introduced
    */
  def onLeaveAction(): ClientAction = js.native
  def onLeaveAction(newValue: ClientAction): js.Any = js.native
  /**
    * In version 7.13.0: deleted
    */
  def onLeaveMicroflowSettings(): MicroflowSettings = js.native
  def onLeaveMicroflowSettings(newValue: MicroflowSettings): js.Any = js.native
  /**
    * In version 7.6.0: deleted
    */
  def required(): Boolean = js.native
  def required(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.6.0: deleted
    */
  def requiredMessage(): Text = js.native
  def requiredMessage(newValue: Text): js.Any = js.native
  def sourceVariable(): js.Any = js.native
  def sourceVariable(newValue: PageVariable): js.Any = js.native
  /**
    * In version 8.8.0: introduced
    */
  @JSName("sourceVariable")
  def sourceVariable_Union(): PageVariable | Null = js.native
  /**
    * In version 7.6.0: introduced
    */
  def validation(): WidgetValidation = js.native
  def validation(newValue: WidgetValidation): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
object AttributeWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

