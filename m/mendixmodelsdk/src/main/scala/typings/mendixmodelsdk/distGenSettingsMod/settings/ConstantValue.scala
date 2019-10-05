package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ConstantValue")
@js.native
class ConstantValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var constant: IConstant = js.native
  val constantQualifiedName: String = js.native
  val containerAsConfiguration: Configuration = js.native
  @JSName("model")
  var model_ConstantValue: IModel = js.native
  var value: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ConstantValue")
@js.native
object ConstantValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ConstantValue = js.native
  /**
    * Creates and returns a new ConstantValue instance in the SDK and on the server.
    * The new ConstantValue will be automatically stored in the 'constantValues' property
    * of the parent Configuration element passed as argument.
    */
  def createIn(container: Configuration): ConstantValue = js.native
}

