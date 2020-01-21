package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
abstract class AccessRuleContainerBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAccessRuleContainerBase: IModel = js.native
  def accessRules(): IList[AccessRule] = js.native
  def containerAsProjectSecurity(): ProjectSecurity = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
object AccessRuleContainerBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

