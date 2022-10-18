package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IMicroflowActionInfo
import typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.MicroflowActionInfo
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/microflows relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowBase because Already inherited
- typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IServerSideMicroflow because Already inherited
- typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo, workflowActionInfo */ @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Microflow")
@js.native
open class Microflow protected () extends ServerSideMicroflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def allowConcurrentExecution: Boolean = js.native
  def allowConcurrentExecution_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FMicroflow: js.Array[String] = js.native
  
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FMicroflow: IList[IModuleRole] = js.native
  
  def concurrencyErrorMessage: Text = js.native
  def concurrencyErrorMessage_=(newValue: Text): Unit = js.native
  
  def concurrencyErrorMicroflow: IMicroflow | Null = js.native
  
  def concurrencyErrorMicroflowQualifiedName: String | Null = js.native
  
  def concurrencyErrorMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflow: FolderBase = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def microflowActionInfo: MicroflowActionInfo | Null = js.native
  def microflowActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
  
  /**
    * In version 9.0.2: introduced
    */
  def workflowActionInfo: MicroflowActionInfo | Null = js.native
  def workflowActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 9.0.2: introduced
    */
  @JSName("workflowActionInfo")
  val workflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
}
object Microflow {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Microflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): Microflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Microflow]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Microflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Microflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
