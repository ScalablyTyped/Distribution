package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.enumerationsMod.enumerations.Condition
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.ConditionSettings")
@js.native
class ConditionSettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConditionSettings: IModel = js.native
  def attribute(): js.Any = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName: String | Null = js.native
  @JSName("attribute")
  def attribute_Union: IAttribute | Null = js.native
  def conditions: IList[Condition] = js.native
  def containerAsTableRow: TableRow = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.ConditionSettings")
@js.native
object ConditionSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ConditionSettings = js.native
  /**
    * Creates and returns a new ConditionSettings instance in the SDK and on the server.
    * The new ConditionSettings will be automatically stored in the 'conditionSettings' property
    * of the parent TableRow element passed as argument.
    */
  def createIn(container: TableRow): ConditionSettings = js.native
}

