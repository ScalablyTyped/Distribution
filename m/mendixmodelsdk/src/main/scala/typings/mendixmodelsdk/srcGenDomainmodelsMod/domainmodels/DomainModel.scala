package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Module
import typings.mendixmodelsdk.srcGenProjectsMod.projects.ModuleDocument
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/domain-model relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IDomainModel because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined documentation, entities, associations, crossAssociations */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.DomainModel")
@js.native
open class DomainModel protected () extends ModuleDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  
  def annotations: IList[Annotation] = js.native
  
  def associations: IList[Association] = js.native
  @JSName("associations")
  val associations_FDomainModel: IList[IAssociation] = js.native
  
  @JSName("containerAsModule")
  def containerAsModule_MDomainModel: Module = js.native
  
  def crossAssociations: IList[CrossAssociation] = js.native
  @JSName("crossAssociations")
  val crossAssociations_FDomainModel: IList[ICrossAssociation] = js.native
  
  /**
    * In version 9.10.0: added public
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * In version 9.10.0: added public
    */
  @JSName("documentation")
  val documentation_FDomainModel: String = js.native
  
  def entities: IList[Entity] = js.native
  @JSName("entities")
  val entities_FDomainModel: IList[IEntity] = js.native
}
object DomainModel {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.DomainModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DomainModel unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IModule): DomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DomainModel]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.DomainModel.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.DomainModel.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
