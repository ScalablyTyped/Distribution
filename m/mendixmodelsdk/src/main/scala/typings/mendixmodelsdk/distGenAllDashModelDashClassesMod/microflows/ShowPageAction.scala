package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/show-page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ShowPageAction")
@js.native
class ShowPageAction protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowPageAction {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ShowPageAction")
@js.native
object ShowPageAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ShowPageAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowPageAction = js.native
  /**
    * Creates and returns a new ShowPageAction instance in the SDK and on the server.
    * The new ShowPageAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowPageAction = js.native
}

