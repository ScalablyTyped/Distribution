package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion")
@js.native
class MasterDetailMasterRegion protected () extends MasterDetailRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMasterDetailMasterRegion: IModel = js.native
  def responsiveWeight: Double = js.native
  def responsiveWeight(newValue: Double): js.Any = js.native
  def tabletWeight: Double = js.native
  def tabletWeight(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion")
@js.native
object MasterDetailMasterRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MasterDetailMasterRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MasterDetailMasterRegion = js.native
  /**
    * Creates and returns a new MasterDetailMasterRegion instance in the SDK and on the server.
    * The new MasterDetailMasterRegion will be automatically stored in the 'master' property
    * of the parent MasterDetail element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createIn(container: MasterDetail): MasterDetailMasterRegion = js.native
}

