package typings.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.GridSortItem")
@js.native
class GridSortItem protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.GridSortItem {
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
@JSImport("mendixmodelsdk", "documenttemplates.GridSortItem")
@js.native
object GridSortItem extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortItem = js.native
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * The new GridSortItem will be automatically stored in the 'sortItems' property
    * of the parent GridSortBar element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortBar): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortItem = js.native
}

