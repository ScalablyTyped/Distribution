package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange")
@js.native
class ConstantRange protected () extends Range {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var singleObject: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange")
@js.native
object ConstantRange extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ConstantRange = js.native
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  def createInDatabaseRetrieveSourceUnderRange(container: DatabaseRetrieveSource): ConstantRange = js.native
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  def createInImportMappingCallUnderRange(container: ImportMappingCall): ConstantRange = js.native
}

