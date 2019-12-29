package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/tab-page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TabPage")
@js.native
class TabPage protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.TabPage {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TabPage")
@js.native
object TabPage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.TabPage = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * The new TabPage will be automatically stored in the 'tabPages' property
    * of the parent TabContainer element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.TabContainer): typings.mendixmodelsdk.distGenPagesMod.pages.TabPage = js.native
}

