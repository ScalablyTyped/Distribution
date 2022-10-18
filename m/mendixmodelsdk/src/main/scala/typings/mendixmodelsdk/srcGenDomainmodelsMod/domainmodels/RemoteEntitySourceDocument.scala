package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined icon, serviceName, version, endpointId, minimumMxVersion, recommendedMxVersion, applicationId, environmentType, metadataHash, validated, validatedEntities */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
open class RemoteEntitySourceDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  def applicationId: String = js.native
  def applicationId_=(newValue: String): Unit = js.native
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  @JSName("applicationId")
  val applicationId_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def catalogUrl: String = js.native
  def catalogUrl_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MRemoteEntitySourceDocument: FolderBase = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def endpointId: String = js.native
  def endpointId_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("endpointId")
  val endpointId_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def environmentType: EnvironmentType = js.native
  def environmentType_=(newValue: EnvironmentType): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("environmentType")
  val environmentType_FRemoteEntitySourceDocument: EnvironmentType = js.native
  
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  def icon: String | Null = js.native
  def icon_=(newValue: String | Null): Unit = js.native
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  @JSName("icon")
  val icon_FRemoteEntitySourceDocument: String | Null = js.native
  
  def metadata: String = js.native
  
  /**
    * In version 8.16.0: introduced
    */
  def metadataHash: String = js.native
  def metadataHash_=(newValue: String): Unit = js.native
  /**
    * In version 8.16.0: introduced
    */
  @JSName("metadataHash")
  val metadataHash_FRemoteEntitySourceDocument: String = js.native
  
  def metadataUrl: String = js.native
  def metadataUrl_=(newValue: String): Unit = js.native
  
  def metadata_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def minimumMxVersion: String = js.native
  def minimumMxVersion_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("minimumMxVersion")
  val minimumMxVersion_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def recommendedMxVersion: String = js.native
  def recommendedMxVersion_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("recommendedMxVersion")
  val recommendedMxVersion_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("serviceName")
  val serviceName_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def validated: Boolean = js.native
  
  /**
    * In version 9.8.0: introduced
    */
  def validatedEntities: IList[String] = js.native
  /**
    * In version 9.8.0: introduced
    */
  @JSName("validatedEntities")
  val validatedEntities_FRemoteEntitySourceDocument: IList[String] = js.native
  
  def validated_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.6.0: introduced
    */
  @JSName("validated")
  val validated_FRemoteEntitySourceDocument: Boolean = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("version")
  val version_FRemoteEntitySourceDocument: String = js.native
}
object RemoteEntitySourceDocument {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
