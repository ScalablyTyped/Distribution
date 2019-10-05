package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.22.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OfflineSchemaFetchInstruction")
@js.native
class OfflineSchemaFetchInstruction protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_OfflineSchemaFetchInstruction: IModel = js.native
  var tableName: String = js.native
  var xPath: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OfflineSchemaFetchInstruction")
@js.native
object OfflineSchemaFetchInstruction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OfflineSchemaFetchInstruction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OfflineSchemaFetchInstruction = js.native
}

