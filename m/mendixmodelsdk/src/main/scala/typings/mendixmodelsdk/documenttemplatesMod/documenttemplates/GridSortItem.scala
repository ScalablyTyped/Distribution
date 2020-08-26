package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem")
@js.native
class GridSortItem protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGridSortItem: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef = js.native
  def attributeRef_=(newValue: AttributeRef): Unit = js.native
  def containerAsGridSortBar: GridSortBar = js.native
  def sortOrder: SortDirection = js.native
  def sortOrder_=(newValue: SortDirection): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem")
@js.native
object GridSortItem extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridSortItem = js.native
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * The new GridSortItem will be automatically stored in the 'sortItems' property
    * of the parent GridSortBar element passed as argument.
    */
  def createIn(container: GridSortBar): GridSortItem = js.native
}

