package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view-save-button relevant section in reference guide}
  *
  * In version 6.7.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewSaveButton")
@js.native
class DataViewSaveButton protected () extends DataViewControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataViewSaveButton: IModel = js.native
  /**
    * In version 6.6.0: introduced
    */
  def syncAutomatically: Boolean = js.native
  def syncAutomatically_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataViewSaveButton")
@js.native
object DataViewSaveButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewSaveButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataViewSaveButton = js.native
  /**
    * Creates and returns a new DataViewSaveButton instance in the SDK and on the server.
    * The new DataViewSaveButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createIn(container: ControlBar): DataViewSaveButton = js.native
}

