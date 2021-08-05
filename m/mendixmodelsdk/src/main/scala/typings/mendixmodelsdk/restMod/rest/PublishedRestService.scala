package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
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
- typings.mendixmodelsdk.restMod.rest.IPublishedRestService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
class PublishedRestService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def allowedRoles: IList[IModuleRole] = js.native
  
  def allowedRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def authenticationMicroflow: IMicroflow | Null = js.native
  
  def authenticationMicroflowQualifiedName: String | Null = js.native
  
  def authenticationMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    * In version 7.11.0: introduced
    */
  def authenticationType: RestAuthenticationType = js.native
  def authenticationType_=(newValue: RestAuthenticationType): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def authenticationTypes: IList[RestAuthenticationType] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedRestService: FolderBase = js.native
  
  /**
    * In version 7.18.0: introduced
    */
  def corsConfiguration: CorsConfiguration | Null = js.native
  def corsConfiguration_=(newValue: CorsConfiguration | Null): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def parameters: IList[RestOperationParameter] = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.7.0: introduced
    */
  def resources: IList[PublishedRestServiceResource] = js.native
  
  /**
    * In version 7.12.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.12.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}
object PublishedRestService {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): PublishedRestService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedRestService]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
