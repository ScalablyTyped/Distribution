package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.InheritanceCase")
@js.native
class InheritanceCase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.InheritanceCase {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.InheritanceCase")
@js.native
object InheritanceCase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new InheritanceCase instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceCase = js.native
  /**
    * Creates and returns a new InheritanceCase instance in the SDK and on the server.
    * The new InheritanceCase will be automatically stored in the 'caseValue' property
    * of the parent SequenceFlow element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SequenceFlow): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceCase = js.native
}

