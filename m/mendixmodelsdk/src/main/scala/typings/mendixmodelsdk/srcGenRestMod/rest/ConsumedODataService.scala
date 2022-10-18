package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.srcGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RequestProxyType
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-odata-service-properties relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
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
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
- typings.mendixmodelsdk.srcGenRestMod.rest.IConsumedODataService because var conflicts: applicationId, containerAsFolderBase, endpointId, environmentType, icon, id, isLoaded, metadataHash, minimumMxVersion, model, recommendedMxVersion, serviceName, structureTypeName, unit, validated, validatedEntities, version. Inlined lastUpdated */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.ConsumedODataService")
@js.native
open class ConsumedODataService protected () extends RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedODataService: FolderBase = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def errorHandlingMicroflow: IMicroflow | Null = js.native
  
  def errorHandlingMicroflowQualifiedName: String | Null = js.native
  
  def errorHandlingMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def headersMicroflow: IMicroflow | Null = js.native
  
  def headersMicroflowQualifiedName: String | Null = js.native
  
  def headersMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def lastUpdated: String = js.native
  def lastUpdated_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("lastUpdated")
  val lastUpdated_FConsumedODataService: String = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def metadataReferences: IList[MetadataReference] = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def oDataVersion: ODataVersion = js.native
  def oDataVersion_=(newValue: ODataVersion): Unit = js.native
  
  def proxyHost: IConstant | Null = js.native
  
  def proxyHostQualifiedName: String | Null = js.native
  
  def proxyHost_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyPassword: IConstant | Null = js.native
  
  def proxyPasswordQualifiedName: String | Null = js.native
  
  def proxyPassword_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyPort: IConstant | Null = js.native
  
  def proxyPortQualifiedName: String | Null = js.native
  
  def proxyPort_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyType: RequestProxyType = js.native
  def proxyType_=(newValue: RequestProxyType): Unit = js.native
  
  def proxyUsername: IConstant | Null = js.native
  
  def proxyUsernameQualifiedName: String | Null = js.native
  
  def proxyUsername_=(newValue: IConstant | Null): Unit = js.native
  
  /**
    * In version 8.14.0: deleted
    * In version 8.0.0: introduced
    */
  def serviceId: String = js.native
  def serviceId_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.5.0: introduced
    */
  def timeoutExpression: String = js.native
  def timeoutExpression_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: deleted
    * In version 8.5.0: introduced
    */
  def timeoutModel: Expression = js.native
  def timeoutModel_=(newValue: Expression): Unit = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def useQuerySegment: Boolean = js.native
  def useQuerySegment_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.14.0: deleted
    * In version 8.13.0: introduced
    */
  def versionApiMockResults: String = js.native
  def versionApiMockResults_=(newValue: String): Unit = js.native
}
object ConsumedODataService {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ConsumedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): ConsumedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ConsumedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ConsumedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
