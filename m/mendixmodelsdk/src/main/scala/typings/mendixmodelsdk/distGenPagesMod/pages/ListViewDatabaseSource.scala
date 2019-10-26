package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
@js.native
class ListViewDatabaseSource protected () extends DatabaseSourceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var search: ListViewSearch = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
@js.native
object ListViewDatabaseSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ListViewDatabaseSource = js.native
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: EntityWidget): ListViewDatabaseSource = js.native
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): ListViewDatabaseSource = js.native
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): ListViewDatabaseSource = js.native
}

