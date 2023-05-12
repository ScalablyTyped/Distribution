package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenSecurityMod.security.IUserRole
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.21.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.UserRoleSet")
@js.native
open class UserRoleSet protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsRetrievalQuery: RetrievalQuery = js.native
  
  def containerAsRuntimeOperation: RuntimeOperation = js.native
  
  def userRoles: IList[IUserRole] = js.native
  
  def userRolesQualifiedNames: js.Array[String] = js.native
}
object UserRoleSet {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UserRoleSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[UserRoleSet]
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * The new UserRoleSet will be automatically stored in the 'allowedUserRoleSets' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInRetrievalQueryUnderAllowedUserRoleSets(container: RetrievalQuery): UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRetrievalQueryUnderAllowedUserRoleSets")(container.asInstanceOf[js.Any]).asInstanceOf[UserRoleSet]
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * The new UserRoleSet will be automatically stored in the 'allowedUserRoleSets' property
    * of the parent RuntimeOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInRuntimeOperationUnderAllowedUserRoleSets(container: RuntimeOperation): UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuntimeOperationUnderAllowedUserRoleSets")(container.asInstanceOf[js.Any]).asInstanceOf[UserRoleSet]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UserRoleSet.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UserRoleSet.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
