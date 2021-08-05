package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
class VersionedService protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def appServiceState: AppServiceState = js.native
  def appServiceState_=(newValue: AppServiceState): Unit = js.native
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsPublishedServiceBase: PublishedServiceBase = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def enumerationsByContract: MsdEnumerationContainer | Null = js.native
  def enumerationsByContract_=(newValue: MsdEnumerationContainer | Null): Unit = js.native
  
  def headerAuthentication: HeaderAuthentication = js.native
  def headerAuthentication_=(newValue: HeaderAuthentication): Unit = js.native
  
  def headerImportMapping: IImportMapping | Null = js.native
  
  def headerImportMappingQualifiedName: String | Null = js.native
  
  def headerImportMapping_=(newValue: IImportMapping | Null): Unit = js.native
  
  def headerMicroflow: IMicroflow | Null = js.native
  
  def headerMicroflowQualifiedName: String | Null = js.native
  
  def headerMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup_=(newValue: ObjectHandlingBackupEnum): Unit = js.native
  
  def operations: IList[PublishedOperation] = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def optimizedXml: Boolean = js.native
  def optimizedXml_=(newValue: Boolean): Unit = js.native
  
  def targetNamespace: String = js.native
  def targetNamespace_=(newValue: String): Unit = js.native
  
  def validate: Boolean = js.native
  def validate_=(newValue: Boolean): Unit = js.native
  
  def versionNumber: Double = js.native
  def versionNumber_=(newValue: Double): Unit = js.native
}
object VersionedService {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): VersionedService = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[VersionedService]
  
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  /* static member */
  inline def createIn(container: PublishedServiceBase): VersionedService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[VersionedService]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
