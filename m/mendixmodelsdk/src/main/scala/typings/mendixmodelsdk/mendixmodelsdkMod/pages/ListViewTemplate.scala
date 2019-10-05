package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ListViewTemplate")
@js.native
class ListViewTemplate protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ListViewTemplate {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.ListViewTemplate")
@js.native
object ListViewTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListViewTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate = js.native
  /**
    * Creates and returns a new ListViewTemplate instance in the SDK and on the server.
    * The new ListViewTemplate will be automatically stored in the 'templates' property
    * of the parent ListView element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate = js.native
}

