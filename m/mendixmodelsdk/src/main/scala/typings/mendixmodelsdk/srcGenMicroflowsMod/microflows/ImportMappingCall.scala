package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ImportMappingCall")
@js.native
open class ImportMappingCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.18.0: introduced
    */
  def commit: CommitEnum = js.native
  def commit_=(newValue: CommitEnum): Unit = js.native
  
  def containerAsResultHandling: ResultHandling = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def contentType: ContentType = js.native
  def contentType_=(newValue: ContentType): Unit = js.native
  
  /**
    * In version 7.8.0: introduced
    */
  def forceSingleOccurrence: Boolean = js.native
  def forceSingleOccurrence_=(newValue: Boolean): Unit = js.native
  
  def mapping: IImportMapping | Null = js.native
  
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName_=(newValue: String): Unit = js.native
  
  def mappingQualifiedName: String | Null = js.native
  
  def mapping_=(newValue: IImportMapping | Null): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup_=(newValue: ObjectHandlingBackupEnum): Unit = js.native
  
  def range: Range = js.native
  def range_=(newValue: Range): Unit = js.native
}
object ImportMappingCall {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ImportMappingCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ImportMappingCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImportMappingCall]
  
  /**
    * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
    * The new ImportMappingCall will be automatically stored in the 'importMappingCall' property
    * of the parent ResultHandling element passed as argument.
    */
  /* static member */
  inline def createIn(container: ResultHandling): ImportMappingCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ImportMappingCall]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ImportMappingCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ImportMappingCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
