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
  * See: {@link https://docs.mendix.com/refguide7/drop-down-search-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.DropDownSearchField")
@js.native
class DropDownSearchField protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.DropDownSearchField {
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
@JSImport("mendixmodelsdk", "pages.DropDownSearchField")
@js.native
object DropDownSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.DropDownSearchField = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * The new DropDownSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.ControlBar): typings.mendixmodelsdk.pagesMod.pages.DropDownSearchField = js.native
}

