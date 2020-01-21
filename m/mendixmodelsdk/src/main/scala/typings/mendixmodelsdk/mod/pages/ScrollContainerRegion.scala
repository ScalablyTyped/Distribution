package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.ScrollContainerRegion {
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
@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
object ScrollContainerRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderBottom(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderCenter(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderLeft(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderRight(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderTop(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = js.native
}

