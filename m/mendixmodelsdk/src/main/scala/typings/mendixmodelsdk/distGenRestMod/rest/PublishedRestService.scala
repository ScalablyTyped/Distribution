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
  * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenRestMod.rest.IPublishedRestService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
class PublishedRestService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FPublishedRestService: IModel = js.native
  def allowedRoles(): IList[IModuleRole] = js.native
  def allowedRolesQualifiedNames(): js.Array[String] = js.native
  /**
    * In version 7.17.0: introduced
    */
  def authenticationMicroflow(): IMicroflow | Null = js.native
  def authenticationMicroflow(newValue: IMicroflow): js.Any = js.native
  def authenticationMicroflowQualifiedName(): String | Null = js.native
  @JSName("authenticationMicroflow")
  def authenticationMicroflow_Any(): js.Any = js.native
  /**
    * In version 7.13.0: deleted
    * In version 7.11.0: introduced
    */
  def authenticationType(): RestAuthenticationType = js.native
  def authenticationType(newValue: RestAuthenticationType): js.Any = js.native
  /**
    * In version 7.13.0: introduced
    */
  def authenticationTypes(): IList[RestAuthenticationType] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedRestService(): FolderBase = js.native
  /**
    * In version 7.18.0: introduced
    */
  def corsConfiguration(): CorsConfiguration | Null = js.native
  def corsConfiguration(newValue: CorsConfiguration): js.Any = js.native
  @JSName("corsConfiguration")
  def corsConfiguration_Any(): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def parameters(): IList[RestOperationParameter] = js.native
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * In version 7.7.0: introduced
    */
  def resources(): IList[PublishedRestServiceResource] = js.native
  /**
    * In version 7.12.0: introduced
    */
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * In version 7.12.0: introduced
    */
  def version(): String = js.native
  def version(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
object PublishedRestService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedRestService = js.native
}

