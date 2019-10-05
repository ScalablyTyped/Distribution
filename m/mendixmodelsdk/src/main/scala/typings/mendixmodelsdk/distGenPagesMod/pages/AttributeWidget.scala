package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  /**
    * In version 7.13.0: introduced
    */
  var onChangeAction: ClientAction = js.native
  /**
    * In version 7.13.0: deleted
    */
  var onChangeMicroflowSettings: MicroflowSettings = js.native
  /**
    * In version 7.13.0: introduced
    */
  var onEnterAction: ClientAction = js.native
  /**
    * In version 7.13.0: deleted
    */
  var onEnterMicroflowSettings: MicroflowSettings = js.native
  /**
    * In version 7.13.0: introduced
    */
  var onLeaveAction: ClientAction = js.native
  /**
    * In version 7.13.0: deleted
    */
  var onLeaveMicroflowSettings: MicroflowSettings = js.native
  /**
    * In version 7.6.0: deleted
    */
  var required: Boolean = js.native
  /**
    * In version 7.6.0: deleted
    */
  var requiredMessage: Text = js.native
  /**
    * In version 7.6.0: introduced
    */
  var validation: WidgetValidation = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
object AttributeWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

