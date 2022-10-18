package typings.mendixmodelsdk.srcGenProjectsMod.projects

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.StructuralUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IProject because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined projectDocuments, modules, projectConversion, isSystemProject */ @JSImport("mendixmodelsdk/src/gen/projects", "projects.Project")
@js.native
open class Project protected () extends StructuralUnit[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  
  def isSystemProject: Boolean = js.native
  def isSystemProject_=(newValue: Boolean): Unit = js.native
  @JSName("isSystemProject")
  var isSystemProject_FProject: Boolean = js.native
  
  def modules: IList[IModule] = js.native
  @JSName("modules")
  var modules_FProject: IList[IModule] = js.native
  
  def projectConversion: IProjectConversion = js.native
  def projectConversion_=(newValue: IProjectConversion): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("projectConversion")
  var projectConversion_FProject: IProjectConversion = js.native
  
  def projectDocuments: IList[IProjectDocument] = js.native
  @JSName("projectDocuments")
  var projectDocuments_FProject: IList[IProjectDocument] = js.native
}
object Project {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Project")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Project.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Project.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
