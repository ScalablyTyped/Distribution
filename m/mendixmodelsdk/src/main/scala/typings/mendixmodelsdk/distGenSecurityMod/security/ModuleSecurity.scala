package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projects.Module
import typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distGenSecurityMod.security.IModuleSecurity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModule, moduleRoles */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleSecurity")
@js.native
class ModuleSecurity protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  @JSName("containerAsModule")
  val containerAsModule_FModuleSecurity: IModule = js.native
  @JSName("model")
  var model_FModuleSecurity: IModel = js.native
  @JSName("moduleRoles")
  val moduleRoles_FModuleSecurity: IList[IModuleRole] = js.native
  def containerAsModule(): Module = js.native
  def moduleRoles(): IList[ModuleRole] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ModuleSecurity")
@js.native
object ModuleSecurity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ModuleSecurity unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  def createIn(container: IModule): ModuleSecurity = js.native
}

