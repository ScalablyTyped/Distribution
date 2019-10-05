package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/deselect-all-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridDeselectAllButton")
@js.native
class GridDeselectAllButton protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.GridDeselectAllButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridDeselectAllButton")
@js.native
object GridDeselectAllButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridDeselectAllButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.GridDeselectAllButton = js.native
  /**
    * Creates and returns a new GridDeselectAllButton instance in the SDK and on the server.
    * The new GridDeselectAllButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.ControlBar): typings.mendixmodelsdk.distGenPagesMod.pages.GridDeselectAllButton = js.native
}

