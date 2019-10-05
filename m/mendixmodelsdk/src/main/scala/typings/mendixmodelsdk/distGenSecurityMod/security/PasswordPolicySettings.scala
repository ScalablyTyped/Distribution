package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.PasswordPolicySettings")
@js.native
class PasswordPolicySettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsProjectSecurity: ProjectSecurity = js.native
  var minimumLength: Double = js.native
  @JSName("model")
  var model_PasswordPolicySettings: IModel = js.native
  var requireDigit: Boolean = js.native
  var requireMixedCase: Boolean = js.native
  var requireSymbol: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.PasswordPolicySettings")
@js.native
object PasswordPolicySettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PasswordPolicySettings = js.native
  /**
    * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
    * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): PasswordPolicySettings = js.native
}

