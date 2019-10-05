package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItem")
@js.native
class SortItem protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  var attributePath: String = js.native
  /**
    * In version 7.11.0: introduced
    */
  var attributeRef: AttributeRef = js.native
  val containerAsSortItemList: SortItemList = js.native
  @JSName("model")
  var model_SortItem: IModel = js.native
  var sortOrder: SortOrderEnum = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItem")
@js.native
object SortItem extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SortItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SortItem = js.native
  /**
    * Creates and returns a new SortItem instance in the SDK and on the server.
    * The new SortItem will be automatically stored in the 'items' property
    * of the parent SortItemList element passed as argument.
    */
  def createIn(container: SortItemList): SortItem = js.native
}

