package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.security.AccessRuleContainerBase
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/access-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AccessRule")
@js.native
class AccessRule protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAccessRule: IModel = js.native
  def allowCreate: Boolean = js.native
  def allowCreate(newValue: Boolean): js.Any = js.native
  def allowDelete: Boolean = js.native
  def allowDelete(newValue: Boolean): js.Any = js.native
  def containerAsAccessRuleContainerBase: AccessRuleContainerBase = js.native
  def containerAsEntity: Entity = js.native
  def defaultMemberAccessRights: MemberAccessRights = js.native
  def defaultMemberAccessRights(newValue: MemberAccessRights): js.Any = js.native
  def documentation: String = js.native
  def documentation(newValue: String): js.Any = js.native
  def memberAccesses: IList[MemberAccess] = js.native
  def moduleRoles: IList[IModuleRole] = js.native
  def moduleRolesQualifiedNames: js.Array[String] = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AccessRule")
@js.native
object AccessRule extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AccessRule = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent security.AccessRuleContainerBase element passed as argument.
    */
  def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): AccessRule = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent Entity element passed as argument.
    */
  def createInEntityUnderAccessRules(container: Entity): AccessRule = js.native
}

