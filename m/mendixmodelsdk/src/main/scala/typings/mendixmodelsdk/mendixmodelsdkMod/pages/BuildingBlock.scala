package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/building-block relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.BuildingBlock")
@js.native
class BuildingBlock protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.BuildingBlock {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.BuildingBlock")
@js.native
object BuildingBlock extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates a new BuildingBlock unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock = js.native
}

