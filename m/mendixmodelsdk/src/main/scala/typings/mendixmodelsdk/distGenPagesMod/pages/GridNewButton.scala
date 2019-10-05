package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var editLocation: NewButtonEditLocation = js.native
  var entity: IEntity | Null = js.native
  val entityQualifiedName: String | Null = js.native
  /**
    * In version 6.2.0: deleted
    * In version 6.0.0: deprecated
    */
  var isPersistent: Boolean = js.native
  var pageSettings: PageSettings = js.native
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

