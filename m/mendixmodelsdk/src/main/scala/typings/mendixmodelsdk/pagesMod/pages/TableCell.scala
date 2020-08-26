package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TableCell")
@js.native
class TableCell protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTableCell: IModel = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  def containerAsTable: Table = js.native
  def height: Double = js.native
  def height_=(newValue: Double): Unit = js.native
  def isHeader: Boolean = js.native
  def isHeader_=(newValue: Boolean): Unit = js.native
  def leftColumnIndex: Double = js.native
  def leftColumnIndex_=(newValue: Double): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  def topRowIndex: Double = js.native
  def topRowIndex_=(newValue: Double): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TableCell")
@js.native
object TableCell extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TableCell = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * The new TableCell will be automatically stored in the 'cells' property
    * of the parent Table element passed as argument.
    */
  def createIn(container: Table): TableCell = js.native
}

