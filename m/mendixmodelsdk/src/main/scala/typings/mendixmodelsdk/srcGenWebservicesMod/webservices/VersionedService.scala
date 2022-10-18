package typings.mendixmodelsdk.srcGenWebservicesMod.webservices

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.VersionedService")
@js.native
open class VersionedService protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.0.2: deleted
    */
  def appServiceState: AppServiceState = js.native
  def appServiceState_=(newValue: AppServiceState): Unit = js.native
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  def containerAsPublishedServiceBase: PublishedServiceBase = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    */
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
  
  /**
    * In version 9.0.2: deleted
    */
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
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.VersionedService")
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
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.VersionedService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.VersionedService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
