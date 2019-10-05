package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ReferenceSetSource")
@js.native
class ReferenceSetSource protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ReferenceSetSource")
@js.native
object ReferenceSetSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSource = js.native
  /**
    * Creates and returns a new ReferenceSetSource instance in the SDK and on the server.
    * The new ReferenceSetSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSource = js.native
}

