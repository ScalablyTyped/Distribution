package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/drop-down-search-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownSearchField")
@js.native
class DropDownSearchField protected () extends SingleSearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var allowMultipleSelect: Boolean = js.native
  var sortBar: GridSortBar = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var xPathConstraint: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownSearchField")
@js.native
object DropDownSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DropDownSearchField = js.native
  /**
    * Creates and returns a new DropDownSearchField instance in the SDK and on the server.
    * The new DropDownSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): DropDownSearchField = js.native
}

