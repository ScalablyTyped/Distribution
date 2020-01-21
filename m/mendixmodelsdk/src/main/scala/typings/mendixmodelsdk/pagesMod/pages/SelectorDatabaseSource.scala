package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorDatabaseSource")
@js.native
class SelectorDatabaseSource protected () extends SelectorSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSelectorDatabaseSource: IModel = js.native
  def databaseConstraints(): IList[DatabaseConstraint] = js.native
  /**
    * In version 6.2.0: introduced
    */
  def sortBar(): GridSortBar = js.native
  def sortBar(newValue: GridSortBar): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorDatabaseSource")
@js.native
object SelectorDatabaseSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectorDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SelectorDatabaseSource = js.native
  /**
    * Creates and returns a new SelectorDatabaseSource instance in the SDK and on the server.
    * The new SelectorDatabaseSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.1.0 and higher
    */
  def createIn(container: AssociationWidget): SelectorDatabaseSource = js.native
}

