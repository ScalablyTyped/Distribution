package typings.mendixmodelsdk.mendixmodelsdkMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.ConstantValue")
@js.native
class ConstantValue protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.ConstantValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.ConstantValue")
@js.native
object ConstantValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenSettingsMod.settings.ConstantValue = js.native
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * The new ConstantValue will be automatically stored in the 'constantValues' property
    * of the parent Configuration element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenSettingsMod.settings.Configuration): typings.mendixmodelsdk.distGenSettingsMod.settings.ConstantValue = js.native
}

