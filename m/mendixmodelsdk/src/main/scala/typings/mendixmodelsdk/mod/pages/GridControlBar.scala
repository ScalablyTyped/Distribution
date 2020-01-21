package typings.mendixmodelsdk.mod.pages

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
@JSImport("mendixmodelsdk", "pages.GridControlBar")
@js.native
class GridControlBar protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.GridControlBar {
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
@JSImport("mendixmodelsdk", "pages.GridControlBar")
@js.native
object GridControlBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.GridControlBar = js.native
  /**
    * Creates and returns a new GridControlBar instance in the SDK and on the server.
    * The new GridControlBar will be automatically stored in the 'controlBar' property
    * of the parent Grid element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.Grid): typings.mendixmodelsdk.pagesMod.pages.GridControlBar = js.native
}

