package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RequestProxyType
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.18.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
- typings.mendixmodelsdk.distGenRestMod.rest.IConsumedODataService because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
class ConsumedODataService protected () extends RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FConsumedODataService: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedODataService(): FolderBase = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def entities(): IList[ODataEntity] = js.native
  /**
    * In version 8.4.0: introduced
    */
  def headersMicroflow(): IMicroflow | Null = js.native
  def headersMicroflow(newValue: IMicroflow): js.Any = js.native
  def headersMicroflowQualifiedName(): String | Null = js.native
  @JSName("headersMicroflow")
  def headersMicroflow_Any(): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def httpConfiguration(): HttpConfiguration = js.native
  def httpConfiguration(newValue: HttpConfiguration): js.Any = js.native
  def metadata(): String = js.native
  def metadata(newValue: String): js.Any = js.native
  def metadataUrl(): String = js.native
  def metadataUrl(newValue: String): js.Any = js.native
  def proxyHost(): IConstant | Null = js.native
  def proxyHost(newValue: IConstant): js.Any = js.native
  def proxyHostQualifiedName(): String | Null = js.native
  @JSName("proxyHost")
  def proxyHost_Any(): js.Any = js.native
  def proxyPassword(): IConstant | Null = js.native
  def proxyPassword(newValue: IConstant): js.Any = js.native
  def proxyPasswordQualifiedName(): String | Null = js.native
  @JSName("proxyPassword")
  def proxyPassword_Any(): js.Any = js.native
  def proxyPort(): IConstant | Null = js.native
  def proxyPort(newValue: IConstant): js.Any = js.native
  def proxyPortQualifiedName(): String | Null = js.native
  @JSName("proxyPort")
  def proxyPort_Any(): js.Any = js.native
  def proxyType(): RequestProxyType = js.native
  def proxyType(newValue: RequestProxyType): js.Any = js.native
  def proxyUsername(): IConstant | Null = js.native
  def proxyUsername(newValue: IConstant): js.Any = js.native
  def proxyUsernameQualifiedName(): String | Null = js.native
  @JSName("proxyUsername")
  def proxyUsername_Any(): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def serviceId(): String = js.native
  def serviceId(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.5.0: introduced
    */
  def timeoutExpression(): String = js.native
  def timeoutExpression(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.5.0: introduced
    */
  def timeoutModel(): Expression = js.native
  def timeoutModel(newValue: Expression): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def version(): String = js.native
  def version(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
object ConsumedODataService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): ConsumedODataService = js.native
}

