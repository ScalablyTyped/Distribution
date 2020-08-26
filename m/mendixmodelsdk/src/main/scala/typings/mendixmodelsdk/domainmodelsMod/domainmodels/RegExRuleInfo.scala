package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RegExRuleInfo")
@js.native
class RegExRuleInfo protected () extends RuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRegExRuleInfo: IModel = js.native
  def regularExpression: IRegularExpression | Null = js.native
  def regularExpressionQualifiedName: String | Null = js.native
  def regularExpression_=(newValue: IRegularExpression | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RegExRuleInfo")
@js.native
object RegExRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RegExRuleInfo = js.native
  /**
    * Creates and returns a new RegExRuleInfo instance in the SDK and on the server.
    * The new RegExRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: ValidationRule): RegExRuleInfo = js.native
}

