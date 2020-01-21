package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/synchronize relevant section in reference guide}
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.SynchronizeAction")
@js.native
class SynchronizeAction protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.SynchronizeAction {
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
@JSImport("mendixmodelsdk", "microflows.SynchronizeAction")
@js.native
object SynchronizeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.SynchronizeAction = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * The new SynchronizeAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.microflowsMod.microflows.SynchronizeAction = js.native
}

