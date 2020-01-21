package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/security", "security.ImageAccessRuleContainer")
@js.native
class ImageAccessRuleContainer protected () extends AccessRuleContainerBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FImageAccessRuleContainer: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ImageAccessRuleContainer")
@js.native
object ImageAccessRuleContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ImageAccessRuleContainer = js.native
  /**
    * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
    * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): ImageAccessRuleContainer = js.native
}

