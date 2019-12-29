package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/nanoflows relevant section in reference guide}
  *
  * In version 7.12.0: removed experimental
  * In version 7.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.Nanoflow")
@js.native
class Nanoflow protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.Nanoflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.Nanoflow")
@js.native
object Nanoflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Nanoflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.Nanoflow = js.native
}

