package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetailDetailRegion")
@js.native
class MasterDetailDetailRegion protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailDetailRegion {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MasterDetailDetailRegion")
@js.native
object MasterDetailDetailRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MasterDetailDetailRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailDetailRegion = js.native
  /**
    * Creates and returns a new MasterDetailDetailRegion instance in the SDK and on the server.
    * The new MasterDetailDetailRegion will be automatically stored in the 'detail' property
    * of the parent MasterDetail element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetail): typings.mendixmodelsdk.distGenPagesMod.pages.MasterDetailDetailRegion = js.native
}

