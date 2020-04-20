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
  * See: {@link https://docs.mendix.com/refguide7/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridControlBar")
@js.native
class GridControlBar protected () extends ControlBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGridControlBar: IModel = js.native
  def defaultButton(): js.Any = js.native
  def defaultButton(newValue: ControlBarItem): js.Any = js.native
  @JSName("defaultButton")
  def defaultButton_Union: ControlBarItem | Null = js.native
  /**
    * In version 7.13.0: deleted
    */
  def searchButton: GridSearchButton = js.native
  def searchButton(newValue: GridSearchButton): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridControlBar")
@js.native
object GridControlBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridControlBar = js.native
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * The new GridControlBar will be automatically stored in the 'controlBar' property
    * of the parent Grid element passed as argument.
    */
  def createIn(container: Grid): GridControlBar = js.native
}

