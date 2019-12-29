package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpHeaderEntry")
@js.native
class HttpHeaderEntry protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpHeaderEntry")
@js.native
object HttpHeaderEntry extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent HttpConfiguration element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry = js.native
}

