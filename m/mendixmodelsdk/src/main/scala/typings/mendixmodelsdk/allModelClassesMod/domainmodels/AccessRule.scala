package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.security.AccessRuleContainerBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide/access-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AccessRule")
@js.native
class AccessRule protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AccessRule {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AccessRule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule]
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent security.AccessRuleContainerBase element passed as argument.
    */
  /* static member */
  inline def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAccessRuleContainerBaseUnderAccessRules")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule]
  
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  inline def createInEntityUnderAccessRules(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityUnderAccessRules")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AccessRule.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AccessRule.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
