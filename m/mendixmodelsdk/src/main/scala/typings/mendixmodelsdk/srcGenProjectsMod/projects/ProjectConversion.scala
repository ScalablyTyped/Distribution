package typings.mendixmodelsdk.srcGenProjectsMod.projects

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IProjectConversion because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProjectConversion")
@js.native
open class ProjectConversion protected () extends ModelUnit[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  def containerAsProject: Project = js.native
  @JSName("containerAsProject")
  val containerAsProject_FProjectConversion: IProject = js.native
  
  def markers: IList[OneTimeConversionMarker] = js.native
}
object ProjectConversion {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProjectConversion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ProjectConversion unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IProject): ProjectConversion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ProjectConversion]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProjectConversion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ProjectConversion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
