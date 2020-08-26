package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.InspectAttribute")
@js.native
abstract class InspectAttribute protected () extends ListOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FInspectAttribute: IModel = js.native
  /**
    * In version 7.0.0: introduced
    */
  def association: IAssociationBase | Null = js.native
  def associationQualifiedName: String | Null = js.native
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  def attribute: IAttribute | Null = js.native
  def attributeQualifiedName: String | Null = js.native
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel: Expression = js.native
  def expressionModel_=(newValue: Expression): Unit = js.native
  def expression_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.InspectAttribute")
@js.native
object InspectAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

