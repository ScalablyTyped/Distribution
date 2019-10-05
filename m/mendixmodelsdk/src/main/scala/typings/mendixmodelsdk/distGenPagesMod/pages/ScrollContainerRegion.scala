package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  val containerAsScrollContainer: ScrollContainer = js.native
  @JSName("model")
  var model_ScrollContainerRegion: IModel = js.native
  var size: Double = js.native
  var sizeMode: SizeMode = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  /**
    * In version 6.10.0: introduced
    */
  var toggleMode: ToggleMode = js.native
  /**
    * In version 7.15.0: deleted
    */
  var widget: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  val widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollContainerRegion")
@js.native
object ScrollContainerRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderBottom(container: ScrollContainer): ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderCenter(container: ScrollContainer): ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderLeft(container: ScrollContainer): ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderRight(container: ScrollContainer): ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderTop(container: ScrollContainer): ScrollContainerRegion = js.native
}

