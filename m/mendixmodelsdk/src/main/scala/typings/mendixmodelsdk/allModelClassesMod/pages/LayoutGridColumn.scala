package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LayoutGridColumn")
@js.native
class LayoutGridColumn protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.LayoutGridColumn")
@js.native
object LayoutGridColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn = js.native
  /**
    * Creates and returns a new LayoutGridColumn instance in the SDK and on the server.
    * The new LayoutGridColumn will be automatically stored in the 'columns' property
    * of the parent LayoutGridRow element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn = js.native
}

