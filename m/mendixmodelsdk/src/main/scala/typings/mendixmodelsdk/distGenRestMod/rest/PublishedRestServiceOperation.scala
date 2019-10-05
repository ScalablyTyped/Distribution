package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CommitEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenServicesMod.services.HttpMethod
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
class PublishedRestServiceOperation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 7.14.0: introduced
    */
  var commit: CommitEnum = js.native
  val containerAsPublishedRestServiceResource: PublishedRestServiceResource = js.native
  /**
    * In version 7.15.0: introduced
    */
  var deprecated: Boolean = js.native
  var documentation: String = js.native
  /**
    * In version 7.14.0: introduced
    */
  var exportMapping: IExportMapping | Null = js.native
  val exportMappingQualifiedName: String | Null = js.native
  var httpMethod: HttpMethod = js.native
  /**
    * In version 7.14.0: introduced
    */
  var importMapping: IImportMapping | Null = js.native
  val importMappingQualifiedName: String | Null = js.native
  var microflow: IMicroflow | Null = js.native
  val microflowQualifiedName: String | Null = js.native
  @JSName("model")
  var model_PublishedRestServiceOperation: IModel = js.native
  /**
    * In version 7.17.0: introduced
    */
  var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  /**
    * In version 7.17.0: introduced
    */
  val parameters: IList[RestOperationParameter] = js.native
  var path: String = js.native
  var summary: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
object PublishedRestServiceOperation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedRestServiceOperation = js.native
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
    * of the parent PublishedRestServiceResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createIn(container: PublishedRestServiceResource): PublishedRestServiceOperation = js.native
}

