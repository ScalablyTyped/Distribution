package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.codeactions.IMicroflowActionInfo
import typings.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow because Already inherited
- typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
class Microflow protected () extends ServerSideMicroflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FMicroflow: js.Array[String] = js.native
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FMicroflow: IList[IModuleRole] = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
  @JSName("model")
  var model_FMicroflow: IModel = js.native
  def allowConcurrentExecution: Boolean = js.native
  def allowConcurrentExecution_=(newValue: Boolean): Unit = js.native
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
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
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Microflow = js.native
}

