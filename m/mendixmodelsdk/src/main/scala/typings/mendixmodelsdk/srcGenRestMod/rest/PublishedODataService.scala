package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-odata-services relevant section in reference guide}
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
- typings.mendixmodelsdk.srcGenRestMod.rest.IPublishedODataService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataService")
@js.native
open class PublishedODataService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def authenticationMicroflow: IMicroflow | Null = js.native
  
  def authenticationMicroflowQualifiedName: String | Null = js.native
  
  def authenticationMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def authenticationTypes: IList[RestAuthenticationType] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedODataService: FolderBase = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.19.0: introduced
    */
  def microflows: IList[PublishedODataMicroflow] = js.native
  
  def namespace: String = js.native
  def namespace_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.1.0: introduced
    */
  def oDataVersion: PublishedODataVersion = js.native
  def oDataVersion_=(newValue: PublishedODataVersion): Unit = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def publishAssociations: Boolean = js.native
  def publishAssociations_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def replaceIllegalChars: Boolean = js.native
  def replaceIllegalChars_=(newValue: Boolean): Unit = js.native
  
  def resources: IList[PublishedRestResource] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.18.0: introduced
    */
  def useGeneralization: Boolean = js.native
  def useGeneralization_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}
object PublishedODataService {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): PublishedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
