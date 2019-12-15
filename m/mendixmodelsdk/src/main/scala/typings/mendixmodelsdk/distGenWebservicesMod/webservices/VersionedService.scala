package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
class VersionedService protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FVersionedService: IModel = js.native
  def appServiceState(): AppServiceState = js.native
  def appServiceState(newValue: AppServiceState): js.Any = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsPublishedServiceBase(): PublishedServiceBase = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def enumerationsByContract(): MsdEnumerationContainer | Null = js.native
  def enumerationsByContract(newValue: MsdEnumerationContainer): js.Any = js.native
  @JSName("enumerationsByContract")
  def enumerationsByContract_Any(): js.Any = js.native
  def headerAuthentication(): HeaderAuthentication = js.native
  def headerAuthentication(newValue: HeaderAuthentication): js.Any = js.native
  def headerImportMapping(): IImportMapping | Null = js.native
  def headerImportMapping(newValue: IImportMapping): js.Any = js.native
  def headerImportMappingQualifiedName(): String | Null = js.native
  @JSName("headerImportMapping")
  def headerImportMapping_Any(): js.Any = js.native
  def headerMicroflow(): IMicroflow | Null = js.native
  def headerMicroflow(newValue: IMicroflow): js.Any = js.native
  def headerMicroflowQualifiedName(): String | Null = js.native
  @JSName("headerMicroflow")
  def headerMicroflow_Any(): js.Any = js.native
  def image(): IImage | Null = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName(): String | Null = js.native
  @JSName("image")
  def image_Any(): js.Any = js.native
  def isLockedByContract(): Boolean = js.native
  def isLockedByContract(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup(): ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup(newValue: ObjectHandlingBackupEnum): js.Any = js.native
  def operations(): IList[PublishedOperation] = js.native
  /**
    * In version 7.13.0: introduced
    */
  def optimizedXml(): Boolean = js.native
  def optimizedXml(newValue: Boolean): js.Any = js.native
  def targetNamespace(): String = js.native
  def targetNamespace(newValue: String): js.Any = js.native
  def validate(): Boolean = js.native
  def validate(newValue: Boolean): js.Any = js.native
  def versionNumber(): Double = js.native
  def versionNumber(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
object VersionedService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): VersionedService = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  def createIn(container: PublishedServiceBase): VersionedService = js.native
}

