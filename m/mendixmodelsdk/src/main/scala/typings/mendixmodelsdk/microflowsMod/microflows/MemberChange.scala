package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MemberChange")
@js.native
class MemberChange protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMemberChange: IModel = js.native
  def association: IAssociationBase | Null = js.native
  def associationQualifiedName: String | Null = js.native
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  def attribute: IAttribute | Null = js.native
  def attributeQualifiedName: String | Null = js.native
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  def containerAsChangeMembersAction: ChangeMembersAction = js.native
  def `type`: ChangeActionItemType = js.native
  def type_=(newValue: ChangeActionItemType): Unit = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def value: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def valueModel: Expression = js.native
  def valueModel_=(newValue: Expression): Unit = js.native
  def value_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MemberChange")
@js.native
object MemberChange extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MemberChange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MemberChange = js.native
  /**
    * Creates and returns a new MemberChange instance in the SDK and on the server.
    * The new MemberChange will be automatically stored in the 'items' property
    * of the parent ChangeMembersAction element passed as argument.
    */
  def createIn(container: ChangeMembersAction): MemberChange = js.native
}

