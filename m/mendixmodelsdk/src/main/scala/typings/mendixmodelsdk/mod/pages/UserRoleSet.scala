package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.21.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.UserRoleSet")
@js.native
open class UserRoleSet protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.UserRoleSet {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object UserRoleSet {
  
  @JSImport("mendixmodelsdk", "pages.UserRoleSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet]
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * The new UserRoleSet will be automatically stored in the 'allowedUserRoleSets' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInRetrievalQueryUnderAllowedUserRoleSets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQuery): typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRetrievalQueryUnderAllowedUserRoleSets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet]
  
  /**
    * Creates and returns a new UserRoleSet instance in the SDK and on the server.
    * The new UserRoleSet will be automatically stored in the 'allowedUserRoleSets' property
    * of the parent RuntimeOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.21.0 and higher
    */
  /* static member */
  inline def createInRuntimeOperationUnderAllowedUserRoleSets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.RuntimeOperation): typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuntimeOperationUnderAllowedUserRoleSets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.UserRoleSet]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.UserRoleSet.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.UserRoleSet.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
