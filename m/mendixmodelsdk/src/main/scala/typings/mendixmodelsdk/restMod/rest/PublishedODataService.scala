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
  * See: {@link https://docs.mendix.com/refguide/published-odata-services relevant section in reference guide}
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
- typings.mendixmodelsdk.restMod.rest.IPublishedODataService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
@js.native
class PublishedODataService protected () extends Document {
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
  
  def namespace: String = js.native
  def namespace_=(newValue: String): Unit = js.native
  
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
    * In version 8.0.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}
object PublishedODataService {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @scala.inline
  def createIn(container: IFolderBase): PublishedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
