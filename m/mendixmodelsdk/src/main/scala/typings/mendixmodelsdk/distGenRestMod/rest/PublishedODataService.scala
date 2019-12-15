package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenRestMod.rest.IPublishedODataService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
@js.native
class PublishedODataService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FPublishedODataService: IModel = js.native
  def allowedModuleRoles(): IList[IModuleRole] = js.native
  def allowedModuleRolesQualifiedNames(): js.Array[String] = js.native
  /**
    * In version 8.0.0: introduced
    */
  def authenticationMicroflow(): IMicroflow | Null = js.native
  def authenticationMicroflow(newValue: IMicroflow): js.Any = js.native
  def authenticationMicroflowQualifiedName(): String | Null = js.native
  @JSName("authenticationMicroflow")
  def authenticationMicroflow_Any(): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def authenticationTypes(): IList[RestAuthenticationType] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedODataService(): FolderBase = js.native
  /**
    * In version 8.4.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def namespace(): String = js.native
  def namespace(newValue: String): js.Any = js.native
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * In version 7.19.0: introduced
    */
  def publishAssociations(): Boolean = js.native
  def publishAssociations(newValue: Boolean): js.Any = js.native
  def resources(): IList[PublishedRestResource] = js.native
  /**
    * In version 8.0.0: introduced
    */
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: introduced
    */
  def summary(): String = js.native
  def summary(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def version(): String = js.native
  def version(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
@js.native
object PublishedODataService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedODataService = js.native
}

