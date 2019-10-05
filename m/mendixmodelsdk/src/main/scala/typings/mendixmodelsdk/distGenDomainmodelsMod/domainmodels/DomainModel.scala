package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projects.Module
import typings.mendixmodelsdk.distGenProjectsMod.projects.ModuleDocument
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IDomainModel because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entities, associations, crossAssociations */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
@js.native
class DomainModel protected () extends ModuleDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  val annotations: IList[Annotation] = js.native
  val associations: IList[Association | IAssociation] = js.native
  @JSName("containerAsModule")
  val containerAsModule_DomainModel: Module = js.native
  val crossAssociations: IList[CrossAssociation | ICrossAssociation] = js.native
  var documentation: String = js.native
  val entities: IList[Entity | IEntity] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DomainModel")
@js.native
object DomainModel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new DomainModel unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  def createIn(container: IModule): DomainModel = js.native
}

