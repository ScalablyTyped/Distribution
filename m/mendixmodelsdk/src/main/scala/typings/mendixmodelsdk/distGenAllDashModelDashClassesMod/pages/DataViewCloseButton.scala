package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view-close-button relevant section in reference guide}
  *
  * In version 6.7.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataViewCloseButton")
@js.native
class DataViewCloseButton protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.DataViewCloseButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataViewCloseButton")
@js.native
object DataViewCloseButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewCloseButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.DataViewCloseButton = js.native
  /**
    * Creates and returns a new DataViewCloseButton instance in the SDK and on the server.
    * The new DataViewCloseButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.ControlBar): typings.mendixmodelsdk.distGenPagesMod.pages.DataViewCloseButton = js.native
}

