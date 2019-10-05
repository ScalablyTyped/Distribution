package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FileDocumentExport")
@js.native
class FileDocumentExport protected () extends OutputMethod {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var targetDocumentVariableName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.FileDocumentExport")
@js.native
object FileDocumentExport extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FileDocumentExport = js.native
  /**
    * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
    * The new FileDocumentExport will be automatically stored in the 'outputMethod' property
    * of the parent ExportXmlAction element passed as argument.
    */
  def createIn(container: ExportXmlAction): FileDocumentExport = js.native
}

