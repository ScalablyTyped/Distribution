package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
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
  @JSName("model")
  var model_FPasswordPolicySettings: IModel = js.native
  def containerAsProjectSecurity: ProjectSecurity = js.native
  def minimumLength: Double = js.native
  def minimumLength_=(newValue: Double): Unit = js.native
  def requireDigit: Boolean = js.native
  def requireDigit_=(newValue: Boolean): Unit = js.native
  def requireMixedCase: Boolean = js.native
  def requireMixedCase_=(newValue: Boolean): Unit = js.native
  def requireSymbol: Boolean = js.native
  def requireSymbol_=(newValue: Boolean): Unit = js.native
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

