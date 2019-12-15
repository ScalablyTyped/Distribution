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

/**
  * In version 8.4.0: deleted
  * In version 6.2.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalSchema")
@js.native
class RetrievalSchema protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRetrievalSchema: IModel = js.native
  /**
    * In version 7.4.0: deleted
    */
  def entity(): String = js.native
  def entity(newValue: String): js.Any = js.native
  /**
    * In version 7.2.0: introduced
    */
  def usedAssociations(): IList[String] = js.native
  /**
    * In version 7.2.0: deleted
    */
  def usedAttributes(): IList[String] = js.native
  /**
    * In version 7.14.0: introduced
    */
  def widgetName(): String = js.native
  def widgetName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalSchema")
@js.native
object RetrievalSchema extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RetrievalSchema instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RetrievalSchema = js.native
}

