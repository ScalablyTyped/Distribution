package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RequestProxyType
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
- typings.mendixmodelsdk.distGenRestMod.rest.IConsumedODataService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
class ConsumedODataService protected () extends RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  val entities: IList[ODataEntity] = js.native
  /**
    * In version 8.0.0: introduced
    */
  var httpConfiguration: HttpConfiguration = js.native
  var metadata: String = js.native
  var metadataUrl: String = js.native
  var proxyHost: IConstant | Null = js.native
  val proxyHostQualifiedName: String | Null = js.native
  var proxyPassword: IConstant | Null = js.native
  val proxyPasswordQualifiedName: String | Null = js.native
  var proxyPort: IConstant | Null = js.native
  val proxyPortQualifiedName: String | Null = js.native
  var proxyType: RequestProxyType = js.native
  var proxyUsername: IConstant | Null = js.native
  val proxyUsernameQualifiedName: String | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  var serviceId: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var serviceName: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var version: String = js.native
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

