package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/range-search-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RangeSearchField")
@js.native
class RangeSearchField protected () extends SearchField {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRangeSearchField: IModel = js.native
  def includeLower: Boolean = js.native
  def includeLower(newValue: Boolean): js.Any = js.native
  def includeUpper: Boolean = js.native
  def includeUpper(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def lowerBound: String = js.native
  def lowerBound(newValue: String): js.Any = js.native
  def lowerBoundRef(): js.Any = js.native
  def lowerBoundRef(newValue: AttributeRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("lowerBoundRef")
  def lowerBoundRef_Union: AttributeRef | Null = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def upperBound: String = js.native
  def upperBound(newValue: String): js.Any = js.native
  def upperBoundRef(): js.Any = js.native
  def upperBoundRef(newValue: AttributeRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("upperBoundRef")
  def upperBoundRef_Union: AttributeRef | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RangeSearchField")
@js.native
object RangeSearchField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RangeSearchField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RangeSearchField = js.native
  /**
    * Creates and returns a new RangeSearchField instance in the SDK and on the server.
    * The new RangeSearchField will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): RangeSearchField = js.native
}

