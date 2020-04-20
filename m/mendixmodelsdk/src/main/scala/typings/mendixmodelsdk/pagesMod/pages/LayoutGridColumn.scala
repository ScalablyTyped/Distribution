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

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridColumn")
@js.native
class LayoutGridColumn protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLayoutGridColumn: IModel = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def `class`(newValue: String): js.Any = js.native
  def containerAsLayoutGridRow: LayoutGridRow = js.native
  /**
    * In version 8.3.0: introduced
    */
  def phoneWeight: Double = js.native
  def phoneWeight(newValue: Double): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style(newValue: String): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def tabletWeight: Double = js.native
  def tabletWeight(newValue: Double): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def verticalAlignment: LayoutGridAlignment = js.native
  def verticalAlignment(newValue: LayoutGridAlignment): js.Any = js.native
  def weight: Double = js.native
  def weight(newValue: Double): js.Any = js.native
  def widget(): js.Any = js.native
  def widget(newValue: Widget): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  @JSName("widget")
  def widget_Union: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridColumn")
@js.native
object LayoutGridColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutGridColumn = js.native
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * The new LayoutGridColumn will be automatically stored in the 'columns' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createIn(container: LayoutGridRow): LayoutGridColumn = js.native
}

