package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/grid-new-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton")
@js.native
class GridNewButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGridNewButton: IModel = js.native
  def editLocation(): NewButtonEditLocation = js.native
  def editLocation(newValue: NewButtonEditLocation): js.Any = js.native
  def entity(): js.Any = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  @JSName("entity")
  def entity_Union(): IEntity | Null = js.native
  /**
    * In version 6.2.0: deleted
    * In version 6.0.0: deprecated
    */
  def isPersistent(): Boolean = js.native
  def isPersistent(newValue: Boolean): js.Any = js.native
  def pageSettings(): PageSettings = js.native
  def pageSettings(newValue: PageSettings): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridNewButton")
@js.native
object GridNewButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridNewButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridNewButton = js.native
  /**
    * Creates and returns a new GridNewButton instance in the SDK and on the server.
    * The new GridNewButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): GridNewButton = js.native
}

